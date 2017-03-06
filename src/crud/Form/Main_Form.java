package crud.Form;

import crud.DataAdapter.Data_Adapter;
import crud.DataProvider.TidakMampu_Provider;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class Main_Form extends javax.swing.JFrame {

    //Constructor
    public Main_Form() {
        initComponents();
        buttonGroup1.add(radiobutton_pria);
        buttonGroup1.add(radiobutton_wanita);
        
        buttonGroup1.add(radiobutton_pria_warga);
        buttonGroup1.add(radiobutton_wanita_warga);

        //Set disable untuk field yang tidak di gunakan di awal
        text_keteranganrt.setEnabled(false);
        text_keteranganrt.setBackground(Color.GRAY);
        text_nomorket.setEnabled(false);
        text_nomorket.setBackground(Color.GRAY);
        text_tanggalket.setEnabled(false);
        text_tanggalket.setBackground(Color.GRAY);
        textarea_keperluan.setEnabled(false);
        textarea_keperluan.setBackground(Color.GRAY);
        
        btn_delete_warga.setEnabled(false);
        btn_update_warga.setEnabled(false);
        btn_clear_warga.setEnabled(false);

        //Penyesuaian koneksi ke database MYSQL
        try {
            database = "urutsewu";
            url = "jdbc:mysql://localhost:3306/" + database;
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //Variable penting
    private Connection koneksi;
    private ResultSet hasil;
    private Statement stat;
    private String query, url, database;

    //Provider yang di gunakan, yang akkan di hubungkan dengan model
    private TidakMampu_Provider warga_tidakmampu;

    //List untuk menampung data yang akan di tampilkan di table
    private List<TidakMampu_Provider> list;

    //Variable yang di gunakan untuk menyimpdan model untuk setiap data Provider, tambah sesuai dengan kebutuhan
    private TableModel model;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TabSatu = new javax.swing.JTabbedPane();
        PanelUtama = new javax.swing.JPanel();
        TidakMampu = new javax.swing.JPanel();
        btn_cari = new javax.swing.JButton();
        btn_bersih = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea_keperluan = new javax.swing.JTextArea();
        label_tanggal = new javax.swing.JLabel();
        text_tanggalket = new javax.swing.JTextField();
        text_nomorket = new javax.swing.JTextField();
        label_keteranganrt = new javax.swing.JLabel();
        text_keteranganrt = new javax.swing.JTextField();
        label_keterangan = new javax.swing.JLabel();
        label_kelamin = new javax.swing.JLabel();
        radiobutton_pria = new javax.swing.JRadioButton();
        radiobutton_wanita = new javax.swing.JRadioButton();
        label_pekerjaan = new javax.swing.JLabel();
        text_pekerjaan = new javax.swing.JTextField();
        text_agama = new javax.swing.JTextField();
        label_agama = new javax.swing.JLabel();
        label_tempatlahir = new javax.swing.JLabel();
        text_tempatlahir = new javax.swing.JTextField();
        label_namalahir = new javax.swing.JLabel();
        text_tanggallahir = new javax.swing.JTextField();
        text_namalengkap = new javax.swing.JTextField();
        label_namalengkap = new javax.swing.JLabel();
        label_nik = new javax.swing.JLabel();
        text_nik = new javax.swing.JTextField();
        btn_cetaksurat = new javax.swing.JButton();
        TabDua = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        TabTiga = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        TabEmpat = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        TabLima = new javax.swing.JPanel();
        scrollview_warga = new javax.swing.JScrollPane();
        table_warga = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_nik_warga = new javax.swing.JTextField();
        text_namalengkap_warga = new javax.swing.JTextField();
        text_tempatlahir_warga = new javax.swing.JTextField();
        text_tanggallahir_warga = new javax.swing.JTextField();
        text_agama_warga = new javax.swing.JTextField();
        text_pekerjaan_warga = new javax.swing.JTextField();
        radiobutton_pria_warga = new javax.swing.JRadioButton();
        radiobutton_wanita_warga = new javax.swing.JRadioButton();
        btn_insert_warga = new javax.swing.JButton();
        btn_update_warga = new javax.swing.JButton();
        btn_delete_warga = new javax.swing.JButton();
        btn_search_warga = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_clear_warga = new javax.swing.JButton();

        jLabel20.setText("jLabel12");

        jTextField8.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Connect Mysql");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel11.setText("Keperluan");

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_bersih.setText("Bersih");
        btn_bersih.setMaximumSize(new java.awt.Dimension(73, 32));
        btn_bersih.setMinimumSize(new java.awt.Dimension(73, 32));
        btn_bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bersihActionPerformed(evt);
            }
        });

        textarea_keperluan.setColumns(20);
        textarea_keperluan.setRows(5);
        jScrollPane2.setViewportView(textarea_keperluan);

        label_tanggal.setText("Tanggal");

        text_nomorket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nomorketActionPerformed(evt);
            }
        });

        label_keteranganrt.setText("Nomor");

        text_keteranganrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_keteranganrtActionPerformed(evt);
            }
        });

        label_keterangan.setText("Keterangan RT");

        label_kelamin.setText("Jenis Kelamin");

        radiobutton_pria.setText("Pria");

        radiobutton_wanita.setText("Wanita");

        label_pekerjaan.setText("Pekerjaan");

        label_agama.setText("Agama");

        label_tempatlahir.setText("Tempat Lahir");

        text_tempatlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tempatlahirActionPerformed(evt);
            }
        });

        label_namalahir.setText("Tanggal Lahir");

        text_tanggallahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tanggallahirActionPerformed(evt);
            }
        });

        label_namalengkap.setText("Nama Lengkap");

        label_nik.setText("NIK");

        text_nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nikActionPerformed(evt);
            }
        });

        btn_cetaksurat.setText("CETAK SURAT");
        btn_cetaksurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetaksuratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TidakMampuLayout = new javax.swing.GroupLayout(TidakMampu);
        TidakMampu.setLayout(TidakMampuLayout);
        TidakMampuLayout.setHorizontalGroup(
            TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TidakMampuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TidakMampuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label_kelamin)
                        .addGap(18, 18, 18)
                        .addComponent(radiobutton_pria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiobutton_wanita))
                    .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(TidakMampuLayout.createSequentialGroup()
                            .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_namalengkap)
                                .addComponent(label_tempatlahir, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label_agama, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(TidakMampuLayout.createSequentialGroup()
                                    .addComponent(text_tempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label_namalahir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text_tanggallahir))
                                .addComponent(text_agama)
                                .addComponent(text_namalengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(TidakMampuLayout.createSequentialGroup()
                            .addComponent(label_nik)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(text_nik, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TidakMampuLayout.createSequentialGroup()
                            .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_pekerjaan, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label_keterangan, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(text_pekerjaan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TidakMampuLayout.createSequentialGroup()
                                        .addComponent(text_keteranganrt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label_keteranganrt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_nomorket, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label_tanggal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_tanggalket))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                        .addComponent(btn_bersih, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(437, 437, 437))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                        .addComponent(btn_cetaksurat, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        TidakMampuLayout.setVerticalGroup(
            TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TidakMampuLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari)
                    .addComponent(label_nik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_namalengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_namalengkap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_tempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_tempatlahir)
                    .addComponent(label_namalahir)
                    .addComponent(text_tanggallahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_agama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_pekerjaan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobutton_pria)
                    .addComponent(radiobutton_wanita)
                    .addComponent(label_kelamin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_keterangan)
                    .addComponent(label_keteranganrt)
                    .addComponent(label_tanggal)
                    .addComponent(text_nomorket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_tanggalket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_keteranganrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bersih, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btn_cetaksurat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout PanelUtamaLayout = new javax.swing.GroupLayout(PanelUtama);
        PanelUtama.setLayout(PanelUtamaLayout);
        PanelUtamaLayout.setHorizontalGroup(
            PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TidakMampu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelUtamaLayout.setVerticalGroup(
            PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUtamaLayout.createSequentialGroup()
                .addComponent(TidakMampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        TabSatu.addTab("TIDAK MAMPU", PanelUtama);

        jLabel12.setText("jLabel12");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField1");

        jLabel13.setText("jLabel12");

        jTextField3.setText("jTextField1");

        jLabel14.setText("jLabel12");

        jTextField4.setText("jTextField1");

        jLabel15.setText("jLabel12");

        jTextField5.setText("jTextField1");

        jLabel16.setText("jLabel12");

        jButton1.setText("jButton1");

        jButton2.setText("jButton1");

        jButton3.setText("jButton1");

        jButton4.setText("jButton1");

        jButton5.setText("jButton1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel17.setText("jLabel12");

        jLabel18.setText("jLabel12");

        jTextField6.setText("jTextField1");

        jLabel19.setText("jLabel12");

        jTextField7.setText("jTextField1");

        javax.swing.GroupLayout TabDuaLayout = new javax.swing.GroupLayout(TabDua);
        TabDua.setLayout(TabDuaLayout);
        TabDuaLayout.setHorizontalGroup(
            TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabDuaLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabDuaLayout.createSequentialGroup()
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TabDuaLayout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(34, 34, 34)
                                .addComponent(jButton1)
                                .addGap(29, 29, 29)
                                .addComponent(jButton2)
                                .addGap(162, 162, 162)
                                .addComponent(jButton4))
                            .addGroup(TabDuaLayout.createSequentialGroup()
                                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TabDuaLayout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(TabDuaLayout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(TabDuaLayout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(255, 255, 255))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(348, 348, 348))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(315, 315, 315))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(501, 501, 501))))))
            .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                    .addContainerGap(524, Short.MAX_VALUE)
                    .addComponent(jButton5)
                    .addGap(435, 435, 435)))
        );
        TabDuaLayout.setVerticalGroup(
            TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabDuaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addGroup(TabDuaLayout.createSequentialGroup()
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                    .addContainerGap(302, Short.MAX_VALUE)
                    .addComponent(jButton5)
                    .addGap(301, 301, 301)))
        );

        TabSatu.addTab("KETERANTAN UMUM", TabDua);

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        jTextField9.setText("jTextField9");

        javax.swing.GroupLayout TabTigaLayout = new javax.swing.GroupLayout(TabTiga);
        TabTiga.setLayout(TabTigaLayout);
        TabTigaLayout.setHorizontalGroup(
            TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabTigaLayout.createSequentialGroup()
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabTigaLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jButton9)
                        .addGap(39, 39, 39)
                        .addComponent(jButton6)
                        .addGap(85, 85, 85)
                        .addComponent(jButton7)
                        .addGap(65, 65, 65)
                        .addComponent(jButton8))
                    .addGroup(TabTigaLayout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        TabTigaLayout.setVerticalGroup(
            TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabTigaLayout.createSequentialGroup()
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9)
                    .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TabTigaLayout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(108, 108, 108)
                            .addComponent(jButton6))
                        .addGroup(TabTigaLayout.createSequentialGroup()
                            .addGap(259, 259, 259)
                            .addComponent(jButton7))
                        .addGroup(TabTigaLayout.createSequentialGroup()
                            .addGap(273, 273, 273)
                            .addComponent(jButton8))))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        TabSatu.addTab("KETERANGAN DOMISILI", TabTiga);

        jButton10.setText("jButton10");

        javax.swing.GroupLayout TabEmpatLayout = new javax.swing.GroupLayout(TabEmpat);
        TabEmpat.setLayout(TabEmpatLayout);
        TabEmpatLayout.setHorizontalGroup(
            TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabEmpatLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jButton10)
                .addContainerGap(628, Short.MAX_VALUE))
        );
        TabEmpatLayout.setVerticalGroup(
            TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabEmpatLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButton10)
                .addContainerGap(453, Short.MAX_VALUE))
        );

        TabSatu.addTab("CATATAN KEPOLISIAN", TabEmpat);

        table_warga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollview_warga.setViewportView(table_warga);

        jLabel1.setText("Nama Lengkap");

        jLabel2.setText("Tempat Lahir");

        jLabel3.setText("Tanggal Lahir");

        jLabel4.setText("NIK");

        jLabel5.setText("Agama");

        jLabel6.setText("Jenis Kelamin");

        text_tempatlahir_warga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tempatlahir_wargaActionPerformed(evt);
            }
        });

        radiobutton_pria_warga.setText("Pria");
        radiobutton_pria_warga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobutton_pria_wargaActionPerformed(evt);
            }
        });

        radiobutton_wanita_warga.setText("Wanita");

        btn_insert_warga.setText("INSERT");
        btn_insert_warga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insert_wargaActionPerformed(evt);
            }
        });

        btn_update_warga.setText("UPDATE");
        btn_update_warga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_wargaActionPerformed(evt);
            }
        });

        btn_delete_warga.setText("DELETE");
        btn_delete_warga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_wargaActionPerformed(evt);
            }
        });

        btn_search_warga.setText("SEARCH");
        btn_search_warga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_wargaActionPerformed(evt);
            }
        });

        jLabel8.setText("Pekerjaan");

        btn_clear_warga.setText("CELAR");
        btn_clear_warga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_wargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabLimaLayout = new javax.swing.GroupLayout(TabLima);
        TabLima.setLayout(TabLimaLayout);
        TabLimaLayout.setHorizontalGroup(
            TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabLimaLayout.createSequentialGroup()
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabLimaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(scrollview_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabLimaLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_tanggallahir_warga)
                            .addComponent(text_agama_warga)
                            .addGroup(TabLimaLayout.createSequentialGroup()
                                .addComponent(text_nik_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TabLimaLayout.createSequentialGroup()
                                .addComponent(radiobutton_pria_warga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radiobutton_wanita_warga))
                            .addComponent(text_namalengkap_warga)
                            .addComponent(text_tempatlahir_warga)
                            .addComponent(text_pekerjaan_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TabLimaLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_clear_warga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(TabLimaLayout.createSequentialGroup()
                                .addComponent(btn_insert_warga)
                                .addGap(18, 18, 18)
                                .addComponent(btn_update_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delete_warga)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        TabLimaLayout.setVerticalGroup(
            TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabLimaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_nik_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_search_warga)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_namalengkap_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_tempatlahir_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(text_tanggallahir_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(text_agama_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radiobutton_pria_warga)
                    .addComponent(radiobutton_wanita_warga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(text_pekerjaan_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_clear_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insert_warga)
                    .addComponent(btn_update_warga)
                    .addComponent(btn_delete_warga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollview_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        TabSatu.addTab("DAFTAR WARGA", TabLima);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TabSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1057, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Fungsi untuk membersihkan isi semua field (FIX)
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {

            //Bagian untuk mebersihkan field
            query = "select * from warga";
            stat = koneksi.createStatement();
            hasil = stat.executeQuery(query);
            this._setModel(hasil);
            btn_bersih.setEnabled(false);
            btn_cari.setEnabled(true);
            btn_search_warga.setEnabled(true);
            btn_insert_warga.setEnabled(true);
            btn_delete_warga.setEnabled(false);
            btn_update_warga.setEnabled(false);
            
            text_nik.setText("");
            text_nik.setEnabled(true);
            text_nik.requestFocus();
            text_nik.setBackground(Color.WHITE);
            
            text_nik_warga.setText("");
            text_nik_warga.setEnabled(true);
            text_nik_warga.requestFocus();
            text_nik_warga.setBackground(Color.WHITE);

            //set textfield dengan string kosong
            text_namalengkap.setText("");
            text_tempatlahir.setText("");
            text_tanggallahir.setText("");
            text_agama.setText("");
            text_pekerjaan.setText("");
            text_keteranganrt.setText("");
            text_nomorket.setText("");
            text_tanggalket.setText("");
            textarea_keperluan.setText("");
            
            text_namalengkap_warga.setText("");
            text_tempatlahir_warga.setText("");
            text_tanggallahir_warga.setText("");
            text_agama_warga.setText("");
            text_pekerjaan_warga.setText("");
            

            buttonGroup1.clearSelection();

            //Set disable untuk field yang tidak di gunakan di awal
            text_keteranganrt.setEnabled(false);
            text_keteranganrt.setBackground(Color.GRAY);
            text_nomorket.setEnabled(false);
            text_nomorket.setBackground(Color.GRAY);
            text_tanggalket.setEnabled(false);
            text_tanggalket.setBackground(Color.GRAY);
            textarea_keperluan.setEnabled(false);
            textarea_keperluan.setBackground(Color.GRAY);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void text_nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nikActionPerformed

    private void text_tanggallahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tanggallahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tanggallahirActionPerformed

    private void text_tempatlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tempatlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tempatlahirActionPerformed

    private void text_keteranganrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_keteranganrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_keteranganrtActionPerformed

    private void text_nomorketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nomorketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nomorketActionPerformed

    //Membersihkan semua field (FIX)
    private void btn_bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bersihActionPerformed
        try {
            //Menjalankan fungsi formWindowOpened
            formWindowOpened(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_bersihActionPerformed

    /**
     * *
     *
     * Fungsi ini di gunakan untuk mengrab data yang ada di dalam database data
     * akan di simpan dan akan di gunakan untuk menset setiap textfield yang
     * bersangkutan hali ni juga di gunakan untuk update data, karen ketika
     * tombol cari mendapat action ada 2 tombol yang di aktifkan "Update" dan
     * "Delete"
     *
     */
    //Cari data (FIX)
    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        try {
            String j_kelamin = "";
            if (text_nik.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak Ada data Yang Anda Pilih");
            } else {
                query = "select * from warga where nik = '" + text_nik.getText() + "'";
                stat = koneksi.createStatement();
                hasil = stat.executeQuery(query);
                while (hasil.next()) {

                    //Set data dari pencarian ke field inputan
                    text_namalengkap.setText(hasil.getString("namalengkap"));
                    text_tempatlahir.setText(hasil.getString("tempatlahir"));
                    text_tanggallahir.setText(hasil.getString("tanggallahir"));
                    text_agama.setText(hasil.getString("agama"));
                    text_pekerjaan.setText(hasil.getString("pekerjaan"));
                    j_kelamin = hasil.getString("jeniskelamin");
                }

                if (j_kelamin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Data Yang Anda Pilih Tidak Ada di database");//pesan ketika data tidak di temukan
                    formWindowOpened(null);
                } else {
                    if (j_kelamin.equals("Pria")) {
                        radiobutton_pria.setSelected(true);
                    } else {
                        radiobutton_wanita.setSelected(true);
                    }
                    query = "select * from warga where nik = '" + text_nik.getText() + "'";
                    stat = koneksi.createStatement();
                    hasil = stat.executeQuery(query);
                    _setModel(hasil);
                    btn_cari.setEnabled(false);
                    btn_bersih.setEnabled(true);
                    text_nik.setEnabled(false);
                    text_nik.setBackground(Color.GRAY);

                    //Aktifkan field yang sebelumnya mati
                    text_keteranganrt.setEnabled(true);
                    text_keteranganrt.setBackground(Color.WHITE);
                    text_nomorket.setEnabled(true);
                    text_nomorket.setBackground(Color.WHITE);
                    text_tanggalket.setEnabled(true);
                    text_tanggalket.setBackground(Color.WHITE);
                    textarea_keperluan.setEnabled(true);
                    textarea_keperluan.setBackground(Color.WHITE);

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_cetaksuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetaksuratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cetaksuratActionPerformed

    private void radiobutton_pria_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_pria_wargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobutton_pria_wargaActionPerformed

    //insert data warga (Masih ada BUG)
    private void btn_insert_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insert_wargaActionPerformed

        try {
            String j_kelamin_warga = "";
            if (radiobutton_pria_warga.isSelected()) {
                j_kelamin_warga = "Pria";
            } else if (radiobutton_wanita_warga.isSelected()) {
                j_kelamin_warga = "Wanita";
            } else {
            }

            //Validasi input kosong
            if (text_nik_warga.getText().equals("") && text_namalengkap_warga.getText().equals("") && text_tempatlahir_warga.getText().equals("")
                    && text_tanggallahir_warga.getText().equals("") && text_agama_warga.getText().equals("")
                    && text_pekerjaan_warga.getText().equals("") && j_kelamin_warga.equals("")) {
                JOptionPane.showMessageDialog(null, "Data Tidak lengkap");
            } else {
                
                //INSERT INTO  warga VALUES (`nik`, `namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `jeniskelamin`);
                 query = "insert into warga values ('" + text_nik_warga.getText().trim() +"','"+ text_namalengkap_warga.getText().trim() +
                         "','"+ text_tempatlahir_warga.getText().trim() +"','"+ text_tanggallahir_warga.getText().trim() +"','"+ text_agama_warga.getText().trim() +
                         "','"+ text_pekerjaan_warga.getText().trim() +"','"+ j_kelamin_warga + "')";

                
                stat = koneksi.createStatement();
                int res = stat.executeUpdate(query);
                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Insert Data Sukses !");
                    formWindowOpened(null);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btn_insert_wargaActionPerformed

    //Update data warga (FIX)
    private void btn_update_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_wargaActionPerformed

        try {
            String j_kelamin_warga = "";
            if (radiobutton_pria_warga.isSelected()) {
                j_kelamin_warga = "Pria";
            } else if (radiobutton_wanita_warga.isSelected()) {
                j_kelamin_warga = "Wanita";
            } else {
            }
            query = "update warga set namalengkap = '" + text_namalengkap_warga.getText() + "', tempatlahir = '" + text_tempatlahir_warga.getText()
                    + "', tanggallahir = '" + text_tanggallahir_warga.getText() + "', agama = '" + text_agama_warga.getText() + "', pekerjaan = '" + text_pekerjaan_warga.getText()
                    + "', jeniskelamin = '" + j_kelamin_warga + "' where nik = '" + text_nik_warga.getText() + "'";
            stat = koneksi.createStatement();
            int res = stat.executeUpdate(query);
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Update Data Sukses !");
                formWindowOpened(null);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btn_update_wargaActionPerformed

    //Delete data warga (FIX)
    private void btn_delete_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_wargaActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null, "Anda Yakin menghapus Data ini ??", "Warning", 2) == JOptionPane.YES_OPTION) {
                query = "delete from warga where nik = '" + text_nik_warga.getText() + "'";
                stat = koneksi.createStatement();
                int res = stat.executeUpdate(query);
                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Delete Data Sukses !");
                }
            }
            formWindowOpened(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_delete_wargaActionPerformed

    //Membersihkan field isian (FIX)
    private void btn_clear_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_wargaActionPerformed
        try {
            //Menjalankan fungsi formWindowOpened
            formWindowOpened(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_clear_wargaActionPerformed

    //Cari data warga (FIX)
    private void btn_search_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_wargaActionPerformed
        try {
            String j_kelamin_warga = "";
            if (text_nik_warga.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak Ada data Yang Anda Pilih");
            } else {
                query = "select * from warga where nik = '" + text_nik_warga.getText() + "'";
                stat = koneksi.createStatement();
                hasil = stat.executeQuery(query);
                while (hasil.next()) {

                    //Set data dari pencarian ke field inputan
                    text_namalengkap_warga.setText(hasil.getString("namalengkap"));
                    text_tempatlahir_warga.setText(hasil.getString("tempatlahir"));
                    text_tanggallahir_warga.setText(hasil.getString("tanggallahir"));
                    text_agama_warga.setText(hasil.getString("agama"));
                    text_pekerjaan_warga.setText(hasil.getString("pekerjaan"));
                    j_kelamin_warga = hasil.getString("jeniskelamin");
                }

                if (j_kelamin_warga.equals("")) {
                    JOptionPane.showMessageDialog(null, "Data Yang Anda Pilih Tidak Ada di database");//pesan ketika data tidak di temukan
                    formWindowOpened(null);
                } else {
                    if (j_kelamin_warga.equals("Pria")) {
                        radiobutton_pria_warga.setSelected(true);
                    } else {
                        radiobutton_wanita_warga.setSelected(true);
                    }
                    query = "select * from warga where nik = '" + text_nik_warga.getText() + "'";
                    stat = koneksi.createStatement();
                    hasil = stat.executeQuery(query);
                    _setModel(hasil);
                    btn_search_warga.setEnabled(false);
                    btn_bersih.setEnabled(true);
                    btn_delete_warga.setEnabled(true);
                    btn_update_warga.setEnabled(true);
                    btn_clear_warga.setEnabled(true);
                    btn_insert_warga.setEnabled(false);
                    
                    text_nik_warga.setEnabled(false);
                    text_nik_warga.setBackground(Color.GRAY);

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btn_search_wargaActionPerformed

    private void text_tempatlahir_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tempatlahir_wargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tempatlahir_wargaActionPerformed

    /**
     * *
     *
     * Fungsi ini di gunakan untuk menset setiap kolum yang akan di tampilkan di
     * table perhatikan setNya dan argumen getStringnya untuk bisa menampilkan
     * data sesuai dengan urutan table yang ada di database
     *
     */ //(FIX)
    private void _setModel(ResultSet hasil) {
        try {
            list = new ArrayList<TidakMampu_Provider>();
            while (hasil.next()) {

                //Untuk Select Data dan menaruhnya di tableView
                warga_tidakmampu = new TidakMampu_Provider();
                warga_tidakmampu.setNomorIndukKependudukan(hasil.getString("nik"));
                warga_tidakmampu.setNamaWarga(hasil.getString("namalengkap"));
                warga_tidakmampu.setTempatLahir(hasil.getString("tempatlahir"));
                warga_tidakmampu.setTanggalLahir(hasil.getString("tanggallahir"));
                warga_tidakmampu.setAgama(hasil.getString("agama"));
                warga_tidakmampu.setPekerjaanWarga(hasil.getString("pekerjaan"));
                warga_tidakmampu.setJenisKelamin(hasil.getString("jeniskelamin"));
                list.add(warga_tidakmampu);
            }
            model = new Data_Adapter(list);

            //nama table yang di gunakan
            table_warga.setModel(model);
            table_warga.setModel(model);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelUtama;
    private javax.swing.JPanel TabDua;
    private javax.swing.JPanel TabEmpat;
    private javax.swing.JPanel TabLima;
    private javax.swing.JTabbedPane TabSatu;
    private javax.swing.JPanel TabTiga;
    private javax.swing.JPanel TidakMampu;
    private javax.swing.JButton btn_bersih;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_cetaksurat;
    private javax.swing.JButton btn_clear_warga;
    private javax.swing.JButton btn_delete_warga;
    private javax.swing.JButton btn_insert_warga;
    private javax.swing.JButton btn_search_warga;
    private javax.swing.JButton btn_update_warga;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel label_agama;
    private javax.swing.JLabel label_kelamin;
    private javax.swing.JLabel label_keterangan;
    private javax.swing.JLabel label_keteranganrt;
    private javax.swing.JLabel label_namalahir;
    private javax.swing.JLabel label_namalengkap;
    private javax.swing.JLabel label_nik;
    private javax.swing.JLabel label_pekerjaan;
    private javax.swing.JLabel label_tanggal;
    private javax.swing.JLabel label_tempatlahir;
    private javax.swing.JRadioButton radiobutton_pria;
    private javax.swing.JRadioButton radiobutton_pria_warga;
    private javax.swing.JRadioButton radiobutton_wanita;
    private javax.swing.JRadioButton radiobutton_wanita_warga;
    private javax.swing.JScrollPane scrollview_warga;
    private javax.swing.JTable table_warga;
    private javax.swing.JTextField text_agama;
    private javax.swing.JTextField text_agama_warga;
    private javax.swing.JTextField text_keteranganrt;
    private javax.swing.JTextField text_namalengkap;
    private javax.swing.JTextField text_namalengkap_warga;
    private javax.swing.JTextField text_nik;
    private javax.swing.JTextField text_nik_warga;
    private javax.swing.JTextField text_nomorket;
    private javax.swing.JTextField text_pekerjaan;
    private javax.swing.JTextField text_pekerjaan_warga;
    private javax.swing.JTextField text_tanggalket;
    private javax.swing.JTextField text_tanggallahir;
    private javax.swing.JTextField text_tanggallahir_warga;
    private javax.swing.JTextField text_tempatlahir;
    private javax.swing.JTextField text_tempatlahir_warga;
    private javax.swing.JTextArea textarea_keperluan;
    // End of variables declaration//GEN-END:variables

}
