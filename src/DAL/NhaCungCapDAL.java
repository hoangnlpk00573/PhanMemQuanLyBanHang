/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhaCungCapDTO;
import java.sql.ResultSet;

/**
 *
 * @author QT
 */
public class NhaCungCapDAL {
    public static void Them(NhaCungCapDTO NCC){
        String cautruyvan="insert into NhaCungCap(TenNhaCungCap,DiaChi,SoDienThoai,MoTa)"
                + "values(N'"+ NCC.getTenncc()+"',N'"+NCC.getDiachi()+"',N'"+NCC.getSdt()+"',N'"+NCC.getMota()+"')" + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static void Xoa(String MaNCC){
        String cautruyvan="delete NhaCungCap where MaNhaCungCap= "+MaNCC+""  + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static void Sua(NhaCungCapDTO NCC){
        String cautruyvan="update NhaCungCap set TenNhaCungCap=N'"+NCC.getTenncc()+"',DiaChi=N'"+NCC.getDiachi()+"',SoDienThoai=N'"+NCC.getSdt()+"',MoTa=N'"+NCC.getMota()+"' where MaNhaCungCap ="+NCC.getMancc() + ";";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static ResultSet Select(){
        ResultSet rs;
        String cautruyvan="select * from NhaCungCap" + ";";
        rs= ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    }
    public static ResultSet Search(String tukhoa ){
        ResultSet rs;        
        String cautruyvan = "Select * from NhaCungCap "
                + "where MaNhaCungCap like N'%" + tukhoa + "%' "
                + "or TenNhaCungCap like N'%" + tukhoa + "%'"
                +"or DiaChi like N'%"+tukhoa+"%'"
                +"or SoDienThoai like N'%"+tukhoa+"%'"
                +"or MoTa like N'%"+tukhoa+"%'" + ";";              
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
         return rs;        
    }
}
