/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.QuyenDAL;
import DTO.QuyenDTO;
import Presentation.MainClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOANG
 */
public class QuyenBLL {
    public static void DoDuLieuVaoJTableQuyentrongBangNhanvien(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Nhóm"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[1];
                item[0] = rs.getString("TenQuyen");
                
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
     public static void DoDuLieuVaoJTableQuyen(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Mã Quyền","Tên Quyền ","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[3];
                item[0] = rs.getInt("MaQuyen");
                item[1] = rs.getString("TenQuyen");
                item[2] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
     public static boolean kiemTra(QuyenDTO Q){
        boolean ketQua = true;
       if(Q.getTenQuyen().trim().equals("")){
            MainClass.ThongBao("Chưa nhập Quyền", "Thông Báo", 1);
            return false;
        }
        return ketQua;
    }
    // Hàm Lấy thông tin dữ liệu trong DAL
    public static void ThemQuyen(QuyenDTO Q){
        boolean ketQua = kiemTra(Q);
        if(ketQua){
           QuyenDAL.CauTruyVanThemQuyen(Q);
        }
    }
    public static void SuaQuyen(QuyenDTO KH){
        boolean ketQua = kiemTra(KH);
        if(ketQua){
            QuyenDAL.CauTruyVanSuaQuyen(KH);
        }
    }
    public static void XoaQuyen(String maCanXoa){
        if(maCanXoa.equals("")){
         
        }else{
             QuyenDAL.CauTruyVanXoaQuyen(maCanXoa);
        }
    }
     public static ResultSet LayTatCaQuyen(){
        ResultSet rs;
        rs = QuyenDAL.CauTruyvanTatCa();
        return rs;
    }
    // Hàm tìm kiếm
    public static ResultSet LaySanPhamTheoTuKhoa(String tuKhoa){
        ResultSet rs;
        rs = QuyenDAL.TimLSP(tuKhoa);
        
        return rs;
    }
}
