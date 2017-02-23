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
public class ChiTietHDNhapDTO {
    int machitiethdnhap;
    int mahdnhap;
    int idsp;
    int soluong;
    String donvitinh;
    double gianhap;
    double thanhtien;
    String mota;

    public ChiTietHDNhapDTO() {
    }

    public ChiTietHDNhapDTO(int machitiethdnhap, int mahdnhap, int idsp, int soluong, String donvitinh, double gianhap, double thanhtien, String mota) {
        this.machitiethdnhap = machitiethdnhap;
        this.mahdnhap = mahdnhap;
        this.idsp = idsp;
        this.soluong = soluong;
        this.donvitinh = donvitinh;
        this.gianhap = gianhap;
        this.thanhtien = thanhtien;
        this.mota = mota;
    }

    public int getMachitiethdnhap() {
        return machitiethdnhap;
    }

    public int getMahdnhap() {
        return mahdnhap;
    }

    public int getIdsp() {
        return idsp;
    }

    public int getSoluong() {
        return soluong;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public double getGianhap() {
        return gianhap;
    }

    public double getThanhtien() {       
        return thanhtien;
    }

    public String getMota() {
        return mota;
    }

    public void setMachitiethdnhap(int machitiethdnhap) {
        this.machitiethdnhap = machitiethdnhap;
    }

    public void setMahdnhap(int mahdnhap) {
        this.mahdnhap = mahdnhap;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    
    
}
