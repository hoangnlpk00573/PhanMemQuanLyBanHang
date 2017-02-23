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
public class LoaiKhachHangDTO {
    private int MaLoaiKhachHang;
    private String TenLoaiKhachhang;
    private String Mota;
    public LoaiKhachHangDTO(){
    }

    public int getMaLoaiKhachHang() {
        return MaLoaiKhachHang;
    }

    public void setMaLoaiKhachHang(int MaLoaiKhachHang) {
        this.MaLoaiKhachHang = MaLoaiKhachHang;
    }

    public String getTenLoaiKhachhang() {
        return TenLoaiKhachhang;
    }

    public void setTenLoaiKhachhang(String TenLoaiKhachhang) {
        this.TenLoaiKhachhang = TenLoaiKhachhang;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public LoaiKhachHangDTO(int MaLoaiKhachHang, String TenLoaiKhachhang, String Mota) {
        this.MaLoaiKhachHang = MaLoaiKhachHang;
        this.TenLoaiKhachhang = TenLoaiKhachhang;
        this.Mota = Mota;
    }
    
}
