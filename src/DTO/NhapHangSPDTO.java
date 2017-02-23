/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author QT
 */
public class NhapHangSPDTO {
    int idsp;
    int maloaisp;
    String tensp;
    int imei;
    String ngaynhap;
    double gianhap;
    int soluong;
    double giaban;
    String donvitinh;
    String hanbaohanh;
    String mota;

    public NhapHangSPDTO() {
    } 

    public NhapHangSPDTO(int idsp, String tensp) {
        this.idsp = idsp;
        this.tensp = tensp;
    }  
    
    public NhapHangSPDTO(int idsp, int maloaisp, String tensp, int imei, String ngaynhap, double gianhap, int soluong, double giaban, String donvitinh, String hanbaohanh, String mota) {
        this.idsp = idsp;
        this.maloaisp = maloaisp;
        this.tensp = tensp;
        this.imei = imei;
        this.ngaynhap = ngaynhap;
        this.gianhap = gianhap;
        this.soluong = soluong;
        this.giaban = giaban;
        this.donvitinh = donvitinh;
        this.hanbaohanh = hanbaohanh;
        this.mota = mota;
    }

    public int getIdsp() {
        return idsp;
    }

    public int getMaloaisp() {
        return maloaisp;
    }

    public String getTensp() {
        return tensp;
    }

    public int getImei() {
        return imei;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public double getGianhap() {
        return gianhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public double getGiaban() {
        return giaban;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public String getHanbaohanh() {
        return hanbaohanh;
    }

    public String getMota() {
        return mota;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public void setMaloaisp(int maloaisp) {
        this.maloaisp = maloaisp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public void setHanbaohanh(String hanbaohanh) {
        this.hanbaohanh = hanbaohanh;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    
    
}
