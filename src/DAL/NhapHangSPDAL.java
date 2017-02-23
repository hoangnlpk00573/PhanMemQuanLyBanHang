/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhapHangSPDTO;
import java.sql.ResultSet;

/**
 *
 * @author QT
 */
public class NhapHangSPDAL {
    public static void ThemSP(NhapHangSPDTO TSP) {
        String cautruyvan = "insert into SanPham(MaLoaiSanPham,TenSanPham,Imei,NgayNhap,GiaNhap,SoLuong,GiaBan,DonViTinh,HanBaoHanh,MoTa)" +
                "values('"+TSP.getMaloaisp()+"',N'"+TSP.getTensp()+"',"
                + "'"+TSP.getImei()+"','"+TSP.getNgaynhap()+"','"+TSP.getGianhap()+"','"+TSP.getSoluong()+"','"+TSP.getGiaban()+"'"
                + ",'"+TSP.getDonvitinh()+"','"+TSP.getHanbaohanh()+"','"+TSP.getMota()+"')" + ";";            
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static ResultSet LaySPTheoIDSP(int idsp){
            ResultSet rs;
            String cauTruyVan = "select * from SanPham where IDSanPham = " + idsp + ";"; 
            rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVan);
            return rs;
        }   
public static ResultSet SelectSP(){
        ResultSet rs;
        String cautruyvan = "select * from SanPham" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    }
public static ResultSet LayMaVaTenSanPham(){
    ResultSet rs;
    String cautruyvan = "select IDSanPham,TenSanPham from SanPham " + ";";
    rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
    return rs;
}
public static ResultSet LayTenLoaiSanPham(){
    ResultSet rs;
    String cautruyvan = "select* from LoaiSanPham " + ";";
    rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
    return rs;
}
public static ResultSet TimSanPhamTheoMaVaTen(String tukhoa){
    ResultSet rs;
    String cautruyvan = "select * from SanPham "
            + "where IDSanPham like N'%" + tukhoa + "%' "
            + "or TenSanPham like N'%" + tukhoa + "%'" + ";";
    rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
    return rs;
}
    public static void SuaTenSP(NhapHangSPDTO TTSP) {
        String cautruyvan = "update SanPham set TenSanPham=N'" + TTSP.getTensp() + "'where IDSanPham =" + TTSP.getIdsp() + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }

    public static void XoaTenSP(String IDSP) {
        String cautruyvan = "delete SanPham where IDSanPham= "+IDSP+""  + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static ResultSet LayThongTinSP(String maloaisp){
    ResultSet rs;
    String cautruyvan = "select * from SanPham inner join LoaiSanPham on SanPham.MaLoaiSanPham=LoaiSanPham.MaLoaiSanPham where SanPham.MaLoaiSanPham = "+maloaisp+" " + ";";
    rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
    return rs;
}
}
