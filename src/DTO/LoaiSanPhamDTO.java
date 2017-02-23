/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author Ridotoji Pham
 */
public class LoaiSanPhamDTO {
    private int maLoaiSanPham;
    private String tenLoaiSP;
    private String moTa;
    
    public LoaiSanPhamDTO(){
        
    }

    public int getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    public void setMaLoaiSanPham(int maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    public String getTenLoaiSP() {
        return tenLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        this.tenLoaiSP = tenLoaiSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public LoaiSanPhamDTO(int maLoaiSanPham, String tenLoaiSP, String moTa) {
        this.maLoaiSanPham = maLoaiSanPham;
        this.tenLoaiSP = tenLoaiSP;
        this.moTa = moTa;
    }

    public ArrayList<LoaiSanPhamDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
