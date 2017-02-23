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
public class ChiTietHoaDon {
    private int maSP;
    private String TenSP;
    private int Soluong;
    private int DonGia;
    private int ThanhTien;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int maSP, String TenSP, int Soluong, int DonGia, int ThanhTien) {
        this.maSP = maSP;
        this.TenSP = TenSP;
        this.Soluong = Soluong;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
    }
    
    
    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
    
}
