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
            database= "kantor";
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
    private TidakMampu_Provider warga_tidakmampu;
    private List<TidakMampu_Provider> list;
    private TableModel model;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_cetaksurat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_simpan = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_cari = new javax.swing.JButton();
        btn_bersih = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea_keperluan = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        text_tanggalket = new javax.swing.JTextField();
        text_nomorket = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        text_keteranganrt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radiobutton_pria = new javax.swing.JRadioButton();
        radiobutton_wanita = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        text_pekerjaan = new javax.swing.JTextField();
        text_agama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_tempatlahir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        text_tanggallahir = new javax.swing.JTextField();
        text_namalengkap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        text_nik = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Connect Mysql");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel11.setText("Keperluan");

        btn_cetaksurat.setText("CETAK SURAT");
        btn_cetaksurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetaksuratActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
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
        btn_bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bersihActionPerformed(evt);
            }
        });

        textarea_keperluan.setColumns(20);
        textarea_keperluan.setRows(5);
        jScrollPane2.setViewportView(textarea_keperluan);

        jLabel10.setText("Tanggal");

        text_nomorket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nomorketActionPerformed(evt);
            }
        });

        jLabel9.setText("Nomor");

        text_keteranganrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_keteranganrtActionPerformed(evt);
            }
        });

        jLabel8.setText("Keterangan RT");

        jLabel3.setText("Jenis Kelamin");

        radiobutton_pria.setText("Pria");

        radiobutton_wanita.setText("Wanita");

        jLabel6.setText("Pekerjaan");

        jLabel5.setText("Agama");

        jLabel4.setText("Tempat Lahir");

        text_tempatlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tempatlahirActionPerformed(evt);
            }
        });

        jLabel7.setText("Tanggal Lahir");

        text_tanggallahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tanggallahirActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Lengkap");

        jLabel1.setText("NIK");

        text_nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(radiobutton_pria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiobutton_wanita))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(text_tempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_tanggallahir))
                                    .addComponent(text_agama)
                                    .addComponent(text_namalengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_nik, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(text_pekerjaan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(text_keteranganrt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(text_nomorket, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(text_tanggalket))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_simpan)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_bersih, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(313, 313, 313))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_cetaksurat, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(text_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_namalengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_tempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(text_tanggallahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobutton_pria)
                    .addComponent(radiobutton_wanita)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(text_nomorket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_tanggalket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_keteranganrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_update)
                    .addComponent(btn_delete)
                    .addComponent(btn_cari)
                    .addComponent(btn_bersih))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_cetaksurat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TIDAK MAMPU", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("SURAT KETERANGAN", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", jPanel6);

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
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1066, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //Fungsi untuk membersihkan isi semua field (FIX)
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            
            //Bagian untuk mebersihkan field
            query = "select * from pegawai";
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

    //Cari data (FIX)
    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        try{
            String j_kelamin = "";
            if(text_nik.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Tidak Ada data Yang Anda Pilih");
            }else{
                query = "select * from pegawai where nik = '"+text_nik.getText()+"'";
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
                    JOptionPane.showMessageDialog(null, "Data Yang Anda Pilih Tidak Ada di database");
                    formWindowOpened(null);
                }else{
                    if(j_kelamin.equals("Pria")){
                        radiobutton_pria.setSelected(true);
                    }else{
                        radiobutton_wanita.setSelected(true);
                    }
                    query = "select * from pegawai where nik = '"+text_nik.getText()+"'";
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

    //Alert untuk delete data (FIX)
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try{
            if(JOptionPane.showConfirmDialog(null, "Anda Yakin menghapus Data ini ??","Warning",2) == JOptionPane.YES_OPTION){
                query = "delete from pegawai where nik = '"+text_nik.getText()+"'";
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

    //Upadate Data (FIX)
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try{
            String j_kelamin = "";
            if(radiobutton_pria.isSelected()){
                j_kelamin = "Pria";
            }else if(radiobutton_wanita.isSelected()){
                j_kelamin = "Wanita";
            }else{}
            query = "update pegawai set namalengkap = '"+text_namalengkap.getText()+ "', tempatlahir = '" + text_tempatlahir.getText() +
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
                query = "insert into pegawai values ('"+text_nik.getText()+"','"+text_namalengkap.getText()+"','"+text_tanggallahir+"','"+
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

    
    /***
     * 
     * Memanggil Form baru untuk cetak surat
     * 
     */ //Masih ada bug di bagian validasi input (Logical Error)
    private void btn_cetaksuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetaksuratActionPerformed

        try{
            String j_kelamin = "";
            if(radiobutton_pria.isSelected()){
                j_kelamin = "Pria";
            }else if(radiobutton_wanita.isSelected()){
                j_kelamin = "Wanita";
            }else{}

           
            if(text_nik.getText().equals("") && text_namalengkap.getText().equals("") && text_tempatlahir.getText().equals("")
                && text_tanggallahir.getText().equals("") && text_agama.getText().equals("") &&
                text_pekerjaan.getText().equals("") || j_kelamin.equals("")){
                JOptionPane.showMessageDialog(null, "Semua Form Harus di Isi");
            }else{
               JOptionPane.showMessageDialog(null, "Akan Cetak Data");
            }
        }catch(HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
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
            jTable1.setModel(model); //nama table yang di gunakan
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bersih;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_cetaksurat;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radiobutton_pria;
    private javax.swing.JRadioButton radiobutton_wanita;
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
