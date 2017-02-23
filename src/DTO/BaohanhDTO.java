/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HOANG
 */
public class BaohanhDTO {
    private int MaBaoHanh;
    private int MaKhachHang;
    private int IDSanPham;
     private int MaLoaiSanPham;
    private String tenSanPham;
    private String Soseri;
    private int SoLuong;
    private String MoTaLoi;
    private String Gia;
   private  String NgayMua;
    public  BaohanhDTO(){
        }

    public int getMaBaoHanh() {
        return MaBaoHanh;
    }

    public void setMaBaoHanh(int MaBaoHanh) {
        this.MaBaoHanh = MaBaoHanh;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public int getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(int IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public int getMaLoaiSanPham() {
        return MaLoaiSanPham;
    }

    public void setMaLoaiSanPham(int MaLoaiSanPham) {
        this.MaLoaiSanPham = MaLoaiSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getSoseri() {
        return Soseri;
    }

    public void setSoseri(String Soseri) {
        this.Soseri = Soseri;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMoTaLoi() {
        return MoTaLoi;
    }

    public void setMoTaLoi(String MoTaLoi) {
        this.MoTaLoi = MoTaLoi;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public String getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(String NgayMua) {
        this.NgayMua = NgayMua;
    }

    public BaohanhDTO(int MaBaoHanh, int MaKhachHang, int IDSanPham, int MaLoaiSanPham, String tenSanPham, String Soseri, int SoLuong, String MoTaLoi, String Gia, String NgayMua) {
        this.MaBaoHanh = MaBaoHanh;
        this.MaKhachHang = MaKhachHang;
        this.IDSanPham = IDSanPham;
        this.MaLoaiSanPham = MaLoaiSanPham;
        this.tenSanPham = tenSanPham;
        this.Soseri = Soseri;
        this.SoLuong = SoLuong;
        this.MoTaLoi = MoTaLoi;
        this.Gia = Gia;
        this.NgayMua = NgayMua;
    }
}
