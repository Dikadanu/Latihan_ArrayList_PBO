package BankArrayList;

import java.util.ArrayList;

public class Nasabah {
    private String nama;
    private String idNasabah;
    private ArrayList<Akun> daftarAkun; 
    public Nasabah(String idNasabah, String nama) {
        this.idNasabah = idNasabah;
        this.nama = nama;
        this.daftarAkun = new ArrayList<>();
    }

    public String getIdNasabah() {
        return idNasabah;
    }

    public String getNama() {
        return nama;
    }

    public void tambahAkun(Akun akunBaru) {
        daftarAkun.add(akunBaru);
        System.out.println("Akun " + akunBaru.getNomorRekening() + " berhasil ditambahkan untuk " + nama);
    }

    public ArrayList<Akun> getDaftarAkun() {
        return daftarAkun;
    }

    public void tampilkanInfoNasabah() {
        System.out.println("ID Nasabah : " + idNasabah);
        System.out.println("Nama       : " + nama);
        System.out.println("Daftar Rekening:");
        if (daftarAkun.isEmpty()) {
            System.out.println("   (Belum memiliki rekening)");
        } else {
            for (Akun a : daftarAkun) {
                a.tampilkanInfoAkun();
            }
        }
    }
}