public class Mahasiswa {
    String nama, nim, kelas, alamat;

    public Mahasiswa(String nama, String nim, String kelas, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getKelas(){
        return kelas;
    }
    public String getAlamat(){
        return alamat;
    }
}