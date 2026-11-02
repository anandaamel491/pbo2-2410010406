package id.ac.uniska.pbo2.p07;

import java.time.Year;

/**
 * Menguji aturan ValidatorBuku tanpa GUI dengan beberapa contoh masukan.
 * Jalankan dengan klik kanan file lalu Run File; semua baris harus bertanda SESUAI.
 */
public class UjiValidatorBuku {

    private static int gagal = 0;

    private static void cek(String nama, String hasil, boolean harusValid) {
        boolean valid = (hasil == null);
        if (valid != harusValid) {
            gagal++;
        }
        String status = (valid == harusValid) ? "SESUAI " : "SALAH ";
        System.out.println(status + nama + ": " + (valid ? "valid" : hasil));
    }

    public static void main(String[] args) {
        int sekarang = Year.now().getValue();
        cek("Kode kosong", ValidatorBuku.kode(""), false);
        cek("Kode benar", ValidatorBuku.kode("B007"), true);
        cek("Judul hanya spasi", ValidatorBuku.judul("   "), false);
        cek("Judul benar", ValidatorBuku.judul("Clean Code"), true);
        cek("Tahun kosong", ValidatorBuku.tahun(""), false);
        cek("Tahun berisi huruf", ValidatorBuku.tahun("20ab"), false);
        cek("Tahun 3 digit", ValidatorBuku.tahun("999"), false);
        cek("Tahun sebelum 1900", ValidatorBuku.tahun("1899"), false);
        cek("Tahun batas bawah 1900", ValidatorBuku.tahun("1900"), true);
        cek("Tahun tahun ini", ValidatorBuku.tahun(String.valueOf(sekarang)), true);
        cek("Tahun depan", ValidatorBuku.tahun(String.valueOf(sekarang + 1)), false);
        System.out.println();
        if (gagal == 0) {
            System.out.println("Semua aturan bekerja sesuai harapan");
        } else {
            System.out.println(gagal + " aturan belum sesuai");
        }
    }
}
