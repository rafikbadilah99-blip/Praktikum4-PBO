package TugasPraktikum4;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ManajemenAset {
    // Atribut list untuk menyimpan daftar aset
    List<AsetIT> daftarAset;

    // Constructor untuk inisialisasi list
    public ManajemenAset() {
        daftarAset = new ArrayList<>();
    }

    // Method menambahkan aset baru ke dalam list
    public void tambahAset(AsetIT asetbaru) {
        daftarAset.add(asetbaru);
    }

    // Method menampilkan seluruh data menggunakan For-Each loop
    public void tampilkanSemuaAset() {
        if (daftarAset.isEmpty()) {
            System.out.println("Daftar aset kosong.");
            return;
        }
        for (AsetIT aset : daftarAset) {
            aset.tampilkanInfoAset();
        }
    }

    // Method mencari aset berdasarkan ID menggunakan Iterator lalu menghapusnya
    public void hapusAset(String idAset) {
        Iterator<AsetIT> it = daftarAset.iterator();
        boolean ditemukan = false;

        while (it.hasNext()) {
            AsetIT asetSekarang = it.next();
            if (asetSekarang.idAset.equalsIgnoreCase(idAset)) {
                it.remove(); // Menghapus secara aman menggunakan Iterator
                ditemukan = true;
                System.out.println("Aset dengan ID " + idAset + " berhasil dihapus.");
                break;
            }
        }

        // Jika ID tidak ditemukan, tampilkan pesan peringatan
        if (!ditemukan) {
            System.out.println("Peringatan: Aset dengan ID " + idAset + " tidak ditemukan!");
        }
    }
}
