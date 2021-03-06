/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BLL.BaoHanhBLL;
import BLL.ComboboxBLL;
import BLL.HangHoaSPBLL;
import BLL.HoaDonNhapBLL;
import BLL.KhachHangBLL;
import BLL.LoaiSanPhamBLL;
import BLL.SanPhamBLL;
import DTO.BaohanhDTO;
import DTO.KhachHangDTO;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ridotoji Pham
 */
public class FrmBaoHanh extends javax.swing.JFrame {

    private Date today = new Date();
    Locale local = new Locale("vi", "VI");
    DateFormat d = DateFormat.getDateInstance(DateFormat.MEDIUM, local);
    String date = d.format(today);

    public FrmBaoHanh() {
        initComponents();
        setUser();

        /*Timer dongho = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calendar lich = Calendar.getInstance();
                int gio = lich.get(Calendar.HOUR);
                int phut = lich.get(Calendar.MINUTE);
                int giay = lich.get(Calendar.SECOND);
                txtngayhentra.setText(" " + gio + " : " + phut + " : " + giay);
            }
        });
          dongho.start();*/
    }

    private void setUser() {
        txtngayhentra.setText(date);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Baohanh = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbltenkhachhang = new javax.swing.JLabel();
        lblmaKH = new javax.swing.JLabel();
        lbldiachi = new javax.swing.JLabel();
        lblghichu1 = new javax.swing.JLabel();
        lbldienthoai = new javax.swing.JLabel();
        txtloaiKhachhang = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtghichu1 = new javax.swing.JTextField();
        txtdienthoai = new javax.swing.JTextField();
        cbngayhentra = new javax.swing.JCheckBox();
        txtngayhentra = new javax.swing.JTextField();
        cbbtenkhachhang = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        lbltenhang = new javax.swing.JLabel();
        lblsoseri = new javax.swing.JLabel();
        lblmotaloi = new javax.swing.JLabel();
        lblnhom = new javax.swing.JLabel();
        lblSL = new javax.swing.JLabel();
        lblgia = new javax.swing.JLabel();
        lblngaymua = new javax.swing.JLabel();
        txttenhang = new javax.swing.JTextField();
        txtsoserri = new javax.swing.JTextField();
        txtmotaloi = new javax.swing.JTextField();
        btnghi = new javax.swing.JButton();
        txtsoluong = new javax.swing.JTextField();
        txtgia = new javax.swing.JTextField();
        txtngaymua = new javax.swing.JTextField();
        cbbTenLoaiSP = new javax.swing.JComboBox<>();
        btnlammoi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txttongcong = new javax.swing.JTextField();
        btnluu = new javax.swing.JButton();
        btnhuy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbangluuhang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bảng Bảo Hành");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 51)));
        jPanel8.setForeground(new java.awt.Color(240, 240, 240));
        jPanel8.setAutoscrolls(true);

        lbltenkhachhang.setText("Tên Khách Hàng:");

        lblmaKH.setText("Loại Khách Hàng:");

        lbldiachi.setText("Địa chỉ:");

        lblghichu1.setText("Ghi chú:");

        lbldienthoai.setText("SDT:");

        txtloaiKhachhang.setEditable(false);
        txtloaiKhachhang.setBackground(new java.awt.Color(255, 255, 255));

        txtdiachi.setEditable(false);
        txtdiachi.setBackground(new java.awt.Color(255, 255, 255));

        txtghichu1.setEditable(false);
        txtghichu1.setBackground(new java.awt.Color(255, 255, 255));
        txtghichu1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        txtdienthoai.setEditable(false);
        txtdienthoai.setBackground(new java.awt.Color(255, 255, 255));
        txtdienthoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdienthoaiActionPerformed(evt);
            }
        });

        cbngayhentra.setText("Ngày hẹn trả");
        cbngayhentra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbngayhentraMouseClicked(evt);
            }
        });

        txtngayhentra.setEditable(false);
        txtngayhentra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cbbtenkhachhang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbtenkhachhang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbtenkhachhangItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lbltenkhachhang)
                        .addGap(40, 40, 40)
                        .addComponent(cbbtenkhachhang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldiachi)
                            .addComponent(lblghichu1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(cbngayhentra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtngayhentra, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtghichu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblmaKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtloaiKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbldienthoai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdienthoai)))))
                .addGap(17, 17, 17))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltenkhachhang)
                    .addComponent(cbbtenkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmaKH)
                    .addComponent(lbldienthoai)
                    .addComponent(txtloaiKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldiachi)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblghichu1)
                    .addComponent(txtghichu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbngayhentra)
                    .addComponent(txtngayhentra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 51)));
        jPanel6.setForeground(new java.awt.Color(240, 240, 240));
        jPanel6.setAutoscrolls(true);

        lbltenhang.setText("Tên Hàng:");

        lblsoseri.setText("Số seri:");

        lblmotaloi.setText("Mô tả lỗi:");

        lblnhom.setText("Nhóm:");

        lblSL.setText("Số lượng:");

        lblgia.setText("Giá:");

        lblngaymua.setText("Ngày mua:");

        btnghi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ghi.png"))); // NOI18N
        btnghi.setText("Ghi");
        btnghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnghiActionPerformed(evt);
            }
        });

        cbbTenLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbTenLoaiSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTenLoaiSPItemStateChanged(evt);
            }
        });

        btnlammoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/xoa.png"))); // NOI18N
        btnlammoi.setText("Làm Mới");
        btnlammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoiActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã Sản Phẩm:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblgia)
                    .addComponent(lblSL)
                    .addComponent(lblnhom)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSanPham)
                    .addComponent(cbbTenLoaiSP, 0, 191, Short.MAX_VALUE)
                    .addComponent(txtgia)
                    .addComponent(txtsoluong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(lblmotaloi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtmotaloi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(lblngaymua)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtngaymua, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(lblsoseri)
                        .addGap(18, 18, 18)
                        .addComponent(txtsoserri, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(lbltenhang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttenhang, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnghi)
                .addGap(27, 27, 27)
                .addComponent(btnlammoi)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltenhang)
                    .addComponent(txttenhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsoseri)
                    .addComponent(txtsoserri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnhom)
                    .addComponent(cbbTenLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmotaloi)
                    .addComponent(txtmotaloi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSL)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblngaymua)
                    .addComponent(txtngaymua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlammoi)
                    .addComponent(btnghi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tổng cộng :");

        txttongcong.setEditable(false);
        txttongcong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttongcongKeyReleased(evt);
            }
        });

        btnluu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnluu.setText("Xuất");
        btnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuActionPerformed(evt);
            }
        });

        btnhuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/huy.png"))); // NOI18N
        btnhuy.setText("Hủy");
        btnhuy.setToolTipText("");
        btnhuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyActionPerformed(evt);
            }
        });

        tblbangluuhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblbangluuhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangluuhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbangluuhang);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnluu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhuy))
                            .addComponent(txttongcong, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttongcong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnluu)
                    .addComponent(btnhuy))
                .addContainerGap())
        );

        Baohanh.addTab("Nhận bảo hành", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Baohanh)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Baohanh, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ResultSet rs = KhachHangBLL.LayTatCaKH();
        ComboboxBLL.LoadDuLieuCombobox(rs, cbbtenkhachhang, "TenKH", "MaKH");
        String maKH = ComboboxBLL.getSelectedItemID(cbbtenkhachhang);
        KhachHangDTO KH = KhachHangBLL.LayDonHangtheoMaDH(maKH);
        txtloaiKhachhang.setText(KH.getLoaiKH());
        txtdienthoai.setText(KH.getSDT());
        txtdiachi.setText(KH.getDiaChi());
        txtghichu1.setText(KH.getMota());

        BaoHanhBLL.DoDuLieuVaoJTableBaoHanh(BaoHanhBLL.LayTatCaBaoHanh(), tblbangluuhang);
        ResultSet rs1 = LoaiSanPhamBLL.LayTatCaLSP();
        ComboboxBLL.LoadDuLieuCombobox(rs1, cbbTenLoaiSP, "TenLoaiSanPham", "MaLoaiSanPham");

        String maBaoHanh = ComboboxBLL.getSelectedItemID(cbbTenLoaiSP);
        BaohanhDTO kh = BaoHanhBLL.LayBaoHanhtheoMaBH(maBaoHanh);

        txttongcong.setText(HangHoaSPBLL.TinhTien(tblbangluuhang, 6) + " VND");
    }//GEN-LAST:event_formWindowOpened

    private void btnghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnghiActionPerformed
        // TODO add your handling code here:
        try {
            int MaSanPham = Integer.parseInt(txtMaSanPham.getText());
            int TenLoai = Integer.parseInt(ComboboxBLL.getSelectedItemID(cbbTenLoaiSP));
            int makh = Integer.parseInt(ComboboxBLL.getSelectedItemID(cbbtenkhachhang));
            String TenHang = txttenhang.getText();
            String soseri = txtsoserri.getText();
            int SoLuong = Integer.parseInt(txtsoluong.getText());
            String MoTaLoi = txtmotaloi.getText();
            String Gia = txtgia.getText();
            String NgayMua = txtngaymua.getText();

            BaohanhDTO BaoHanh = new BaohanhDTO(0, makh, MaSanPham, TenLoai, TenHang, soseri, SoLuong, MoTaLoi, Gia, NgayMua);
            BaoHanhBLL.ThemPhanBaoHanh(BaoHanh);
            ResultSet rs = BaoHanhBLL.LayTatCaBaoHanh();
            BaoHanhBLL.DoDuLieuVaoJTableBaoHanh(rs, tblbangluuhang);
            txttongcong.setText(HangHoaSPBLL.TinhTien(tblbangluuhang, 6) + " VND");
        } catch (NumberFormatException e) {
            MainClass.ThongBao("Nhập Thông Tin", "Thông Báo", 1);
        }


    }//GEN-LAST:event_btnghiActionPerformed

    private void cbbTenLoaiSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTenLoaiSPItemStateChanged

    }//GEN-LAST:event_cbbTenLoaiSPItemStateChanged
    private void setSelectedCombobox(String tenLoai) {
        for (int i = 0; i < cbbTenLoaiSP.getItemCount(); i++) {
            Object obj = cbbTenLoaiSP.getItemAt(i);
            if (obj != null) {
                DTO.DinhNghiaComboBox m = (DTO.DinhNghiaComboBox) obj;
                if (tenLoai.equals(m.DisplayMmber)) {
                    cbbTenLoaiSP.setSelectedItem(m);
                }
            }
        }
    }
    private void tblbangluuhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangluuhangMouseClicked
        // TODO add your handling code here:
        int index = tblbangluuhang.getSelectedRow();
        txtMaSanPham.setText(tblbangluuhang.getValueAt(index, 0).toString());
        txttenhang.setText(tblbangluuhang.getValueAt(index, 1).toString());
        String tenLoai = tblbangluuhang.getValueAt(index, 2).toString();
        //setSelectedCombobox(tenLoai);
        cbbTenLoaiSP.setSelectedItem(tblbangluuhang.getValueAt(index, 2).toString());
        txtsoserri.setText(tblbangluuhang.getValueAt(index, 3).toString());
        txtsoluong.setText(tblbangluuhang.getValueAt(index, 4).toString());
        txtmotaloi.setText(tblbangluuhang.getValueAt(index, 5).toString());
        txtgia.setText(tblbangluuhang.getValueAt(index, 6).toString());
        txtngaymua.setText(tblbangluuhang.getValueAt(index, 7).toString());
    }//GEN-LAST:event_tblbangluuhangMouseClicked

    private void btnhuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyActionPerformed
        // TODO add your handling code here:
        FrmChinh frm = new FrmChinh();
        frm.show();
        this.dispose();
    }//GEN-LAST:event_btnhuyActionPerformed

    private void txttongcongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttongcongKeyReleased
        // TODO add your handling code here:
        txttongcong.setText(HangHoaSPBLL.TinhTien(tblbangluuhang, 6) + " VND");
    }//GEN-LAST:event_txttongcongKeyReleased

    private void btnlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoiActionPerformed
        // TODO add your handling code here:
        txttenhang.setText("");
        txtsoserri.setText("");
        txtsoluong.setText("");
        txtgia.setText("");
        txtmotaloi.setText("");
        txtngaymua.setText("");
        txttongcong.setText("");
        txtMaSanPham.setText("");
    }//GEN-LAST:event_btnlammoiActionPerformed

    private void cbbtenkhachhangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbtenkhachhangItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 1) {
            String maKH = ComboboxBLL.getSelectedItemID(cbbtenkhachhang);
            KhachHangDTO KH = KhachHangBLL.LayDonHangtheoMaDH(maKH);
            txtloaiKhachhang.setText(KH.getLoaiKH());
            txtdienthoai.setText(KH.getSDT());
            txtdiachi.setText(KH.getDiaChi());
            txtghichu1.setText(KH.getMota());
        }
    }//GEN-LAST:event_cbbtenkhachhangItemStateChanged

    private void cbngayhentraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbngayhentraMouseClicked
        // TODO add your handling code here:
        int Click = cbngayhentra.getComponentCount();
        if (Click == 0) {
            txtngayhentra.setEditable(true);
        } else {
            txtngayhentra.setEditable(false);
        }
    }//GEN-LAST:event_cbngayhentraMouseClicked

    private void txtdienthoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdienthoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdienthoaiActionPerformed

    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-A7029VT\\SQLEXPRESS"
                    + ";databaseName=QuanLyBanHang;user=sa;password=123;");
            JasperDesign jasperDesign = JRXmlLoader.load("D:\\PhanMemDuAn01\\DuAn1-PhanMemQLBanHang\\DuAn1-PhanMemQLBanHang\\PhanMemQLBanHang\\src\\Report\\bangBaoHanh.jrxml");
            String sql = "select * from LoaiSanPham ,baohanh,KhachHang"
                    + " where LoaiSanPham.MaLoaiSanPham = BaoHanh.MaLoaiSanPham and KhachHang.MaKH = BaoHanh.MaKhachhang ";
            JRDesignQuery newQuyery = new JRDesignQuery();
            newQuyery.setText(sql);
            jasperDesign.setQuery(newQuyery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), conn);
            JasperViewer.viewReport(jasperPrint);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnluuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBaoHanh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBaoHanh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBaoHanh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBaoHanh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBaoHanh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Baohanh;
    private javax.swing.JButton btnghi;
    private javax.swing.JButton btnhuy;
    private javax.swing.JButton btnlammoi;
    private javax.swing.JButton btnluu;
    private javax.swing.JComboBox<String> cbbTenLoaiSP;
    private javax.swing.JComboBox<String> cbbtenkhachhang;
    private javax.swing.JCheckBox cbngayhentra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSL;
    private javax.swing.JLabel lbldiachi;
    private javax.swing.JLabel lbldienthoai;
    private javax.swing.JLabel lblghichu1;
    private javax.swing.JLabel lblgia;
    private javax.swing.JLabel lblmaKH;
    private javax.swing.JLabel lblmotaloi;
    private javax.swing.JLabel lblngaymua;
    private javax.swing.JLabel lblnhom;
    private javax.swing.JLabel lblsoseri;
    private javax.swing.JLabel lbltenhang;
    private javax.swing.JLabel lbltenkhachhang;
    private javax.swing.JTable tblbangluuhang;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtdienthoai;
    private javax.swing.JTextField txtghichu1;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txtloaiKhachhang;
    private javax.swing.JTextField txtmotaloi;
    private javax.swing.JTextField txtngayhentra;
    private javax.swing.JTextField txtngaymua;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txtsoserri;
    private javax.swing.JTextField txttenhang;
    private javax.swing.JTextField txttongcong;
    // End of variables declaration//GEN-END:variables
}
