# Penggunaan AI

## Nama AI

**Google Gemini**

Dalam proses pembuatan aplikasi `FormTiketTravel`, Google Gemini digunakan sebagai alat bantu untuk memahami konsep dan implementasi Java Swing. Pemanfaatannya mencakup pembuatan validasi input, penggunaan komponen Swing, penerapan event pada tombol, serta pengaturan perubahan tampilan menggunakan FlatLaf.

AI digunakan sebagai referensi dan bukan sebagai pengganti proses pengerjaan. Setiap contoh kode yang diperoleh tetap dipahami, diuji, dan disesuaikan dengan struktur program yang digunakan.

---

## Prompt 1 – Validasi Data Pemesan

### Prompt

> "Saya sedang membuat form pemesanan tiket travel menggunakan Java Swing. Saya ingin ketika tombol Pesan ditekan, program mengecek apakah nama pemesan dan nomor HP sudah diisi. Jika ada yang kosong, berikan notifikasi dan jangan lanjutkan proses. Jika sudah lengkap, tampilkan informasi bahwa data siap diproses. Berikan contoh implementasi Java Swing yang sederhana."

### Hasil Bantuan AI

Google Gemini memberikan pendekatan dengan mengambil isi dari `JTextField`, kemudian melakukan pengecekan terhadap data tersebut. Method `trim()` digunakan agar input yang hanya berisi spasi juga dianggap kosong.

Salah satu contoh kode yang diberikan adalah:

```java
private void prosesPemesanan() {

    String nama = namaPemesanField.getText().trim();
    String hp = nomorHpField.getText().trim();

    if (nama.isEmpty() || hp.isEmpty()) {
        JOptionPane.showMessageDialog(
                this,
                "Silakan lengkapi nama dan nomor HP terlebih dahulu.",
                "Data Belum Lengkap",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    JOptionPane.showMessageDialog(
            this,
            "Data pemesanan berhasil diperiksa.",
            "Informasi",
            JOptionPane.INFORMATION_MESSAGE
    );
}
```

Dari contoh tersebut, kode kemudian disesuaikan dengan komponen yang terdapat pada aplikasi. Validasi ini digunakan agar proses pemesanan tidak berjalan apabila informasi utama dari pengguna belum tersedia.

---

## Prompt 2 – Mengecek Kelas Tiket

### Prompt

> "Dalam FormTiketTravel terdapat tiga pilihan kelas menggunakan JRadioButton, yaitu Ekonomi, Bisnis, dan Eksekutif. Saya ingin mengetahui pilihan yang dipilih pengguna ketika tombol proses ditekan, kemudian menampilkan hasil pilihannya menggunakan JOptionPane. Bagaimana cara membuatnya?"

### Hasil Bantuan AI

Google Gemini menjelaskan bahwa kondisi setiap `JRadioButton` dapat diketahui melalui `isSelected()`. Berdasarkan nilai tersebut, program dapat menentukan kelas tiket yang dipilih oleh pengguna.

Contoh kode:

```java
private void tampilkanKelas() {

    String kelas = "";

    if (ekonomiRadio.isSelected()) {
        kelas = "Ekonomi";
    } else if (bisnisRadio.isSelected()) {
        kelas = "Bisnis";
    } else if (eksekutifRadio.isSelected()) {
        kelas = "Eksekutif";
    } else {
        kelas = "Belum memilih kelas";
    }

    JOptionPane.showMessageDialog(
            this,
            "Kelas tiket: " + kelas,
            "Informasi Tiket",
            JOptionPane.INFORMATION_MESSAGE
    );
}
```

Selain itu, AI menjelaskan bahwa ketiga `JRadioButton` sebaiknya berada dalam satu `ButtonGroup`. Dengan begitu, pengguna hanya dapat memilih satu kelas tiket dalam satu waktu.

---

## Prompt 3 – Event pada JToggleButton

### Prompt

> "Saya mempunyai JToggleButton pada aplikasi Java Swing. Saya ingin teks pada tombol berubah berdasarkan statusnya. Saat tombol aktif, teksnya menjadi 'Dark Mode', sedangkan saat tidak aktif menjadi 'Light Mode'. Bagaimana cara menerapkannya pada event tombol?"

### Hasil Bantuan AI

Google Gemini menyarankan penggunaan `isSelected()` untuk mendapatkan status dari `JToggleButton`. Setelah status diketahui, `setText()` dapat digunakan untuk mengubah tulisan pada tombol.

Contoh implementasinya:

```java
private void modeToggleActionPerformed(
        java.awt.event.ActionEvent evt) {

    boolean aktif = modeToggle.isSelected();

    if (aktif) {
        modeToggle.setText("Dark Mode");
    } else {
        modeToggle.setText("Light Mode");
    }
}
```

Konsep tersebut kemudian dapat dikembangkan untuk mengubah tema aplikasi. Ketika toggle berada pada kondisi aktif, program dapat diarahkan untuk menggunakan tema tertentu, sedangkan kondisi sebaliknya menggunakan tema yang berbeda.

---

# Alasan Penggunaan AI

Google Gemini digunakan sebagai pendamping selama proses pengembangan aplikasi, terutama ketika terdapat konsep Java Swing yang masih perlu dipahami atau ketika diperlukan contoh penerapan kode tertentu.

Bantuan yang diperoleh meliputi pemahaman mengenai pengambilan data dari `JTextField`, pemeriksaan status `JRadioButton` dan `JToggleButton`, penggunaan `JOptionPane`, serta penerapan event handling pada komponen Swing.

Contoh kode dari AI tidak langsung diterapkan seluruhnya ke dalam project. Kode terlebih dahulu dipelajari dan disesuaikan dengan struktur `FormTiketTravel`, terutama pada bagian nama komponen, nama variabel, dan kebutuhan program.

Untuk pembuatan antarmuka, proses tetap dilakukan melalui **NetBeans GUI Builder**. Komponen seperti `JTextField`, `JRadioButton`, `JCheckBox`, `JComboBox`, `JButton`, dan `JToggleButton` ditempatkan serta diatur melalui desain form. Google Gemini hanya dimanfaatkan sebagai bantuan dalam memahami konsep dan menyelesaikan bagian logika pemrograman.

Dengan demikian, penggunaan AI dalam praktikum ini berfungsi sebagai **media pendukung pembelajaran dan pemecahan masalah**, bukan sebagai pengganti proses memahami dan mengerjakan program secara mandiri.