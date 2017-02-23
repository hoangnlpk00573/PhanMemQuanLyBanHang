/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 From Bảo HÀnh
 */
package BLL;

import DAL.BaoHanhDAL;
import DTO.BaohanhDTO;
import Presentation.MainClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOANG
 */
public class BaoHanhBLL {
    public static boolean kiemTra(BaohanhDTO BH){
        boolean ketQua = true;
       if(BH.getGia().trim().equals("") ){
            MainClass.ThongBao("Chưa nhập Tên sản phẩm", "Thông Báo", 1);
            return false;
       }
        return ketQua;
    }
    // Hàm Lấy thông tin dữ liệu trong DAL
    public static void ThemPhanBaoHanh(BaohanhDTO BH){
        boolean ketQua = kiemTra(BH);
        if(ketQua){
            BaoHanhDAL.ThemBaohanh(BH);
        }
    }
    public static void SuaDonhang(BaohanhDTO BH){
        boolean ketQua = kiemTra(BH);
        if(ketQua){
            BaoHanhDAL.SuaBaoHanhTheoMa(BH);
        }
    }
      public static ResultSet LayTatCaBaoHanh(){
        ResultSet rs;
        rs = BaoHanhDAL.LayDanhSachBaoHanh();
        return rs;
    }
    public static void DoDuLieuVaoJTableBaoHanh(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Mã Sản Phẩm","Tên Sản Phẩm","Tên Loại Sản Phẩm", "Số seri", "Số Lượng","Mô Tả lỗi","Giá Sản Phẩm","Ngày Mua"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[8];
                 item[0] = rs.getInt("IDSanPham");
                 item[1] = rs.getString("TenSanPham");
                item[2] = rs.getInt("MaLoaiSanPham");
                   if(rs.getInt("MaLoaiSanPham")== 1){
                   item[2] = "Nokia";
               }else if(rs.getInt("MaLoaiSanPham")== 2){
                   item[2] = "Samsung";
               }else if(rs.getInt("MaLoaiSanPham")== 3){
                    item[2] = "HTC";
               }else if(rs.getInt("MaLoaiSanPham")== 4){
                    item[2] = "Apple";
               }else if(rs.getInt("MaLoaiSanPham")== 5){
                    item[2] = "LG";
               }else if(rs.getInt("MaLoaiSanPham")== 6){
                    item[2] = "Sony";
               }else if(rs.getInt("MaLoaiSanPham")== 7){
                    item[2] = "Oppo";
               }
                item[3] = rs.getString("Soseri");
                item[4] = rs.getInt("SoLuong");
                item[5]= rs.getString("MoTaLoi");
                item[6] = rs.getString("Gia");
                item[7] = rs.getString("NgayMua");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
      public static BaohanhDTO LayBaoHanhtheoMaBH(String MaDH){
        BaohanhDTO DH = new BaohanhDTO();
        if(!MaDH.equals("")){
            DH = BaoHanhDAL.LayBaohanhtheoMaBaoHanh(MaDH);
        }else{
            MainClass.ThongBao("Chưa Nhập Khách hàng", MaDH, 0);
        }
        return DH;
    }
}
