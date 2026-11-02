package id.ac.uniska.pbo2.p07;

import com.formdev.flatlaf.FlatLaf;
import java.awt.Color;
import java.util.function.Predicate;
import javax.swing.JComponent;

/**
 * Dialog modal untuk menambah atau mengubah satu buku.
 */
public class DialogBuku extends javax.swing.JDialog {

    private Buku hasil; // tetap null jika pengguna membatalkan
    private final Predicate<String> kodeSudahDipakai;

    /**
     * Membuat dialog tambah atau ubah buku.
     *
     * @param pemilik jendela utama yang dikunci selama dialog terbuka
     * @param judul judul dialog, misalnya Tambah Buku
     * @param awal buku yang akan diubah, atau null untuk buku baru
     * @param kodeSudahDipakai memeriksa apakah sebuah kode sudah dipakai buku lain
     */
    public DialogBuku(java.awt.Frame pemilik, String judul, Buku awal,
            Predicate<String> kodeSudahDipakai) {
        super(pemilik, judul, true); // true berarti modal
        this.kodeSudahDipakai = kodeSudahDipakai;
        initComponents();
        if (awal != null) {
            kodeField.setText(awal.kode());
            judulField.setText(awal.judul());
            penulisField.setText(awal.penulis());
            penerbitField.setText(awal.penerbit());
            tahunField.setText(String.valueOf(awal.tahun()));
            kategoriCombo.setSelectedItem(awal.kategori());
            statusCombo.setSelectedItem(awal.status());
        }
        kodeField.putClientProperty("JTextField.placeholderText", "Contoh: B007");
        penulisField.putClientProperty("JTextField.placeholderText", "Boleh dikosongkan");
        penerbitField.putClientProperty("JTextField.placeholderText", "Boleh dikosongkan");
        tahunField.putClientProperty("JTextField.placeholderText", "Contoh: 2008");
        pesanLabel.putClientProperty("FlatLaf.styleClass", "small");
        pesanLabel.setForeground(FlatLaf.isLafDark()
                ? new Color(0xFF8A80) : new Color(0xC62828));
        getRootPane().setDefaultButton(simpanButton);
        pack();
        setLocationRelativeTo(pemilik);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        formPanel = new javax.swing.JPanel();
        labelPanel = new javax.swing.JPanel();
        kodeLabel = new javax.swing.JLabel();
        judulLabel = new javax.swing.JLabel();
        penulisLabel = new javax.swing.JLabel();
        penerbitLabel = new javax.swing.JLabel();
        tahunLabel = new javax.swing.JLabel();
        kategoriLabel = new javax.swing.JLabel();
        statusBukuLabel = new javax.swing.JLabel();
        isianPanel = new javax.swing.JPanel();
        kodeField = new javax.swing.JTextField();
        judulField = new javax.swing.JTextField();
        penulisField = new javax.swing.JTextField();
        penerbitField = new javax.swing.JTextField();
        tahunField = new javax.swing.JTextField();
        kategoriCombo = new javax.swing.JComboBox<>();
        statusCombo = new javax.swing.JComboBox<>();
        bawahPanel = new javax.swing.JPanel();
        pesanLabel = new javax.swing.JLabel();
        tombolPanel = new javax.swing.JPanel();
        batalButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        formPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 8, 16));
        formPanel.setLayout(new java.awt.BorderLayout(12, 0));

        labelPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 8));

        kodeLabel.setLabelFor(kodeField);
        kodeLabel.setText("Kode");
        labelPanel.add(kodeLabel);

        judulLabel.setLabelFor(judulField);
        judulLabel.setText("Judul");
        labelPanel.add(judulLabel);

        penulisLabel.setLabelFor(penulisField);
        penulisLabel.setText("Penulis");
        labelPanel.add(penulisLabel);

        penerbitLabel.setLabelFor(penerbitField);
        penerbitLabel.setText("Penerbit");
        labelPanel.add(penerbitLabel);

        tahunLabel.setLabelFor(tahunField);
        tahunLabel.setText("Tahun terbit");
        labelPanel.add(tahunLabel);

        kategoriLabel.setLabelFor(kategoriCombo);
        kategoriLabel.setText("Kategori");
        labelPanel.add(kategoriLabel);

        statusBukuLabel.setLabelFor(statusCombo);
        statusBukuLabel.setText("Status");
        labelPanel.add(statusBukuLabel);

        formPanel.add(labelPanel, java.awt.BorderLayout.WEST);

        isianPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 8));

        isianPanel.add(kodeField);

        judulField.setColumns(24);
        isianPanel.add(judulField);

        isianPanel.add(penulisField);

        isianPanel.add(penerbitField);

        isianPanel.add(tahunField);

        kategoriCombo.setModel(new javax.swing.DefaultComboBoxModel<>(KategoriBuku.values()));
        isianPanel.add(kategoriCombo);

        statusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(StatusBuku.values()));
        isianPanel.add(statusCombo);

        formPanel.add(isianPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(formPanel, java.awt.BorderLayout.CENTER);

        bawahPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 16, 16, 16));
        bawahPanel.setLayout(new java.awt.BorderLayout(0, 8));

        pesanLabel.setText(" ");
        bawahPanel.add(pesanLabel, java.awt.BorderLayout.NORTH);

        tombolPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 8, 0));

        batalButton.setText("Batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(batalButton);

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(simpanButton);

        bawahPanel.add(tombolPanel, java.awt.BorderLayout.SOUTH);

        getContentPane().add(bawahPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        dispose();
    }//GEN-LAST:event_batalButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        simpan();
    }//GEN-LAST:event_simpanButtonActionPerformed

    /** Memeriksa semua isian; data baru dikembalikan hanya jika semuanya valid. */
    private void simpan() {
        bersihkanTanda();
        String kode = kodeField.getText().trim();
        String judul = judulField.getText().trim();
        String tahunTeks = tahunField.getText().trim();

        String kesalahan = ValidatorBuku.kode(kode);
        if (kesalahan != null) {
            tolak(kesalahan, kodeField);
            return;
        }
        if (kodeSudahDipakai.test(kode)) {
            tolak("Kode " + kode + " sudah dipakai buku lain", kodeField);
            return;
        }
        kesalahan = ValidatorBuku.judul(judul);
        if (kesalahan != null) {
            tolak(kesalahan, judulField);
            return;
        }
        kesalahan = ValidatorBuku.tahun(tahunTeks);
        if (kesalahan != null) {
            tolak(kesalahan, tahunField);
            return;
        }

        KategoriBuku kategori = (KategoriBuku) kategoriCombo.getSelectedItem();
        StatusBuku status = (StatusBuku) statusCombo.getSelectedItem();
        hasil = new Buku(kode, judul, penulisField.getText().trim(), penerbitField.getText().trim(),
                Integer.parseInt(tahunTeks), kategori, status);
        dispose();
    }

    /** Menampilkan pesan, menandai isian dengan garis merah, dan memindahkan fokus ke sana. */
    private void tolak(String pesan, JComponent isian) {
        pesanLabel.setText(pesan);
        isian.putClientProperty("JComponent.outline", "error");
        isian.requestFocusInWindow();
    }

    private void bersihkanTanda() {
        pesanLabel.setText(" ");
        for (JComponent isian : new JComponent[]{kodeField, judulField, tahunField}) {
            isian.putClientProperty("JComponent.outline", null);
        }
    }

    /** Menampilkan dialog dan menunggu sampai ditutup. Mengembalikan null jika dibatalkan. */
    public Buku tampilkan() {
        // Pada dialog modal, baris berikut menunggu sampai dialog ditutup
        setVisible(true);
        return hasil;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JPanel bawahPanel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel isianPanel;
    private javax.swing.JTextField judulField;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JComboBox<KategoriBuku> kategoriCombo;
    private javax.swing.JLabel kategoriLabel;
    private javax.swing.JTextField kodeField;
    private javax.swing.JLabel kodeLabel;
    private javax.swing.JPanel labelPanel;
    private javax.swing.JTextField penerbitField;
    private javax.swing.JLabel penerbitLabel;
    private javax.swing.JTextField penulisField;
    private javax.swing.JLabel penulisLabel;
    private javax.swing.JLabel pesanLabel;
    private javax.swing.JButton simpanButton;
    private javax.swing.JLabel statusBukuLabel;
    private javax.swing.JComboBox<StatusBuku> statusCombo;
    private javax.swing.JTextField tahunField;
    private javax.swing.JLabel tahunLabel;
    private javax.swing.JPanel tombolPanel;
    // End of variables declaration//GEN-END:variables
}
