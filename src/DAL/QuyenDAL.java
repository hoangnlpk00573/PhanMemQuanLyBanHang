/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.QuyenDTO;
import java.sql.ResultSet;

/**
 *
 * @author HOANG
 */
public class QuyenDAL {
    public static void CauTruyVanThemQuyen(QuyenDTO Q) {
        String SQLThem = "insert into Quyen(TenQuyen,MoTa)" +"values('"+Q.getTenQuyen()+"',N'"+Q.getMota()+"' )" + ";";            
        ConnectionDB.ExcuteQueryUpdate(SQLThem);
    }
       public static void CauTruyVanSuaQuyen(QuyenDTO Q) {
        String SQLSua = "update Quyen set TenQuyen = N'"+Q.getTenQuyen()+"',MoTa = N'"+Q.getMota()+"' where MaQuyen = "+ Q.getMaQuyen() + ";";            
        ConnectionDB.ExcuteQueryUpdate(SQLSua);
    }
         public static void CauTruyVanXoaQuyen(String Q) {
        String SQLXoa = "delete from Quyen where TenQuyen = '"+Q+"'"  + ";";            
        ConnectionDB.ExcuteQueryUpdate(SQLXoa);
    }
        public static ResultSet CauTruyvanTatCa(){
            ResultSet rs;
            String Sql = "select * from Quyen" + ";";
            rs =ConnectionDB.ExcuteQueryGetTable(Sql);
            return  rs;
        }
        public static ResultSet TimLSP(String tuKhoa ){
        ResultSet rs;        
        String cauTruyVanSQL = "Select * from Quyen "
                + "where MaQuyen like N'%" + tuKhoa + "%' "
                + "or TenQuyen like N'%" + tuKhoa + "%'" + ";";
               rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
        
        return rs;        
    }
}
