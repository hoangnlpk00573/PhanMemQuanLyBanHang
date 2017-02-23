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
public class HangHoaSPDTO {
     private  int IDSanPham;
    private int MaLoaiSanpham;
     private  String TenSanPham;
     private String email;
     private String NgayNhap;
     private String GiaNhap;
      private int SoLuong;
       private String GiaBan;
        private String DonViTinh;
     private  String HanBaoHanh;
     private  String MoTa;
     public  HangHoaSPDTO(){
     }

    public int getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(int IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public int getMaLoaiSanpham() {
        return MaLoaiSanpham;
    }

    public void setMaLoaiSanpham(int MaLoaiSanpham) {
        this.MaLoaiSanpham = MaLoaiSanpham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(String GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(String GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public String getHanBaoHanh() {
        return HanBaoHanh;
    }

    public void setHanBaoHanh(String HanBaoHanh) {
        this.HanBaoHanh = HanBaoHanh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public HangHoaSPDTO(int IDSanPham, int MaLoaiSanpham, String TenSanPham, String email, String NgayNhap, String GiaNhap, int SoLuong, String GiaBan, String DonViTinh, String HanBaoHanh, String MoTa) {
        this.IDSanPham = IDSanPham;
        this.MaLoaiSanpham = MaLoaiSanpham;
        this.TenSanPham = TenSanPham;
        this.email = email;
        this.NgayNhap = NgayNhap;
        this.GiaNhap = GiaNhap;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.DonViTinh = DonViTinh;
        this.HanBaoHanh = HanBaoHanh;
        this.MoTa = MoTa;
    }
     
 }
