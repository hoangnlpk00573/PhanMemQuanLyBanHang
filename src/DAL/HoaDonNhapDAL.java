/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.HoaDonNhapDTO;
import java.sql.ResultSet;

/**
 *
 * @author Ridotoji Pham
 */
public class HoaDonNhapDAL {
      public static ResultSet CauTruyVanLayThongTinHoaDon() {
        ResultSet rs;
        String SQLSelect = "select TenSanPham,Imei,SanPham.MoTa,SoLuong,GiaBan,NgayNhap,LoaiSanPham.MoTa from SanPham INNER JOIN LoaiSanPham " +
"on SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
    public static void Them(HoaDonNhapDTO HDN) {
        String cautruyvan = "insert into HoaDonNhap(SoHDNhap,NgayTao,MaNhanVien,MaNhaCungCap,TinhTrang,TongTien,MoTa)"
                + "values(N'" + HDN.getSohdn()+ "',N'" + HDN.getNgaytao()+ "',N'" + HDN.getManv()+ "',N'" + HDN.getMancc()+ "'"
                + ",N'" + HDN.getTinhtrang()+ "',N'" + HDN.getTongtien()+ "',N'" + HDN.getMota() + "')" + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }

    public static void Sua(HoaDonNhapDTO HDN) {
        String cautruyvan = "update HoaDonNhap set SoHDNhap=N'"+HDN.getSohdn()+"',NgayTao=N'" + HDN.getNgaytao()+ "',MaNhanVien='"+HDN.getManv()+"',MaNhaCungCap='"+HDN.getMancc()+"',TinhTrang='"+HDN.getTinhtrang()+"',TongTien='"+HDN.getTongtien()+"',MoTa='"+HDN.getMota()+"' where MaHoaDonNhap =" + HDN.getMahdn() + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static void Xoa(String mahdn) {
        String cautruyvan = "delete from HoaDonNhap where MaHoaDonNhap = " + mahdn + "" + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }   
    public static ResultSet LayTatCaHD() {
        ResultSet rs;
        String cautruyvan = "select * from HoaDonNhap" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    }
    public static ResultSet LayMaHDNhap(int mahdnhap) {
        ResultSet rs;
        String cauTruyVan = "select * from HoaDonNhap where MaHoaDonNhap = " + mahdnhap + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVan);
        return rs;
    }
    public static ResultSet LayMaNV() {
        ResultSet rs;
        String cauTruyVan = "select MaNhanVien from NhanVien" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVan);
        return rs;
    }
    public static ResultSet LayMaNCC() {
        ResultSet rs;
        String cauTruyVan = "select MaNhaCungCap from NhaCungCap" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVan);
        return rs;
    }  
}
