Praktikum PBO - Modul 4: Java Collections Framework & Operasi CRUD

Repositori ini berisi implementasi program Java untuk Sistem Manajemen Aset IT sebagai penyelesaian Tugas Praktikum Modul 4 Pemrograman Berorientasi Objek (PBO).

📌 Deskripsi Program
Program ini mensimulasikan pengelolaan data Aset IT (seperti Server, Router, Switch, PC) menggunakan konsep Java Collections Framework (JCF). Program mendukung operasi dasar CRUD (Create, Read, Delete) di dalam memori menggunakan ArrayList dan pencarian/penghapusan data secara aman memanfaatkan Iterator.

🛠️ Fitur Utama
Pemodelan Objek Aset IT (AsetIT.java): Menyimpan atribut aset seperti idAset, namaPerangkat, lokasi, dan statusKondisi.
Manajemen Koleksi Data (ManajemenAset.java):
Tambah Data (Create): Menambahkan objek aset baru ke dalam ArrayList.
Tampil Data (Read): Menampilkan seluruh daftar aset menggunakan perulangan For-Each.
Hapus Data (Delete): Menghapus aset berdasarkan idAset menggunakan Iterator untuk menghindari ConcurrentModificationException. Serta memberikan peringatan jika ID tidak ditemukan.
Simulasi Main (MainAset.java): Menguji seluruh alur eksekusi program dari penambahan 4 data awal hingga pembuktian penghapusan data.

📁 Struktur Direktori
src/
├── AsetIT.java           # Model class data aset IT
├── ManajemenAset.java    # Class pengelola koleksi (List & Iterator)
└── MainAset.java         # Class utama untuk menjalankan simulasi


🚀 Cara Menjalankan Program
Clone repositori ini:
git clone https://github.com/username-anda/nama-repo.git
cd nama-repo

Kompilasi semua file Java:
javac src/*.java

Jalankan program utama:
java -cp src MainAset

(Atau buka proyek melalui IDE seperti NetBeans/Eclipse/VS Code lalu jalankan MainAset.java secara langsung).

🖥️ Contoh Output Console
=== DAFTAR ASET IT (AWAL) ===
A01 | Server Dell | Lokasi: Ruang Server | Kondisi: Baik
A02 | Router Mikrotik | Lokasi: Lab Komputer | Kondisi: Baik
A03 | Switch Cisco | Lokasi: Ruang Network | Kondisi: Rusak
A04 | PC Client | Lokasi: Lab Multimedia | Kondisi: Baik

--- Menghapus Aset ID: A03 ---
Aset dengan ID A03 berhasil dihapus.

=== DAFTAR ASET IT (SETELAH PENGHAPUSAN) ===
A01 | Server Dell | Lokasi: Ruang Server | Kondisi: Baik
A02 | Router Mikrotik | Lokasi: Lab Komputer | Kondisi: Baik
A04 | PC Client | Lokasi: Lab Multimedia | Kondisi: Baik


👨‍💻 Penulis
Nama: Rafik Badilah
Mata Kuliah: Pemrograman Berorientasi Objek (PBO)-Praktikum 4
