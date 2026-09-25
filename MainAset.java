package TugasPraktikum4;

public class MainAset {
    public static void main(String[] args) {
        // a. Instansiasi objek ManajemenAset
        ManajemenAset manajemen = new ManajemenAset();

        // b.i. Tambahkan minimal 4 data aset IT
        manajemen.tambahAset(new AsetIT("A01", "Server Dell", "Ruang Server", "Baik"));
        manajemen.tambahAset(new AsetIT("A02", "Router Mikrotik", "Lab Komputer", "Baik"));
        manajemen.tambahAset(new AsetIT("A03", "Switch Cisco", "Ruang Network", "Rusak"));
        manajemen.tambahAset(new AsetIT("A04", "PC Client", "Lab Multimedia", "Baik"));

        // b.ii. Tampilkan semua aset
        System.out.println("=== DAFTAR ASET IT (AWAL) ===");
        manajemen.tampilkanSemuaAset();

        // b.iii. Hapus salah satu aset menggunakan ID yang valid
        System.out.println("\n--- Menghapus Aset ID: A03 ---");
        manajemen.hapusAset("A03");

        // b.iv. Tampilkan kembali semua aset untuk membuktikan penghapusan berhasil
        System.out.println("\n=== DAFTAR ASET IT (SETELAH PENGHAPUSAN) ===");
        manajemen.tampilkanSemuaAset();
    }
}
