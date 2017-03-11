package crud.Form;

import crud.DataAdapter.Data_Adapter;
import crud.DataProvider.Data_Provider;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.table.TableModel;

public class Main_Form extends javax.swing.JFrame {

    //Constructor
    public Main_Form() {
        initComponents();

        //Button Grup Setting
        buttonGroup1.add(radiobutton_pria_tidakmampu);
        buttonGroup1.add(radiobutton_wanita_tidakmampu);

        buttonGroup1.add(radiobutton_pria_warga);
        buttonGroup1.add(radiobutton_wanita_warga);

        buttonGroup1.add(radiobutton_pria_catkepolisian);
        buttonGroup1.add(radiobutton_wanita_catkepolisian);

        buttonGroup1.add(radiobutton_pria_ketdomisili);
        buttonGroup1.add(radiobutton_wanita_ketdomisili);

        buttonGroup1.add(radiobutton_pria_perumum);
        buttonGroup1.add(radiobutton_wanita_perumum);

        //Set disable untuk field yang tidak di gunakan di awal
        //Tab Tidak Mampu
        text_namalengkap_tidakmampu.setEnabled(false);
        text_namalengkap_tidakmampu.setBackground(Color.GRAY);

        //Tidak Mampu
        text_nosurat_tidakmampu.setEnabled(false);
        text_nosurat_tidakmampu.setBackground(Color.GRAY);
        text_namalengkap_tidakmampu.setEnabled(false);
        text_namalengkap_tidakmampu.setBackground(Color.GRAY);
        text_tempatlahir_tidakmampu.setEnabled(false);
        text_tempatlahir_tidakmampu.setBackground(Color.GRAY);
        text_tanggallahir_tidakmampu.setEnabled(false);
        text_tanggallahir_tidakmampu.setBackground(Color.GRAY);;
        text_agama_tidakmampu.setEnabled(false);
        text_agama_tidakmampu.setBackground(Color.GRAY);
        text_pekerjaan_tidakmampu.setEnabled(false);
        text_pekerjaan_tidakmampu.setBackground(Color.GRAY);
        text_keteranganrt_tidakmampu.setEnabled(false);
        text_keteranganrt_tidakmampu.setBackground(Color.GRAY);
        text_nomorket_tidakmampu.setEnabled(false);
        text_nomorket_tidakmampu.setBackground(Color.GRAY);
        text_tanggalket_tidakmampu.setEnabled(false);
        text_tanggalket_tidakmampu.setBackground(Color.GRAY);
        textarea_keperluan_tidakmampu.setEnabled(false);
        textarea_keperluan_tidakmampu.setBackground(Color.GRAY);

        //Keterangan Umum
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
    private Data_Provider data_provider;

    //List untuk menampung data yang akan di tampilkan di table
    private List<Data_Provider> list;

    //Variable yang di gunakan untuk menyimpdan model untuk setiap data Provider, tambah sesuai dengan kebutuhan
    private TableModel model;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        TabSatu = new javax.swing.JTabbedPane();
        PanelUtama = new javax.swing.JPanel();
        TidakMampu = new javax.swing.JPanel();
        btn_search_tidakmampu = new javax.swing.JButton();
        btn_clear_tidakmampu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea_keperluan_tidakmampu = new javax.swing.JTextArea();
        label_tanggal = new javax.swing.JLabel();
        text_tanggalket_tidakmampu = new javax.swing.JTextField();
        text_nomorket_tidakmampu = new javax.swing.JTextField();
        label_keteranganrt = new javax.swing.JLabel();
        text_keteranganrt_tidakmampu = new javax.swing.JTextField();
        label_keterangan = new javax.swing.JLabel();
        label_kelamin = new javax.swing.JLabel();
        radiobutton_pria_tidakmampu = new javax.swing.JRadioButton();
        radiobutton_wanita_tidakmampu = new javax.swing.JRadioButton();
        label_pekerjaan = new javax.swing.JLabel();
        text_pekerjaan_tidakmampu = new javax.swing.JTextField();
        text_agama_tidakmampu = new javax.swing.JTextField();
        label_agama = new javax.swing.JLabel();
        label_tempatlahir = new javax.swing.JLabel();
        text_tempatlahir_tidakmampu = new javax.swing.JTextField();
        label_namalahir = new javax.swing.JLabel();
        text_tanggallahir_tidakmampu = new javax.swing.JTextField();
        text_namalengkap_tidakmampu = new javax.swing.JTextField();
        label_namalengkap = new javax.swing.JLabel();
        label_nik = new javax.swing.JLabel();
        text_nik_tidakmampu = new javax.swing.JTextField();
        btn_print_tidakmampu = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        text_nosurat_tidakmampu = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        TabDua = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        text_nosurat_ketumum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        text_nik_ketumum = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        text_namalengkap_ketumum = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        text_tempatlahir_ketumum = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        text_tangallahir_ketumum = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        text_agama_ketumum = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        text_pekerjaan_ketumum = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        text_tempattinggal_ketumum = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        text_nokk_ketumum = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea_keperluan_ketumum = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        text_masaberlaku_ketumum = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtarena_keperluanlain_ketumum = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        text_penandatangan_ketumum = new javax.swing.JTextField();
        btn_search_ketumum = new javax.swing.JButton();
        btn_clear_ketumum = new javax.swing.JButton();
        btn_print_ketumum = new javax.swing.JButton();
        TabTiga = new javax.swing.JPanel();
        text_nosurat_ketdomisili = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        text_nik_ketdomisili = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        text_namalengkap_ketdomisili = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        text_bin_ketdomisili = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        text_tempatlahir_ketdomisili = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        text_warganegara_ketdomisili = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        text_agama_ketdomisili = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        text_pekerjaan_ketdomisili = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        text_tempattinggal_ketdomisili = new javax.swing.JTextField();
        text_keteranganrt_ketdomisili = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        text_tanggallahir_ketdomisili = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        text_nomorket_ketdomisili = new javax.swing.JTextField();
        text_tanggalket_ketdomisili = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textarea_keperluan_ketdomisili = new javax.swing.JTextArea();
        btn_search_ketdomisili = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        text_binti_ketdomisili = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        text_oenandatangan_ketdomisili = new javax.swing.JTextField();
        checkbox_ttdcamat = new javax.swing.JCheckBox();
        btn_clear_ketdomisili = new javax.swing.JButton();
        btn_print_ketdomisili = new javax.swing.JButton();
        radiobutton_pria_ketdomisili = new javax.swing.JRadioButton();
        radiobutton_wanita_ketdomisili = new javax.swing.JRadioButton();
        TabEmpat = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        text_nosurat_catkepolisian = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        text_namalengkap_catkepolisian = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        text_tempatlahir_catkepolisian = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        text_warganegara_catkepolisian = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        text_agama_catkepolisian = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        text_statuskawin_catkepolisian = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        radiobutton_pria_catkepolisian = new javax.swing.JRadioButton();
        radiobutton_wanita_catkepolisian = new javax.swing.JRadioButton();
        jLabel57 = new javax.swing.JLabel();
        text_tangallahir_catkepolisian = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        text_pekerjaan_catkepolisian = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        text_tempattinggal_catkepolisian = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textarea_keperluan_catkepolisian = new javax.swing.JTextArea();
        jLabel62 = new javax.swing.JLabel();
        text_penandatangan_catkepolisian = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        text_nik_catkepolisian = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        text_keteranganrt_catkepolisian = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        text_nomorket_catkepolisian = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        text_tanggalket_catkepolisian = new javax.swing.JTextField();
        btn_search_catkepolisian = new javax.swing.JButton();
        btn_clear_catkepolisian = new javax.swing.JButton();
        btn_print_catkepolisian = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        text_nosurat_perumum = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        text_nik_perumum = new javax.swing.JTextField();
        btn_search_perumum = new javax.swing.JButton();
        text_namalengkap_perumum = new javax.swing.JTextField();
        text_tempatlahir_perumum = new javax.swing.JTextField();
        text_tanggallahir_perumum = new javax.swing.JTextField();
        text_agama_perumum = new javax.swing.JTextField();
        text_pekerjaan_perumum = new javax.swing.JTextField();
        text_tempattinggal_perumum = new javax.swing.JTextField();
        text_suratpernyataan_perumum = new javax.swing.JTextField();
        text_saksisatu_perumum = new javax.swing.JTextField();
        text_saksidua_perumum = new javax.swing.JTextField();
        text_namart_perumum = new javax.swing.JTextField();
        text_namarw_perumum = new javax.swing.JTextField();
        text_penandatangan_perumum = new javax.swing.JTextField();
        btn_clear_perumum = new javax.swing.JButton();
        btn_print_perumum = new javax.swing.JButton();
        text_warganegara_perumum = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        radiobutton_pria_perumum = new javax.swing.JRadioButton();
        radiobutton_wanita_perumum = new javax.swing.JRadioButton();
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
        text_alamat_warga = new javax.swing.JTextField();
        radiobutton_pria_warga = new javax.swing.JRadioButton();
        radiobutton_wanita_warga = new javax.swing.JRadioButton();
        btn_insert_warga = new javax.swing.JButton();
        btn_update_warga = new javax.swing.JButton();
        btn_delete_warga = new javax.swing.JButton();
        btn_search_warga = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_clear_warga = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        text_golongandarah_warga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        text_pendidikan_warga = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        text_pekerjaan_warga = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        text_rt_warga = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        text_rw_warga = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        text_statuskawin_warga = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        text_namaayah_warga = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        text_namaibu_warga = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        text_warganegara_warga = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

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

        btn_search_tidakmampu.setText("SEARCH");
        btn_search_tidakmampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_tidakmampuActionPerformed(evt);
            }
        });

        btn_clear_tidakmampu.setText("CLEAR");
        btn_clear_tidakmampu.setMaximumSize(new java.awt.Dimension(73, 32));
        btn_clear_tidakmampu.setMinimumSize(new java.awt.Dimension(73, 32));
        btn_clear_tidakmampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_tidakmampuActionPerformed(evt);
            }
        });

        textarea_keperluan_tidakmampu.setColumns(20);
        textarea_keperluan_tidakmampu.setRows(5);
        jScrollPane2.setViewportView(textarea_keperluan_tidakmampu);

        label_tanggal.setText("Tanggal");

        text_nomorket_tidakmampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nomorket_tidakmampuActionPerformed(evt);
            }
        });

        label_keteranganrt.setText("Nomor");

        text_keteranganrt_tidakmampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_keteranganrt_tidakmampuActionPerformed(evt);
            }
        });

        label_keterangan.setText("Keterangan RT");

        label_kelamin.setText("Jenis Kelamin");

        radiobutton_pria_tidakmampu.setText("Pria");

        radiobutton_wanita_tidakmampu.setText("Wanita");

        label_pekerjaan.setText("Pekerjaan");

        label_agama.setText("Agama");

        label_tempatlahir.setText("Tempat Lahir");

        text_tempatlahir_tidakmampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tempatlahir_tidakmampuActionPerformed(evt);
            }
        });

        label_namalahir.setText("Tanggal Lahir");

        text_tanggallahir_tidakmampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tanggallahir_tidakmampuActionPerformed(evt);
            }
        });

        label_namalengkap.setText("Nama Lengkap");

        label_nik.setText("NIK");

        text_nik_tidakmampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nik_tidakmampuActionPerformed(evt);
            }
        });

        btn_print_tidakmampu.setText("PRINT");
        btn_print_tidakmampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_print_tidakmampuActionPerformed(evt);
            }
        });

        jLabel25.setText("Keperluan");

        jLabel49.setText("No Surat");

        javax.swing.GroupLayout TidakMampuLayout = new javax.swing.GroupLayout(TidakMampu);
        TidakMampu.setLayout(TidakMampuLayout);
        TidakMampuLayout.setHorizontalGroup(
            TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TidakMampuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_print_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TidakMampuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TidakMampuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label_kelamin)
                                .addGap(18, 18, 18)
                                .addComponent(radiobutton_pria_tidakmampu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiobutton_wanita_tidakmampu))
                            .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TidakMampuLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(TidakMampuLayout.createSequentialGroup()
                                            .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(label_keterangan)
                                                .addComponent(label_pekerjaan))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(TidakMampuLayout.createSequentialGroup()
                                                    .addComponent(text_keteranganrt_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(label_keteranganrt)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(text_nomorket_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(label_tanggal)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(text_tanggalket_tidakmampu, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                                                .addComponent(text_pekerjaan_tidakmampu)))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TidakMampuLayout.createSequentialGroup()
                                    .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_namalengkap)
                                            .addComponent(label_tempatlahir, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label_agama, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(TidakMampuLayout.createSequentialGroup()
                                            .addGap(42, 42, 42)
                                            .addComponent(label_nik)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TidakMampuLayout.createSequentialGroup()
                                            .addComponent(text_tempatlahir_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(label_namalahir)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(text_tanggallahir_tidakmampu))
                                        .addComponent(text_agama_tidakmampu)
                                        .addComponent(text_namalengkap_tidakmampu)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                                            .addComponent(text_nik_tidakmampu)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(TidakMampuLayout.createSequentialGroup()
                                                    .addComponent(jLabel49)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(text_nosurat_tidakmampu))
                                                .addComponent(btn_search_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                        .addComponent(btn_clear_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(432, 432, 432))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(476, 476, 476))))
        );
        TidakMampuLayout.setVerticalGroup(
            TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TidakMampuLayout.createSequentialGroup()
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TidakMampuLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(text_nosurat_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_nik_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_search_tidakmampu)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_nik)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_namalengkap_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_namalengkap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_tempatlahir_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_tempatlahir)
                    .addComponent(label_namalahir)
                    .addComponent(text_tanggallahir_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_agama)
                    .addComponent(text_agama_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_pekerjaan_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_pekerjaan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobutton_pria_tidakmampu)
                    .addComponent(radiobutton_wanita_tidakmampu)
                    .addComponent(label_kelamin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_keterangan)
                    .addComponent(label_keteranganrt)
                    .addComponent(label_tanggal)
                    .addComponent(text_nomorket_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_tanggalket_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_keteranganrt_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_clear_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btn_print_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

        jLabel10.setText("No Surat");

        jLabel12.setText("NIK");

        jLabel13.setText("Nama Lengkap");

        jLabel14.setText("Tempat");

        jLabel15.setText("Tanggal Lahir");

        jLabel16.setText("Agama");

        jLabel17.setText("Pekerjaan");

        jLabel18.setText("Tempat Tinggal");

        jLabel21.setText("No KK");

        jLabel19.setText("Keperluan");

        textarea_keperluan_ketumum.setColumns(20);
        textarea_keperluan_ketumum.setRows(5);
        jScrollPane1.setViewportView(textarea_keperluan_ketumum);

        jLabel22.setText("Masa Berlaku");

        jLabel23.setText("Keterangan Lain");

        txtarena_keperluanlain_ketumum.setColumns(20);
        txtarena_keperluanlain_ketumum.setRows(5);
        jScrollPane3.setViewportView(txtarena_keperluanlain_ketumum);

        jLabel24.setText("Penanda Tangan");

        btn_search_ketumum.setText("SEARCH");
        btn_search_ketumum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_ketumumActionPerformed(evt);
            }
        });

        btn_clear_ketumum.setText("CLEAR");
        btn_clear_ketumum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_ketumumActionPerformed(evt);
            }
        });

        btn_print_ketumum.setText("PRINT");
        btn_print_ketumum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_print_ketumumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabDuaLayout = new javax.swing.GroupLayout(TabDua);
        TabDua.setLayout(TabDuaLayout);
        TabDuaLayout.setHorizontalGroup(
            TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabDuaLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(text_nosurat_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                            .addComponent(btn_clear_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104)
                            .addComponent(btn_print_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(279, 279, 279))
                        .addGroup(TabDuaLayout.createSequentialGroup()
                            .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TabDuaLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(27, 27, 27)))
                            .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(text_namalengkap_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text_nik_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addComponent(btn_search_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(162, 162, 162))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                            .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(TabDuaLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel23)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(text_masaberlaku_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel24)
                                            .addGap(18, 18, 18)
                                            .addComponent(text_penandatangan_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(TabDuaLayout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addGap(18, 18, 18)
                                            .addComponent(text_tempattinggal_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel16))
                                            .addGap(18, 18, 18)
                                            .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(text_agama_ketumum)
                                                .addComponent(text_tempatlahir_ketumum))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(jLabel21))
                                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(text_pekerjaan_ketumum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                                .addComponent(text_tangallahir_ketumum, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(text_nokk_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(165, 165, 165)))))
        );
        TabDuaLayout.setVerticalGroup(
            TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabDuaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(text_nosurat_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TabDuaLayout.createSequentialGroup()
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(text_nik_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_namalengkap_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(btn_search_ketumum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabDuaLayout.createSequentialGroup()
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(text_tempatlahir_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_agama_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_tangallahir_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(text_pekerjaan_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_tempattinggal_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(text_nokk_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_masaberlaku_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(text_penandatangan_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_print_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        TabSatu.addTab("KETERANGAN UMUM", TabDua);

        jLabel32.setText("No Surat");

        jLabel33.setText("NIK");

        jLabel34.setText("Nama Lengkap");

        jLabel35.setText("Jenis Kelamin");

        jLabel36.setText("Bin");

        jLabel37.setText("Tempat");

        jLabel38.setText("Warga Negara");

        jLabel39.setText("Agama");

        jLabel40.setText("Pekerjaan");

        jLabel41.setText("Tempat Tinggal");

        jLabel42.setText("Surat Keterangan RT");

        jLabel43.setText("Tanggal Lahir");

        jLabel44.setText("Nomor");

        jLabel45.setText("Tanggal");

        jLabel46.setText("Keperluan");

        textarea_keperluan_ketdomisili.setColumns(20);
        textarea_keperluan_ketdomisili.setRows(5);
        jScrollPane4.setViewportView(textarea_keperluan_ketdomisili);

        btn_search_ketdomisili.setText("SEARCH");
        btn_search_ketdomisili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_ketdomisiliActionPerformed(evt);
            }
        });

        jLabel47.setText("Binti");

        jLabel48.setText("Pejabat Penanda Tangan");

        checkbox_ttdcamat.setText("Ttd Camat");

        btn_clear_ketdomisili.setText("CLEAR");
        btn_clear_ketdomisili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_ketdomisiliActionPerformed(evt);
            }
        });

        btn_print_ketdomisili.setText("PRINT");

        radiobutton_pria_ketdomisili.setText("Pria");

        radiobutton_wanita_ketdomisili.setText("Wanita");

        javax.swing.GroupLayout TabTigaLayout = new javax.swing.GroupLayout(TabTiga);
        TabTiga.setLayout(TabTigaLayout);
        TabTigaLayout.setHorizontalGroup(
            TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabTigaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabTigaLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_nosurat_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabTigaLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_nik_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_search_ketdomisili)
                        .addGap(340, 340, 340))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TabTigaLayout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel36)
                                .addComponent(jLabel34)
                                .addComponent(jLabel35))
                            .addGap(18, 18, 18)
                            .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(TabTigaLayout.createSequentialGroup()
                                    .addComponent(text_namalengkap_ketdomisili)
                                    .addGap(108, 108, 108))
                                .addGroup(TabTigaLayout.createSequentialGroup()
                                    .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TabTigaLayout.createSequentialGroup()
                                            .addComponent(text_bin_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel47)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(text_binti_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TabTigaLayout.createSequentialGroup()
                                            .addComponent(radiobutton_pria_ketdomisili)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(radiobutton_wanita_ketdomisili)))
                                    .addGap(451, 451, 451))))
                        .addGroup(TabTigaLayout.createSequentialGroup()
                            .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TabTigaLayout.createSequentialGroup()
                                    .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel38)
                                        .addComponent(jLabel37)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel40)
                                        .addComponent(jLabel41)
                                        .addComponent(jLabel42)
                                        .addComponent(jLabel46)
                                        .addComponent(jLabel48))
                                    .addGap(18, 18, 18)
                                    .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TabTigaLayout.createSequentialGroup()
                                            .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(text_oenandatangan_ketdomisili, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(TabTigaLayout.createSequentialGroup()
                                                        .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(TabTigaLayout.createSequentialGroup()
                                                                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                    .addComponent(text_keteranganrt_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(text_tempattinggal_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(24, 24, 24)
                                                                .addComponent(jLabel44)
                                                                .addGap(13, 13, 13))
                                                            .addGroup(TabTigaLayout.createSequentialGroup()
                                                                .addComponent(jLabel45)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                        .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(text_nomorket_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(text_tanggalket_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(TabTigaLayout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(checkbox_ttdcamat))
                                                .addGroup(TabTigaLayout.createSequentialGroup()
                                                    .addGap(50, 50, 50)
                                                    .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btn_print_ketdomisili, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btn_clear_ketdomisili, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(TabTigaLayout.createSequentialGroup()
                                            .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(text_warganegara_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(text_agama_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(TabTigaLayout.createSequentialGroup()
                                                    .addComponent(text_tempatlahir_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel43))
                                                .addComponent(text_pekerjaan_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addComponent(text_tanggallahir_ketdomisili, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(108, 108, 108)))))
        );
        TabTigaLayout.setVerticalGroup(
            TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabTigaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nosurat_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(text_nik_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search_ketdomisili))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(text_namalengkap_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radiobutton_pria_ketdomisili)
                        .addComponent(radiobutton_wanita_ketdomisili))
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_bin_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47)
                        .addComponent(text_binti_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(text_tempatlahir_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(text_tanggallahir_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(text_warganegara_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(text_agama_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(text_pekerjaan_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(text_tempattinggal_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabTigaLayout.createSequentialGroup()
                        .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(text_keteranganrt_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_nomorket_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_tanggalket_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addGap(18, 18, 18)
                        .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabTigaLayout.createSequentialGroup()
                        .addComponent(btn_clear_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_print_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(text_oenandatangan_ketdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox_ttdcamat))
                .addGap(42, 42, 42))
        );

        TabSatu.addTab("KETERANGAN DOMISILI", TabTiga);

        jLabel50.setText("No SUrat");

        jLabel51.setText("Nma Lengkap");

        jLabel52.setText("Tempat");

        jLabel53.setText("Warga Negara");

        jLabel54.setText("Agama");

        jLabel55.setText("Status Kawin");

        jLabel56.setText("Jenis Kelamin");

        radiobutton_pria_catkepolisian.setText("Pria");

        radiobutton_wanita_catkepolisian.setText("Wanita");

        jLabel57.setText("Tanggal Lahir");

        jLabel59.setText("Pekerjaan");

        jLabel60.setText("Tempat Tinggal");

        jLabel61.setText("Keperluan");

        textarea_keperluan_catkepolisian.setColumns(20);
        textarea_keperluan_catkepolisian.setRows(5);
        jScrollPane5.setViewportView(textarea_keperluan_catkepolisian);

        jLabel62.setText("Pejabat Penandatangan");

        jLabel63.setText("NIK");

        jLabel64.setText("Surat Keterangan RT");

        jLabel65.setText("Nomor");

        jLabel66.setText("Tanggal");

        btn_search_catkepolisian.setText("SEARCH");
        btn_search_catkepolisian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_catkepolisianActionPerformed(evt);
            }
        });

        btn_clear_catkepolisian.setText("CLEAR");
        btn_clear_catkepolisian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_catkepolisianActionPerformed(evt);
            }
        });

        btn_print_catkepolisian.setText("PRINT");

        javax.swing.GroupLayout TabEmpatLayout = new javax.swing.GroupLayout(TabEmpat);
        TabEmpat.setLayout(TabEmpatLayout);
        TabEmpatLayout.setHorizontalGroup(
            TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabEmpatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_nosurat_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(TabEmpatLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel63)
                .addGap(41, 41, 41)
                .addComponent(text_nik_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_search_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(TabEmpatLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabEmpatLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_clear_catkepolisian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_print_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabEmpatLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_warganegara_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(645, 645, 645))
                    .addGroup(TabEmpatLayout.createSequentialGroup()
                        .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TabEmpatLayout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_penandatangan_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel54)
                            .addGroup(TabEmpatLayout.createSequentialGroup()
                                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TabEmpatLayout.createSequentialGroup()
                                        .addComponent(radiobutton_pria_catkepolisian)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radiobutton_wanita_catkepolisian))
                                    .addComponent(text_namalengkap_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(TabEmpatLayout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TabEmpatLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_keteranganrt_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_nomorket_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_tanggalket_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TabEmpatLayout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(45, 45, 45)
                                .addComponent(text_tempatlahir_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_tangallahir_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TabEmpatLayout.createSequentialGroup()
                        .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TabEmpatLayout.createSequentialGroup()
                                .addComponent(text_pekerjaan_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_tempattinggal_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(text_statuskawin_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TabEmpatLayout.createSequentialGroup()
                                .addComponent(text_agama_catkepolisian)
                                .addGap(333, 333, 333))))))
        );
        TabEmpatLayout.setVerticalGroup(
            TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabEmpatLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(text_nosurat_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(text_nik_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search_catkepolisian))
                .addGap(18, 18, 18)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(text_namalengkap_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(radiobutton_pria_catkepolisian)
                    .addComponent(radiobutton_wanita_catkepolisian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(text_tempatlahir_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(text_tangallahir_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(text_warganegara_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(text_agama_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(text_statuskawin_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(text_pekerjaan_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_tempattinggal_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(text_keteranganrt_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(text_nomorket_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(text_tanggalket_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(jScrollPane5))
                .addGap(9, 9, 9)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(text_penandatangan_catkepolisian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear_catkepolisian)
                    .addComponent(btn_print_catkepolisian))
                .addGap(34, 34, 34))
        );

        TabSatu.addTab("CATATAN KEPOLISIAN", TabEmpat);

        jLabel67.setText("No Surat");

        jLabel68.setText("Nama Lengkap");

        jLabel69.setText("NIK");

        jLabel70.setText("Jenis Kelamin");

        jLabel71.setText("Tempat Lahir");

        jLabel72.setText("Tangal Lahir");

        jLabel73.setText("Warga Negara");

        jLabel74.setText("Agama");

        jLabel75.setText("Pekerjaan");

        jLabel76.setText("Tempat Tinggal");

        jLabel77.setText("Surat Pernyataan");

        jLabel78.setText("Menyatakan Bahwa");

        jLabel79.setText("Saksi 1");

        jLabel80.setText("Saksi 2");

        jLabel81.setText("Nama Ketua RT");

        jLabel82.setText("Nama Ketua RW");

        jLabel83.setText("Pejabat Penandatangan");

        btn_search_perumum.setText("SEARCH");
        btn_search_perumum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_perumumActionPerformed(evt);
            }
        });

        btn_clear_perumum.setText("CLEAR");
        btn_clear_perumum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_perumumActionPerformed(evt);
            }
        });

        btn_print_perumum.setText("PRINT");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        radiobutton_pria_perumum.setText("Pria");

        radiobutton_wanita_perumum.setText("Wanita");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_nik_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_search_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_namart_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_namarw_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel79)
                                        .addGap(29, 29, 29)
                                        .addComponent(text_saksisatu_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addComponent(jLabel80))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel76)
                                                    .addComponent(jLabel77))
                                                .addGap(31, 31, 31))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel73)
                                                .addGap(48, 48, 48)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(text_warganegara_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(text_tempattinggal_perumum)
                                                .addComponent(text_suratpernyataan_perumum, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(text_saksidua_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel74)
                                    .addComponent(jLabel75))
                                .addGap(196, 196, 196)
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_tanggallahir_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addGap(18, 18, 18)
                                .addComponent(text_penandatangan_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel68)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(text_namalengkap_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel70)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(text_pekerjaan_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(text_agama_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(text_tempatlahir_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(radiobutton_pria_perumum)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radiobutton_wanita_perumum)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel78)))
                        .addContainerGap(350, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text_nosurat_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_clear_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_print_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(text_nosurat_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(text_nik_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search_perumum))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(text_namalengkap_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(radiobutton_pria_perumum)
                    .addComponent(radiobutton_wanita_perumum))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(text_tempatlahir_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_tanggallahir_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(text_agama_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(text_pekerjaan_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(text_tempattinggal_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77)
                            .addComponent(text_suratpernyataan_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(text_warganegara_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80)
                    .addComponent(text_saksisatu_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_saksidua_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jLabel82)
                    .addComponent(text_namart_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_namarw_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addComponent(text_penandatangan_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_print_perumum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        TabSatu.addTab("PERNYATAAN UMUM", jPanel1);

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

        jLabel8.setText("Alamat");

        btn_clear_warga.setText("CELAR");
        btn_clear_warga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_wargaActionPerformed(evt);
            }
        });

        jLabel7.setText("Golongan Darah");

        jLabel9.setText("Pendidikan");

        jLabel26.setText("Pekerjaan");

        jLabel27.setText("RT");

        jLabel28.setText("RW");

        jLabel29.setText("Status Kawin");

        jLabel30.setText("Nama Ayah");

        jLabel31.setText("Nama Ibu");

        jLabel58.setText("Warga Negara");

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
                        .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(TabLimaLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiobutton_pria_warga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiobutton_wanita_warga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                                .addComponent(jLabel30))
                            .addGroup(TabLimaLayout.createSequentialGroup()
                                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TabLimaLayout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabLimaLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabLimaLayout.createSequentialGroup()
                                        .addComponent(text_nik_warga)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_search_warga))
                                    .addComponent(text_golongandarah_warga, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(text_namalengkap_warga)
                                    .addComponent(text_agama_warga)
                                    .addComponent(text_tempatlahir_warga)
                                    .addComponent(text_statuskawin_warga)
                                    .addComponent(text_warganegara_warga))
                                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(TabLimaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel26)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabLimaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel31)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_tanggallahir_warga, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(text_alamat_warga)
                            .addComponent(text_pendidikan_warga)
                            .addComponent(text_pekerjaan_warga)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabLimaLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(text_rt_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_rw_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addComponent(text_namaayah_warga)
                            .addComponent(text_namaibu_warga)))
                    .addGroup(TabLimaLayout.createSequentialGroup()
                        .addGap(379, 379, 379)
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
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nik_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search_warga)
                    .addComponent(jLabel4)
                    .addComponent(jLabel26)
                    .addComponent(text_pekerjaan_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_namalengkap_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(text_pendidikan_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_tempatlahir_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(text_tanggallahir_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_agama_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(text_alamat_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(text_golongandarah_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(text_rt_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(text_rw_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(radiobutton_pria_warga)
                        .addComponent(radiobutton_wanita_warga))
                    .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(text_namaayah_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(text_statuskawin_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(text_namaibu_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(text_warganegara_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btn_clear_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insert_warga)
                    .addComponent(btn_update_warga)
                    .addComponent(btn_delete_warga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollview_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        TabSatu.addTab("DAFTAR WARGA", TabLima);

        jLabel11.setText("Keperluan");

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

            //Disable dan Enable Button
            btn_clear_tidakmampu.setEnabled(false);
            btn_search_tidakmampu.setEnabled(true);
            btn_search_warga.setEnabled(true);
            btn_insert_warga.setEnabled(true);
            btn_delete_warga.setEnabled(false);
            btn_update_warga.setEnabled(false);
            btn_clear_warga.setEnabled(false);

            //Keterangan Tidak Mampu (11 Fields) FIX
            text_nosurat_tidakmampu.setText("");
            text_nik_tidakmampu.setText("");
            text_nik_tidakmampu.requestFocus();
            text_namalengkap_tidakmampu.setText("");
            text_tempatlahir_tidakmampu.setText("");
            text_tanggallahir_tidakmampu.setText("");
            text_agama_tidakmampu.setText("");
            text_pekerjaan_tidakmampu.setText("");
            text_keteranganrt_tidakmampu.setText("");
            text_nomorket_tidakmampu.setText("");
            text_tanggalket_tidakmampu.setText("");
            textarea_keperluan_tidakmampu.setText("");

            text_nik_tidakmampu.setEnabled(true);
            text_nik_tidakmampu.setBackground(Color.WHITE);
            text_nosurat_tidakmampu.setEnabled(false);
            text_nosurat_tidakmampu.setBackground(Color.GRAY);
            text_namalengkap_tidakmampu.setEnabled(false);
            text_namalengkap_tidakmampu.setBackground(Color.GRAY);
            text_tempatlahir_tidakmampu.setEnabled(false);
            text_tempatlahir_tidakmampu.setBackground(Color.GRAY);
            text_tanggallahir_tidakmampu.setEnabled(false);
            text_tanggallahir_tidakmampu.setBackground(Color.GRAY);;
            text_agama_tidakmampu.setEnabled(false);
            text_agama_tidakmampu.setBackground(Color.GRAY);
            text_pekerjaan_tidakmampu.setEnabled(false);
            text_pekerjaan_tidakmampu.setBackground(Color.GRAY);
            text_keteranganrt_tidakmampu.setEnabled(false);
            text_keteranganrt_tidakmampu.setBackground(Color.GRAY);
            text_nomorket_tidakmampu.setEnabled(false);
            text_nomorket_tidakmampu.setBackground(Color.GRAY);
            text_tanggalket_tidakmampu.setEnabled(false);
            text_tanggalket_tidakmampu.setBackground(Color.GRAY);
            textarea_keperluan_tidakmampu.setEnabled(false);
            textarea_keperluan_tidakmampu.setBackground(Color.GRAY);

            //Keterangan Umum (13 Fileds) FIX
            text_nik_ketumum.setText("");
            text_nik_ketumum.setEnabled(true);
            text_nik_ketumum.requestFocus();
            text_nik_ketumum.setBackground(Color.WHITE);
            text_nosurat_ketumum.setText("");
            text_namalengkap_ketumum.setText("");
            text_tempatlahir_ketumum.setText("");
            text_tangallahir_ketumum.setText("");
            text_agama_ketumum.setText("");
            text_pekerjaan_ketumum.setText("");
            textarea_keperluan_ketumum.setText("");
            text_tempattinggal_ketumum.setText("");
            text_nokk_ketumum.setText("");
            textarea_keperluan_ketumum.setText("");
            txtarena_keperluanlain_ketumum.setText("");
            text_masaberlaku_ketumum.setText("");
            text_penandatangan_ketumum.setText("");

            //Keterangan Domisili (15 Fields) FIX
            text_nosurat_ketdomisili.setText("");
            text_nik_ketdomisili.setText("");
            text_namalengkap_ketdomisili.setText("");
            text_bin_ketdomisili.setText("");
            text_binti_ketdomisili.setText("");
            text_tempatlahir_ketdomisili.setText("");
            text_tanggallahir_ketdomisili.setText("");
            text_warganegara_ketdomisili.setText("");
            text_agama_ketdomisili.setText("");
            text_pekerjaan_ketdomisili.setText("");
            text_tempattinggal_ketdomisili.setText("");
            text_keteranganrt_ketdomisili.setText("");
            text_nomorket_ketdomisili.setText("");
            text_tanggalket_ketdomisili.setText("");
            textarea_keperluan_ketdomisili.setText("");
            text_oenandatangan_ketdomisili.setText("");

            //Catatan Kepolisian (15 Fields) FIX
            text_nosurat_catkepolisian.setText("");
            text_nik_catkepolisian.setText("");
            text_namalengkap_catkepolisian.setText("");
            text_tempatlahir_catkepolisian.setText("");
            text_tangallahir_catkepolisian.setText("");
            text_warganegara_catkepolisian.setText("");
            text_agama_catkepolisian.setText("");
            text_statuskawin_catkepolisian.setText("");
            text_pekerjaan_catkepolisian.setText("");
            text_tempattinggal_catkepolisian.setText("");
            text_keteranganrt_catkepolisian.setText("");
            text_nomorket_catkepolisian.setText("");
            text_tanggalket_catkepolisian.setText("");
            textarea_keperluan_catkepolisian.setText("");
            text_penandatangan_catkepolisian.setText("");

            //Pernyataan Umum (16 Fields) FIX
            text_nosurat_perumum.setText("");
            text_nik_perumum.setText("");
            text_namalengkap_perumum.setText("");
            text_tempatlahir_perumum.setText("");
            text_tanggallahir_perumum.setText("");
            text_agama_perumum.setText("");
            text_pekerjaan_perumum.setText("");
            text_tempattinggal_perumum.setText("");
            text_suratpernyataan_perumum.setText("");
            text_warganegara_perumum.setText("");
            text_saksisatu_perumum.setText("");
            text_saksidua_perumum.setText("");
            text_namart_perumum.setText("");
            text_namarw_perumum.setText("");
            text_penandatangan_perumum.setText("");
            jTextArea3.setText("");

            //Daftar Warga (15 Fields) FIX
            text_nik_warga.setText("");
            text_nik_warga.setEnabled(true);
            text_nik_warga.requestFocus();
            text_nik_warga.setBackground(Color.WHITE);
            text_namalengkap_warga.setText("");
            text_tempatlahir_warga.setText("");
            text_tanggallahir_warga.setText("");
            text_agama_warga.setText("");
            text_pekerjaan_warga.setText("");
            text_pendidikan_warga.setText("");
            text_alamat_warga.setText("");
            text_rt_warga.setText("");
            text_rw_warga.setText("");
            text_statuskawin_warga.setText("");
            text_namaayah_warga.setText("");
            text_namaibu_warga.setText("");
            text_golongandarah_warga.setText("");
            text_warganegara_warga.setText("");

            //Set buttongroup ke pilihan kosong
            buttonGroup1.clearSelection();

            //Set disable untuk field yang tidak di gunakan di awal
            text_keteranganrt_tidakmampu.setEnabled(false);
            text_keteranganrt_tidakmampu.setBackground(Color.GRAY);
            text_nomorket_tidakmampu.setEnabled(false);
            text_nomorket_tidakmampu.setBackground(Color.GRAY);
            text_tanggalket_tidakmampu.setEnabled(false);
            text_tanggalket_tidakmampu.setBackground(Color.GRAY);
            textarea_keperluan_tidakmampu.setEnabled(false);
            textarea_keperluan_tidakmampu.setBackground(Color.GRAY);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

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
                    //`namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`
                    //`rt`, `rw`, `jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`
                    text_namalengkap_warga.setText(hasil.getString("namalengkap"));
                    text_tempatlahir_warga.setText(hasil.getString("tempatlahir"));
                    text_tanggallahir_warga.setText(hasil.getString("tanggallahir"));
                    text_agama_warga.setText(hasil.getString("agama"));
                    text_pekerjaan_warga.setText(hasil.getString("pekerjaan"));
                    text_pendidikan_warga.setText(hasil.getString("pendidikan"));
                    text_alamat_warga.setText(hasil.getString("alamat"));
                    text_rt_warga.setText(hasil.getString("rt"));
                    text_rw_warga.setText(hasil.getString("rw"));
                    j_kelamin_warga = hasil.getString("jeniskelamin");
                    text_statuskawin_warga.setText(hasil.getString("statuskawin"));
                    text_namaayah_warga.setText(hasil.getString("namaayah"));
                    text_namaibu_warga.setText(hasil.getString("namaibu"));
                    text_golongandarah_warga.setText(hasil.getString("goldarah"));
                    text_warganegara_warga.setText(hasil.getString("warganegara"));
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
                    btn_clear_tidakmampu.setEnabled(true);
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

            //`namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`, `rt`, `rw`
            //`jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`, warganegara
            query = "update warga set namalengkap = '" + text_namalengkap_warga.getText() + "', tempatlahir = '" + text_tempatlahir_warga.getText()
                    + "', tanggallahir = '" + text_tanggallahir_warga.getText() + "', agama = '" + text_agama_warga.getText() + "', pekerjaan = '" + text_pekerjaan_warga.getText()
                    + "', pendidikan = '" + text_pendidikan_warga.getText() + "', alamat = '" + text_alamat_warga.getText() + "', rt = '" + text_rt_warga.getText()
                    + "', rw = '" + text_rw_warga.getText() + "', jeniskelamin = '" + j_kelamin_warga + "', statuskawin = '" + text_statuskawin_warga.getText()
                    + "', namaayah = '" + text_namaayah_warga.getText() + "', namaibu = '" + text_namaibu_warga.getText()
                    + "', goldarah = '" + text_golongandarah_warga.getText() + "', warganegara = '" + text_warganegara_warga.getText()
                    + "' where nik = '" + text_nik_warga.getText() + "'";

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

    //insert data warga (FIX)
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
            //`nik`, `namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`, `rt`, `rw`
            //`jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`
            if (text_nik_warga.getText().equals("") && text_namalengkap_warga.getText().equals("")
                    && text_tempatlahir_warga.getText().equals("") && text_tanggallahir_warga.getText().equals("")
                    && text_agama_warga.getText().equals("") && text_pekerjaan_warga.getText().equals("")
                    && text_pendidikan_warga.getText().equals("") && text_alamat_warga.getText().equals("")
                    && text_rt_warga.getText().equals("") && text_rw_warga.getText().equals("")
                    && j_kelamin_warga.equals("") && text_statuskawin_warga.getText().equals("")
                    && text_namaayah_warga.getText().equals("") && text_namaibu_warga.getText().equals("")
                    && text_golongandarah_warga.getText().equals("") && text_warganegara_warga.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Data Tidak lengkap");
            } else {

                //`nik`, `namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`, `rt`, `rw`, `jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`, 'warganegara'
                query = "INSERT INTO warga VALUES ('" + text_nik_warga.getText().trim() + "','" + text_namalengkap_warga.getText().trim()
                        + "','" + text_tempatlahir_warga.getText().trim() + "','" + text_tanggallahir_warga.getText().trim() + "','" + text_agama_warga.getText().trim()
                        + "','" + text_pekerjaan_warga.getText().trim() + "','" + text_pendidikan_warga.getText().trim()
                        + "','" + text_alamat_warga.getText().trim() + "','" + text_rt_warga.getText().trim() + "','" + text_rw_warga.getText().trim()
                        + "','" + j_kelamin_warga + "','" + text_statuskawin_warga.getText().trim() + "','" + text_namaayah_warga.getText().trim() + "','" + text_namaibu_warga.getText().trim()
                        + "','" + text_golongandarah_warga.getText().trim() + "','" + text_warganegara_warga.getText().trim() + "');";

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

    private void radiobutton_pria_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_pria_wargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobutton_pria_wargaActionPerformed

    private void text_tempatlahir_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tempatlahir_wargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tempatlahir_wargaActionPerformed

    //Button Search untuk tab keterangan umum
    private void btn_search_ketumumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_ketumumActionPerformed
        try {

            if (text_nik_ketumum.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak Ada data Yang Anda Pilih");
            } else {
                query = "select * from warga where nik = '" + text_nik_ketumum.getText() + "'";
                stat = koneksi.createStatement();
                hasil = stat.executeQuery(query);
                while (hasil.next()) {

                    //Set data dari pencarian ke field inputan
                    text_namalengkap_ketumum.setText(hasil.getString("namalengkap"));
                    text_tempatlahir_ketumum.setText(hasil.getString("tempatlahir"));
                    text_tangallahir_ketumum.setText(hasil.getString("tanggallahir"));
                    text_agama_ketumum.setText(hasil.getString("agama"));
                    text_pekerjaan_ketumum.setText(hasil.getString("pekerjaan"));

                }
                query = "select * from warga where nik = '" + text_nik_ketumum.getText() + "'";
                stat = koneksi.createStatement();
                hasil = stat.executeQuery(query);

                _setModel(hasil);
                btn_search_tidakmampu.setEnabled(false);
                btn_clear_tidakmampu.setEnabled(true);
                text_nik_tidakmampu.setEnabled(false);
                text_nik_tidakmampu.setBackground(Color.GRAY);

                //Aktifkan field yang sebelumnya mati
//                    text_keteranganrt_tidakmampu.setEnabled(true);
//                    text_keteranganrt_tidakmampu.setBackground(Color.WHITE);
//                    
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_search_ketumumActionPerformed

    //fungsi untuk cetak surat (Masih belum berfungsi)
    private void btn_print_tidakmampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_print_tidakmampuActionPerformed

        try {

            String j_kelamin = "";
            if (radiobutton_pria_tidakmampu.isSelected()) {
                j_kelamin = "Pria";
            } else if (radiobutton_wanita_tidakmampu.isSelected()) {
                j_kelamin = "Wanita";
            } else {
                //Empty
            }

            if (text_nik_tidakmampu.getText().equals("") && text_namalengkap_tidakmampu.getText().equals("") && text_tempatlahir_tidakmampu.getText().equals("")
                    && text_tanggallahir_tidakmampu.getText().equals("") && text_agama_tidakmampu.getText().equals("")
                    && text_pekerjaan_tidakmampu.getText().equals("") || j_kelamin.equals("")) {
                JOptionPane.showMessageDialog(null, "Semua Form Harus di Isi");
            } else {

                //Fungsi akan di jalankan ketika semua field sudah terisi
                JFrame fr = new JFrame("Surat Keterangan Tidak Mampu | Print Preview");

                fr.setSize(600, 850);//Ukuran Frame Login
                fr.setLocation(380, 0);//Set Lokasi Running

                final JPanel panel = new JPanel();
                LayoutManager overlay = new OverlayLayout(panel);
                panel.setLayout(overlay);

                JLabel label1 = new JLabel(text_namalengkap_tidakmampu.getText());
                label1.setForeground(Color.BLACK);
                label1.setFont(new Font("Times New Roman", Font.BOLD, 12));
                label1.setAlignmentX(0);
                label1.setAlignmentY(0);
                panel.add(label1);

                JLabel label2 = new JLabel("Contoh");
                label2.setForeground(Color.BLACK);
                label2.setFont(new Font("Times New Roman", Font.BOLD, 12));
                label2.setAlignmentX(0.5f);
                label2.setAlignmentY(0.5f);
                panel.add(label2);

                JLabel label3 = new JLabel(new ImageIcon(Main_Form.class.getResource("TemplateSurat\\SKTM.jpg")));
                label3.setAlignmentX(0.5f);
                label3.setAlignmentY(0.5f);
                panel.add(label3);

                JButton btnLog = new JButton("Cetak & Simpan");
                btnLog.setBounds(140, 300, 200, 50);
                panel.add(btnLog);

                //Set action untuk button ceetak dan simpan
                btnLog.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        takePicture(panel); //Memanggil fungsi take picture

                        /* setSize(getPreferredSize());
                BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
                Graphics2D g = image.createGraphics();
                printAll(g);
                g.dispose();
                try {
                    ImageIO.write(image, "png", new File("aa.png"));
                } catch (IOException ex) {
                    Logger.getLogger(Main_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
                         */
                    }
                });

                //Fungsi yang akan di jalankan ketika buttun cancel di tekan
                JButton btnLog2 = new JButton("Cancel");
                btnLog2.setBounds(140, 300, 200, 50);
                panel.add(btnLog2);
                btnLog2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //new Login().setVisible(true);
                        //fr.setVisible(false);
                    }
                });

                fr.add(panel);
                fr.pack();
                fr.setVisible(true);

                /*
            JPanel jp = new JPanel();
            fr.add(jp);
            fr.setVisible(true);
            jp.setLayout(null);
        //ImageIcon sktm = new ImageIcon(this.getClass().getResource("template\\SKTM.jpg"));      
        //fr.add(new JLabelh(new ImageIcon("template\\SKTM.jpg")));
        //JLabel lb = new JLabel(sktm);
        //Graphics g = lb.getGraphics();
            //g.setFont(g.getFont().deriveFont(12f));
            //g.drawString("Hello World!", 100, 100);
            //g.dispose();
        //lb.setBounds(0, 0, 595, 842);
        //jp.add(lb);
        //String path = "template\\SKTM.jpg";
        
        JLabel nm = new JLabel();
            nm.setText("Example Text");
            nm.setBounds(100, 100, 300, 20);
        jp.add(nm);
                
        //*
            JButton btnLog = new JButton("Login");
            btnLog.setBounds(140, 300, 200, 50);
            jp.add(btnLog);        
        btnLog.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //new Login().setVisible(true);
                //fr.setVisible(false);
            }
        });
        
        Graphics g = SKTM.getGraphics();

        g.setFont(g.getFont().deriveFont(12f));
        g.drawString("Hello World!", 100, 100);
        g.dispose();
                 */
                //ImageIO.write(image, "png", new File("test.png"));  
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btn_print_tidakmampuActionPerformed

    //Fungsi TakePicture
    void takePicture(JPanel panel) {
        BufferedImage img = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
        panel.print(img.getGraphics()); // or: panel.printAll(...);

        try {
            ImageIO.write(img, "jpg", new File("Hasil//Hasil.jpg"));
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void text_nik_tidakmampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nik_tidakmampuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nik_tidakmampuActionPerformed

    private void text_tanggallahir_tidakmampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tanggallahir_tidakmampuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tanggallahir_tidakmampuActionPerformed

    private void text_tempatlahir_tidakmampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tempatlahir_tidakmampuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tempatlahir_tidakmampuActionPerformed

    private void text_keteranganrt_tidakmampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_keteranganrt_tidakmampuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_keteranganrt_tidakmampuActionPerformed

    private void text_nomorket_tidakmampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nomorket_tidakmampuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nomorket_tidakmampuActionPerformed

    //Membersihkan semua field (FIX)
    private void btn_clear_tidakmampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_tidakmampuActionPerformed
        try {
            //Menjalankan fungsi formWindowOpened
            formWindowOpened(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_clear_tidakmampuActionPerformed

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
    private void btn_search_tidakmampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_tidakmampuActionPerformed
        try {
            String j_kelamin = "";
            if (text_nik_tidakmampu.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak Ada data Yang Anda Pilih");
            } else {
                query = "select * from warga where nik = '" + text_nik_tidakmampu.getText() + "'";
                stat = koneksi.createStatement();
                hasil = stat.executeQuery(query);
                while (hasil.next()) {

                    //Set data dari pencarian ke field inputan
                    text_namalengkap_tidakmampu.setText(hasil.getString("namalengkap"));
                    text_tempatlahir_tidakmampu.setText(hasil.getString("tempatlahir"));
                    text_tanggallahir_tidakmampu.setText(hasil.getString("tanggallahir"));
                    text_agama_tidakmampu.setText(hasil.getString("agama"));
                    text_pekerjaan_tidakmampu.setText(hasil.getString("pekerjaan"));
                    j_kelamin = hasil.getString("jeniskelamin");
                }

                if (j_kelamin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Data Yang Anda Pilih Tidak Ada di database");//pesan ketika data tidak di temukan
                    formWindowOpened(null);
                } else {
                    if (j_kelamin.equals("Pria")) {
                        radiobutton_pria_tidakmampu.setSelected(true);
                    } else {
                        radiobutton_wanita_tidakmampu.setSelected(true);
                    }
                    query = "select * from warga where nik = '" + text_nik_tidakmampu.getText() + "'";
                    stat = koneksi.createStatement();
                    hasil = stat.executeQuery(query);
                    _setModel(hasil);
                    btn_search_tidakmampu.setEnabled(false);
                    btn_clear_tidakmampu.setEnabled(true);
                    text_nik_tidakmampu.setEnabled(false);
                    text_nik_tidakmampu.setBackground(Color.GRAY);

                    //Aktifkan field yang sebelumnya mati
                    text_nosurat_tidakmampu.setEnabled(true);
                    text_nosurat_tidakmampu.setBackground(Color.WHITE);
                    text_namalengkap_tidakmampu.setEnabled(true);
                    text_namalengkap_tidakmampu.setBackground(Color.WHITE);
                    text_tempatlahir_tidakmampu.setEnabled(true);
                    text_tempatlahir_tidakmampu.setBackground(Color.WHITE);
                    text_tanggallahir_tidakmampu.setEnabled(true);
                    text_tanggallahir_tidakmampu.setBackground(Color.WHITE);;
                    text_agama_tidakmampu.setEnabled(true);
                    text_agama_tidakmampu.setBackground(Color.WHITE);
                    text_pekerjaan_tidakmampu.setEnabled(true);
                    text_pekerjaan_tidakmampu.setBackground(Color.WHITE);
                    text_keteranganrt_tidakmampu.setEnabled(true);
                    text_keteranganrt_tidakmampu.setBackground(Color.WHITE);
                    text_nomorket_tidakmampu.setEnabled(true);
                    text_nomorket_tidakmampu.setBackground(Color.WHITE);
                    text_tanggalket_tidakmampu.setEnabled(true);
                    text_tanggalket_tidakmampu.setBackground(Color.WHITE);
                    textarea_keperluan_tidakmampu.setEnabled(true);
                    textarea_keperluan_tidakmampu.setBackground(Color.WHITE);

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_search_tidakmampuActionPerformed

    private void btn_print_ketumumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_print_ketumumActionPerformed

        new TestPreview();

    }//GEN-LAST:event_btn_print_ketumumActionPerformed

    //Tombol clear keterangan umum
    private void btn_clear_ketumumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_ketumumActionPerformed
        try {
            //Menjalankan fungsi formWindowOpened
            formWindowOpened(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_clear_ketumumActionPerformed

     //Tombol clear keterangan domisili
    private void btn_clear_ketdomisiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_ketdomisiliActionPerformed
        try {
            //Menjalankan fungsi formWindowOpened
            formWindowOpened(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_clear_ketdomisiliActionPerformed

     //Tombol clear catatan kepolisian
    private void btn_clear_catkepolisianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_catkepolisianActionPerformed
        try {
            //Menjalankan fungsi formWindowOpened
            formWindowOpened(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_clear_catkepolisianActionPerformed

     //Tombol clear pernyataan umum
    private void btn_clear_perumumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_perumumActionPerformed
        try {
            //Menjalankan fungsi formWindowOpened
            formWindowOpened(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_clear_perumumActionPerformed

    //Tombol cari keterangan umum
    private void btn_search_ketdomisiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_ketdomisiliActionPerformed
        try {
            String j_kelamin = "";
            if (text_nik_ketdomisili.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak Ada data Yang Anda Pilih");
            } else {
                query = "select * from warga where nik = '" + text_nik_ketdomisili.getText() + "'";
                stat = koneksi.createStatement();
                hasil = stat.executeQuery(query);
                while (hasil.next()) {

                    //Set data dari pencarian ke field inputan
                    text_namalengkap_ketdomisili.setText(hasil.getString("namalengkap"));
                    text_bin_ketdomisili.setText(hasil.getString("namaayah"));
                    text_binti_ketdomisili.setText(hasil.getString("namaibu"));
                    text_tempatlahir_ketdomisili.setText(hasil.getString("tempatlahir"));
                    text_tanggallahir_ketdomisili.setText(hasil.getString("tanggallahir"));
                    text_agama_ketdomisili.setText(hasil.getString("agama"));
                    text_warganegara_ketdomisili.setText(hasil.getString("warganegara"));
                    text_pekerjaan_ketdomisili.setText(hasil.getString("pekerjaan"));
                    j_kelamin = hasil.getString("jeniskelamin");
                }

                if (j_kelamin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Data Yang Anda Pilih Tidak Ada di database");//pesan ketika data tidak di temukan
                    formWindowOpened(null);
                } else {
                    if (j_kelamin.equals("Pria")) {
                        radiobutton_pria_ketdomisili.setSelected(true);
                    } else {
                        radiobutton_wanita_ketdomisili.setSelected(true);
                    }
                    query = "select * from warga where nik = '" + text_nik_ketdomisili.getText() + "'";
                    stat = koneksi.createStatement();
                    hasil = stat.executeQuery(query);
                    _setModel(hasil);
                    btn_search_ketdomisili.setEnabled(false);
                    btn_clear_ketdomisili.setEnabled(true);
                    text_nik_ketdomisili.setEnabled(false);
                    text_nik_ketdomisili.setBackground(Color.GRAY);

                    //Aktifkan field yang sebelumnya mati
//                    text_keteranganrt_ketdomisili.setEnabled(true);
//                    text_keteranganrt_ketdomisili.setBackground(Color.WHITE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_search_ketdomisiliActionPerformed

     //Tombol cari catatan kepolisian
    private void btn_search_catkepolisianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_catkepolisianActionPerformed
        try {
            String j_kelamin = "";
            if (text_nik_catkepolisian.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak Ada data Yang Anda Pilih");
            } else {
                query = "select * from warga where nik = '" + text_nik_catkepolisian.getText() + "'";
                stat = koneksi.createStatement();
                hasil = stat.executeQuery(query);
                while (hasil.next()) {

                    //Set data dari pencarian ke field inputan
                    text_namalengkap_catkepolisian.setText(hasil.getString("namalengkap"));
                    text_tempatlahir_catkepolisian.setText(hasil.getString("tempatlahir"));
                    text_tangallahir_catkepolisian.setText(hasil.getString("tanggallahir"));
                    text_agama_catkepolisian.setText(hasil.getString("agama"));
                    text_statuskawin_catkepolisian.setText(hasil.getString("statuskawin"));
                    text_warganegara_catkepolisian.setText(hasil.getString("warganegara"));
                    text_pekerjaan_catkepolisian.setText(hasil.getString("pekerjaan"));
                    j_kelamin = hasil.getString("jeniskelamin");
                }

                if (j_kelamin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Data Yang Anda Pilih Tidak Ada di database");//pesan ketika data tidak di temukan
                    formWindowOpened(null);
                } else {
                    if (j_kelamin.equals("Pria")) {
                        radiobutton_pria_catkepolisian.setSelected(true);
                    } else {
                        radiobutton_wanita_catkepolisian.setSelected(true);
                    }
                    query = "select * from warga where nik = '" + text_nik_catkepolisian.getText() + "'";
                    stat = koneksi.createStatement();
                    hasil = stat.executeQuery(query);
                    _setModel(hasil);
                    btn_search_ketdomisili.setEnabled(false);
                    btn_clear_ketdomisili.setEnabled(true);
                    text_nik_ketdomisili.setEnabled(false);
                    text_nik_ketdomisili.setBackground(Color.GRAY);

                    //Aktifkan field yang sebelumnya mati
//                    text_keteranganrt_ketdomisili.setEnabled(true);
//                    text_keteranganrt_ketdomisili.setBackground(Color.WHITE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_search_catkepolisianActionPerformed

     //Tombol cari pernyataan umum
    private void btn_search_perumumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_perumumActionPerformed
        try {
            String j_kelamin = "";
            if (text_nik_perumum.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak Ada data Yang Anda Pilih");
            } else {
                query = "select * from warga where nik = '" + text_nik_perumum.getText() + "'";
                stat = koneksi.createStatement();
                hasil = stat.executeQuery(query);
                while (hasil.next()) {

                    //Set data dari pencarian ke field inputan
                    text_namalengkap_perumum.setText(hasil.getString("namalengkap"));
                    text_tempatlahir_perumum.setText(hasil.getString("tempatlahir"));
                    text_tanggallahir_perumum.setText(hasil.getString("tanggallahir"));
                    text_agama_perumum.setText(hasil.getString("agama"));
                    text_warganegara_perumum.setText(hasil.getString("warganegara"));
                    text_pekerjaan_perumum.setText(hasil.getString("pekerjaan"));
                    j_kelamin = hasil.getString("jeniskelamin");
                }

                if (j_kelamin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Data Yang Anda Pilih Tidak Ada di database");//pesan ketika data tidak di temukan
                    formWindowOpened(null);
                } else {
                    if (j_kelamin.equals("Pria")) {
                        radiobutton_pria_perumum.setSelected(true);
                    } else {
                        radiobutton_wanita_perumum.setSelected(true);
                    }
                    query = "select * from warga where nik = '" + text_nik_perumum.getText() + "'";
                    stat = koneksi.createStatement();
                    hasil = stat.executeQuery(query);
                    _setModel(hasil);
                    btn_search_perumum.setEnabled(false);
                    btn_clear_perumum.setEnabled(true);
                    text_nik_perumum.setEnabled(false);
                    text_nik_perumum.setBackground(Color.GRAY);

                    //Aktifkan field yang sebelumnya mati
//                    text_keteranganrt_ketdomisili.setEnabled(true);
//                    text_keteranganrt_ketdomisili.setBackground(Color.WHITE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_search_perumumActionPerformed

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
            list = new ArrayList<Data_Provider>();
            while (hasil.next()) {

                //`nik`, `namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`, `rt`, `rw`, `jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`
                //Untuk Select Data dan menempatkannya di tableView
                //String yang menjadi parameter adalah nama kolom yang ada di dalam database
                data_provider = new Data_Provider();
                data_provider.setNomorIndukKependudukan(hasil.getString("nik"));
                data_provider.setNamaWarga(hasil.getString("namalengkap"));
                data_provider.setTempatLahir(hasil.getString("tempatlahir"));
                data_provider.setTanggalLahir(hasil.getString("tanggallahir"));
                data_provider.setAgama(hasil.getString("agama"));
                data_provider.setPekerjaanWarga(hasil.getString("pekerjaan"));
                data_provider.setPendidikan(hasil.getString("pendidikan"));
                data_provider.setAlamat(hasil.getString("alamat"));
                data_provider.setRt(hasil.getString("rt"));
                data_provider.setRw(hasil.getString("rw"));
                data_provider.setJenisKelamin(hasil.getString("jeniskelamin"));
                data_provider.setStatuskawin(hasil.getString("statuskawin"));
                data_provider.setNamaayah(hasil.getString("namaayah"));
                data_provider.setNamaibu(hasil.getString("namaibu"));
                data_provider.setGoldarah(hasil.getString("goldarah"));
                data_provider.setWarganegara(hasil.getString("warganegara"));

                list.add(data_provider);
            }
            model = new Data_Adapter(list);

            //nama table yang di gunakan
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
    private javax.swing.JButton btn_clear_catkepolisian;
    private javax.swing.JButton btn_clear_ketdomisili;
    private javax.swing.JButton btn_clear_ketumum;
    private javax.swing.JButton btn_clear_perumum;
    private javax.swing.JButton btn_clear_tidakmampu;
    private javax.swing.JButton btn_clear_warga;
    private javax.swing.JButton btn_delete_warga;
    private javax.swing.JButton btn_insert_warga;
    private javax.swing.JButton btn_print_catkepolisian;
    private javax.swing.JButton btn_print_ketdomisili;
    private javax.swing.JButton btn_print_ketumum;
    private javax.swing.JButton btn_print_perumum;
    private javax.swing.JButton btn_print_tidakmampu;
    private javax.swing.JButton btn_search_catkepolisian;
    private javax.swing.JButton btn_search_ketdomisili;
    private javax.swing.JButton btn_search_ketumum;
    private javax.swing.JButton btn_search_perumum;
    private javax.swing.JButton btn_search_tidakmampu;
    private javax.swing.JButton btn_search_warga;
    private javax.swing.JButton btn_update_warga;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkbox_ttdcamat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField8;
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
    private javax.swing.JRadioButton radiobutton_pria_catkepolisian;
    private javax.swing.JRadioButton radiobutton_pria_ketdomisili;
    private javax.swing.JRadioButton radiobutton_pria_perumum;
    private javax.swing.JRadioButton radiobutton_pria_tidakmampu;
    private javax.swing.JRadioButton radiobutton_pria_warga;
    private javax.swing.JRadioButton radiobutton_wanita_catkepolisian;
    private javax.swing.JRadioButton radiobutton_wanita_ketdomisili;
    private javax.swing.JRadioButton radiobutton_wanita_perumum;
    private javax.swing.JRadioButton radiobutton_wanita_tidakmampu;
    private javax.swing.JRadioButton radiobutton_wanita_warga;
    private javax.swing.JScrollPane scrollview_warga;
    private javax.swing.JTable table_warga;
    private javax.swing.JTextField text_agama_catkepolisian;
    private javax.swing.JTextField text_agama_ketdomisili;
    private javax.swing.JTextField text_agama_ketumum;
    private javax.swing.JTextField text_agama_perumum;
    private javax.swing.JTextField text_agama_tidakmampu;
    private javax.swing.JTextField text_agama_warga;
    private javax.swing.JTextField text_alamat_warga;
    private javax.swing.JTextField text_bin_ketdomisili;
    private javax.swing.JTextField text_binti_ketdomisili;
    private javax.swing.JTextField text_golongandarah_warga;
    private javax.swing.JTextField text_keteranganrt_catkepolisian;
    private javax.swing.JTextField text_keteranganrt_ketdomisili;
    private javax.swing.JTextField text_keteranganrt_tidakmampu;
    private javax.swing.JTextField text_masaberlaku_ketumum;
    private javax.swing.JTextField text_namaayah_warga;
    private javax.swing.JTextField text_namaibu_warga;
    private javax.swing.JTextField text_namalengkap_catkepolisian;
    private javax.swing.JTextField text_namalengkap_ketdomisili;
    private javax.swing.JTextField text_namalengkap_ketumum;
    private javax.swing.JTextField text_namalengkap_perumum;
    private javax.swing.JTextField text_namalengkap_tidakmampu;
    private javax.swing.JTextField text_namalengkap_warga;
    private javax.swing.JTextField text_namart_perumum;
    private javax.swing.JTextField text_namarw_perumum;
    private javax.swing.JTextField text_nik_catkepolisian;
    private javax.swing.JTextField text_nik_ketdomisili;
    private javax.swing.JTextField text_nik_ketumum;
    private javax.swing.JTextField text_nik_perumum;
    private javax.swing.JTextField text_nik_tidakmampu;
    private javax.swing.JTextField text_nik_warga;
    private javax.swing.JTextField text_nokk_ketumum;
    private javax.swing.JTextField text_nomorket_catkepolisian;
    private javax.swing.JTextField text_nomorket_ketdomisili;
    private javax.swing.JTextField text_nomorket_tidakmampu;
    private javax.swing.JTextField text_nosurat_catkepolisian;
    private javax.swing.JTextField text_nosurat_ketdomisili;
    private javax.swing.JTextField text_nosurat_ketumum;
    private javax.swing.JTextField text_nosurat_perumum;
    private javax.swing.JTextField text_nosurat_tidakmampu;
    private javax.swing.JTextField text_oenandatangan_ketdomisili;
    private javax.swing.JTextField text_pekerjaan_catkepolisian;
    private javax.swing.JTextField text_pekerjaan_ketdomisili;
    private javax.swing.JTextField text_pekerjaan_ketumum;
    private javax.swing.JTextField text_pekerjaan_perumum;
    private javax.swing.JTextField text_pekerjaan_tidakmampu;
    private javax.swing.JTextField text_pekerjaan_warga;
    private javax.swing.JTextField text_penandatangan_catkepolisian;
    private javax.swing.JTextField text_penandatangan_ketumum;
    private javax.swing.JTextField text_penandatangan_perumum;
    private javax.swing.JTextField text_pendidikan_warga;
    private javax.swing.JTextField text_rt_warga;
    private javax.swing.JTextField text_rw_warga;
    private javax.swing.JTextField text_saksidua_perumum;
    private javax.swing.JTextField text_saksisatu_perumum;
    private javax.swing.JTextField text_statuskawin_catkepolisian;
    private javax.swing.JTextField text_statuskawin_warga;
    private javax.swing.JTextField text_suratpernyataan_perumum;
    private javax.swing.JTextField text_tangallahir_catkepolisian;
    private javax.swing.JTextField text_tangallahir_ketumum;
    private javax.swing.JTextField text_tanggalket_catkepolisian;
    private javax.swing.JTextField text_tanggalket_ketdomisili;
    private javax.swing.JTextField text_tanggalket_tidakmampu;
    private javax.swing.JTextField text_tanggallahir_ketdomisili;
    private javax.swing.JTextField text_tanggallahir_perumum;
    private javax.swing.JTextField text_tanggallahir_tidakmampu;
    private javax.swing.JTextField text_tanggallahir_warga;
    private javax.swing.JTextField text_tempatlahir_catkepolisian;
    private javax.swing.JTextField text_tempatlahir_ketdomisili;
    private javax.swing.JTextField text_tempatlahir_ketumum;
    private javax.swing.JTextField text_tempatlahir_perumum;
    private javax.swing.JTextField text_tempatlahir_tidakmampu;
    private javax.swing.JTextField text_tempatlahir_warga;
    private javax.swing.JTextField text_tempattinggal_catkepolisian;
    private javax.swing.JTextField text_tempattinggal_ketdomisili;
    private javax.swing.JTextField text_tempattinggal_ketumum;
    private javax.swing.JTextField text_tempattinggal_perumum;
    private javax.swing.JTextField text_warganegara_catkepolisian;
    private javax.swing.JTextField text_warganegara_ketdomisili;
    private javax.swing.JTextField text_warganegara_perumum;
    private javax.swing.JTextField text_warganegara_warga;
    private javax.swing.JTextArea textarea_keperluan_catkepolisian;
    private javax.swing.JTextArea textarea_keperluan_ketdomisili;
    private javax.swing.JTextArea textarea_keperluan_ketumum;
    private javax.swing.JTextArea textarea_keperluan_tidakmampu;
    private javax.swing.JTextArea txtarena_keperluanlain_ketumum;
    // End of variables declaration//GEN-END:variables

}