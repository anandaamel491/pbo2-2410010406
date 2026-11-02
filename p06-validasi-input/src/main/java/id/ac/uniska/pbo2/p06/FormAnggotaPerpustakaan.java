package id.ac.uniska.pbo2.p06;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Form Anggota Perpustakaan (Pertemuan 6, Latihan Mandiri).
 * Aturan validasi ada di kelas Validator; form hanya membaca isian dan menampilkan hasilnya.
 */
public class FormAnggotaPerpustakaan extends javax.swing.JFrame {

    private static final int PANJANG_NPM = 10;
    private static final int PANJANG_HP_MAKS = 13;

    /** Membuat form baru. */
    public FormAnggotaPerpustakaan() {
        initComponents();

        // gaya huruf FlatLaf dan placeholder
        judulLabel.putClientProperty("FlatLaf.styleClass", "h2");
        keteranganLabel.putClientProperty("FlatLaf.style", "foreground: $Label.disabledForeground");
        dataAnggotaLabel.putClientProperty("FlatLaf.styleClass", "h4");
        kontakLabel.putClientProperty("FlatLaf.styleClass", "h4");
        persetujuanLabel.putClientProperty("FlatLaf.styleClass", "h4");
        npmField.putClientProperty("JTextField.placeholderText", "Contoh: 2410010123");
        emailField.putClientProperty("JTextField.placeholderText", "nama@contoh.com");
        hpField.putClientProperty("JTextField.placeholderText", "08xxxxxxxxxx");

        // label pesan kesalahan: huruf kecil dan warna merah yang mengikuti tema
        for (JLabel pesan : List.of(npmPesanLabel, namaPesanLabel, prodiPesanLabel,
                emailPesanLabel, hpPesanLabel)) {
            pesan.putClientProperty("FlatLaf.styleClass", "small");
            pesan.setForeground(warnaKesalahan());
        }
        statusLabel.setForeground(warnaKesalahan());
        digitLabel.putClientProperty("FlatLaf.styleClass", "small");

        getRootPane().setDefaultButton(daftarButton);
        perbaruiHitungDigit();
        pack(); // hitung ulang ukuran setelah gaya huruf berubah
        setMinimumSize(getSize()); // jendela tidak dapat dikecilkan melebihi ukuran awal
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jenisGroup = new javax.swing.ButtonGroup();
        headerPanel = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();
        isiPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        dataAnggotaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        npmField = new javax.swing.JTextField();
        digitLabel = new javax.swing.JLabel();
        npmPesanLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        namaPesanLabel = new javax.swing.JLabel();
        prodiLabel = new javax.swing.JLabel();
        prodiCombo = new javax.swing.JComboBox<>();
        prodiPesanLabel = new javax.swing.JLabel();
        jenisLabel = new javax.swing.JLabel();
        jenisPanel = new javax.swing.JPanel();
        mahasiswaRadio = new javax.swing.JRadioButton();
        dosenRadio = new javax.swing.JRadioButton();
        umumRadio = new javax.swing.JRadioButton();
        kontakLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailPesanLabel = new javax.swing.JLabel();
        hpLabel = new javax.swing.JLabel();
        hpField = new javax.swing.JTextField();
        hpPesanLabel = new javax.swing.JLabel();
        alamatLabel = new javax.swing.JLabel();
        alamatScroll = new javax.swing.JScrollPane();
        alamatArea = new javax.swing.JTextArea();
        persetujuanLabel = new javax.swing.JLabel();
        setujuCheck = new javax.swing.JCheckBox();
        bawahPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        tombolPanel = new javax.swing.JPanel();
        batalButton = new javax.swing.JButton();
        daftarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Form Anggota Perpustakaan");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 8, 16));
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.Y_AXIS));

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        judulLabel.setText("Form Anggota Perpustakaan");
        headerPanel.add(judulLabel);

        keteranganLabel.setText("Lengkapi data keanggotaan perpustakaan.");
        headerPanel.add(keteranganLabel);

        getContentPane().add(headerPanel, java.awt.BorderLayout.NORTH);

        isiPanel.setLayout(new java.awt.BorderLayout());

        formPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 8, 16));
        formPanel.setLayout(new java.awt.GridBagLayout());

        dataAnggotaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dataAnggotaLabel.setText("Data Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        formPanel.add(dataAnggotaLabel, gridBagConstraints);

        npmLabel.setDisplayedMnemonic('P');
        npmLabel.setLabelFor(npmField);
        npmLabel.setText("NPM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 12);
        formPanel.add(npmLabel, gridBagConstraints);

        npmField.setColumns(20);
        npmField.setToolTipText("Hanya angka, tepat 10 digit");
        npmField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                npmFieldFocusLost(evt);
            }
        });
        npmField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                npmFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                npmFieldKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        formPanel.add(npmField, gridBagConstraints);

        digitLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        formPanel.add(digitLabel, gridBagConstraints);

        npmPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 2, 0);
        formPanel.add(npmPesanLabel, gridBagConstraints);

        namaLabel.setDisplayedMnemonic('N');
        namaLabel.setLabelFor(namaField);
        namaLabel.setText("Nama lengkap");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 12);
        formPanel.add(namaLabel, gridBagConstraints);

        namaField.setColumns(20);
        namaField.setToolTipText("Huruf saja, minimal 3 huruf, tanpa angka");
        namaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        formPanel.add(namaField, gridBagConstraints);

        namaPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 2, 0);
        formPanel.add(namaPesanLabel, gridBagConstraints);

        prodiLabel.setDisplayedMnemonic('R');
        prodiLabel.setLabelFor(prodiCombo);
        prodiLabel.setText("Program studi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 12);
        formPanel.add(prodiLabel, gridBagConstraints);

        prodiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih program studi", "Teknik Informatika", "Sistem Informasi", "Teknik Elektro", "Teknik Mesin" }));
        prodiCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                prodiComboItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        formPanel.add(prodiCombo, gridBagConstraints);

        prodiPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 2, 0);
        formPanel.add(prodiPesanLabel, gridBagConstraints);

        jenisLabel.setDisplayedMnemonic('J');
        jenisLabel.setLabelFor(mahasiswaRadio);
        jenisLabel.setText("Jenis anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(jenisLabel, gridBagConstraints);

        jenisPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jenisGroup.add(mahasiswaRadio);
        mahasiswaRadio.setMnemonic('M');
        mahasiswaRadio.setSelected(true);
        mahasiswaRadio.setText("Mahasiswa");
        jenisPanel.add(mahasiswaRadio);

        jenisGroup.add(dosenRadio);
        dosenRadio.setMnemonic('D');
        dosenRadio.setText("Dosen");
        jenisPanel.add(dosenRadio);

        jenisGroup.add(umumRadio);
        umumRadio.setMnemonic('U');
        umumRadio.setText("Umum");
        jenisPanel.add(umumRadio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(jenisPanel, gridBagConstraints);

        kontakLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kontakLabel.setText("Kontak");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 6, 0);
        formPanel.add(kontakLabel, gridBagConstraints);

        emailLabel.setDisplayedMnemonic('E');
        emailLabel.setLabelFor(emailField);
        emailLabel.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 12);
        formPanel.add(emailLabel, gridBagConstraints);

        emailField.setColumns(20);
        emailField.setToolTipText("Contoh: nama@contoh.com");
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        formPanel.add(emailField, gridBagConstraints);

        emailPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 2, 0);
        formPanel.add(emailPesanLabel, gridBagConstraints);

        hpLabel.setDisplayedMnemonic('H');
        hpLabel.setLabelFor(hpField);
        hpLabel.setText("Nomor HP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 12);
        formPanel.add(hpLabel, gridBagConstraints);

        hpField.setColumns(20);
        hpField.setToolTipText("Hanya angka, diawali 08, 10 sampai 13 digit");
        hpField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hpFieldKeyTyped(evt);
            }
        });
        hpField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hpFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        formPanel.add(hpField, gridBagConstraints);

        hpPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 2, 0);
        formPanel.add(hpPesanLabel, gridBagConstraints);

        alamatLabel.setDisplayedMnemonic('L');
        alamatLabel.setLabelFor(alamatArea);
        alamatLabel.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(alamatLabel, gridBagConstraints);

        alamatArea.setColumns(20);
        alamatArea.setLineWrap(true);
        alamatArea.setRows(4);
        alamatArea.setWrapStyleWord(true);
        alamatScroll.setViewportView(alamatArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(alamatScroll, gridBagConstraints);

        persetujuanLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        persetujuanLabel.setText("Persetujuan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 6, 0);
        formPanel.add(persetujuanLabel, gridBagConstraints);

        setujuCheck.setMnemonic('T');
        setujuCheck.setText("Setuju dengan tata tertib perpustakaan");
        setujuCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                setujuCheckItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        formPanel.add(setujuCheck, gridBagConstraints);

        isiPanel.add(formPanel, java.awt.BorderLayout.NORTH);

        getContentPane().add(isiPanel, java.awt.BorderLayout.CENTER);

        bawahPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 16, 16));
        bawahPanel.setLayout(new java.awt.BorderLayout());

        statusLabel.setText(" ");
        bawahPanel.add(statusLabel, java.awt.BorderLayout.CENTER);

        tombolPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 8, 0));

        batalButton.setMnemonic('B');
        batalButton.setText("Batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(batalButton);

        daftarButton.setText("Daftar");
        daftarButton.setEnabled(false);
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(daftarButton);

        bawahPanel.add(tombolPanel, java.awt.BorderLayout.EAST);

        getContentPane().add(bawahPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void npmFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npmFieldKeyTyped
        hanyaAngka(evt, npmField, PANJANG_NPM);
    }//GEN-LAST:event_npmFieldKeyTyped

    private void npmFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npmFieldKeyReleased
        perbaruiHitungDigit();
    }//GEN-LAST:event_npmFieldKeyReleased

    private void npmFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_npmFieldFocusLost
        // isian kosong baru diperiksa saat Daftar diklik
        if (!npmField.getText().isBlank()) {
            periksaNpm();
        }
    }//GEN-LAST:event_npmFieldFocusLost

    private void namaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFieldFocusLost
        if (!namaField.getText().isBlank()) {
            periksaNama();
        }
    }//GEN-LAST:event_namaFieldFocusLost

    private void prodiComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_prodiComboItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            periksaProdi();
        }
    }//GEN-LAST:event_prodiComboItemStateChanged

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        if (!emailField.getText().isBlank()) {
            periksaEmail();
        }
    }//GEN-LAST:event_emailFieldFocusLost

    private void hpFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hpFieldKeyTyped
        hanyaAngka(evt, hpField, PANJANG_HP_MAKS);
    }//GEN-LAST:event_hpFieldKeyTyped

    private void hpFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hpFieldFocusLost
        if (!hpField.getText().isBlank()) {
            periksaHp();
        }
    }//GEN-LAST:event_hpFieldFocusLost

    private void setujuCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_setujuCheckItemStateChanged
        daftarButton.setEnabled(setujuCheck.isSelected());
    }//GEN-LAST:event_setujuCheckItemStateChanged

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        batal();
    }//GEN-LAST:event_batalButtonActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        daftar();
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int jawab = JOptionPane.showConfirmDialog(this, "Keluar dari aplikasi?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * Pencegahan kesalahan untuk isian angka: karakter bukan angka atau melebihi batas
     * panjang dibatalkan. Dipakai bersama oleh NPM dan nomor HP.
     */
    private void hanyaAngka(java.awt.event.KeyEvent evt, JTextField isian, int maks) {
        boolean penuh = isian.getText().length() >= maks && isian.getSelectedText() == null;
        if (!Character.isDigit(evt.getKeyChar()) || penuh) {
            evt.consume(); // karakter tidak dimasukkan ke isian
        }
    }

    private void perbaruiHitungDigit() {
        int jumlah = 0;
        for (char c : npmField.getText().toCharArray()) {
            if (Character.isDigit(c)) {
                jumlah++;
            }
        }
        digitLabel.setText(jumlah + " dari " + PANJANG_NPM + " digit");
    }

    private boolean periksaNpm() {
        return tandai(npmField, npmPesanLabel, Validator.npm(npmField.getText()));
    }

    private boolean periksaNama() {
        return tandai(namaField, namaPesanLabel, Validator.nama(namaField.getText()));
    }

    private boolean periksaProdi() {
        String kesalahan = null;
        if (prodiCombo.getSelectedIndex() == 0) {
            kesalahan = "Pilih salah satu program studi";
        }
        return tandai(prodiCombo, prodiPesanLabel, kesalahan);
    }

    private boolean periksaEmail() {
        return tandai(emailField, emailPesanLabel, Validator.email(emailField.getText()));
    }

    private boolean periksaHp() {
        return tandai(hpField, hpPesanLabel, Validator.nomorHp(hpField.getText()));
    }

    /** Menandai isian dengan garis merah dan pesan. Mengembalikan true jika isian valid. */
    private boolean tandai(JComponent isian, JLabel pesan, String kesalahan) {
        isian.putClientProperty("JComponent.outline", (kesalahan == null) ? null : "error");
        pesan.setText((kesalahan == null) ? " " : kesalahan);
        return kesalahan == null;
    }

    private void daftar() {
        // Semua isian diperiksa agar pengguna melihat seluruh kesalahan sekaligus
        List<JComponent> salah = new ArrayList<>();
        if (!periksaNpm()) {
            salah.add(npmField);
        }
        if (!periksaNama()) {
            salah.add(namaField);
        }
        if (!periksaProdi()) {
            salah.add(prodiCombo);
        }
        if (!periksaEmail()) {
            salah.add(emailField);
        }
        if (!periksaHp()) {
            salah.add(hpField);
        }

        if (!salah.isEmpty()) {
            statusLabel.setText(salah.size() + " isian perlu diperbaiki");
            salah.get(0).requestFocusInWindow(); // arahkan pengguna ke kesalahan pertama
            return;
        }

        statusLabel.setText(" ");
        String ringkasan = "NPM           : " + npmField.getText().trim() + "\n"
                + "Nama          : " + namaField.getText().trim() + "\n"
                + "Program studi : " + prodiCombo.getSelectedItem() + "\n"
                + "Jenis anggota : " + jenisAnggota() + "\n"
                + "Email         : " + emailField.getText().trim() + "\n"
                + "Nomor HP      : " + hpField.getText().trim() + "\n"
                + "Alamat        : " + alamatArea.getText().trim();
        JOptionPane.showMessageDialog(this, ringkasan, "Pendaftaran Berhasil",
                JOptionPane.INFORMATION_MESSAGE);
        kosongkan();
    }

    private String jenisAnggota() {
        if (dosenRadio.isSelected()) {
            return "Dosen";
        }
        if (umumRadio.isSelected()) {
            return "Umum";
        }
        return "Mahasiswa";
    }

    private void batal() {
        // Aksi yang menghapus data meminta konfirmasi terlebih dahulu
        if (adaIsian()) {
            int jawab = JOptionPane.showConfirmDialog(this,
                    "Data yang sudah diisi akan dihapus. Lanjutkan?", "Konfirmasi",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (jawab != JOptionPane.YES_OPTION) {
                return;
            }
        }
        kosongkan();
    }

    private boolean adaIsian() {
        return !npmField.getText().isBlank() || !namaField.getText().isBlank()
                || !emailField.getText().isBlank() || !hpField.getText().isBlank()
                || !alamatArea.getText().isBlank();
    }

    /** Mengosongkan semua isian, menghapus tanda kesalahan, dan mengembalikan fokus ke NPM. */
    private void kosongkan() {
        for (JTextField isian : List.of(npmField, namaField, emailField, hpField)) {
            isian.setText("");
        }
        alamatArea.setText("");
        prodiCombo.setSelectedIndex(0);
        mahasiswaRadio.setSelected(true);
        setujuCheck.setSelected(false);
        tandai(npmField, npmPesanLabel, null);
        tandai(namaField, namaPesanLabel, null);
        tandai(prodiCombo, prodiPesanLabel, null);
        tandai(emailField, emailPesanLabel, null);
        tandai(hpField, hpPesanLabel, null);
        statusLabel.setText(" ");
        perbaruiHitungDigit();
        npmField.requestFocusInWindow();
    }

    /** Merah yang mudah dibaca: lebih gelap di tema terang, lebih terang di tema gelap. */
    static Color warnaKesalahan() {
        return FlatLaf.isLafDark() ? new Color(0xFF8A80) : new Color(0xC62828);
    }

    public static void main(String args[]) {
        FlatLightLaf.setup();

        // Tampilkan form di Event Dispatch Thread
        java.awt.EventQueue.invokeLater(() -> new FormAnggotaPerpustakaan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatArea;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JScrollPane alamatScroll;
    private javax.swing.JButton batalButton;
    private javax.swing.JPanel bawahPanel;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel dataAnggotaLabel;
    private javax.swing.JLabel digitLabel;
    private javax.swing.JRadioButton dosenRadio;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailPesanLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField hpField;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JLabel hpPesanLabel;
    private javax.swing.JPanel isiPanel;
    private javax.swing.ButtonGroup jenisGroup;
    private javax.swing.JLabel jenisLabel;
    private javax.swing.JPanel jenisPanel;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JLabel kontakLabel;
    private javax.swing.JRadioButton mahasiswaRadio;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel namaPesanLabel;
    private javax.swing.JTextField npmField;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JLabel npmPesanLabel;
    private javax.swing.JLabel persetujuanLabel;
    private javax.swing.JComboBox<String> prodiCombo;
    private javax.swing.JLabel prodiLabel;
    private javax.swing.JLabel prodiPesanLabel;
    private javax.swing.JCheckBox setujuCheck;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel tombolPanel;
    private javax.swing.JRadioButton umumRadio;
    // End of variables declaration//GEN-END:variables
}
