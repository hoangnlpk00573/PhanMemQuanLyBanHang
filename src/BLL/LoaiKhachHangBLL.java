/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoaiKhachHangDAL;
import DTO.LoaiKhachHangDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOANG
 */
public class LoaiKhachHangBLL {
       public static void DanhSachBanHang(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Sản Phẩm"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[1];
                item[0] = rs.getString("TenSanPham");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
    public static ResultSet LayTatCaLKH(){
        ResultSet rs;
        rs = LoaiKhachHangDAL.CauTruyvanTatCaLKH();
        return rs;
    }
      
    public  static boolean KiemTra(LoaiKhachHangDTO SP0){
        boolean Ketqua = true;
        if(SP0.getTenLoaiKhachhang().equals(Ketqua)){
           System.out.println("Please In LoaiKhachHang ");
           return  false;
        }
        return Ketqua;
   }
  public  static void ThemLKH(LoaiKhachHangDTO SP0){
       boolean Ketqua = KiemTra(SP0);
       if (Ketqua) {
          LoaiKhachHangDAL.CauTruyVanThemLoaiKhachHang(SP0);
      }
  }
      public static void SuaLKH(LoaiKhachHangDTO LKH){
        boolean ketQua = KiemTra(LKH);
        if(ketQua){
            LoaiKhachHangDAL.CauTruyVanSuaLoaiKH(LKH);
        }
    }
    public static void XoaLKH(String maCanXoa){
        if(maCanXoa.equals("")){
         
        }else{
             LoaiKhachHangDAL.CauTruyVanXoaLKH(maCanXoa);
        }
    }
}
