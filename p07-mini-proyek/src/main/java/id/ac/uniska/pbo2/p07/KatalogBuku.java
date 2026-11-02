package id.ac.uniska.pbo2.p07;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 * Katalog Buku Perpustakaan: JTable dengan AbstractTableModel, menu, dan dialog modal.
 */
public class KatalogBuku extends javax.swing.JFrame {

    // Dibuat sebelum initComponents() karena dipakai sebagai model JTable
    private final BukuTableModel model = new BukuTableModel();
    private final TableRowSorter<BukuTableModel> sorter = new TableRowSorter<>(model);

    /** Membuat form baru. */
    public KatalogBuku() {
        initComponents();

        // Kode tambahan yang tidak tersedia di jendela Properties
        cariField.putClientProperty("JTextField.placeholderText", "Cari kode, judul, penulis");
        bukuTable.setRowSorter(sorter); // klik judul kolom untuk mengurutkan
        bukuTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        bukuTable.getColumnModel().getColumn(0).setPreferredWidth(70);
        bukuTable.getColumnModel().getColumn(1).setPreferredWidth(260);
        bukuTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        bukuTable.getColumnModel().getColumn(3).setPreferredWidth(140);
        bukuTable.getColumnModel().getColumn(4).setPreferredWidth(60);
        bukuTable.getColumnModel().getColumn(5).setPreferredWidth(90);
        bukuTable.getColumnModel().getColumn(6).setPreferredWidth(90);

        // Tombol Ubah dan Hapus hanya aktif jika ada baris yang dipilih
        bukuTable.getSelectionModel().addListSelectionListener(e -> perbaruiTombol());

        isiContoh();
        perbaruiTombol();
        perbaruiStatus();
        setSize(980, 460);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atasPanel = new javax.swing.JPanel();
        tombolPanel = new javax.swing.JPanel();
        tambahButton = new javax.swing.JButton();
        ubahButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        cariField = new javax.swing.JTextField();
        tabelPanel = new javax.swing.JPanel();
        tabelScroll = new javax.swing.JScrollPane();
        bukuTable = new javax.swing.JTable();
        statusLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        keluarItem = new javax.swing.JMenuItem();
        bukuMenu = new javax.swing.JMenu();
        tambahItem = new javax.swing.JMenuItem();
        ubahItem = new javax.swing.JMenuItem();
        bukuSeparator = new javax.swing.JPopupMenu.Separator();
        hapusItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Katalog Buku Perpustakaan");

        atasPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 4, 8, 12));
        atasPanel.setLayout(new java.awt.BorderLayout(8, 0));

        tombolPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 0));

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(tambahButton);

        ubahButton.setText("Ubah");
        ubahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(ubahButton);

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(hapusButton);

        atasPanel.add(tombolPanel, java.awt.BorderLayout.WEST);

        cariField.setColumns(20);
        cariField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariFieldKeyReleased(evt);
            }
        });
        atasPanel.add(cariField, java.awt.BorderLayout.EAST);

        getContentPane().add(atasPanel, java.awt.BorderLayout.NORTH);

        tabelPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 12, 0, 12));
        tabelPanel.setLayout(new java.awt.BorderLayout());

        bukuTable.setModel(model);
        bukuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bukuTableMouseClicked(evt);
            }
        });
        tabelScroll.setViewportView(bukuTable);

        tabelPanel.add(tabelScroll, java.awt.BorderLayout.CENTER);

        getContentPane().add(tabelPanel, java.awt.BorderLayout.CENTER);

        statusLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 8, 12));
        statusLabel.setText(" ");
        getContentPane().add(statusLabel, java.awt.BorderLayout.SOUTH);

        fileMenu.setMnemonic('F');
        fileMenu.setText("File");

        keluarItem.setText("Keluar");
        keluarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarItemActionPerformed(evt);
            }
        });
        fileMenu.add(keluarItem);

        menuBar.add(fileMenu);

        bukuMenu.setMnemonic('B');
        bukuMenu.setText("Buku");

        tambahItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        tambahItem.setText("Tambah");
        tambahItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahItemActionPerformed(evt);
            }
        });
        bukuMenu.add(tambahItem);

        ubahItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ubahItem.setText("Ubah");
        ubahItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahItemActionPerformed(evt);
            }
        });
        bukuMenu.add(ubahItem);
        bukuMenu.add(bukuSeparator);

        hapusItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        hapusItem.setText("Hapus");
        hapusItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusItemActionPerformed(evt);
            }
        });
        bukuMenu.add(hapusItem);

        menuBar.add(bukuMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        tambah();
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void ubahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahButtonActionPerformed
        ubah();
    }//GEN-LAST:event_ubahButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        hapus();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void cariFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariFieldKeyReleased
        // Isi tabel disaring setiap tombol keyboard dilepas
        saring();
    }//GEN-LAST:event_cariFieldKeyReleased

    private void bukuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bukuTableMouseClicked
        // Klik dua kali pada baris untuk mengubah buku
        if (evt.getClickCount() == 2 && bukuTable.getSelectedRow() >= 0) {
            ubah();
        }
    }//GEN-LAST:event_bukuTableMouseClicked

    private void keluarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarItemActionPerformed
        dispose();
    }//GEN-LAST:event_keluarItemActionPerformed

    private void tambahItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahItemActionPerformed
        tambah();
    }//GEN-LAST:event_tambahItemActionPerformed

    private void ubahItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahItemActionPerformed
        ubah();
    }//GEN-LAST:event_ubahItemActionPerformed

    private void hapusItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusItemActionPerformed
        hapus();
    }//GEN-LAST:event_hapusItemActionPerformed

    private void isiContoh() {
        model.tambah(new Buku("B001", "Laskar Pelangi", "Andrea Hirata", "Bentang Pustaka", 2005,
                KategoriBuku.FIKSI, StatusBuku.TERSEDIA));
        model.tambah(new Buku("B002", "Bumi Manusia", "Pramoedya Ananta Toer", "Hasta Mitra", 1980,
                KategoriBuku.FIKSI, StatusBuku.DIPINJAM));
        model.tambah(new Buku("B003", "Filosofi Teras", "Henry Manampiring", "Penerbit Buku Kompas", 2018,
                KategoriBuku.NONFIKSI, StatusBuku.TERSEDIA));
        model.tambah(new Buku("B004", "Harry Potter", "J.K. Rowling", "Bloomsbury", 1997,
                KategoriBuku.FIKSI, StatusBuku.TERSEDIA));
        model.tambah(new Buku("B005", "Dilan 1990", "Pidi Baiq", "Pastel Books", 2014,
                KategoriBuku.FIKSI, StatusBuku.DIPINJAM));
    }

    private void saring() {
        String kata = cariField.getText().trim();
        if (kata.isEmpty()) {
            sorter.setRowFilter(null);
        } else {
            // (?i): huruf besar dan kecil dianggap sama; 0, 1, 2: kode, judul, penulis
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(kata), 0, 1, 2));
        }
        perbaruiStatus();
    }

    /**
     * Mengubah nomor baris tampilan menjadi nomor baris model,
     */
    private int barisTerpilih() {
        int barisTampilan = bukuTable.getSelectedRow();
        if (barisTampilan < 0) {
            return -1;
        }
        return bukuTable.convertRowIndexToModel(barisTampilan);
    }

    private void tambah() {
        Buku baru = new DialogBuku(this, "Tambah Buku", null,
                kode -> model.adaKode(kode, -1)).tampilkan();
        if (baru != null) {
            model.tambah(baru);
            perbaruiStatus();
        }
    }

    private void ubah() {
        int baris = barisTerpilih();
        if (baris < 0) {
            return;
        }
        Buku hasil = new DialogBuku(this, "Ubah Buku", model.get(baris),
                kode -> model.adaKode(kode, baris)).tampilkan();
        if (hasil != null) {
            model.ubah(baris, hasil);
            perbaruiStatus(); // status buku bisa berubah, jadi jumlah tersedia ikut berubah
        }
    }

    private void hapus() {
        int baris = barisTerpilih();
        if (baris < 0) {
            return;
        }
        String judul = model.get(baris).judul();
        int jawab = JOptionPane.showConfirmDialog(this, "Hapus buku \"" + judul + "\"?",
                "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (jawab == JOptionPane.YES_OPTION) {
            model.hapus(baris);
            perbaruiStatus();
        }
    }

    private void perbaruiTombol() {
        boolean adaPilihan = bukuTable.getSelectedRow() >= 0;
        ubahButton.setEnabled(adaPilihan);
        hapusButton.setEnabled(adaPilihan);
        ubahItem.setEnabled(adaPilihan);
        hapusItem.setEnabled(adaPilihan);
    }

    private void perbaruiStatus() {
        statusLabel.setText("Menampilkan " + bukuTable.getRowCount()
                + " dari " + model.getRowCount() + " buku, "
                + model.jumlahTersedia() + " tersedia");
    }

    public static void main(String args[]) {
        FlatLightLaf.setup();

        // Tampilkan form di Event Dispatch Thread
        java.awt.EventQueue.invokeLater(() -> new KatalogBuku().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atasPanel;
    private javax.swing.JMenu bukuMenu;
    private javax.swing.JPopupMenu.Separator bukuSeparator;
    private javax.swing.JTable bukuTable;
    private javax.swing.JTextField cariField;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton hapusButton;
    private javax.swing.JMenuItem hapusItem;
    private javax.swing.JMenuItem keluarItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel tabelPanel;
    private javax.swing.JScrollPane tabelScroll;
    private javax.swing.JButton tambahButton;
    private javax.swing.JMenuItem tambahItem;
    private javax.swing.JPanel tombolPanel;
    private javax.swing.JButton ubahButton;
    private javax.swing.JMenuItem ubahItem;
    // End of variables declaration//GEN-END:variables
}
