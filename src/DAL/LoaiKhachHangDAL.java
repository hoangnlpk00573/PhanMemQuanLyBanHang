/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiKhachHangDTO;
import java.sql.ResultSet;

/**
 *
 * @author HOANG
 */
public class LoaiKhachHangDAL {
    public static void CauTruyVanThemLoaiKhachHang(LoaiKhachHangDTO LKH) {
        String Them = "insert into LoaiKhachHang(TenLoaiKH,GhiChu)" +
               "values(N'"+LKH.getTenLoaiKhachhang()+"',N'"+LKH.getMota()+"')" + ";";            
        ConnectionDB.ExcuteQueryUpdate(Them);
    }
        public static ResultSet CauTruyvanTatCaLKH(){
            ResultSet rs;
            String Sql = "select * from LoaiKhachHang" + ";";
            rs =ConnectionDB.ExcuteQueryGetTable(Sql);
            return  rs;
        }
       
           public static void CauTruyVanSuaLoaiKH(LoaiKhachHangDTO LKH) {
        String SQLSua = "update LoaiKhachHang set TenLoaiKH = "+LKH.getTenLoaiKhachhang()+",GhiChu = "+LKH.getMota()+" where MaLoaiKH ="+ LKH.getMaLoaiKhachHang() + ";";            
        ConnectionDB.ExcuteQueryUpdate(SQLSua);
    }
        public static void CauTruyVanXoaLKH(String LKH){
            String SQLxoa = "delete from LoaiKhachHang where MaLoaiKH =" +""+ LKH+"" + ";";
        ConnectionDB.ExcuteQueryUpdate(SQLxoa);
        }
}
