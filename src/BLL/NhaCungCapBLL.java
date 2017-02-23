/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhaCungCapDAL;
import DTO.NhaCungCapDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QT
 */
public class NhaCungCapBLL {
    public static void DoDuLieu(ResultSet rs, JTable ncc) {
        Object[] objs = new Object[]{"Mã Nhà Cung Cấp", "Tên Nhà Cung Cấp", "Địa Chỉ","Số Điện Thoại","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        ncc.setModel(tableModel);
        try {
            while (rs.next()) {
                Object[] item = new Object[5];
                item[0] = rs.getInt("MaNhaCungCap");
                item[1] = rs.getString("TenNhaCungCap");
                item[2] = rs.getString("DiaChi");
                item[3] = rs.getString("SoDienThoai");
                item[4] = rs.getString("MoTa");               
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public static boolean KiemTra(NhaCungCapDTO NCC){
        boolean ketqua = true;
        if(NCC.getTenncc().trim().equals("")){
            System.out.println("Chưa nhập tên");
            return false;
        }else if(NCC.getDiachi().trim().equals("")){
            System.out.println("Chưa nhập địa chỉ");
            return false;      
        }
        return ketqua;
    }     
      public static void Them(NhaCungCapDTO NCC){
          boolean ketquakiemtra = KiemTra(NCC);
          if(ketquakiemtra){
              NhaCungCapDAL.Them(NCC);
          }
      }
      public static void Sua(NhaCungCapDTO NCC) {
        boolean ketquakiemtra = KiemTra(NCC);
        if (ketquakiemtra) {
            NhaCungCapDAL.Sua(NCC);
        }
    }

    public static void Xoa(String MaNCC) {
        if (MaNCC.equals("")) {

        } else {
            NhaCungCapDAL.Xoa(MaNCC);
        }
    }
    public static ResultSet LayTatCaNCC() {
        ResultSet rs;
        rs = NhaCungCapDAL.Select();
        return rs;
    }
    public static ResultSet LayNCCTheoTuKhoa(String tukhoa){
        ResultSet rs;
        rs = NhaCungCapDAL.Search(tukhoa);      
        return rs;
    }
}
