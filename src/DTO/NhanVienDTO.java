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
public class NhanVienDTO {
    private int MaNhanVien;
    private  String TenNhanVien;
    private String DiaChi;
    private String SDT;
    private int Gioitinh;
    private  String ChungminhND;
    private String Chucvu;
    private String NgaySinh;
    private String NgayVaolam;
    private String Username;
    private String Password;
    private int MaQuyen;
    private String Mota;
    public NhanVienDTO(){
        
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(int Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getChungminhND() {
        return ChungminhND;
    }

    public void setChungminhND(String ChungminhND) {
        this.ChungminhND = ChungminhND;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNgayVaolam() {
        return NgayVaolam;
    }

    public void setNgayVaolam(String NgayVaolam) {
        this.NgayVaolam = NgayVaolam;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(int MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public NhanVienDTO(int MaNhanVien, String TenNhanVien, String DiaChi, String SDT, int Gioitinh, String ChungminhND, String Chucvu, String NgaySinh, String NgayVaolam, String Username, String Password, int MaQuyen, String Mota) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Gioitinh = Gioitinh;
        this.ChungminhND = ChungminhND;
        this.Chucvu = Chucvu;
        this.NgaySinh = NgaySinh;
        this.NgayVaolam = NgayVaolam;
        this.Username = Username;
        this.Password = Password;
        this.MaQuyen = MaQuyen;
        this.Mota = Mota;
    }
    
}
