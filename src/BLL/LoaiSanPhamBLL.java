/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoaiSanPhamDAL;
import DTO.LoaiSanPhamDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ridotoji Pham
 */
public class LoaiSanPhamBLL {
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
     public static void DoDuLieuVaoJTableDonhang(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Nhóm Hàng"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[1];
                item[0] = rs.getString("TenLoaiSanPham");
                
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public static ResultSet LayTatCaLSP(){
        ResultSet rs;
        rs = LoaiSanPhamDAL.CauTruyvanTatCaLSP();
        return rs;
    }
      
    public  static boolean KiemTra(LoaiSanPhamDTO SP0){
        boolean Ketqua = true;
        if(SP0.getTenLoaiSP().equals(Ketqua)){
           System.out.println("Please In LoaiSanPham ");
           return  false;
        }
        return Ketqua;
   }
  public  static void ThemLSP(LoaiSanPhamDTO SP0){
       boolean Ketqua = KiemTra(SP0);
       if (Ketqua) {
          LoaiSanPhamDAL.CauTruyVanThemLoaiSanPham(SP0);
      }
  }
      public static void SuaLSP(LoaiSanPhamDTO LSP){
        boolean ketQua = KiemTra(LSP);
        if(ketQua){
            LoaiSanPhamDAL.CauTruyVanSuaLoaiSanPham(LSP);
        }
    }
    public static void XoaLSP(String maCanXoa){
        if(maCanXoa.equals("")){
         
        }else{
             LoaiSanPhamDAL.CauTruyVanXoaLSP(maCanXoa);
        }
    }
    public static void DoDuLieuVaoJTableSanPham(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Mã khách hàng", "Họ tên", "Đơn giá","Điện Thoại","Địa Chỉ"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[5];
                item[0] = rs.getInt("MaKhachHang");
                item[1] = rs.getString("HoTen");
                item[2] = rs.getString("DonGia");
                item[3] = rs.getString("SDT");
                item[4] = rs.getString("DiaChi");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
      public static void DoDuLieuVaoJTableLoáianPham(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Mã Loại Sản Phẩm", "Tên Loại Sản Phẩm", "Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[3];
                item[0] = rs.getInt("MaLoaiSanPham");
                item[1] = rs.getString("TenLoaiSanPham");
                item[2] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
