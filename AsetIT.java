package TugasPraktikum4;

public class AsetIT {
    String idAset;
    String namaPerangkat;
    String lokasi;
    String statusKondisi;
    
    // Constructor parameterized untuk mengisi semua atribut
    public AsetIT(String idAset, String namaPerangkat, String lokasi, String statusKondisi) {
        this.idAset = idAset;
        this.namaPerangkat = namaPerangkat;
        this.lokasi = lokasi;
        this.statusKondisi = statusKondisi;
    }
    
    // Method untuk mencetak data aset ke konsol
    public void tampilkanInfoAset() {
        System.out.println(idAset + " | " + namaPerangkat + " | Lokasi: " + lokasi + " | Kondisi: " + statusKondisi);
    }
}
