/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DTO.*;
import DAL.*;
import Presentation.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author HOANG
 */
public class HangHoaSPBLL {
    public static String[] InputDialogSoLuongSanPham(String tieuDe, String LoaiSP){
        // Hàm tao table Để liên kế với  Jtable liên kết
        String[] info = new String[2];
       JTextField txtLSP = new JTextField();
        JTextField txtMota = new JTextField();
        // Thư mục để tạo nội dung của bảng
        Object[] message = {
            "Loại sản phẩm:", txtLSP,
            "Mô Tả:", txtMota,
           };
        int option = JOptionPane.showConfirmDialog(new JFrame(), message, tieuDe, JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION)
        {
            info[0] = txtLSP.getText();
            info[1] = txtMota.getText();
         }else{
            info = null;
        }return info;
    }
    // Thư mục Thêm dữ liệu vào table
    public static void ThemSanPhamVaoHangHoa(JTable tableTam, 
            HangHoaSPDTO sp, String soLuong, String ghiChu){
      DefaultTableModel tableModel = (DefaultTableModel) tableTam.getModel();
       Object[] item = new Object[7];

        item[0] = tableTam.getRowCount() + 1;
        item[1] = sp.getTenSanPham();
        item[2] = sp.getDonViTinh();
        item[3] = soLuong;
        item[4] = sp.getGiaNhap();
        item[5] = sp.getGiaBan();
        item[6] = sp.getHanBaoHanh();
        tableModel.addRow(item);
}
     public static ResultSet LaySanPhamTheoMaLoaiSP(String maLoaiSP){
        ResultSet rs;
        rs = HangHoaSPDAL.LayThongTinSPDuaVaoMaLoai(maLoaiSP);
        
        return rs;
    }
       public static ResultSet LaySanPhamTheoTenSanPham(String TenSP,String ID){
        ResultSet rs;
        rs = HangHoaSPDAL.LayThongTinSPDuaVaoTenSanPham(TenSP,ID);
        
        return rs;
    }
    // Hàm tính số tiền cần add 
    public static double TinhTien(JTable tblCTHD, int chiSoCotThanhTien){
        double tongTien = 0;
        
        for(int i=0; i < tblCTHD.getRowCount(); i++ ){
            tongTien += Double.parseDouble(
                    tblCTHD.getValueAt(i, chiSoCotThanhTien).toString());
        }
        
        return tongTien;
    }
    // thư mục xóa cột cần xóa
    public static void RemoveRowInTable(JTable tblTam, int viTriDong){
        DefaultTableModel tableModel = (DefaultTableModel) tblTam.getModel();
        
        tableModel.removeRow(viTriDong);
    }
  // thư mục kiểm tra dữ liệu giống nhau trong bảng
    public static int ViTriSanPhamBiTrung(JTable tblTam, String IDSanPham ){
        int viTri = -1;
        
        for(int i = 0; i < tblTam.getRowCount(); i++){
            String IDSPTrongTable = tblTam.getValueAt(i, 7).toString();
            
            if(IDSPTrongTable.equals(IDSanPham)){
                viTri = i;
            }
        }
        
        return  viTri;
    }
    // tính số lượng và số tiền cần trả 
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
  public static void DoDuLieuVaoJTableDonHang(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Mã Sản Phẩm","Đơn Hàng","Tên Loại Sản Phẩm", "Đơn Vị tính", "Số Lượng","Giá Mua","Giá bán","Bảo hành"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[8];
                 item[0] = rs.getInt("IDSanPham");
                item[1] = rs.getString("TenSanPham");
                item[2] = rs.getString("TenLoaiSanPham");
                item[3] = rs.getString("DonViTinh");
                item[4] = rs.getInt("SoLuong");
                item[5]= rs.getInt("GiaNhap");
                item[6] = rs.getInt("GiaBan");
                item[7] = rs.getString("HanBaoHanh");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
  public static boolean kiemTra(HangHoaSPDTO DH){
        boolean ketQua = true;
       if(DH.getTenSanPham().trim().equals("")){
            MainClass.ThongBao("Chưa nhập Tên sản phẩm", "Thông Báo", 1);
            return false;
        }
        return ketQua;
    }
    // Hàm Lấy thông tin dữ liệu trong DAL
    public static void ThemDonhang(HangHoaSPDTO DH){
        boolean ketQua = kiemTra(DH);
        if(ketQua){
            HangHoaSPDAL.CauTruyVanThemHangHoaSP(DH);
        }
    }
    public static void SuaDonhang(HangHoaSPDTO KH){
        boolean ketQua = kiemTra(KH);
        if(ketQua){
            HangHoaSPDAL.CauTruyVanSuaHangHoaSP(KH);
        }
    }
    public static void XoaDonHang(String maCanXoa){
        if(maCanXoa.equals("")){
        }else{
             HangHoaSPDAL.CauTruyVanXoaDonHang(maCanXoa);
        }
    }
     
    public  static  void ThemLoaiSanPhamVaoCBB(String MaLoai){
        HangHoaSPDAL.CauTruyVanLayThongTinTenLoaiLSP(MaLoai);
    }
    
    // Hàm đỏ dữ liệu trong Bảng
    public static void DoDuLieuVaoJTableDonhang(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Nhóm Hàng"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[1];
                item[0] = rs.getString("TenLoaiSanPham");
                
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    // Hàm lấy tất cả trong DAL
    public static ResultSet LayTatCaDonhang(){
        ResultSet rs;
        rs = HangHoaSPDAL.CauTruyVanLayThongTinHangHoa();
        return rs;
    }
   public static ResultSet LayTatCaSanPham(){
        ResultSet rs;
        rs = HangHoaSPDAL.CauTruyVanLayThongTinSanPham();
        return rs;
    }
    public static ResultSet Laybangtonkho(){
        ResultSet rs;
        rs = HangHoaSPDAL.CauTruyVanLayThongTinbangtonkho();
        return rs;
    }
    public static ResultSet LayTatCaLSP(){
        ResultSet rs;
        rs = HangHoaSPDAL.CauTruyVanLayThongTinLSP();
        return rs;
    }
     
    // Hàm tìm kiếm
    public static ResultSet LaySanPhamTheoTuKhoa(String tuKhoa){
        ResultSet rs;
        rs = HangHoaSPDAL.TimSanPham(tuKhoa);
        
        return rs;
    }
   public static void DoDuLieuVaoJTablesanpham(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"ID Sản Phẩm", "Mã Loại Sản Phẩm", "Tên Sản Phẩm","Số seri","Ngày Nhập","Giá Nhập","Số Lượng","Giá bán","Đơn vị tính","Hạn Bảo Hành","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[11];
                item[0] = rs.getInt("IDSanPham");
                item[1] = rs.getInt("MaLoaiSanPham");
                if(rs.getInt("MaLoaiSanPham") == 1){
                    item[1]= "Nokia" ;
                }else if(rs.getInt("MaLoaiSanPham") == 2){
                    item[1]= "Samsung" ;
                }else if(rs.getInt("MaLoaiSanPham") == 3){
                    item[1]= "HTC" ;
                }else if(rs.getInt("MaLoaiSanPham") == 4){
                    item[1]= "Apple" ;
                }else if(rs.getInt("MaLoaiSanPham") == 5){
                    item[1]= "LG" ;
                }else if(rs.getInt("MaLoaiSanPham") == 6){
                    item[1]= "Sony" ;
                }else if(rs.getInt("MaLoaiSanPham") == 7){
                    item[1]= "Oppo" ;
               }
                item[2] = rs.getString("TenSanPham");
                item[3]= rs.getString("Imei");
                item[4] = rs.getString("NgayNhap");
                item[5] = rs.getString("GiaNhap");
                item[6]= rs.getInt("SoLuong");
                item[7] = rs.getString("GiaBan");
                item[8] = rs.getString("DonViTinh");
                item[9] = rs.getString("HanBaoHanh");
                item[10] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
       public static HangHoaSPDTO LaySanPhamtheoMaDH(String MaDH){
        HangHoaSPDTO DH = new HangHoaSPDTO();
        if(!MaDH.equals("")){
            DH = HangHoaSPDAL.LaySanPhamtheoMaSP(MaDH);
        }else{
            MainClass.ThongBao("Chưa Nhập Khách hàng", MaDH, 0);
        }
        return DH;
    }
        public static void DoDuLieuVaoJTableBangtonkho(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Sản Phẩm", "Đơn vị tính", "Số Lượng","Giá mua vào","Trị giá Sản Phẩm","Hạn Bảo Hành"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
           
        try {
            while(rs.next()){
                Object[] item = new Object[6];
                item[0] = rs.getString("TenSanPham");
                item[1] = rs.getString("DonViTinh");
                item[2] = rs.getInt("SoLuong");
                item[3]= rs.getString("GiaNhap");
                item[4] = rs.getString("GiaBan");
                item[5] = rs.getString("HanBaoHanh");
                tableModel.addRow(item);
               
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
       
    }
}
