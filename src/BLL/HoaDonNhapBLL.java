/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.HoaDonNhapDAL;
import DTO.HoaDonNhapDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ridotoji Pham
 */
public class HoaDonNhapBLL {

    public static ResultSet LayBangsanphamvaLSP() {
        ResultSet rs;
        rs = HoaDonNhapDAL.CauTruyVanLayThongTinHoaDon();
        return rs;
    }

    public static void DoDuLieuVaoJTableHoaDonNhap(ResultSet rs, JTable tableTam) {
        Object[] objs = new Object[]{"Tên Sản Phẩm", "Số Seri", "Mô Tả lỗi", "Số Lượng", "Giá Sửa chữa", "Ngày Mua", "Ghi Chú"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[7];
                item[0] = rs.getString("TenSanPham");
                item[1] = rs.getString("Imei");
                item[2] = rs.getString("MoTa");
                item[3] = rs.getInt("SoLuong");
                item[4] = rs.getString("GiaBan");
                item[5] = rs.getString("NgayNhap");
                item[6] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public static void DanhSachMaHD(ResultSet rs, JTable tableTam) {
        Object[] objs = new Object[]{"Mã HDN", "Số HDN", "Ngày Tạo", "Mã NV", "Mã NCC", "Tình Trạng", "Tổng Tiền", "Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[8];
                item[0] = rs.getInt("MaHoaDonNhap");
                item[1] = rs.getString("SoHDNhap");
                item[2] = rs.getString("NgayTao");
                item[3] = rs.getInt("MaNhanVien");
                item[4] = rs.getInt("MaNhaCungCap");
                item[5] = rs.getString("TinhTrang");
                item[6] = rs.getDouble("TongTien");
                item[7] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public static ResultSet LayTatCaHoaDonNhap() {     
        ResultSet rs;
        rs = HoaDonNhapDAL.LayTatCaHD();
        return rs;  
    }
    public static void Them(HoaDonNhapDTO hdn) {       
            HoaDonNhapDAL.Them(hdn);      
    }
    public static void Sua(HoaDonNhapDTO hdn) {       
            HoaDonNhapDAL.Sua(hdn);      
    }
     public static void Xoa(String mahdn) {
        if (mahdn.equals("")) {

        } else {
            HoaDonNhapDAL.Xoa(mahdn);
        }
    }
    public static ResultSet LayMaNV() {     
        ResultSet rs;
        rs = HoaDonNhapDAL.LayMaNV();
        return rs;  
    }
    public static ResultSet LayMaNCC() {     
        ResultSet rs;
        rs = HoaDonNhapDAL.LayMaNCC();
        return rs;  
    }
}
