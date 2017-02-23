/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChiTietHDNhapDTO;
import java.sql.ResultSet;


/**
 *
 * @author QT
 */
public class ChiTietHDNhapDAL {

    public static void Them(ChiTietHDNhapDTO HDN) {
        String cautruyvan = "insert into ChiTietHDNhap(MaHoaDonNhap,IDSanPham,SoLuong,DonViTinh,DonGia,ThanhTien,MoTa)"
                + "values('" + HDN.getMahdnhap() + "','" + HDN.getIdsp() + "','" + HDN.getSoluong() + "','" + HDN.getDonvitinh()+ "','" + HDN.getGianhap() + "','" + HDN.getThanhtien() + "','" + HDN.getMota() + "')" + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }

    public static void Sua(ChiTietHDNhapDTO CTHDN) {
        String cautruyvan = "update ChiTietHDNhap set SoLuong=N'" + CTHDN.getSoluong()+ "',DonViTinh='"+CTHDN.getDonvitinh()+"',DonGia='"+CTHDN.getGianhap()+"',ThanhTien='"+CTHDN.getThanhtien()+"',MoTa='"+CTHDN.getMota()+"' where MaChiTietHDNhap =" + CTHDN.getMachitiethdnhap() + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static void Xoa(String macthdn) {
        String cautruyvan = "delete from ChiTietHDNhap where MaChiTietHDNhap= " + macthdn + "" + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static ResultSet LayTatCaHDNhap() {
        ResultSet rs;
        String cautruyvan = "select * from ChiTietHDNhap" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    } 
}
