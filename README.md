# Praktikum PBO - Modul 4: Java Collections Framework & Operasi CRUD

Repositori ini berisi implementasi program Java untuk Sistem Manajemen Aset IT sebagai penyelesaian Tugas Praktikum Modul 4 Pemrograman Berorientasi Objek (PBO).

-----

## 📌 Deskripsi Program
Program ini mensimulasikan pengelolaan data Aset IT (seperti Server, Router, Switch, PC) menggunakan konsep Java Collections Framework (JCF). Program mendukung operasi dasar CRUD (Create, Read, Delete) di dalam memori menggunakan `ArrayList` dan pencarian/penghapusan data secara aman memanfaatkan `Iterator`.

-----

## 🛠️ Fitur Utama
1. **Pemodelan Objek Aset IT (`AsetIT.java`)**: Menyimpan atribut aset seperti `idAset`, `namaPerangkat`, `lokasi`, dan `statusKondisi`.
2. **Manajemen Koleksi Data (`ManajemenAset.java`)**:
   - **Tambah Data (Create)**: Menambahkan objek aset baru ke dalam `ArrayList`.
   - **Tampil Data (Read)**: Menampilkan seluruh daftar aset menggunakan perulangan For-Each.
   - **Hapus Data (Delete)**: Menghapus aset berdasarkan `idAset` menggunakan `Iterator` untuk menghindari `ConcurrentModificationException`, serta memberikan peringatan jika ID tidak ditemukan.
3. **Simulasi Main (`MainAset.java`)**: Menguji seluruh alur eksekusi program dari penambahan 4 data awal hingga pembuktian penghapusan data.

-----

## 📝 Penjelasan Source Code

### 1. `AsetIT.java` (Model Data / Blueprint)
Class ini berfungsi sebagai cetakan (*blueprint*) untuk menyimpan informasi dari satu objek aset IT.
* **Atribut Class**:
  * `idAset` (`String`): Menyimpan ID unik untuk setiap aset (misal: `"A01"`).
  * `namaPerangkat` (`String`): Menyimpan nama perangkat IT (misal: `"Server Dell"`).
  * `lokasi` (`String`): Menyimpan lokasi fisik penempatan aset (misal: `"Ruang Server"`).
  * `statusKondisi` (`String`): Menyimpan status kelayakan perangkat (misal: `"Baik"` atau `"Rusak"`).
* **Constructor Parameterized**:
  * `public AsetIT(...)`: Menginisialisasi nilai seluruh atribut di atas secara langsung saat objek diciptakan menggunakan kata kunci `this`.
* **Method `tampilkanInfoAset()`**:
  * Mencetak format ringkas seluruh atribut ke konsol menggunakan penggabungan string.

### 2. `ManajemenAset.java` (Class Pengelola / Controller)
Class ini bertindak sebagai pengelola koleksi objek `AsetIT` yang menerapkan Java Collections Framework (JCF) dan `Iterator`.
* **Atribut `daftarAset`**:
  * Menggunakan interface `List<AsetIT>` dengan instansiasi `ArrayList<AsetIT>` untuk menyimpan data secara dinamis di memori.
* **Method `tambahAset(AsetIT asetbaru)`**:
  * Menambahkan objek `AsetIT` ke dalam list `daftarAset` menggunakan method `.add()`.
* **Method `tampilkanSemuaAset()`**:
  * Pengecekan kondisi `if (daftarAset.isEmpty())`: Mencegah error dan menginformasikan jika list belum diisi.
  * Iterasi menggunakan **For-Each Loop** (`for (AsetIT aset : daftarAset)`): Menelusuri seluruh elemen di dalam koleksi dan memanggil method `aset.tampilkanInfoAset()` secara berurutan.
* **Method `hapusAset(String idAset)`**:
  * Menggunakan **`Iterator<AsetIT>`** (`daftarAset.iterator()`): Melakukan penelusuran elemen koleksi secara aman dari potensi `ConcurrentModificationException`.
  * Perulangan `while (it.hasNext())`: Memeriksa ketersediaan elemen berikutnya.
  * Pencocokan ID dengan `equalsIgnoreCase(idAset)`: Mencari ID tanpa membedakan huruf besar/kecil.
  * `it.remove()`: Menghapus elemen yang cocok dari koleksi secara aman.
  * Flag `boolean ditemukan`: Memberikan peringatan ke konsol jika ID yang dicari tidak ada dalam koleksi.

### 3. `MainAset.java` (Class Utama / Driver Program)
Class ini mengeksekusi alur utama program sesuai dengan skenario tugas praktikum:
1. **Instansiasi Objek**: Membuat objek pengelola `manajemen` dari class `ManajemenAset`.
2. **Penambahan Data (Create)**: Memasukkan 4 data aset IT awal (`A01` hingga `A04`) dengan parameter ID, Nama, Lokasi, dan Kondisi.
3. **Menampilkan Data (Read)**: Memanggil `tampilkanSemuaAset()` untuk menampilkan kondisi awal data.
4. **Penghapusan Data (Delete)**: Memanggil `hapusAset("A03")` untuk menghapus item dengan ID valid.
5. **Verifikasi Output**: Memanggil `tampilkanSemuaAset()` kembali untuk membuktikan bahwa item `A03` telah berhasil terhapus dari koleksi.

-----

## 📁 Struktur Direktori
```text
src/
└── TugasPraktikum4/
    ├── AsetIT.java         # Model class data aset IT
    ├── ManajemenAset.java  # Class pengelola koleksi (List & Iterator)
    └── MainAset.java       # Class utama untuk menjalankan simulasi

-----

## 🚀 Cara Menjalankan Program
1. Clone repositori ini:
git clone https://github.com/rafikbadilah99-blip/Praktikum4-PBO.git
cd Praktikum4-PBO

2. Kompilasi semua file Java:
javac src/*.java

3. Jalankan program utama:
java -cp src MainAset
(Atau buka proyek melalui IDE seperti NetBeans/Eclipse/VS Code lalu jalankan MainAset.java secara langsung).

-----

### 🖥️ Contoh Output Console
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

-----

### 🎓 Identitas Praktikum & Kontributor
Nama: Rafik Badilah
NIM: L0325009
Mata Kuliah: Pemrograman Berorientasi Objek (PBO)
Modul: Modul 4 - Java Collections Framework & Operasi CRUD
Dosen Pengampu: Fadillah Siva, S.Kom., M.Cs.
Asisten Praktikum:
1. Azfa Rahma Putra Susanto
2. Indra Fata Azhari
