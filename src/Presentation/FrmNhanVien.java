/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BLL.*;
import BLL.NhanVienBLL;
import BLL.QuyenBLL;
import DTO.NhanVienDTO;
import FormNho.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ridotoji Pham
 */
public class FrmNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form FrmNhanVien
     */
    public FrmNhanVien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        NhanVien = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblquyen = new javax.swing.JTable();
        btnthemnhanvien = new javax.swing.JButton();
        btnsuanhanvien = new javax.swing.JButton();
        btnxoanhanvien = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblnhanvien = new javax.swing.JTable();
        txttimkiem = new javax.swing.JTextField();
        lbltimkiem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtmanhanvien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttenNhanvien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsodienthoai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbdNam = new javax.swing.JRadioButton();
        rbdnu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtchungminhnhandan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtchucvu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtngaysinh = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtngayvaolam = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttaikhoan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtmatkhau = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtmaquyen = new javax.swing.JTextField();
        cbbQuyen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bảng Nhân Viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblquyen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {""},
                {null},
                {null}
            },
            new String [] {
                "Tên nhóm"
            }
        ));
        tblquyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblquyenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblquyen);

        btnthemnhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Them.png"))); // NOI18N
        btnthemnhanvien.setText("Thêm");
        btnthemnhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemnhanvienActionPerformed(evt);
            }
        });

        btnsuanhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sua.png"))); // NOI18N
        btnsuanhanvien.setText("Sửa");
        btnsuanhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuanhanvienActionPerformed(evt);
            }
        });

        btnxoanhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/xoa.png"))); // NOI18N
        btnxoanhanvien.setText("Xóa");
        btnxoanhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoanhanvienActionPerformed(evt);
            }
        });

        tblnhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Họ Tên", "Mã NV", "Điện thoại", "Địa chỉ", "Chức Vụ", "Ghi chú"
            }
        ));
        tblnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnhanvienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblnhanvien);

        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttimkiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        lbltimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        lbltimkiem.setText("Tìm kiếm :");
        lbltimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbltimkiemMouseClicked(evt);
            }
        });

        jLabel1.setText("Mã Nhân viên:");

        txtmanhanvien.setEditable(false);

        jLabel2.setText("Tên Nhân Viên:");

        jLabel3.setText("Địa chỉ:");

        jLabel4.setText("Số Điện Thoại:");

        jLabel5.setText("Giới tính:");

        buttonGroup1.add(rbdNam);
        rbdNam.setSelected(true);
        rbdNam.setText("Nam");

        buttonGroup1.add(rbdnu);
        rbdnu.setText("Nữ");

        jLabel6.setText("Chứng minh ND:");

        jLabel7.setText("Chức vụ:");

        jLabel8.setText("Ngày Sinh:");

        jLabel9.setText("Ngày Vào Làm:");

        jLabel10.setText("Tài Khoản:");

        jLabel11.setText("Mật Khẩu:");

        jLabel12.setText("Mã Quyền:");

        jLabel13.setText("Mô Tả:");

        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/xuat.png"))); // NOI18N
        btnclear.setText("Làm Mới");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jLabel14.setText("Mã Quyền:");

        cbbQuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(8, 8, 8)
                        .addComponent(txtmaquyen))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(btnthemnhanvien)
                                .addGap(18, 18, 18)
                                .addComponent(btnxoanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(btnsuanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnclear)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtdiachi, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbdNam)
                                                .addGap(63, 63, 63)
                                                .addComponent(rbdnu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtmanhanvien)
                                            .addComponent(txtchucvu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtsodienthoai)
                                                    .addComponent(txttenNhanvien)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel12))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtchungminhnhandan)
                                                    .addComponent(txtngaysinh)
                                                    .addComponent(txttaikhoan)
                                                    .addComponent(cbbQuyen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13)
                                            .addComponent(lbltimkiem))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txttimkiem)
                                                    .addComponent(txtMoTa)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtngayvaolam, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtmanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txttenNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbdNam)
                        .addComponent(rbdnu)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtchungminhnhandan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtngayvaolam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltimkiem)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthemnhanvien)
                    .addComponent(btnsuanhanvien)
                    .addComponent(btnxoanhanvien)
                    .addComponent(btnclear))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtmaquyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        NhanVien.addTab("Nhân viên", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NhanVien)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ResultSet rs = QuyenBLL.LayTatCaQuyen();
         QuyenBLL.DoDuLieuVaoJTableQuyentrongBangNhanvien(rs,tblquyen);
         
         ResultSet rs1 = NhanVienBLL.LayTatCaNhanVien();
        NhanVienBLL.DoDuLieuVaoJTableQuyentrongBangNhanvien(rs1, tblnhanvien);
        
        ResultSet rs2 = NhanVienBLL.LayTatCaNhanVien();
        NhanVienBLL.DoDuLieuVaoJTableNhanVienDayDu(rs2, tblnhanvien);
        
        ResultSet rs3 = QuyenBLL.LayTatCaQuyen();
        ComboboxBLL.LoadDuLieuCombobox(rs3, cbbQuyen, "TenQuyen", "MaQuyen");
        String maKH = ComboboxBLL.getSelectedItemID(cbbQuyen);
    }//GEN-LAST:event_formWindowOpened

    private void lbltimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltimkiemMouseClicked
        // TODO add your handling code here:
        String tuKhoa = txttimkiem.getText();
        //Kết quả của tìm theo từ khóa ResultSet
        ResultSet rs = NhanVienBLL.LayNVTheoTuKhoa(tuKhoa);
        //gọi hàm đổ dữ liệu sau khi tìm kiếm vào Table
        NhanVienBLL.DoDuLieuVaoJTableNhanVienDayDu(rs, tblnhanvien);
    }//GEN-LAST:event_lbltimkiemMouseClicked

    private void btnxoanhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoanhanvienActionPerformed
        // TODO add your handling code here:
       int[] cacViTriDuocChon = tblnhanvien.getSelectedRows();
           for(int i = 0; i < cacViTriDuocChon.length; i++){
    String MaLoaiCanXoa = tblnhanvien.getValueAt(cacViTriDuocChon[i], 0).toString() ;
     //Gọi hàm xóa ở tầng xử lý
            NhanVienBLL.XoaNhanVien(MaLoaiCanXoa);
         }
           ResultSet rs = NhanVienBLL.LayTatCaNhanVien();
        //Đọc lại dữ liệu và đổ lại dữ liệu
       NhanVienBLL.DoDuLieuVaoJTableNhanVienDayDu(rs, tblnhanvien); 
    }//GEN-LAST:event_btnxoanhanvienActionPerformed

    private void btnsuanhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuanhanvienActionPerformed
        // TODO add your handling code here:
        int MaNhanVien = Integer.parseInt(txtmanhanvien.getText());
         String TenNhanVien = txttenNhanvien.getText();
        String Diachi = txtdiachi.getText();
        String SDT = txtsodienthoai.getText();
        int GioiTinh;
        if(rbdNam.isSelected()){
            GioiTinh = 1;
        }else{
            GioiTinh = 0;
        }
        String CMND = txtchungminhnhandan.getText();
        String ChucVu = txtchucvu.getText();
        String NgaySinh = txtngaysinh.getText();
        String NgayVaoLam = txtngayvaolam.getText();
        String UserName = txttaikhoan.getText();
        String Pass = txtmatkhau.getText();
        int MaQuyen = Integer.parseInt(ComboboxBLL.getSelectedItemID(cbbQuyen));
        String MoTa =txtMoTa.getText();
        NhanVienDTO NV = new NhanVienDTO(MaNhanVien, TenNhanVien, Diachi, SDT, GioiTinh, CMND, ChucVu, NgaySinh, NgayVaoLam, UserName, Pass, MaQuyen, MoTa);
        NhanVienBLL.SuaNV(NV);
        ResultSet rs = NhanVienBLL.LayTatCaNhanVien();
        NhanVienBLL.DoDuLieuVaoJTableNhanVienDayDu(rs, tblnhanvien);
    }//GEN-LAST:event_btnsuanhanvienActionPerformed

    private void btnthemnhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemnhanvienActionPerformed
        // TODO add your handling code here:
        String TenNhanVien = txttenNhanvien.getText();
        String Diachi = txtdiachi.getText();
        String SDT = txtsodienthoai.getText();
        int GioiTinh;
        if(rbdNam.isSelected()){
            GioiTinh = 1;
        }else{
            GioiTinh = 0;
        }
        String CMND = txtchungminhnhandan.getText();
        String ChucVu = txtchucvu.getText();
        String NgaySinh = txtngaysinh.getText();
        String NgayVaoLam = txtngayvaolam.getText();
        String UserName = txttaikhoan.getText();
        String Pass = txtmatkhau.getText();
        //int MaQuyen = Integer.parseInt(txtmaQuyen.getText());
        int MaQuyen = Integer.parseInt(ComboboxBLL.getSelectedItemID(cbbQuyen));
        String MoTa =txtMoTa.getText();
        
        NhanVienDTO Nv = new NhanVienDTO(0, TenNhanVien, Diachi, SDT, GioiTinh, CMND, ChucVu, NgaySinh, NgayVaoLam, UserName, Pass, MaQuyen, MoTa);
        NhanVienBLL.ThemNhanVien(Nv);
        ResultSet rs = NhanVienBLL.LayTatCaNhanVien();
        NhanVienBLL.DoDuLieuVaoJTableNhanVienDayDu(rs, tblnhanvien);
    }//GEN-LAST:event_btnthemnhanvienActionPerformed

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        // TODO add your handling code here:
         String tuKhoa = txttimkiem.getText();
        //Kết quả của tìm theo từ khóa ResultSet
        ResultSet rs = NhanVienBLL.LayNVTheoTuKhoa(tuKhoa);
        //gọi hàm đổ dữ liệu sau khi tìm kiếm vào Table
        NhanVienBLL.DoDuLieuVaoJTableNhanVienDayDu(rs, tblnhanvien);
    }//GEN-LAST:event_txttimkiemKeyReleased

    private void txttimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemKeyPressed

    private void tblnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnhanvienMouseClicked
        // TODO add your handling code here:
         int index = tblnhanvien.getSelectedRow();
        txtmanhanvien.setText(tblnhanvien.getValueAt(index, 0).toString());
        txttenNhanvien.setText(tblnhanvien.getValueAt(index, 1).toString());
       txtdiachi.setText(tblnhanvien.getValueAt(index, 2).toString());
       txtsodienthoai.setText(tblnhanvien.getValueAt(index, 3).toString());
      if(tblnhanvien.getValueAt(index, 4).equals("Nam")){
            rbdNam.setSelected(true);
        }
        else{
            rbdnu.setSelected(true);
        }
      txtchungminhnhandan.setText(tblnhanvien.getValueAt(index, 5).toString());
        txtchucvu.setText(tblnhanvien.getValueAt(index, 6).toString());
       txtngaysinh.setText(tblnhanvien.getValueAt(index, 7).toString());
       txtngayvaolam.setText(tblnhanvien.getValueAt(index, 8).toString());
       txttaikhoan.setText(tblnhanvien.getValueAt(index, 9).toString());
        txtmatkhau.setText(tblnhanvien.getValueAt(index, 10).toString());
       //txtmaQuyen.setText(tblnhanvien.getValueAt(index, 11).toString());
       cbbQuyen.setSelectedItem(tblnhanvien.getValueAt(index, 11).toString());
        txtMoTa.setText(tblnhanvien.getValueAt(index, 12).toString());
    }//GEN-LAST:event_tblnhanvienMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtmanhanvien.setText("");txttenNhanvien.setText("");txtdiachi.setText("");txtsodienthoai.setText("");txtchungminhnhandan.setText("");
        txtchucvu.setText("");txtngaysinh.setText("");txtngayvaolam.setText("");txttaikhoan.setText("");txtmatkhau.setText("");/*txtmaQuyen.setText("")*/;txtMoTa.setText("");
        
    }//GEN-LAST:event_btnclearActionPerformed

    private void tblquyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblquyenMouseClicked
        // TODO add your handling code here:
          int viTriDongVuaBam = tblquyen.getSelectedRow();
        txtmaquyen.setText(tblquyen.getValueAt(viTriDongVuaBam, 0).toString());
        
    }//GEN-LAST:event_tblquyenMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane NhanVien;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsuanhanvien;
    private javax.swing.JButton btnthemnhanvien;
    private javax.swing.JButton btnxoanhanvien;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbQuyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltimkiem;
    private javax.swing.JRadioButton rbdNam;
    private javax.swing.JRadioButton rbdnu;
    private javax.swing.JTable tblnhanvien;
    private javax.swing.JTable tblquyen;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtchucvu;
    private javax.swing.JTextField txtchungminhnhandan;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtmanhanvien;
    private javax.swing.JTextField txtmaquyen;
    private javax.swing.JTextField txtmatkhau;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtngayvaolam;
    private javax.swing.JTextField txtsodienthoai;
    private javax.swing.JTextField txttaikhoan;
    private javax.swing.JTextField txttenNhanvien;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}