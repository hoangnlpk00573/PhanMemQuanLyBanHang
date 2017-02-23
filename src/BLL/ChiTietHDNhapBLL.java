/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChiTietHDNhapDAL;
import DAL.ConnectionDB;
import DTO.ChiTietHDNhapDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QT
 */
public class ChiTietHDNhapBLL {    
      public static void Them(ChiTietHDNhapDTO HDN){        
              ChiTietHDNhapDAL.Them(HDN);         
      }     
       public static void DoDuLieu(ResultSet rs, JTable cthdn) {
        Object[] objs = new Object[]{"Mã Chi Tiết HD Nhập", "Mã HD Nhập", "ID Sản Phẩm","Số Lượng","Đơn Vị Tính","Đơn Giá","Thành Tiền","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        cthdn.setModel(tableModel);
        try {
            while (rs.next()) {
                Object[] item = new Object[8];
                item[0] = rs.getInt("MaChiTietHDNhap");
                item[1] = rs.getInt("MaHoaDonNhap");
                item[2] = rs.getInt("IDSanPham");
                item[3] = rs.getInt("SoLuong");
                item[4] = rs.getString("DonViTinh");
                item[5] = rs.getDouble("DonGia");
                item[6] = rs.getDouble("ThanhTien");
                item[7] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }              
     public static ResultSet LayTatCaHoaDonNhap() {     
        ResultSet rs;
        rs = ChiTietHDNhapDAL.LayTatCaHDNhap();
        return rs;  
    }
     public static void Sua(ChiTietHDNhapDTO cthdn) {       
            ChiTietHDNhapDAL.Sua(cthdn);      
    }
     public static void Xoa(String macthdn) {
        if (macthdn.equals("")) {

        } else {
            ChiTietHDNhapDAL.Xoa(macthdn);
        }
    }   
}
