package Form;

import Tool.KoneksiDB;
import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FrMenu extends javax.swing.JFrame {
    
    KoneksiDB getCnn = new KoneksiDB();
    Connection _Cnn;
    String vid_user, vnama_user, vpass, vlev_user;
    String sqlselect;

    public FrMenu() {
        initComponents();
        Image image = new ImageIcon(getClass().getResource("/Image/Admin-Schoolar.png")).getImage();
                        setIconImage(image);
        this.setExtendedState(this.getExtendedState() | FrMenu.MAXIMIZED_BOTH);
        
        disableMenu();
        txtIdUser.requestFocus(true);
    }
    
    private void disableMenu(){
        mnSistem.setEnabled(false);
        mnMaster.setEnabled(false);
        mnMahasiswa.setEnabled(false);
    }
    
    private void enableMenu(){
        mnSistem.setEnabled(true);
        mnMaster.setEnabled(true);
        mnMahasiswa.setEnabled(true);
    }
    
    private void aksiLogin(){
        vid_user = txtIdUser.getText().replaceAll("'", "");
        vpass = txtPass.getText().replaceAll("'", "");
        try{
            _Cnn = null;
            _Cnn = getCnn.getConnection();
            sqlselect = "select * from tbuser where id_user='"+vid_user+"' " 
                    + " and pass='"+vpass+"' ";
            Statement stat = _Cnn.createStatement();
            ResultSet res = stat.executeQuery(sqlselect);
            if(res.first()){
                enableMenu();
                panelLogin.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "ID. User dan Password salah",
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Error method aksiLogin() : "+ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbKeterangan = new javax.swing.JLabel();
        jpMenu = new javax.swing.JDesktopPane();
        panelLogin = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtIdUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnSistem = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnUser = new javax.swing.JMenuItem();
        mnKeluar = new javax.swing.JMenuItem();
        mnMaster = new javax.swing.JMenu();
        mnTA = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnJurusan = new javax.swing.JMenuItem();
        mnProdi = new javax.swing.JMenuItem();
        mnMahasiswa = new javax.swing.JMenu();
        mnDataMahasiswa = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnLapMahasiswa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIAKAD v.1.0.1");
        setLocation(new java.awt.Point(100, 50));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbKeterangan.setText("ID. User : ..... | Lev. User : .....");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtIdUser.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "ID. User : "));
        txtIdUser.setOpaque(false);
        txtIdUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUserActionPerformed(evt);
            }
        });

        txtPass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Password : "));
        txtPass.setOpaque(false);

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login-blue.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/small_logout.png"))); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN SIAKAD v.1.0.1");

        jLabel2.setText("-{ Sistem Informasi Akademik Oemah Codinger }-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPass)
                    .addComponent(txtIdUser)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        panelLogin.addTab("Login", new javax.swing.ImageIcon(getClass().getResource("/Image/Admin-Schoolar-Icon.png")), jPanel2); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon-login.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("SISTEM INFORMASI AKADEMIK");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("SEKOLAH TINGGI OEMAH CODINGER (STOC)");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("oemahcodinger.com");

        jpMenu.setLayer(panelLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMenu.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMenu.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMenu.setLayer(jSeparator4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMenu.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMenu.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        mnSistem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1 - Sistem.png"))); // NOI18N
        mnSistem.setText("Sistem");
        mnSistem.add(jSeparator1);

        mnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1 - user.png"))); // NOI18N
        mnUser.setText("User");
        mnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUserActionPerformed(evt);
            }
        });
        mnSistem.add(mnUser);

        mnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/small_logout.png"))); // NOI18N
        mnKeluar.setText("Keluar");
        mnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKeluarActionPerformed(evt);
            }
        });
        mnSistem.add(mnKeluar);

        jMenuBar1.add(mnSistem);

        mnMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/2 - Master.png"))); // NOI18N
        mnMaster.setText("Master");

        mnTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/2 - master small.png"))); // NOI18N
        mnTA.setText("Tahun Angkatan");
        mnTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTAActionPerformed(evt);
            }
        });
        mnMaster.add(mnTA);
        mnMaster.add(jSeparator2);

        mnJurusan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/2 - master small.png"))); // NOI18N
        mnJurusan.setText("Jurusan");
        mnJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnJurusanActionPerformed(evt);
            }
        });
        mnMaster.add(mnJurusan);

        mnProdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/2 - master small.png"))); // NOI18N
        mnProdi.setText("Program Studi");
        mnProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProdiActionPerformed(evt);
            }
        });
        mnMaster.add(mnProdi);

        jMenuBar1.add(mnMaster);

        mnMahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3 - Mahasiswa.png"))); // NOI18N
        mnMahasiswa.setText("Mahasiswa");

        mnDataMahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3 - mahasiswa small.png"))); // NOI18N
        mnDataMahasiswa.setText("Data Mahasiswa");
        mnDataMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDataMahasiswaActionPerformed(evt);
            }
        });
        mnMahasiswa.add(mnDataMahasiswa);
        mnMahasiswa.add(jSeparator3);

        mnLapMahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/report-small2.png"))); // NOI18N
        mnLapMahasiswa.setText("Laporan Data Mahasiswa");
        mnLapMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLapMahasiswaActionPerformed(evt);
            }
        });
        mnMahasiswa.add(mnLapMahasiswa);

        jMenuBar1.add(mnMahasiswa);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jpMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpMenu)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUserActionPerformed

    private void mnTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTAActionPerformed
        IfrTahunAngkatan fr = new IfrTahunAngkatan();
        jpMenu.add(fr);
        fr.setVisible(true);
    }//GEN-LAST:event_mnTAActionPerformed

    private void mnLapMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLapMahasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnLapMahasiswaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(txtIdUser.getText().equals("") | txtPass.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Silakan lengkapi data !", "Informasi", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            aksiLogin();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        txtIdUser.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_btnBatalActionPerformed

    private void mnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUserActionPerformed
        IfrUser fr = new IfrUser();
        jpMenu.add(fr);
        fr.setVisible(true);
    }//GEN-LAST:event_mnUserActionPerformed

    private void mnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKeluarActionPerformed
        int jawab = JOptionPane.showConfirmDialog(this, "Apakah anda akan keluar dari sistem?", "Informasi", 
                JOptionPane.YES_NO_OPTION);
        if(jawab == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_mnKeluarActionPerformed

    private void mnJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnJurusanActionPerformed
        IfrJurusan fr = new IfrJurusan();
        jpMenu.add(fr);
        fr.setVisible(true);
    }//GEN-LAST:event_mnJurusanActionPerformed

    private void mnProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProdiActionPerformed
        IfrProdi fr = new IfrProdi();
        jpMenu.add(fr);
        fr.setVisible(true);
    }//GEN-LAST:event_mnProdiActionPerformed

    private void mnDataMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDataMahasiswaActionPerformed
        IfrMahasiswa fr = new IfrMahasiswa();
        jpMenu.add(fr);
        fr.setVisible(true);
    }//GEN-LAST:event_mnDataMahasiswaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException,
            IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        try{
            com.jtattoo.plaf.mcwin.McWinLookAndFeel.setTheme("Default", "JavaSwing", "");
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            SwingUtilities.updateComponentTreeUI(new FrMenu());
        }finally{
            new FrMenu().setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JDesktopPane jpMenu;
    private javax.swing.JLabel lbKeterangan;
    private javax.swing.JMenuItem mnDataMahasiswa;
    private javax.swing.JMenuItem mnJurusan;
    private javax.swing.JMenuItem mnKeluar;
    private javax.swing.JMenuItem mnLapMahasiswa;
    private javax.swing.JMenu mnMahasiswa;
    private javax.swing.JMenu mnMaster;
    private javax.swing.JMenuItem mnProdi;
    private javax.swing.JMenu mnSistem;
    private javax.swing.JMenuItem mnTA;
    private javax.swing.JMenuItem mnUser;
    private javax.swing.JTabbedPane panelLogin;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}


// Keterangan
/*
    1. Deklarasikan terlebih dahulu variabel-variabel name pada form login dan menu
    2. Import file class library yang dibutuhkan
    3. Deklarasi objek koneksi database dan class Connection
    4. Deklarasikan variabel-variabel yang dibutuhkan untuk operasi login
    5. Buat method disabelMenu() dan enableMenu()
    6. Buat method aksiLogin()
    7. Tambahkan beberapa sintak pada method constructor
    8. Ubah sintak method main
    9. Tambahkan data untuk tbuser
    10. Tambahkan sintak untuk tombol login dan batal
*/