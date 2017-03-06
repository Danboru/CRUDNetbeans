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
        
        //Set disable untuk field yang tidak di gunakan di awal
        text_keteranganrt.setEnabled(false);
        text_keteranganrt.setBackground(Color.GRAY);
        text_nomorket.setEnabled(false);
        text_nomorket.setBackground(Color.GRAY);
        text_tanggalket.setEnabled(false);
        text_tanggalket.setBackground(Color.GRAY);
        textarea_keperluan.setEnabled(false);
        textarea_keperluan.setBackground(Color.GRAY);
                 
        //Penyesuaian koneksi ke database MYSQL
        try{
            database= "urutsewu";
            url = "jdbc:mysql://localhost:3306/"+database;
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, "root", "");            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //Variable penting
    private Connection koneksi;
    private ResultSet hasil;
    private Statement stat;
    private String query,url,database;
    
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
        scrollview_wargasatu = new javax.swing.JScrollPane();
        table_wargasatu = new javax.swing.JTable();
        btn_simpan = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
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
        scrollview_wargadua = new javax.swing.JScrollPane();
        table_wargadua = new javax.swing.JTable();
        TabTiga = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        scrollview_wargatiga = new javax.swing.JScrollPane();
        table_wargatiga = new javax.swing.JTable();
        TabEmpat = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        scrollview_wargaempat = new javax.swing.JScrollPane();
        table_wargaempat = new javax.swing.JTable();
        TabLima = new javax.swing.JPanel();
        scrollview_wargalima = new javax.swing.JScrollPane();
        table_wargalima = new javax.swing.JTable();

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

        table_wargasatu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollview_wargasatu.setViewportView(table_wargasatu);

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.setMaximumSize(new java.awt.Dimension(73, 32));
        btn_update.setMinimumSize(new java.awt.Dimension(73, 32));
        btn_update.setPreferredSize(new java.awt.Dimension(73, 32));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.setMaximumSize(new java.awt.Dimension(73, 32));
        btn_delete.setMinimumSize(new java.awt.Dimension(73, 32));
        btn_delete.setPreferredSize(new java.awt.Dimension(73, 32));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

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
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TidakMampuLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(label_kelamin)
                        .addGap(18, 18, 18)
                        .addComponent(radiobutton_pria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiobutton_wanita))
                    .addGroup(TidakMampuLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(TidakMampuLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(scrollview_wargasatu, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 58, Short.MAX_VALUE))
            .addGroup(TidakMampuLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cetaksurat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TidakMampuLayout.createSequentialGroup()
                        .addComponent(btn_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_bersih, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TidakMampuLayout.setVerticalGroup(
            TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TidakMampuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nik)
                    .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cari)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(TidakMampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bersih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cetaksurat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollview_wargasatu, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        table_wargadua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollview_wargadua.setViewportView(table_wargadua);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDuaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollview_wargadua, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollview_wargadua, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
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

        table_wargatiga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollview_wargatiga.setViewportView(table_wargatiga);

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
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabTigaLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(scrollview_wargatiga, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
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
                .addGap(36, 36, 36)
                .addComponent(scrollview_wargatiga, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        TabSatu.addTab("KETERANGAN DOMISILI", TabTiga);

        jButton10.setText("jButton10");

        table_wargaempat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollview_wargaempat.setViewportView(table_wargaempat);

        javax.swing.GroupLayout TabEmpatLayout = new javax.swing.GroupLayout(TabEmpat);
        TabEmpat.setLayout(TabEmpatLayout);
        TabEmpatLayout.setHorizontalGroup(
            TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabEmpatLayout.createSequentialGroup()
                .addGroup(TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabEmpatLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jButton10))
                    .addGroup(TabEmpatLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(scrollview_wargaempat, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        TabEmpatLayout.setVerticalGroup(
            TabEmpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabEmpatLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButton10)
                .addGap(120, 120, 120)
                .addComponent(scrollview_wargaempat, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        TabSatu.addTab("CATATAN KEPOLISIAN", TabEmpat);

        table_wargalima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollview_wargalima.setViewportView(table_wargalima);

        javax.swing.GroupLayout TabLimaLayout = new javax.swing.GroupLayout(TabLima);
        TabLima.setLayout(TabLimaLayout);
        TabLimaLayout.setHorizontalGroup(
            TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabLimaLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(scrollview_wargalima, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        TabLimaLayout.setVerticalGroup(
            TabLimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabLimaLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(scrollview_wargalima, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
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
        try{
            
            //Bagian untuk mebersihkan field
            query = "select * from warga";
            stat = koneksi.createStatement();
            hasil = stat.executeQuery(query);
            this._setModel(hasil);
            btn_simpan.setEnabled(true);
            btn_update.setEnabled(false);
            btn_delete.setEnabled(false);
            btn_bersih.setEnabled(false);
            btn_cari.setEnabled(true);
            text_nik.setText("");
            text_nik.setEnabled(true);
            text_nik.requestFocus();
            text_nik.setBackground(Color.WHITE);
           
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
            
        }catch(SQLException ex){
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
        try{
            //Menjalankan fungsi formWindowOpened
            formWindowOpened(null);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_bersihActionPerformed

    /***
     * 
     * Fungsi ini di gunakan untuk mengrab data yang ada di dalam database
     * data akan di simpan dan akan di gunakan untuk menset setiap textfield yang bersangkutan
     * hali ni juga di gunakan untuk update data, karen ketika tombol cari mendapat action
     * ada 2 tombol yang di aktifkan "Update" dan "Delete"
     * 
     */
    //Cari data (FIX)
    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        try{
            String j_kelamin = "";
            if(text_nik.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Tidak Ada data Yang Anda Pilih");
            }else{
                query = "select * from warga where nik = '"+text_nik.getText()+"'";
                stat = koneksi.createStatement();
                hasil = stat.executeQuery(query);
                while(hasil.next()){

                    //Set data dari pencarian ke field inputan
                    text_namalengkap.setText(hasil.getString("namalengkap"));
                    text_tempatlahir.setText(hasil.getString("tempatlahir"));
                    text_tanggallahir.setText(hasil.getString("tanggallahir"));
                    text_agama.setText(hasil.getString("agama"));
                    text_pekerjaan.setText(hasil.getString("pekerjaan"));
                    j_kelamin = hasil.getString("jeniskelamin");
                }

                if(j_kelamin.equals("")){
                    JOptionPane.showMessageDialog(null, "Data Yang Anda Pilih Tidak Ada di database");//pesan ketika data tidak di temukan
                    formWindowOpened(null);
                }else{
                    if(j_kelamin.equals("Pria")){
                        radiobutton_pria.setSelected(true);
                    }else{
                        radiobutton_wanita.setSelected(true);
                    }
                    query = "select * from warga where nik = '"+text_nik.getText()+"'";
                    stat = koneksi.createStatement();
                    hasil = stat.executeQuery(query);
                    _setModel(hasil);
                    btn_simpan.setEnabled(false);
                    btn_update.setEnabled(true);
                    btn_delete.setEnabled(true);
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
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_cariActionPerformed

    /***
     * 
     * Fungsi utama untik delete data ada di dalam alert dialog, bukan di tombol utamanya
     * tombol utama hanya memanggil fungsi ini
     * 
     */
    //Alert untuk delete data (FIX)
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try{
            if(JOptionPane.showConfirmDialog(null, "Anda Yakin menghapus Data ini ??","Warning",2) == JOptionPane.YES_OPTION){
                query = "delete from warga where nik = '"+text_nik.getText()+"'";
                stat = koneksi.createStatement();
                int res = stat.executeUpdate(query);
                if(res == 1){
                    JOptionPane.showMessageDialog(null, "Delete Data Sukses !");
                }
            }
            formWindowOpened(null);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    /***
     * 
     * Ini bagian untuk update data, tombol akan aktif ketika tombol cari sudah di click
     * dan akan disable atau fungsi tidak di jalankan ketika tombol cari belum mendapatkan action
     * 
     */
    //Upadate Data (FIX)
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try{
            String j_kelamin = "";
            if(radiobutton_pria.isSelected()){
                j_kelamin = "Pria";
            }else if(radiobutton_wanita.isSelected()){
                j_kelamin = "Wanita";
            }else{}
            query = "update warga set namalengkap = '"+text_namalengkap.getText()+ "', tempatlahir = '" + text_tempatlahir.getText() +
            "', tanggallahir = '" + text_tanggallahir.getText() + "', agama = '" + text_agama.getText() + "', pekerjaan = '" + text_pekerjaan.getText() +
            "', jeniskelamin = '"+j_kelamin+"' where nik = '"+text_nik.getText()+"'";
            stat = koneksi.createStatement();
            int res = stat.executeUpdate(query);
            if(res == 1){
                JOptionPane.showMessageDialog(null, "Update Data Sukses !");
                formWindowOpened(null);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    //Simpan data (Masih ada BUG) //Logical Error
    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed

        try{
            String j_kelamin = "";
            if(radiobutton_pria.isSelected()){
                j_kelamin = "Pria";
            }else if(radiobutton_wanita.isSelected()){
                j_kelamin = "Wanita";
            }else{}

            //Validasi input kosong
            if(text_nik.getText().equals("") && text_namalengkap.getText().equals("") && text_tempatlahir.getText().equals("")
                && text_tanggallahir.getText().equals("") && text_agama.getText().equals("") &&
                text_pekerjaan.getText().equals("") || j_kelamin.equals("")){
                JOptionPane.showMessageDialog(null, "Data Tidak lengkap");
            }else{
                query = "insert into warga values ('"+text_nik.getText()+"','"+text_namalengkap.getText()+"','"+text_tanggallahir+"','"+
                text_tempatlahir.getText().toString() +"','"+ text_agama.getText() +"','"+ text_pekerjaan.getText() +"','"+j_kelamin+"')";
                stat = koneksi.createStatement();
                int res = stat.executeUpdate(query);
                if(res == 1){
                    JOptionPane.showMessageDialog(null, "Insert Data Sukses !");
                    formWindowOpened(null);
                }
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_cetaksuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetaksuratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cetaksuratActionPerformed

 
    /***
     * 
     * Fungsi ini di gunakan untuk menset setiap kolum yang akan di tampilkan di table
     * perhatikan setNya dan argumen getStringnya
     * untuk bisa menampilkan data sesuai dengan urutan table yang ada di database
     * 
     */ //(FIX)
    private void _setModel(ResultSet hasil)
    {
        try{
            list = new ArrayList<TidakMampu_Provider>();
            while(hasil.next()){
                
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
            table_wargasatu.setModel(model); 
            table_wargadua.setModel(model);
            table_wargatiga.setModel(model);
            table_wargaempat.setModel(model);
            table_wargalima.setModel(model);
            
        }catch(SQLException ex){
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
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JRadioButton radiobutton_wanita;
    private javax.swing.JScrollPane scrollview_wargadua;
    private javax.swing.JScrollPane scrollview_wargaempat;
    private javax.swing.JScrollPane scrollview_wargalima;
    private javax.swing.JScrollPane scrollview_wargasatu;
    private javax.swing.JScrollPane scrollview_wargatiga;
    private javax.swing.JTable table_wargadua;
    private javax.swing.JTable table_wargaempat;
    private javax.swing.JTable table_wargalima;
    private javax.swing.JTable table_wargasatu;
    private javax.swing.JTable table_wargatiga;
    private javax.swing.JTextField text_agama;
    private javax.swing.JTextField text_keteranganrt;
    private javax.swing.JTextField text_namalengkap;
    private javax.swing.JTextField text_nik;
    private javax.swing.JTextField text_nomorket;
    private javax.swing.JTextField text_pekerjaan;
    private javax.swing.JTextField text_tanggalket;
    private javax.swing.JTextField text_tanggallahir;
    private javax.swing.JTextField text_tempatlahir;
    private javax.swing.JTextArea textarea_keperluan;
    // End of variables declaration//GEN-END:variables

}
