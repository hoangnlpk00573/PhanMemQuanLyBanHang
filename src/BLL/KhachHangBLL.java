/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachHangDAL;
import DTO.KhachHangDTO;
import Presentation.MainClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ridotoji Pham
 */
public class KhachHangBLL {

    public static void JTableKhachhang(ResultSet rs, JTable tableTam) {
        Object[] objs = new Object[]{"Tên Khách Hàng ", "Mã Khách Hàng", "Số Điện Thoại", "Địa Chỉ", "Số Lượng", "Đơn Giá"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[6];
                item[0] = rs.getString("TenKH");
                item[1] = rs.getString("MaKH");
                item[2] = rs.getString("SoDienThoai");
                item[3] = rs.getString("DiaChi");
                item[4] = rs.getString("SoLuong");
                item[5] = rs.getString("GiaBan");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static boolean KiemTra(KhachHangDTO KH) {
        boolean KetQua = true;
        if (KH.getMota().equals(KetQua)) {
            System.out.println("Pass");
            return false;
        }
        return KetQua;
    }

    public static void ThemKH(KhachHangDTO Kh) {
        boolean Ketqua = KiemTra(Kh);
        if (Ketqua) {
            KhachHangDAL.CauTruyVanThemSP(Kh);
        }
    }

    public static void DanhSachTenKhachHang(ResultSet rs, JTable tableTam) {
        Object[] objs = new Object[]{"Mã Khách Hàng", "Tên Khách Hàng"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[2];
                item[0] = rs.getString("MaKH");
                item[1] = rs.getString("TenKH");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void LayKHTheoMaKH(ResultSet rs, JTable tableTam) {
        Object[] objs = new Object[]{"Mã Khách Hàng", "Mã Loại Khách hàng", "Tên Khách Hàng", "Địa Chỉ", "Giới Tính", "Số Điện Thoại", "Loại Khách Hàng", "Ghi Chú"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[8];
                item[0] = rs.getInt("MaKH");
                item[1] = rs.getInt("MaLoaiKH");
                item[2] = rs.getString("TenKH");
                item[3] = rs.getString("DiaChi");
                item[4] = rs.getInt("GioiTinh");
                if (rs.getInt("GioiTinh") == 1) {
                    item[4] = "Nam";
                } else {
                    item[4] = "Nữ";
                }
                item[5] = rs.getString("SoDienThoai");
                item[6] = rs.getString("LoaiKH");
                item[7] = rs.getString("MoTa");

                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void SuaKhachHang(KhachHangDTO KH) {
        KhachHangDAL.SuaKhachHangTheoMa(KH);
    }

    public static void XoaKhachHang(int maCanXoa) {
        KhachHangDAL.XoaKhachHang(maCanXoa);
    }
     public static ResultSet LayTatCaKH(){
        ResultSet rs;
        rs = KhachHangDAL.LayDanhSachKhachHang();
        return rs;
    }
      public static KhachHangDTO LayDonHangtheoMaDH(String MaDH){
        KhachHangDTO DH = new KhachHangDTO();
        if(!MaDH.equals("")){
            DH = KhachHangDAL.LayKhachHangtheoMaDH(MaDH);
        }else{
            MainClass.ThongBao("Chưa Nhập Khách hàng", MaDH, 0);
        }
        return DH;
    }
    public static ResultSet LayTenKhachHang(String tuKhoa){
        ResultSet rs;
        rs = KhachHangDAL.TimKH(tuKhoa);
        
        return rs;
    }
    public static ResultSet LayTenKhachHang2(String tuKhoa){
        ResultSet rs;
        rs = KhachHangDAL.TimKH2(tuKhoa);
        
        return rs;
    }
    public static void LayBangKhachHang(ResultSet rs, JTable tableTam) {
        Object[] objs = new Object[]{"Tên Khách Hàng ", "Địa Chỉ", "Tên Hàng", "Số Lượng", "Tổng Tiền"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[5];
                item[0] = rs.getString("TenKH");
                item[1] = rs.getString("DiaChi");
                item[2] = rs.getString("TenSanPham");
                item[3] = rs.getInt("SoLuong");
                item[4] = rs.getString("GiaBan") ;
              
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
     public static ResultSet LayKhachHangtheoTenKhachHang(String TenKH,String ID){
        ResultSet rs;
        rs = KhachHangDAL.LayThongTinKHDuaVaoTenKH(TenKH,ID);
        
        return rs;
    }
}
