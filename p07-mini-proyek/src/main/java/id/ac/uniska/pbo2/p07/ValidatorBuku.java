package id.ac.uniska.pbo2.p07;

import java.time.Year;

/**
 * Aturan validasi isian buku tanpa GUI.
 * Setiap method mengembalikan pesan kesalahan, atau null jika nilai sudah benar.
 */
public final class ValidatorBuku {

    public static final int TAHUN_MINIMAL = 1900;

    private ValidatorBuku() {
        // kelas utilitas, tidak perlu dibuat object-nya
    }

    public static String wajibDiisi(String nilai, String namaIsian) {
        if (nilai == null || nilai.isBlank()) {
            return namaIsian + " wajib diisi";
        }
        return null;
    }

    public static String kode(String kode) {
        return wajibDiisi(kode, "Kode");
    }

    public static String judul(String judul) {
        return wajibDiisi(judul, "Judul");
    }

    public static String tahun(String tahun) {
        String kosong = wajibDiisi(tahun, "Tahun");
        if (kosong != null) {
            return kosong;
        }
        if (!tahun.trim().matches("\\d{4}")) {
            return "Tahun berupa angka 4 digit, contoh: 2008";
        }
        int nilai = Integer.parseInt(tahun.trim());
        int sekarang = Year.now().getValue();
        if (nilai < TAHUN_MINIMAL || nilai > sekarang) {
            return "Tahun harus antara " + TAHUN_MINIMAL + " dan " + sekarang;
        }
        return null;
    }
}
