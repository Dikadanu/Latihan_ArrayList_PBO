package BankArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bankABC = new Bank("Bank Central ABC");

        Nasabah n1 = new Nasabah("N001", "Andika");
        Nasabah n2 = new Nasabah("N002", "Budi");

        System.out.println("=== PENDAFTARAN NASABAH ===");
        bankABC.tambahNasabah(n1);
        bankABC.tambahNasabah(n2);

        System.out.println("\n=== PEMBUATAN AKUN ===");

        Akun akunAndika1 = new Akun("REK-101", 1500000);
        Akun akunAndika2 = new Akun("REK-102", 5000000);
        n1.tambahAkun(akunAndika1);
        n1.tambahAkun(akunAndika2);
        
        Akun akunBudi1 = new Akun("REK-201", 3000000);
        n2.tambahAkun(akunBudi1);

        bankABC.tampilkanSemuaNasabah();

        System.out.println("=== TRANSAKSI ===");
        akunAndika1.setor(500000);
        akunAndika1.tarik(200000);

        System.out.println("\n=== SETELAH TRANSAKSI ===");
        n1.tampilkanInfoNasabah();
    }
}