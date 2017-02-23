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
public class HoaDonNhapDTO {
    int mahdn;
    String sohdn;
    String ngaytao;
    int manv;
    int mancc;
    String tinhtrang;
    double tongtien;
    String mota;

    public HoaDonNhapDTO() {
    }

    public HoaDonNhapDTO(int mahdn, String sohdn, String ngaytao, int manv, int mancc, String tinhtrang, double tongtien, String mota) {
        this.mahdn = mahdn;
        this.sohdn = sohdn;
        this.ngaytao = ngaytao;
        this.manv = manv;
        this.mancc = mancc;
        this.tinhtrang = tinhtrang;
        this.tongtien = tongtien;
        this.mota = mota;
    }

    public int getMahdn() {
        return mahdn;
    }

    public String getSohdn() {
        return sohdn;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public int getManv() {
        return manv;
    }

    public int getMancc() {
        return mancc;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public double getTongtien() {
        return tongtien;
    }

    public String getMota() {
        return mota;
    }

    public void setMahdn(int mahdn) {
        this.mahdn = mahdn;
    }

    public void setSohdn(String sohdn) {
        this.sohdn = sohdn;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public void setMancc(int mancc) {
        this.mancc = mancc;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    
    
}
