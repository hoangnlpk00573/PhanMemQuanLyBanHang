/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.ResultSet;

/**
 *
 * @author truong
 */
public class LoginDAL {
    public static ResultSet LayNVTheoMa(String userNam, String Pass){
        ResultSet rs;
        String cautruyvan = "select * from db_dtdm.nhanvien where UserName= '" + userNam + "' and Password= '" + Pass + "'" + ";";
       
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        
        return rs;
    }
}
