/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiSanPhamDTO;
import java.sql.ResultSet;

/**
 *
 * @author Ridotoji Pham
 */
public class LoaiSanPhamDAL {
       public static void CauTruyVanThemLoaiSanPham(LoaiSanPhamDTO LSP) {
        String Them = "insert into LoaiSanPham(TenLoaiSanPham,MoTa)" +
               "values(N'"+LSP.getTenLoaiSP()+"',N'"+LSP.getMoTa()+"')" + ";";            
        ConnectionDB.ExcuteQueryUpdate(Them);
    }
        public static ResultSet CauTruyvanTatCaLSP(){
            ResultSet rs;
            String Sql = "select * from LoaiSanPham" + ";";
            rs =ConnectionDB.ExcuteQueryGetTable(Sql);
            return  rs;
        }
      
           public static void CauTruyVanSuaLoaiSanPham(LoaiSanPhamDTO LSP) {
        String SQLSua = "update LoaiSanPham set TenLoaiSanPham=N'"+LSP.getTenLoaiSP()+"',MoTa=N'"+LSP.getMoTa()+"' where MaLoaiSanPham ="+LSP.getMaLoaiSanPham() + ";";
        ConnectionDB.ExcuteQueryUpdate(SQLSua);
    }
        public static void CauTruyVanXoaLSP(String LSP){
            String SQLxoa = "delete from LoaiSanPham where TenLoaiSanPham ='"+LSP+"'" + ";";
        ConnectionDB.ExcuteQueryUpdate(SQLxoa);
        }
}
