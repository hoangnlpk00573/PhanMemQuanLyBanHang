/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Ridotoji Pham
 */
public class HoaDonNhap {
    private int maHoaDonNhap;
    private int soHoaDonNhap;
    private String ngayTao;
    private String maNhanVien;
    private String maNhaCungCap;
    private String tinhTrang;
    private String tongTien;
    private String moTa;
    
    public HoaDonNhap(){
        
    }

    public int getMaHoaDonNhap() {
        return maHoaDonNhap;
    }

    public void setMaHoaDonNhap(int maHoaDonNhap) {
        this.maHoaDonNhap = maHoaDonNhap;
    }

    public int getSoHoaDonNhap() {
        return soHoaDonNhap;
    }

    public void setSoHoaDonNhap(int soHoaDonNhap) {
        this.soHoaDonNhap = soHoaDonNhap;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public HoaDonNhap(int maHoaDonNhap, int soHoaDonNhap, String ngayTao, String maNhanVien, String maNhaCungCap, String tinhTrang, String tongTien, String moTa) {
        this.maHoaDonNhap = maHoaDonNhap;
        this.soHoaDonNhap = soHoaDonNhap;
        this.ngayTao = ngayTao;
        this.maNhanVien = maNhanVien;
        this.maNhaCungCap = maNhaCungCap;
        this.tinhTrang = tinhTrang;
        this.tongTien = tongTien;
        this.moTa = moTa;
    }
    
}
