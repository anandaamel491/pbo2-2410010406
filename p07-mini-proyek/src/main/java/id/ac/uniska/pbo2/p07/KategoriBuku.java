package id.ac.uniska.pbo2.p07;

/**
 * Kategori buku. Nilai dari toString() dipakai sebagai teks di JComboBox dan tabel.
 */
public enum KategoriBuku {
    FIKSI("Fiksi"),
    NONFIKSI("Nonfiksi"),
    TEKNOLOGI("Teknologi"),
    REFERENSI("Referensi");

    private final String label;

    KategoriBuku(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
