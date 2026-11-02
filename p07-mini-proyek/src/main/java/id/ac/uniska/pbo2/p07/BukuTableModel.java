package id.ac.uniska.pbo2.p07;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Menghubungkan daftar Buku dengan JTable.
 * JTable bertanya kepada model: berapa baris, berapa kolom, dan apa isi setiap sel.
 */
public class BukuTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {"Kode", "Judul", "Penulis", "Penerbit", "Tahun", "Kategori", "Status"};

    private final List<Buku> daftar = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    /** Kolom tahun bertipe Integer agar diurutkan sebagai angka, bukan sebagai teks. */
    @Override
    public Class<?> getColumnClass(int kolom) {
        return kolom == 4 ? Integer.class : Object.class;
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Buku b = daftar.get(baris);
        return switch (kolom) {
            case 0 -> b.kode();
            case 1 -> b.judul();
            case 2 -> b.penulis();
            case 3 -> b.penerbit();
            case 4 -> b.tahun();
            case 5 -> b.kategori();
            default -> b.status();
        };
    }

    public Buku get(int baris) {
        return daftar.get(baris);
    }

    public void tambah(Buku buku) {
        daftar.add(buku);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris); // tampilkan baris baru
    }

    public void ubah(int baris, Buku buku) {
        daftar.set(baris, buku);
        fireTableRowsUpdated(baris, baris);
    }

    public void hapus(int baris) {
        daftar.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }

    /** Jumlah seluruh buku berstatus Tersedia (tidak terpengaruh pencarian). */
    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : daftar) {
            if (b.status() == StatusBuku.TERSEDIA) {
                jumlah++;
            }
        }
        return jumlah;
    }

    /**
     * Memeriksa apakah kode sudah dipakai buku lain.
     *
     * @param kecualiBaris baris model yang sedang diubah (diabaikan), atau -1 untuk buku baru
     */
    public boolean adaKode(String kode, int kecualiBaris) {
        for (int i = 0; i < daftar.size(); i++) {
            if (i != kecualiBaris && daftar.get(i).kode().equalsIgnoreCase(kode)) {
                return true;
            }
        }
        return false;
    }
}
