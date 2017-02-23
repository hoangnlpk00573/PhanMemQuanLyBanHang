/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.BaohanhDTO;
import java.sql.*;

/**
 *
 * @author HOANG
 */
public class BaoHanhDAL {

    public static void ThemBaohanh(BaohanhDTO BH) {
        String cautruyvan = "insert into BaoHanh (MaKhachhang,IDSanPham,MaLoaiSanPham,TenSanPham,Soseri,SoLuong,MoTaLoi,Gia,NgayMua)"
                + "values(" + BH.getMaKhachHang() + "," + BH.getIDSanPham() + "," + BH.getMaLoaiSanPham() + ",'" + BH.getTenSanPham() + "','" + BH.getSoseri() + "','" + BH.getSoLuong() + "','" + BH.getMoTaLoi() + "','" + BH.getGia() + "','" + BH.getNgayMua() + "')" + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }

    public static void SuaBaoHanhTheoMa(BaohanhDTO BH) {
        String cauTruyVan = "update BaoHanh set MaKhachhang =" + BH.getMaKhachHang() + ",IDSanPham = N'" + BH.getIDSanPham() + "',MaLoaiSanPham = '" + BH.getMaLoaiSanPham() + "',TenSanPham = N'" + BH.getTenSanPham() + "',Soseri = '" + BH.getSoseri() + "'"
                + ",SoLuong = N'" + BH.getSoLuong() + "',MoTaLoi = N'" + BH.getMoTaLoi() + "',Gia = '" + BH.getGia() + "',NgayMua = '" + BH.getNgayMua() + "' where MaBaoHanh = " + BH.getMaBaoHanh() + ";";
        ConnectionDB.ExcuteQueryUpdate(cauTruyVan);
    }

    public static ResultSet LayDanhSachBaoHanh() {
        ResultSet rs;
        String cautruyvan = "select * from BaoHanh " + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    }

    public static BaohanhDTO LayBaohanhtheoMaBaoHanh(String maBH) {
        ResultSet rs;
        String cauTruyVanSQL = "Select * from BaoHanh where MaLoaiSanPham = '" + maBH + "'" + ";";

        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
        BaohanhDTO sp = new BaohanhDTO();
        try {
            while (rs.next()) {
                sp.setMaBaoHanh(rs.getInt("MaBaoHanh"));
                sp.setMaKhachHang(rs.getInt("MaKhachHang"));
                sp.setIDSanPham(rs.getInt("IDSanPham"));
                sp.setMaLoaiSanPham(rs.getInt("MaLoaiSanPham"));
                sp.setTenSanPham(rs.getString("TenSanPham"));
                sp.setSoseri(rs.getString("Soseri"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setMoTaLoi(rs.getString("MoTaLoi"));
                sp.setGia(rs.getString("Gia"));
                sp.setNgayMua(rs.getString("NgayMua"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return sp;
    }
}
