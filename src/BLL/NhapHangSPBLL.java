/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhapHangSPDAL;
import DTO.NhapHangSPDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QT
 */
public class NhapHangSPBLL {
    public static void DanhSachSanPham(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"","","","","",""};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[6];
                item[0] = rs.getInt("IDSanPham");
                item[1] = rs.getString("TenSanPham");
                item[2] = rs.getString("Imei");                                      
                item[3] = rs.getDouble("GiaNhap");
                item[4] = rs.getString("DonViTinh");
                item[5] = rs.getString("HanBaoHanh");
               
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
    public static ResultSet LayTatCaSP() {
        ResultSet rs;
        rs = NhapHangSPDAL.SelectSP();
        return rs;
    }
    public static void LayMaVaTenSP(ResultSet rs,JTable tbl){
        Object []objs = new Object[]{"ID Sản Phẩm","Tên Sản Phẩm"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tbl.setModel(tableModel);      
        try {
            while(rs.next()){
                Object[] item = new Object[2];
                item[0] = rs.getInt("IDSanPham");             
                item[1] = rs.getString("TenSanPham");
                
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public static boolean KiemTraTenSP(NhapHangSPDTO TTSP){
        boolean ketqua = true;
        if(TTSP.getTensp().trim().equals("")){
            System.out.println("Chưa nhập tên");
            return false;
        }
        return ketqua;
    }          
      public static void SuaTenSP(NhapHangSPDTO TTSP) {
        boolean ketquakiemtra = KiemTraTenSP(TTSP);
        if (ketquakiemtra) {
            NhapHangSPDAL.SuaTenSP(TTSP);
        }
    }
     public static void XoaTenSP(String IDSP) {
        if (IDSP.equals("")) {

        } else {
            NhapHangSPDAL.XoaTenSP(IDSP);
        }
    }   
      public static ResultSet LayTatCaTenSP() {
        ResultSet rs;
        rs = NhapHangSPDAL.LayMaVaTenSanPham();
        return rs;
    }
      public static ResultSet LaySanPhamTheoTen(String maloaisp) {
        ResultSet rs;
        rs = NhapHangSPDAL.LayThongTinSP(maloaisp);
        return rs;
    }
      public static ResultSet LaySanPhamTheoTuKhoa(String tukhoa){
        ResultSet rs;
        rs = NhapHangSPDAL.TimSanPhamTheoMaVaTen(tukhoa);      
        return rs;
    }
}
