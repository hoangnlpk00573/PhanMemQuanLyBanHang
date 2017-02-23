/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author HOANG
 */
public class HangHoaSPDAL {
    
     public static void CauTruyVanThemHangHoaSP(HangHoaSPDTO HH) {
        String SQLThem = "insert into SanPham(MaLoaiSanPham,TenSanPham,Imei,NgayNhap,GiaNhap,SoLuong,GiaBan,DonViTinh,HanBaoHanh,MoTa)"
                + " values("+HH.getMaLoaiSanpham()+",N'"+HH.getTenSanPham()+"',N'"+HH.getEmail()+"','"+HH.getNgayNhap()+"'"
                + ","+HH.getGiaNhap()+",N'"+HH.getSoLuong()+"','"+HH.getGiaBan()+"','"+HH.getDonViTinh()+"',N'"+HH.getHanBaoHanh()+"',N'"+HH.getMoTa()+"')" + ";";
        ConnectionDB.ExcuteQueryUpdate(SQLThem);
    }
     
 public static void CauTruyVanSuaHangHoaSP(HangHoaSPDTO HH) {
        String SQLSua = "update SanPham set  MaLoaiSanPham='"+HH.getMaLoaiSanpham()+"',TenSanPham = N'"+HH.getTenSanPham()+"'"
                + ",Imei = '"+HH.getEmail()+"',NgayNhap = '"+HH.getNgayNhap()+"',GiaNhap=N'"+HH.getGiaNhap()+"',SoLuong = N'"+HH.getSoLuong()+"'"
                + ",GiaBan = '"+HH.getGiaBan()+"',DonViTinh= '"+HH.getDonViTinh()+"',HanBaoHanh = N'"+HH.getHanBaoHanh()+"',MoTa = N'"+HH.getMoTa()+"' where IDSanPham = " +HH.getIDSanPham() + ";";
        ConnectionDB.ExcuteQueryUpdate(SQLSua);
    }

    public static void CauTruyVanXoaDonHang(String TenSanPham) {
        String SQlXoa = "delete a  from SanPham a INNER JOIN LoaiSanPham b on a.MaLoaiSanPham = b.MaLoaiSanPham where a.IDSanPham = "+TenSanPham+" "  + ";" ;
        ConnectionDB.ExcuteQueryUpdate(SQlXoa);
    }
    public static ResultSet CauTruyVanLayThongTinHangHoa() {
        ResultSet rs;
        String SQLSelect = "select * from LoaiSanPham inner join SanPham on SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham "  + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
    public static ResultSet CauTruyVanLayThongTinSanPham() {
        ResultSet rs;
        String SQLSelect = "select * from  SanPham  "  + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
     public static ResultSet CauTruyVanLayThongTinbangtonkho( ) {
        ResultSet rs;
        String SQLSelect = "select TenSanPham,DonViTinh,SoLuong,GiaBan,GiaNhap,HanBaoHanh from SanPham "  + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
      public static ResultSet CauTruyVanLayThongTinLSP() {
        ResultSet rs;
        String SQLSelect = "select * from LoaiSanPham"  + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
      public static ResultSet CauTruyVanLayThongTinTenLoaiLSP(String MaLoai) {
        ResultSet rs;
        String SQLSelect = "select * from LoaiSanPham where TenLoaiSanPham = "+MaLoai+" "  + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
    public static ResultSet TimSanPham(String tuKhoa ){
        ResultSet rs;        
        String cauTruyVanSQL = "Select * from SanPham "
                + "where TenSanPham like N'%" + tuKhoa + "%' "
                + "or SoLuong like N'%" + tuKhoa + "%'"
                +"or DonViTinh like N'%"+tuKhoa+"%'"  + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
         return rs;        
    }
     public static HangHoaSPDTO LaySanPhamtheoMaSP(String maSP){
        ResultSet rs;
        String cauTruyVanSQL = "Select * from SanPham  where MaLoaiSanPham = "+maSP+""  + ";";
        
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
        HangHoaSPDTO sp = new HangHoaSPDTO();
        try {
            while(rs.next()){
                sp.setTenSanPham(rs.getString("TenSanPham"));
                sp.setDonViTinh(rs.getString("DonViTinh"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                 sp.setGiaNhap(rs.getString("GiaNhap"));
                 sp.setGiaBan(rs.getString("GiaBan"));
                  sp.setHanBaoHanh(rs.getString("HanBaoHanh"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return sp;
    }
      public static ResultSet LayThongTinSPDuaVaoMaLoai(String MaLoaiSP) {
        ResultSet rs;
        String SQLSelect = "select * from SanPham inner join LoaiSanPham on SanPham.MaLoaiSanPham= LoaiSanPham.MaLoaiSanPham where SanPham.MaLoaiSanPham  = "+MaLoaiSP+" "  + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    } 
         public static ResultSet LayThongTinSPDuaVaoTenSanPham(String TenSanPham,String ID) {
        ResultSet rs;
        String SQLSelect = "select * from SanPham inner join LoaiSanPham on SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham  where   SanPham.MaLoaiSanPham = "+ID+""  + ";";
rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
}
