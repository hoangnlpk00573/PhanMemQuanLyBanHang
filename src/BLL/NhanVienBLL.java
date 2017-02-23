/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhanVienDAL;
import DTO.NhanVienDTO;
import Presentation.MainClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOANG
 */
public class NhanVienBLL {
    public static void DoDuLieuVaoJTableQuyentrongBangNhanvien(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Nhân Viên","Mã Nhân Viên","Số Điện thoại","Địa Chỉ","Chức vụ","Ghi chú"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        try {
            while(rs.next()){
                Object[] item = new Object[6];
                item[0] = rs.getString("TenNhanVien");
                 item[1] = rs.getInt("MaNhanVien");
                  item[2] = rs.getString("SoDienThoai");
                   item[3] = rs.getString("DiaChi");
                    item[4] = rs.getString("ChucVu");
                     item[5] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
        public static void DoDuLieuVaoJTableNhanVienDayDu(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Mã Nhân Viên","Tên Nhân Viên","Địa Chỉ","Số Điện thoại","Giới tính","Chứng Minh Nhân Dân","Chức Vụ","Ngày Sinh","Ngày Vào Làm","Tài Khoản","Mật khẩu","Mã Quyền","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        try {
            while(rs.next()){
                Object[] item = new Object[13];
                item[0] = rs.getInt("MaNhanVien");
                 item[1] = rs.getString("TenNhanVien");
                  item[2] = rs.getString("DiaChi");
                   item[3] = rs.getString("SoDienThoai");
                    item[4] = rs.getInt("GioiTinh");
                    if(rs.getInt("GioiTinh") == 1){
                       item[4] = "Nam";
                            }
                         else{
                    item[4] = "Nữ";
                         } 
                     item[5] = rs.getString("CMND");
                     item[6] = rs.getString("ChucVu");
                    item[7] = rs.getString("NgaySinh");
                     item[8] = rs.getString("NgayVaoLam");
                     item[9] = rs.getString("UserName");
                    item[10] = rs.getString("Password");
                     item[11] = rs.getInt("MaQuyen");
                     item[12] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
     public static boolean kiemTra(NhanVienDTO Q){
        boolean ketQua = true;
       if(Q.getTenNhanVien().trim().equals("") || Q.getSDT().trim().equals("") || Q.getChungminhND().trim().equals("") 
               || Q.getNgaySinh().trim().equals("") || Q.getUsername().trim().equals("") || Q.getPassword().trim().equals("")
               || Q.getNgaySinh().trim().equals("") || Q.getChucvu().trim().equals("") || Q.getDiaChi().trim().equals("")){
            MainClass.ThongBao("Hãy Nhập Đầy Đủ Thông Tin", "Thông Báo", 1);
            return false;
        }else if(Q.getUsername().equals(NhanVienDAL.CauTruyvanUserNhanVien())) {
            MainClass.ThongBao("Tài Khoản Bị Trùng", "Thông Báo", 1);
            return false;
        }
        return ketQua;
    }
    // Hàm Lấy thông tin dữ liệu trong DAL
    public static void ThemNhanVien(NhanVienDTO Q){
        boolean ketQua = kiemTra(Q);
        if(ketQua){
           NhanVienDAL.CauTruyVanThemNhanVien(Q);
        }
    }
    public static void SuaNV(NhanVienDTO NV){
        boolean ketQua = kiemTra(NV);
        if(ketQua){
            NhanVienDAL.CauTruyVanSuaNhanVien(NV);
        }
    }
    public static void XoaNhanVien(String maCanXoa){
        
             NhanVienDAL.CauTruyVanXoaNhanVien(maCanXoa);
        
    }
     public static ResultSet LayTatCaNhanVien(){
        ResultSet rs;
        rs = NhanVienDAL.CauTruyvanNhanVien();
        return rs;
    }
      public static ResultSet LayTatCaNhanVienVaSanPham(){
        ResultSet rs;
        rs = NhanVienDAL.CauTruyvanNhanVienSanPham();
        return rs;
    }
    // Hàm tìm kiếm
    public static ResultSet LayNVTheoTuKhoa(String tuKhoa){
        ResultSet rs;
        rs = NhanVienDAL.TimLSP(tuKhoa);
        
        return rs;
    }
}
