/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachHangDAL;
import DAL.SanPhamDAL;
import DTO.ChiTietHoaDon;
import DTO.SanPhamDTO;
import Presentation.MainClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ridotoji Pham
 */
public class SanPhamBLL {
    public static void DanhSachBanHang(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"ID Sản phẩm","Tên Sản Phẩm"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[2];
                item[0] = rs.getString("IdSanPham");
                item[1] = rs.getString("TenSanPham");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
    public static ResultSet LayTatCaSP(){
        ResultSet rs;
        rs = SanPhamDAL.CauTruyvantatca();
        return rs;
    }
      
    public  static boolean KiemTra(SanPhamDTO SP0){
        boolean Ketqua = true;
        if(SP0.getEmail().equals(Ketqua)){
           System.out.println("Please In Print ");
           return  false;
        }
        return Ketqua;
   }
  public  static void ThemSP(SanPhamDTO SP0){
       boolean Ketqua = KiemTra(SP0);
       if (Ketqua) {
          SanPhamDAL.CauTruyVanThemSP(SP0);
      }
  }
   
    public static void DoDuLieuVaoJTableSanPham(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Sản Phẩm", "Số Lượng", "Đơn giá","Thành tiền"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[4];
                item[0] = rs.getString("TenSanPham");
                item[1] = rs.getInt("SoLuong");
                item[2] = rs.getString("GiaBan");
                item[3] = rs.getString("GiaNhap");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }   
    
    public static ChiTietHoaDon TaoChiTietHoaDon(ResultSet rs, int soluong){
        ChiTietHoaDon cthd = new ChiTietHoaDon();
        try {
            while(rs.next()){
                
                String tenSP = rs.getString("TenSanPham");
                //int Soluong = rs.getInt("SoLuong");
                int GiaBan = rs.getInt("GiaBan");
                int ThanhTien = soluong*GiaBan;
                int maSP = rs.getInt("IdSanPham");
             cthd.setMaSP(maSP);
             cthd.setTenSP(tenSP);
             cthd.setSoluong(soluong);
             cthd.setDonGia(GiaBan);
             cthd.setThanhTien(ThanhTien);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return cthd;
    }
    
    public static void DoDuLieuVaoJTableCTHD(ChiTietHoaDon cthd, JTable tableTam){
        Object []objs = new Object[]{"Tên Sản Phẩm", "Số Lượng", "Đơn giá","Thành tiền"};
         DefaultTableModel tableModel = (DefaultTableModel) tableTam.getModel();
        tableTam.setModel(tableModel);
        
       
                Object[] item = new Object[4];
                item[0] = cthd.getTenSP();
                item[1] = cthd.getSoluong();
                item[2] = cthd.getDonGia();
                item[3] = cthd.getThanhTien();
                tableModel.addRow(item);
           
    } 
    
    public static String[] InputDialogSoLuongSanPham(String tieuDe, String maSP){
        // Hàm tao table Để liên kế với  Jtable liên kết
        String[] info = new String[2];
        JLabel lblTenSP = new JLabel();
        lblTenSP.setText(maSP);
          JTextField txtGhiChu = new JTextField();
        // Thư mục để tạo nội dung của bảng
        Object[] message = {
            "Tên sản phẩm:", lblTenSP,
            "Nhập ghi chú:", txtGhiChu,
            
        };
        int option = JOptionPane.showConfirmDialog(new JFrame(), message, tieuDe, JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION)
        {
            info[0] = lblTenSP.getText();
           info[1] = txtGhiChu.getText();
    
        }else{
            info = null;
        }

        
        return info;
    }
        public static SanPhamDTO LaySanPhamTheoMaSP(String MaSP){
            SanPhamDTO sp = new SanPhamDTO();
            if(!MaSP.equals("")){
                sp = SanPhamDAL.LaySanPhamtheomaSanPham(MaSP);
            }else{
                MainClass.ThongBao("Chưa Có Mã Sản Phẩm", "Thông Báo", 0);
            }
            return sp;
        }
        public static int ViTriSanPhamBiTrung(JTable tblTam, String IDSanPham ){
        int viTri = -1;
        
        for(int i = 0; i < tblTam.getRowCount(); i++){
            String IDSPTrongTable = tblTam.getValueAt(i, 11).toString();
            
            if(IDSPTrongTable.equals(IDSanPham)){
                viTri = i;
            }
        }
        
        return  viTri;
    }
        public static void ThemSanPhamVaoBang(JTable tableTam, 
            SanPhamDTO sp, String soLuong, String ghiChu){
       DefaultTableModel tableModel = (DefaultTableModel) tableTam.getModel();
        
        Object[] item = new Object[11];

        item[0] = tableTam.getRowCount() + 1;
        item[1] = sp.getIdSanPham();
        item[2] = sp.getMaLoaiSanPham();
        item[3] = sp.getTenSanPham();
        item[4] = sp.getEmail();
        item[5] = sp.getHanBaoHanh();
        item[6] = soLuong;
        item[7] = sp.getDonViTinh();
        item[8] = sp.getGiaBan();
        item[9] = sp.getGiaNhap();
        item[10] = sp.getMoTa();
        tableModel.addRow(item);
        
        }
         public static void AddProductDuplicate(JTable tblTam, 
            int viTriTrung, int soLuong){
        int soLuongODongTrung = 
                Integer.parseInt( tblTam.getValueAt(viTriTrung, 4).toString());
        int tongSoLuong = soLuongODongTrung + soLuong;
        
        tblTam.setValueAt(tongSoLuong, viTriTrung, 4);
        
        double donGia = 
                Double.parseDouble(tblTam.getValueAt(viTriTrung, 3).toString());
        double thanhTien = donGia * tongSoLuong;
        
        tblTam.setValueAt(thanhTien, viTriTrung, 5);
        
    }
         public static void XoaSanPhamne(int maCanXoa) {
            SanPhamDAL.XoaSanPham(maCanXoa);
    }
        public static void LayDanhSachSP(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Sản Phẩm", "Số Lượng", "Đơn giá","Thành tiền"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[4];
                item[0] = rs.getString("TenSanPham");
                item[1] = rs.getInt("SoLuong");
                item[2] = rs.getString("GiaBan");
                item[3] = rs.getString("GiaNhap");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
        public static ResultSet LayThongTinKH(String maSP){
        ResultSet rs;
        rs = SanPhamDAL.LayThongTinSP(maSP);   
        return rs;
    }
        public static ResultSet LayTenSP(String tuKhoa){
        ResultSet rs;
        rs = SanPhamDAL.Timsp(tuKhoa);
        
        return rs;
    }
        
}
