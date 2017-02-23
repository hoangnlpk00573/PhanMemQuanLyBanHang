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
public class QuyenDTO {
    private int MaQuyen;
    private String TenQuyen;
    private String Mota;
    public QuyenDTO(){
    }

    public int getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(int MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public String getTenQuyen() {
        return TenQuyen;
    }

    public void setTenQuyen(String TenQuyen) {
        this.TenQuyen = TenQuyen;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public QuyenDTO(int MaQuyen, String TenQuyen, String Mota) {
        this.MaQuyen = MaQuyen;
        this.TenQuyen = TenQuyen;
        this.Mota = Mota;
    }
    
}
