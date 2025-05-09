/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.tas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtamaAdmin
     */
    public Admin() {
        initComponents();
        tampilDataBarang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        inputCariProduk = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputKodeBarang = new javax.swing.JTextField();
        inputNamaBarang = new javax.swing.JTextField();
        inputHargaBarang = new javax.swing.JTextField();
        inputStokBarang = new javax.swing.JTextField();
        tombolTambah = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();
        tombolUpdate = new javax.swing.JButton();
        tombolKembali = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Cari Produk");

        inputCariProduk.setBackground(new java.awt.Color(255, 255, 204));
        inputCariProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCariProdukActionPerformed(evt);
            }
        });

        buttonCari.setBackground(new java.awt.Color(255, 255, 204));
        buttonCari.setText("Cari");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama", "Harga", "Stok"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Harga Barang");

        jLabel5.setText("Stok Barang");

        inputKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKodeBarangActionPerformed(evt);
            }
        });

        inputHargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHargaBarangActionPerformed(evt);
            }
        });

        inputStokBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputStokBarangActionPerformed(evt);
            }
        });

        tombolTambah.setBackground(new java.awt.Color(204, 255, 255));
        tombolTambah.setText("Tambah");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });

        tombolHapus.setBackground(new java.awt.Color(255, 153, 153));
        tombolHapus.setText("Hapus");
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });

        tombolUpdate.setBackground(new java.awt.Color(153, 255, 153));
        tombolUpdate.setText("Update");
        tombolUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUpdateActionPerformed(evt);
            }
        });

        tombolKembali.setBackground(new java.awt.Color(255, 102, 102));
        tombolKembali.setText("Kembali");
        tombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKembaliActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel6.setText("Selamat Datang Admin!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252)
                        .addComponent(inputCariProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(buttonCari))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(inputKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(inputNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(inputHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(inputStokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(tombolTambah)
                        .addGap(18, 18, 18)
                        .addComponent(tombolHapus)
                        .addGap(18, 18, 18)
                        .addComponent(tombolUpdate)
                        .addGap(207, 207, 207)
                        .addComponent(tombolKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(inputCariProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(inputKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(inputNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(inputHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(inputStokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tombolTambah)
                    .addComponent(tombolHapus)
                    .addComponent(tombolUpdate)
                    .addComponent(tombolKembali)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCariProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCariProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCariProdukActionPerformed

    private void inputKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKodeBarangActionPerformed
        // TODO add your handling code here:
        inputKodeBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tampilkanDetailBarang(inputKodeBarang.getText());
            }
        });
    }//GEN-LAST:event_inputKodeBarangActionPerformed

    private void inputHargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHargaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHargaBarangActionPerformed

    private void inputStokBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputStokBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputStokBarangActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
        cariDataBarang();
    }//GEN-LAST:event_buttonCariActionPerformed

    private void tombolUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUpdateActionPerformed
        // TODO add your handling code here:
        String kodeBarang = inputKodeBarang.getText();
        String namaBarang = inputNamaBarang.getText();
        int hargaBarang = Integer.parseInt(inputHargaBarang.getText());
        int stokBarang = Integer.parseInt(inputStokBarang.getText());
        
        if (kodeBarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kode barang harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (kodeBarang.isEmpty() || namaBarang.isEmpty() || hargaBarang <= 0 || stokBarang <= 0) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
    }
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin mengubah barang ini?", "Konfirmasi ubah", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection conn = Koneksi.getConnection()) {
                String query = "UPDATE pakaian SET nama = ?, harga = ?, stok = ? WHERE kode = ?";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setString(1, namaBarang);
                    stmt.setInt(2, hargaBarang);
                    stmt.setInt(3, stokBarang);
                    stmt.setString(4, kodeBarang);
                    
                    int rowsUpdated = stmt.executeUpdate();
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Success", JOptionPane.INFORMATION_MESSAGE);
                        tampilDataBarang();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        tombolUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUpdateActionPerformed(evt);
            }
        });
    }//GEN-LAST:event_tombolUpdateActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        // TODO add your handling code here:                                           
        String kodeBarang = inputKodeBarang.getText();
        String namaBarang = inputNamaBarang.getText();
        int hargaBarang = Integer.parseInt(inputHargaBarang.getText());
        int stokBarang = Integer.parseInt(inputStokBarang.getText());

        if (kodeBarang.isEmpty() || namaBarang.isEmpty() || hargaBarang <= 0 || stokBarang <= 0) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isKodeExists(kodeBarang)) {
            JOptionPane.showMessageDialog(this, "Kode barang sudah ada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = Koneksi.getConnection()) {
            String query = "INSERT INTO pakaian (kode, nama, harga, stok) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, kodeBarang);
                stmt.setString(2, namaBarang);
                stmt.setInt(3, hargaBarang);
                stmt.setInt(4, stokBarang);

                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                    tampilDataBarang();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        inputKodeBarang.setText("");
        inputNamaBarang.setText("");
        inputHargaBarang.setText("");
        inputStokBarang.setText("");
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        // TODO add your handling code here:
        String kodeBarang = inputKodeBarang.getText();

        if (kodeBarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kode barang harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus barang ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection conn = Koneksi.getConnection()) {
                String query = "DELETE FROM pakaian WHERE kode = ?";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setString(1, kodeBarang);

                    int rowsDeleted = stmt.executeUpdate();
                    if (rowsDeleted > 0) {
                        System.out.println("Data berhasil dihapus");
                        JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
                        tampilDataBarang();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });
    }//GEN-LAST:event_tombolHapusActionPerformed

    private void tombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKembaliActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Login z = new Login();
            z.setVisible(true);
            this.setVisible(false);
            this.dispose();
        } else if (confirm == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_tombolKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCari;
    private javax.swing.JTextField inputCariProduk;
    private javax.swing.JTextField inputHargaBarang;
    private javax.swing.JTextField inputKodeBarang;
    private javax.swing.JTextField inputNamaBarang;
    private javax.swing.JTextField inputStokBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolKembali;
    private javax.swing.JButton tombolTambah;
    private javax.swing.JButton tombolUpdate;
    // End of variables declaration//GEN-END:variables
private void tampilDataBarang() {
        DefaultTableModel tableBarang = (DefaultTableModel) table.getModel();
        tableBarang.setRowCount(0);

        try (Connection conn = Koneksi.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pakaian");

            while (rs.next()) {
                String kode = rs.getString("kode");
                String nama = rs.getString("nama");
                int harga = rs.getInt("harga");
                int stok = rs.getInt("stok");

                Object[] rowData = {kode, nama, harga, stok};
                tableBarang.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cariDataBarang() {
        String cari = inputCariProduk.getText();
        DefaultTableModel tableBarang = (DefaultTableModel) table.getModel();
        tableBarang.setRowCount(0);

        try (Connection conn = Koneksi.getConnection()) {
            String query = "SELECT * FROM pakaian WHERE nama LIKE ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, "%" + cari + "%");
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        String kode_barang = rs.getString("kode");
                        String nama_barang = rs.getString("nama");
                        int harga_barang = rs.getInt("harga");
                        int stok_barang = rs.getInt("stok");

                        Object[] rowData = {kode_barang, nama_barang, harga_barang, stok_barang};
                        tableBarang.addRow(rowData);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private boolean isKodeExists(String kodeBarang) {
        try (Connection conn = Koneksi.getConnection()) {
            String query = "SELECT COUNT(*) AS count FROM pakaian WHERE kode = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, kodeBarang);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        int count = rs.getInt("count");
                        return count > 0;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void tampilkanDetailBarang(String kodeBarang) {
        try (Connection conn = Koneksi.getConnection()) {
            String query = "SELECT * FROM pakaian WHERE kode = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, kodeBarang);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        inputNamaBarang.setText(rs.getString("nama"));
                        inputHargaBarang.setText(String.valueOf(rs.getInt("harga")));
                        inputStokBarang.setText(String.valueOf(rs.getInt("stok")));
                    } else {
                        clearInputFields();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void clearInputFields() {
        inputNamaBarang.setText("");
        inputHargaBarang.setText("");
        inputStokBarang.setText("");
    }

}