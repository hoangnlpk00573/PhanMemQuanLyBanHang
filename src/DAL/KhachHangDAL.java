/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhachHangDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ridotoji Pham
 */
public class KhachHangDAL {

    public static void CauTruyVanThemSP(KhachHangDTO KH) {
        String SQLThem = "insert into KhachHang(MaLoaiKH,TenKH,DiaChi,GioiTinh,SoDienThoai,LoaiKH,MoTa)"
                + "values(" + KH.getMaLoaiKH() + ",'" + KH.getTenKhachHang() + "','" + KH.getDiaChi() + "'," + KH.getGioitinh() + ",'" + KH.getSDT() + "','" + KH.getLoaiKH() + "','" + KH.getMota() + "')" + ";";
        ConnectionDB.ExcuteQueryUpdate(SQLThem);
    }

    public static ResultSet CauTruyvan() {
        ResultSet rs;
        String Sql = "select * from KhachHang,SanPham" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(Sql);
        return rs;
    }

    public static ResultSet LayDanhSachKhachHang() {
        ResultSet rs;
        String cautruyvan = "select * from KhachHang" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    }

    public static ResultSet LayKHTheoMaKH(int makh) {
        ResultSet rs;
        String cauTruyVan = "select * from KhachHang where MaKH = " + makh + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVan);
        return rs;
    }

    public static ResultSet LayBangsanphamkhachhangvahoadon() {
        ResultSet rs;
        String cauTruyVan = "select * from KhachHang inner join SanPham "
                + "on KhachHang.MaKH = SanPham.IDSanPham " + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVan);
        return rs;
    }

    public static void SuaKhachHangTheoMa(KhachHangDTO KH) {
        String cauTruyVan = "update KhachHang set MaLoaiKH =" + KH.getMaLoaiKH() + ",TenKH = '" + KH.getTenKhachHang() + "',DiaChi = '" + KH.getDiaChi() + "',GioiTinh = " + KH.getGioitinh() + ",SoDienThoai = '" + KH.getSDT() + "',LoaiKH = '" + KH.getLoaiKH() + "' where MaKH = " + KH.getMaKH() + ";";
        ConnectionDB.ExcuteQueryUpdate(cauTruyVan);
    }

    public static void XoaKhachHang(int MaKhachHang) {
        String cauTruyVan = "delete from KhachHang where MaKH=" + MaKhachHang + ";";
        ConnectionDB.ExcuteQueryUpdate(cauTruyVan);
    }

    public static KhachHangDTO LayKhachHangtheoMaDH(String maKH) {
        ResultSet rs;
        String cauTruyVanSQL = "Select * from khachhang where MaKH = '" + maKH + " '" + ";";

        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
        KhachHangDTO sp = new KhachHangDTO();
        try {
            while (rs.next()) {
                sp.setMaKH(rs.getInt("MaKH"));
                sp.setMaLoaiKH(rs.getInt("MaLoaiKH"));
                sp.setTenKhachHang(rs.getString("TenKH"));
                sp.setDiaChi(rs.getString("DiaChi"));
                sp.setGioitinh(rs.getInt("GioiTinh"));
                sp.setSDT(rs.getString("SoDienThoai"));
                sp.setLoaiKH(rs.getString("LoaiKH"));
                sp.setMota(rs.getString("MoTa"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return sp;
    }

    public static ResultSet TimKH(String tuKhoa) {
        ResultSet rs;
        String cauTruyVanSQL = "Select * from KhachHang "
                + "where TenKH like N'%" + tuKhoa + "%' "
                + "or SoDienThoai like N'%" + tuKhoa + "%'"
                + "or DiaChi like N'%" + tuKhoa + "%'" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
        return rs;
    }

    public static ResultSet TimKH2(String tuKhoa) {
        ResultSet rs;
        String cauTruyVanSQL = "Select * from KhachHang "
                + "where TenKH like N'%" + tuKhoa + "%' "
                + "or SoDienThoai like N'%" + tuKhoa + "%'"
                + "or MaLoaiKH like N'%" + tuKhoa + "%'"
                + "or DiaChi like N'%" + tuKhoa + "%'" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
        return rs;
    }

    public static ResultSet LayThongTinKHDuaVaoTenKH(String TenSanPham, String ID) {
        ResultSet rs;
        String SQLSelect = "select * from KhachHang inner join LoaiKhachHang on KhachHang.MaLoaiKH = LoaiKhachHang.MaLoaiKH  where   KhachHang.MaLoaiKH = " + ID + "" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
}
