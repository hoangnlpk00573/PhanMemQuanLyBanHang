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
public class NhaCungCapDTO {
    int mancc;
    String tenncc;
    String diachi;
    String sdt;
    String mota;

    public NhaCungCapDTO() {
    }

    public NhaCungCapDTO(int mancc, String tenncc, String diachi, String sdt, String mota) {
        this.mancc = mancc;
        this.tenncc = tenncc;
        this.diachi = diachi;
        this.sdt = sdt;
        this.mota = mota;
    }

    public int getMancc() {
        return mancc;
    }

    public String getTenncc() {
        return tenncc;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public String getMota() {
        return mota;
    }

    public void setMancc(int mancc) {
        this.mancc = mancc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    
    
}
