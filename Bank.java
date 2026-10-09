package BankArrayList;

import java.util.ArrayList;

public class Bank {
    private String namaBank;
    private ArrayList<Nasabah> daftarNasabah; 
    public Bank(String namaBank) {
        this.namaBank = namaBank;
        this.daftarNasabah = new ArrayList<>();
    }

    public void tambahNasabah(Nasabah nasabahBaru) {
        daftarNasabah.add(nasabahBaru);
        System.out.println("Nasabah " + nasabahBaru.getNama() + " berhasil terdaftar di " + namaBank);
    }

    public Nasabah cariNasabah(String idNasabah) {
        for (Nasabah n : daftarNasabah) {
            if (n.getIdNasabah().equalsIgnoreCase(idNasabah)) {
                return n;
            }
        }
        return null;
    }

    public void tampilkanSemuaNasabah() {
        System.out.println("\n=== DAFTAR NASABAH " + namaBank.toUpperCase() + " ===");
        if (daftarNasabah.isEmpty()) {
            System.out.println("Belum ada nasabah terdaftar.");
        } else {
            for (Nasabah n : daftarNasabah) {
                n.tampilkanInfoNasabah();
                System.out.println("------------------------------------");
            }
        }
    }
}