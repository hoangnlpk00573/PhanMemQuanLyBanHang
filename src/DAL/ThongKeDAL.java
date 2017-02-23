/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.ResultSet;

/**
 *
 * @author HOANG
 */
public class ThongKeDAL {
        public static ResultSet CauTruyVanLayThongTinSP() {
        ResultSet rs;
        String SQLSelect = "select * from SanPham " + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
     public static ResultSet CauTruyVanthuchi() {
        ResultSet rs;
        String SQLSelect = "select NgayNhap,MaNhanVien ,ChucVu,TenKH,KhachHang.MoTa,GiaBan,NhanVien.MoTa from SanPham,NhanVien,KhachHang where SanPham.IDSanPham=NhanVien.MaNhanVien and SanPham.IDSanPham=KhachHang.MaKH " + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
      public static ResultSet TimSanPham(String tuKhoa ){
        ResultSet rs;        
        String cauTruyVanSQL = "Select * from SanPham,NhanVien,KhachHang "
                + "where NgayNhap like N'%" + tuKhoa + "%' "
                 +"or TenKH like N'%"+tuKhoa+"%'"
                +"or GiaBan like N'%"+tuKhoa+"%'" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
         return rs;        
    }
       public static ResultSet TimSanPhamtrongbangthongke(String tuKhoa ){
        ResultSet rs;        
        String cauTruyVanSQL = "Select * from SanPham "
                + "where NgayNhap like N'%" + tuKhoa + "%' "
                + "or SoLuong like N'%" + tuKhoa + "%'"
                +"or GiaBan like N'%"+tuKhoa+"%'"
                +"or GiaNhap like N'%"+tuKhoa+"%'" + ";";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
         return rs;        
    }
}
