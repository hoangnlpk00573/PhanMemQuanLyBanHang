/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVienDTO;
import java.sql.ResultSet;

/**
 *
 * @author HOANG
 */
public class NhanVienDAL {
     public static void CauTruyVanThemNhanVien(NhanVienDTO NV) {
        String SQLThem = "insert into NhanVien(TenNhanVien,DiaChi,SoDienThoai,GioiTinh,CMND,ChucVu,NgaySinh,NgayVaoLam,UserName,Password,MaQuyen,MoTa)" 
     +"values(N'"+NV.getTenNhanVien()+"',N'"+NV.getDiaChi()+"','"+NV.getSDT()+"',"+NV.getGioitinh()+",'"+NV.getChungminhND()+"',N'"+NV.getChucvu()+"',"
                + "'"+NV.getNgaySinh()+"','"+NV.getNgayVaolam()+"',N'"+NV.getUsername()+"',N'"+NV.getPassword()+"','"+NV.getMaQuyen()+"',N'"+NV.getMota()+"')" + ";"  + ";";            
        ConnectionDB.ExcuteQueryUpdate(SQLThem);
    }
       public static void CauTruyVanSuaNhanVien(NhanVienDTO NV) {
        String SQLSua = "update NhanVien set TenNhanVien = N'"+NV.getTenNhanVien()+"',DiaChi = N'"+NV.getDiaChi()+"',SoDienThoai = '"+NV.getSDT()+"',GioiTinh = "+NV.getGioitinh()+",CMND = '"+NV.getChungminhND()+"'"
        + ",ChucVu = N'"+NV.getChucvu()+"',NgaySinh = '"+NV.getNgaySinh()+"',NgayVaoLam = '"+NV.getNgayVaolam()+"',UserName = N'"+NV.getUsername()+"',Password = N'"+NV.getPassword()+"',MaQuyen = '"+NV.getMaQuyen()+"',MoTa = N'"+NV.getMota()+"' where MaNhanVien = " + NV.getMaNhanVien() + ";" + ";";            
        ConnectionDB.ExcuteQueryUpdate(SQLSua);
    }
        public static void CauTruyVanXoaNhanVien(String NV) {
            String SQLxoa = "delete from NhanVien where MaNhanVien =" + NV +";" + ";";
        ConnectionDB.ExcuteQueryUpdate(SQLxoa);
        }
        public static ResultSet CauTruyvanNhanVien(){
            ResultSet rs;
            String Sql = "select * from NhanVien " + ";";
            rs =ConnectionDB.ExcuteQueryGetTable(Sql);
            return  rs;
        }
          public static ResultSet CauTruyvanNhanVienSanPham(){
            ResultSet rs;
            String Sql = "select * from NhanVien INNER JOIN SanPham ON NhanVien.MaNhanVien=SanPham.IDSanPham " +";";
            rs =ConnectionDB.ExcuteQueryGetTable(Sql);
            return  rs;
        }
        public static ResultSet TimLSP(String tuKhoa ){
        ResultSet rs;        
        String cauTruyVanSQL = "Select * from NhanVien "
                + "where TenNhanVien like N'%" + tuKhoa + "%' "
                + "or DiaChi like N'%" + tuKhoa + "%' or GioiTinh like N'%" + tuKhoa + "%'"
                + "or ChucVu like N'%" + tuKhoa + "%'or UserName like N'%" + tuKhoa + "%'" +";";
               rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
        
        return rs;        
    }public static ResultSet CauTruyvanUserNhanVien(){
            ResultSet rs;
            String Sql = "select UserName from NhanVien " + ";";
            rs =ConnectionDB.ExcuteQueryGetTable(Sql);
            return  rs;
        }
}
