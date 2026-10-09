package BankArrayList;

public class Akun {
    private String nomorRekening;
    private double saldo;

    public Akun(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor Rp" + jumlah + " ke " + nomorRekening + " berhasil.");
        } else {
            System.out.println("Jumlah setor harus lebih dari 0.");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik Rp" + jumlah + " dari " + nomorRekening + " berhasil.");
        } else {
            System.out.println("Penarikan gagal! Saldo tidak mencukupi atau jumlah tidak valid.");
        }
    }

    public void tampilkanInfoAkun() {
        System.out.println("   - No. Rekening: " + nomorRekening + " | Saldo: Rp" + saldo);
    }
}