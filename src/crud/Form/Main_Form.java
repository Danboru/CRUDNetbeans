package crud.Form;

import crud.DataAdapter.Data_Adapter;
import crud.DataProvider.Data_Provider;
import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class Main_Form extends javax.swing.JFrame {

    //Constructor
    public Main_Form() {
        initComponents();
        buttonGroup1.add(radiobutton_pria_tidakmampu);
        buttonGroup1.add(radiobutton_wanita_tidakmampu);
        
        buttonGroup1.add(radiobutton_pria_warga);
        buttonGroup1.add(radiobutton_wanita_warga);

        //Set disable untuk field yang tidak di gunakan di awal
        text_keteranganrt_tidakmampu.setEnabled(false);
        text_keteranganrt_tidakmampu.setBackground(Color.GRAY);
        text_nomorket_tidakmampu.setEnabled(false);
        text_nomorket_tidakmampu.setBackground(Color.GRAY);
        text_tanggalket_tidakmampu.setEnabled(false);
        text_tanggalket_tidakmampu.setBackground(Color.GRAY);
        textarea_keperluan_tidakmampu.setEnabled(false);
        textarea_keperluan_tidakmampu.setBackground(Color.GRAY);
        
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
    private Data_Provider warga_tidakmampu;

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
        jLabel11 = new javax.swing.JLabel();
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
        text_tgllagir__ketumum = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        text_agama_ketumum = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        text_pekerjaan_ketumum = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        text_tmpttinggal_ketumum = new javax.swing.JTextField();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                                            .addComponent(text_nik_tidakmampu)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_search_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TidakMampuLayout.createSequentialGroup()
                                            .addComponent(text_tempatlahir_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(label_namalahir)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(text_tanggallahir_tidakmampu))
                                        .addComponent(text_agama_tidakmampu)
                                        .addComponent(text_namalengkap_tidakmampu)))))))
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
                        .addGap(98, 98, 98)
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
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_agama_tidakmampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_agama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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

        jLabel18.setText("Tmpat Tinggal");

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

        btn_print_ketumum.setText("PRINT");

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
                                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addComponent(jLabel19)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel23)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(text_masaberlaku_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(24, 24, 24)
                                            .addComponent(jLabel24)
                                            .addGap(18, 18, 18)
                                            .addComponent(text_penandatangan_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29))))
                                .addGroup(TabDuaLayout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addGap(18, 18, 18)
                                            .addComponent(text_tmpttinggal_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                .addComponent(text_tgllagir__ketumum, javax.swing.GroupLayout.Alignment.TRAILING)))
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
                            .addComponent(text_tgllagir__ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(text_pekerjaan_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_tmpttinggal_ketumum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jButton1.setText("SEARCH");

        jLabel47.setText("Binti");

        jLabel48.setText("Pejabat Penanda Tangan");

        jCheckBox1.setText("Ttd Camat");

        jButton2.setText("CLEAR");

        jButton3.setText("PRINT");

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
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabTigaLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
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
                                    .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(TabTigaLayout.createSequentialGroup()
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel47)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(451, 451, 451))
                                .addGroup(TabTigaLayout.createSequentialGroup()
                                    .addComponent(jTextField3)
                                    .addGap(108, 108, 108))))
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
                                        .addComponent(jTextField11)
                                        .addGroup(TabTigaLayout.createSequentialGroup()
                                            .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(TabTigaLayout.createSequentialGroup()
                                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel43)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(TabTigaLayout.createSequentialGroup()
                                            .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(TabTigaLayout.createSequentialGroup()
                                                        .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(TabTigaLayout.createSequentialGroup()
                                                                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(24, 24, 24)
                                                                .addComponent(jLabel44)
                                                                .addGap(13, 13, 13))
                                                            .addGroup(TabTigaLayout.createSequentialGroup()
                                                                .addComponent(jLabel45)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                        .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(TabTigaLayout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jCheckBox1))
                                                .addGroup(TabTigaLayout.createSequentialGroup()
                                                    .addGap(50, 50, 50)
                                                    .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                                .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(108, 108, 108)))))
        );
        TabTigaLayout.setVerticalGroup(
            TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabTigaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel47)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabTigaLayout.createSequentialGroup()
                        .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addGap(18, 18, 18)
                        .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabTigaLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(TabTigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(42, 42, 42))
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

        javax.swing.GroupLayout TabLimaLayout = new javax.swing.GroupLayout(TabLima);
        TabLima.setLayout(TabLimaLayout);
        TabLimaLayout.setHorizontalGroup(
            TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabLimaLayout.createSequentialGroup()
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabLimaLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_clear_warga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(TabLimaLayout.createSequentialGroup()
                                .addComponent(btn_insert_warga)
                                .addGap(18, 18, 18)
                                .addComponent(btn_update_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delete_warga))))
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
                                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                                    .addComponent(text_statuskawin_warga))
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
                            .addComponent(text_namaibu_warga))))
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
                .addGap(18, 18, 18)
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
            btn_clear_tidakmampu.setEnabled(false);
            btn_search_tidakmampu.setEnabled(true);
            btn_search_warga.setEnabled(true);
            btn_insert_warga.setEnabled(true);
            btn_delete_warga.setEnabled(false);
            btn_update_warga.setEnabled(false);
            btn_clear_warga.setEnabled(false);
            
            text_nik_tidakmampu.setText("");
            text_nik_tidakmampu.setEnabled(true);
            text_nik_tidakmampu.requestFocus();
            text_nik_tidakmampu.setBackground(Color.WHITE);
            
            text_nik_warga.setText("");
            text_nik_warga.setEnabled(true);
            text_nik_warga.requestFocus();
            text_nik_warga.setBackground(Color.WHITE);

            //set textfield dengan string kosong
            text_namalengkap_tidakmampu.setText("");
            text_tempatlahir_tidakmampu.setText("");
            text_tanggallahir_tidakmampu.setText("");
            text_agama_tidakmampu.setText("");
            text_pekerjaan_tidakmampu.setText("");
            text_keteranganrt_tidakmampu.setText("");
            text_nomorket_tidakmampu.setText("");
            text_tanggalket_tidakmampu.setText("");
            textarea_keperluan_tidakmampu.setText("");
            
            //`namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`
            //`rt`, `rw`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`
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

    private void btn_print_tidakmampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_print_tidakmampuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_print_tidakmampuActionPerformed

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
            //`nik`, `namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`, `rt`, `rw`
            //`jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`
                   if (text_nik_warga.getText().equals("") && text_namalengkap_warga.getText().equals("")
                    && text_tempatlahir_warga.getText().equals("") && text_tanggallahir_warga.getText().equals("")
                    && text_agama_warga.getText().equals("") && text_pekerjaan_warga.getText().equals("")
                    && text_pendidikan_warga.getText().equals("") && text_alamat_warga.getText().equals("")
                    && text_rt_warga.getText().equals("") && text_rw_warga.getText().equals("")
                    && j_kelamin_warga.equals("") && text_statuskawin_warga.getText().equals("")
                    && text_namaayah_warga.getText().equals("") && text_namaibu_warga.getText().equals("")
                    && text_golongandarah_warga.getText().equals("")
                           ) {
                JOptionPane.showMessageDialog(null, "Data Tidak lengkap");
            } else {
                
                //`nik`, `namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`, `rt`, `rw`, `jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`
                query = "INSERT INTO warga VALUES ('"+ text_nik_warga.getText().trim() +"','"+ text_namalengkap_warga.getText().trim() +
                        "','" + text_tempatlahir_warga.getText().trim() +"','" + text_tanggallahir_warga.getText().trim() +"','"+ text_agama_warga.getText().trim() +
                        "','"+ text_pekerjaan_warga.getText().trim() +"','"+ text_pendidikan_warga.getText().trim() +
                        "','"+ text_alamat_warga.getText().trim() +"','"+ text_rt_warga.getText().trim() +"','"+ text_rw_warga.getText().trim() +
                        "','"+ j_kelamin_warga +"','"+ text_statuskawin_warga.getText().trim() +"','"+ text_namaayah_warga.getText().trim() +"','"+ text_namaibu_warga.getText().trim() +
                        "','"+ text_golongandarah_warga.getText().trim() +"');";

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
            
            //`namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`, `rt`, `rw`
            //`jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`
            query = "update warga set namalengkap = '" + text_namalengkap_warga.getText() + "', tempatlahir = '" + text_tempatlahir_warga.getText()
                    + "', tanggallahir = '" + text_tanggallahir_warga.getText() + "', agama = '" + text_agama_warga.getText() + "', pekerjaan = '" + text_alamat_warga.getText()
                    + "', pendidikan = '" + text_pendidikan_warga.getText() + "', alamat = '" + text_alamat_warga.getText() + "', rt = '" + text_rt_warga.getText()
                    + "', rw = '" + text_rw_warga.getText()+ "', jeniskelamin = '" + j_kelamin_warga + "', statuskawin = '" + text_statuskawin_warga.getText()
                    + "', namaayah = '" + text_namaayah_warga.getText()+ "', namaibu = '" + text_namaibu_warga.getText()
                    + "', goldarah = '" + text_golongandarah_warga.getText() + "' where nik = '" + text_nik_warga.getText() + "'";
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

    private void text_tempatlahir_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tempatlahir_wargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tempatlahir_wargaActionPerformed

    private void btn_search_ketumumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_ketumumActionPerformed
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
    }//GEN-LAST:event_btn_search_ketumumActionPerformed

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
                //Untuk Select Data dan menaruhnya di tableView
                //String yang menjadi parameter adalah nama kolom yang ada di dalam database yang di gunakan
                warga_tidakmampu = new Data_Provider();
                warga_tidakmampu.setNomorIndukKependudukan(hasil.getString("nik"));
                warga_tidakmampu.setNamaWarga(hasil.getString("namalengkap"));
                warga_tidakmampu.setTempatLahir(hasil.getString("tempatlahir"));
                warga_tidakmampu.setTanggalLahir(hasil.getString("tanggallahir"));
                warga_tidakmampu.setAgama(hasil.getString("agama"));
                warga_tidakmampu.setPekerjaanWarga(hasil.getString("pekerjaan"));
                warga_tidakmampu.setPendidikan(hasil.getString("pendidikan"));
                warga_tidakmampu.setAlamat(hasil.getString("alamat"));
                warga_tidakmampu.setRt(hasil.getString("rt"));
                warga_tidakmampu.setRw(hasil.getString("rw"));
                warga_tidakmampu.setJenisKelamin(hasil.getString("jeniskelamin"));
                warga_tidakmampu.setStatuskawin(hasil.getString("statuskawin"));
                warga_tidakmampu.setNamaayah(hasil.getString("namaayah"));
                warga_tidakmampu.setNamaibu(hasil.getString("namaibu"));
                warga_tidakmampu.setGoldarah(hasil.getString("goldarah"));
                
                list.add(warga_tidakmampu);
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
    private javax.swing.JButton btn_clear_ketumum;
    private javax.swing.JButton btn_clear_tidakmampu;
    private javax.swing.JButton btn_clear_warga;
    private javax.swing.JButton btn_delete_warga;
    private javax.swing.JButton btn_insert_warga;
    private javax.swing.JButton btn_print_ketumum;
    private javax.swing.JButton btn_print_tidakmampu;
    private javax.swing.JButton btn_search_ketumum;
    private javax.swing.JButton btn_search_tidakmampu;
    private javax.swing.JButton btn_search_warga;
    private javax.swing.JButton btn_update_warga;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
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
    private javax.swing.JRadioButton radiobutton_pria_tidakmampu;
    private javax.swing.JRadioButton radiobutton_pria_warga;
    private javax.swing.JRadioButton radiobutton_wanita_tidakmampu;
    private javax.swing.JRadioButton radiobutton_wanita_warga;
    private javax.swing.JScrollPane scrollview_warga;
    private javax.swing.JTable table_warga;
    private javax.swing.JTextField text_agama_ketumum;
    private javax.swing.JTextField text_agama_tidakmampu;
    private javax.swing.JTextField text_agama_warga;
    private javax.swing.JTextField text_alamat_warga;
    private javax.swing.JTextField text_golongandarah_warga;
    private javax.swing.JTextField text_keteranganrt_tidakmampu;
    private javax.swing.JTextField text_masaberlaku_ketumum;
    private javax.swing.JTextField text_namaayah_warga;
    private javax.swing.JTextField text_namaibu_warga;
    private javax.swing.JTextField text_namalengkap_ketumum;
    private javax.swing.JTextField text_namalengkap_tidakmampu;
    private javax.swing.JTextField text_namalengkap_warga;
    private javax.swing.JTextField text_nik_ketumum;
    private javax.swing.JTextField text_nik_tidakmampu;
    private javax.swing.JTextField text_nik_warga;
    private javax.swing.JTextField text_nokk_ketumum;
    private javax.swing.JTextField text_nomorket_tidakmampu;
    private javax.swing.JTextField text_nosurat_ketumum;
    private javax.swing.JTextField text_pekerjaan_ketumum;
    private javax.swing.JTextField text_pekerjaan_tidakmampu;
    private javax.swing.JTextField text_pekerjaan_warga;
    private javax.swing.JTextField text_penandatangan_ketumum;
    private javax.swing.JTextField text_pendidikan_warga;
    private javax.swing.JTextField text_rt_warga;
    private javax.swing.JTextField text_rw_warga;
    private javax.swing.JTextField text_statuskawin_warga;
    private javax.swing.JTextField text_tanggalket_tidakmampu;
    private javax.swing.JTextField text_tanggallahir_tidakmampu;
    private javax.swing.JTextField text_tanggallahir_warga;
    private javax.swing.JTextField text_tempatlahir_ketumum;
    private javax.swing.JTextField text_tempatlahir_tidakmampu;
    private javax.swing.JTextField text_tempatlahir_warga;
    private javax.swing.JTextField text_tgllagir__ketumum;
    private javax.swing.JTextField text_tmpttinggal_ketumum;
    private javax.swing.JTextArea textarea_keperluan_ketumum;
    private javax.swing.JTextArea textarea_keperluan_tidakmampu;
    private javax.swing.JTextArea txtarena_keperluanlain_ketumum;
    // End of variables declaration//GEN-END:variables

}
