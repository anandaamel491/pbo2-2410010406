package id.ac.uniska.pbo2.p07;

public record Buku(String kode, String judul, String penulis, String penerbit,
        int tahun, KategoriBuku kategori, StatusBuku status) {
}
