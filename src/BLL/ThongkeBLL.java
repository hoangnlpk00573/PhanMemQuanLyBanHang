/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import DAL.ThongKeDAL;
import DTO.SanPhamDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOANG
 */
public class ThongkeBLL {
   
     public static void DoDuLieuVaoJTableSanPham(ResultSet rs, JTable tableTam ){
       Calendar cal = new GregorianCalendar();
        Object []objs = new Object[]{"Ngày Bán Sản Phẩm","Doanh số Bán Hàng","Trị Giá Nhập Hàng", "Lợi Nhuận"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
     try {
            while(rs.next()){
                Object[] item = new Object[4];
                 item[0] = rs.getString("NgayNhap");
                item[1] = rs.getInt("SoLuong");
                item[2] = rs.getString("GiaNhap");
                item[3] = rs.getString("GiaBan")  ;
                   tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
     public static void JTablethuchi(ResultSet rs, JTable tableTam) {
        Object[] objs = new Object[]{"Số Thứ tự", "Ngày", "Mã Nhân Viên", "Số CV", "Người Nộp/Nhận", "Nội Dung","Số Tiền","Ghi chú"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[8];
                item[0] = tableTam.getRowCount()+1;
                item[1] = rs.getString("NgayNhap");
                item[2] = rs.getString("MaNhanVien");
                item[3] = rs.getString("ChucVu");
                item[4] = rs.getString("TenKH");
                item[5] = rs.getString("MoTa");
                item[6] = rs.getString("GiaBan");
                item[7] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
      public static ResultSet LaySanPhamTheoTuKhoa(String tuKhoa){
        ResultSet rs;
        rs = ThongKeDAL.TimSanPhamtrongbangthongke(tuKhoa);
        
        return rs;
    }
}
