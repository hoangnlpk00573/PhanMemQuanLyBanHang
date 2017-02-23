/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoginDAL;
import Presentation.FrmChinh;
import Presentation.MainClass;
import Presentation.frmDangNhap;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sun.applet.Main;

/**
 *
 * @author truong
 */
public class LoginBLL {
    public static boolean KiemTra(String tdn, String mk) {    
        boolean kq = false;
        ResultSet rs;
        rs = LoginDAL.LayNVTheoMa(tdn,mk);
        
        
        
        try {
            if(rs.next()){
                kq=true;
                quyen = rs.getInt("MaQuyen");
                manv = rs.getInt("MaNhanVien");
                matkhau=rs.getString("Password");
            }    
        } catch (SQLException ex) {
            System.out.println("lỗi đăng nhập");
        }
        
       
        return kq;
    }
    public static int quyen = 0;
    public static  int manv = 0;
    public static  String matkhau = "";
    public static void thoat(){
        
        int kq=JOptionPane.showConfirmDialog(null, "Bạn Muốn Thoát Chương Trình ?","WARNING",JOptionPane.YES_NO_OPTION);
        if(kq==0)
        {
        System.exit(0);
        }
    }
    public static void DangXuat(){
        int kq = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Đăng Xuất ?","WARNING",JOptionPane.YES_NO_OPTION);
        if(kq==0)
        {
            frmDangNhap.frm.hide();
            
            MainClass.frm.show();
            
        }
    }
}
