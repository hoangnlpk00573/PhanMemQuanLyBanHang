/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DAL.ConnectionDB;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ridotoji Pham
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static ConnectionDB Connection = new ConnectionDB();

    public static frmDangNhap frm = new frmDangNhap();
    public static void main(String[] args) {
        // TODO code application logic here
          

           frm.show();
    }
     public static void ThongBao(String noiDung, String tieuDe, int icon){
        JOptionPane.showMessageDialog(new JFrame(), noiDung, tieuDe, icon);
    }
     
}
