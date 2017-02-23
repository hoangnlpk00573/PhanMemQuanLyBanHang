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
public class SanPhamDTO {
    private int idSanPham;
    private int maSanPham;
    private int maLoaiSanPham;
    private String tenSanPham;
    private String email;
    private String hanBaoHanh;
    private int soLuong;
    private String donViTinh;
    private String giaBan;
    private String giaNhap;
    private String moTa;
    
    public SanPhamDTO(){
        
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    public void setMaLoaiSanPham(int maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHanBaoHanh() {
        return hanBaoHanh;
    }

    public void setHanBaoHanh(String hanBaoHanh) {
        this.hanBaoHanh = hanBaoHanh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public String getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(String giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public SanPhamDTO(int idSanPham, int maSanPham, int maLoaiSanPham, String tenSanPham, String email, String hanBaoHanh, int soLuong, String donViTinh, String giaBan, String giaNhap, String moTa) {
        this.idSanPham = idSanPham;
        this.maSanPham = maSanPham;
        this.maLoaiSanPham = maLoaiSanPham;
        this.tenSanPham = tenSanPham;
        this.email = email;
        this.hanBaoHanh = hanBaoHanh;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
        this.moTa = moTa;
    }
    
}
