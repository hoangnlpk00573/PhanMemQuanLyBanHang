/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import static BLL.LoginBLL.KiemTra;
import DAL.ConnectionDB;
import FormNho.FrmDangki;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author truong
 */
public class frmDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form frmDangNhap
     */
    public frmDangNhap() {
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

        pnlDangnhap = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTendangnhap = new javax.swing.JTextField();
        lblTendangnhap = new javax.swing.JLabel();
        pswMatkhau = new javax.swing.JPasswordField();
        lblMatkhau = new javax.swing.JLabel();
        btnDangnhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlDangnhap.setBackground(new java.awt.Color(255, 255, 255));
        pnlDangnhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        lblTendangnhap.setText("Tên Đăng nhập :");

        pswMatkhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswMatkhauKeyPressed(evt);
            }
        });

        lblMatkhau.setText("Mật Khẩu :");

        btnDangnhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDangnhap.setForeground(new java.awt.Color(0, 153, 0));
        btnDangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        btnDangnhap.setText("Đăng Nhập");
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangnhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDangnhapLayout = new javax.swing.GroupLayout(pnlDangnhap);
        pnlDangnhap.setLayout(pnlDangnhapLayout);
        pnlDangnhapLayout.setHorizontalGroup(
            pnlDangnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangnhapLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlDangnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDangnhapLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlDangnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pswMatkhau)
                            .addComponent(txtTendangnhap)
                            .addGroup(pnlDangnhapLayout.createSequentialGroup()
                                .addGroup(pnlDangnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDangnhapLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addComponent(btnDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDangnhapLayout.setVerticalGroup(
            pnlDangnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangnhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTendangnhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMatkhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDangnhap)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pswMatkhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswMatkhauKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String tdn = txtTendangnhap.getText().trim();
            String mk = String.valueOf(pswMatkhau.getPassword()).trim();
            if (KiemTra(tdn, mk)) {
                frm = new FrmChinh();
                frm.show();
                this.dispose();
            } else {
                ThongBao("Bạn nhập sai tài khoản hoặc mật khẩu", "Lỗi đăng nhập", 2);
            }
        }
    }//GEN-LAST:event_pswMatkhauKeyPressed
    public static FrmChinh frm;
    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangnhapActionPerformed
        // TODO add your handling code here:
        String tdn = txtTendangnhap.getText().trim();
        String mk = String.valueOf(pswMatkhau.getPassword()).trim();
        if (KiemTra(tdn, mk)) {
            frm = new FrmChinh();
            frm.show();
            this.dispose();
        } else {
            ThongBao("Bạn nhập sai tài khoản hoặc mật khẩu", "Lỗi đăng nhập", 2);
        }
    }//GEN-LAST:event_btnDangnhapActionPerformed

    public static int quyen = 0;
    public static String HoTen = "";
    public static String manv = "";

    private boolean KiemTra(String dangnhap, String matkhau) {
        boolean kq = false;

        String cautruyvan = "select * from db_dtdm.nhanvien where UserName= '" + dangnhap + "' "
                + "and Password= '" + matkhau + "'";

        ResultSet rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);

        try {

            if (rs.next()) {
                kq = true;
                quyen = rs.getInt("MaQuyen");
                HoTen = rs.getString("TenNhanVien");
                manv = rs.getString("MaNhanVien");
            }

        } catch (SQLException ex) {
            System.out.println("lỗi đăng nhập");
        }

        return kq;
    }

    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);

    }

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
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangnhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMatkhau;
    private javax.swing.JLabel lblTendangnhap;
    private javax.swing.JPanel pnlDangnhap;
    private javax.swing.JPasswordField pswMatkhau;
    private javax.swing.JTextField txtTendangnhap;
    // End of variables declaration//GEN-END:variables
}
