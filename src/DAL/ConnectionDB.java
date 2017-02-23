/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.*;

public class ConnectionDB {
    static Connection con;
    public ConnectionDB() {
 try {
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_dtdm", "root", "");
     Statement st = con.createStatement();
 } catch (Exception ex) {
     System.out.println("Error: " + ex);
     
 }
    }    
     /**
     * Hàm thực thi câu lệnh Select
     * Đầu vào: @CauTruyVanSQL - Câu truy vấn Select cần thực thi
     * Đầu ra: ResultSet - Bảng dữ liệu, vì câu Select trả về bảng dữ liệu
     * @param cauTruyVan
     * @return 
     */
    public static ResultSet ExcuteQueryGetTable(String cauTruyVan){
        try {
            ResultSet rs;
            Statement st = (Statement) con.createStatement();
            rs = st.executeQuery(cauTruyVan);
            return rs;
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return null;    
    }
    /**
     * Hàm thực thi câu lệnh update, delete, insert
     * Đầu vào: @CauTruyvan 
     * Đầu ra: Thực thi và cập nhập vào CSDL
     * @param cauTruyVan
     */
    public static void ExcuteQueryUpdate(String cauTruyVan){
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(cauTruyVan);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
