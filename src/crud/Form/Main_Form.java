package crud.Form;

import crud.DataAdapter.Data_Adapter;
import crud.DataProvider.Data_Provider;
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
        jLabel25 = new javax.swing.JLabel();
        TabDua = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        jLabel7 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();

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

        btn_cari.setText("SEARCH");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_bersih.setText("CLEAR");
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

        btn_cetaksurat.setText("PRINT");
        btn_cetaksurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetaksuratActionPerformed(evt);
            }
        });

        jLabel25.setText("Keperluan");

        javax.swing.GroupLayout TidakMampuLayout = new javax.swing.GroupLayout(TidakMampu);
        TidakMampu.setLayout(TidakMampuLayout);
        TidakMampuLayout.setHorizontalGroup(
            TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(463, 463, 463))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                        .addComponent(btn_bersih, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(432, 432, 432))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TidakMampuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cetaksurat, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                    .addComponent(text_keteranganrt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(label_keteranganrt)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(text_nomorket, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(label_tanggal)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(text_tanggalket, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                                                .addComponent(text_pekerjaan)))
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
                                            .addComponent(text_nik)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TidakMampuLayout.createSequentialGroup()
                                            .addComponent(text_tempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(label_namalahir)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(text_tanggallahir))
                                        .addComponent(text_agama)
                                        .addComponent(text_namalengkap)))))))
                .addGap(147, 147, 147))
        );
        TidakMampuLayout.setVerticalGroup(
            TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TidakMampuLayout.createSequentialGroup()
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TidakMampuLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cari)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_nik)))
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
                .addGap(27, 27, 27)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_bersih, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_cetaksurat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel22.setText("Masa Berlaku");

        jLabel23.setText("Keterangan Lain");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel24.setText("Penanda Tangan");

        jButton1.setText("SEARCH");

        jButton2.setText("CLEAR");

        jButton3.setText("PRINT");

        javax.swing.GroupLayout TabDuaLayout = new javax.swing.GroupLayout(TabDua);
        TabDua.setLayout(TabDuaLayout);
        TabDuaLayout.setHorizontalGroup(
            TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabDuaLayout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TabDuaLayout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TabDuaLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel21)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(342, 342, 342))
                                .addGroup(TabDuaLayout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel16))
                                    .addGap(18, 18, 18)
                                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(17, 17, 17)
                                            .addComponent(jLabel17)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(418, 418, 418))))
                        .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TabDuaLayout.createSequentialGroup()
                                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(27, 27, 27)))
                                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(TabDuaLayout.createSequentialGroup()
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(TabDuaLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel19)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel23)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(TabDuaLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TabDuaLayout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(TabDuaLayout.createSequentialGroup()
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel24)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
        );
        TabDuaLayout.setVerticalGroup(
            TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabDuaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addComponent(jLabel17)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(TabDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 74, Short.MAX_VALUE))
        );

        TabSatu.addTab("KETERANGAN UMUM", TabDua);

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

        jLabel7.setText("Golongan Darah");

        jLabel9.setText("jLabel9");

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
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6)
                        .addGap(86, 86, 86)
                        .addComponent(radiobutton_pria_warga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiobutton_wanita_warga))
                    .addGroup(TabLimaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(scrollview_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TabLimaLayout.createSequentialGroup()
                                .addComponent(text_nik_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TabLimaLayout.createSequentialGroup()
                                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(text_namalengkap_warga, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_agama_warga, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_tempatlahir_warga, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_tanggallahir_warga)
                                    .addComponent(text_pekerjaan_warga)
                                    .addComponent(jTextField11))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        TabLimaLayout.setVerticalGroup(
            TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabLimaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nik_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search_warga)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_namalengkap_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(text_pekerjaan_warga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabLimaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radiobutton_pria_warga)
                        .addComponent(radiobutton_wanita_warga)))
                .addGap(33, 33, 33)
                .addComponent(btn_clear_warga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
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
            btn_clear_warga.setEnabled(false);
            
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
            list = new ArrayList<Data_Provider>();
            while (hasil.next()) {

                //Untuk Select Data dan menaruhnya di tableView
                warga_tidakmampu = new Data_Provider();
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
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
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
