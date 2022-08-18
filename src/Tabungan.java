public class Tabungan {
    String nama;
    int noRek;
    int saldo;

    public Tabungan(String nama, int noRek) {
        this.nama = nama;
        this.noRek = noRek;
    }

    public Tabungan(String nama, int noRek, int saldo) {
        this.nama = nama;
        this.noRek = noRek;
        this.saldo = saldo;
    }

    public void cekSaldo() {
        System.out.println("Saldo anda saat ini adalah " + this.saldo);
    }

    public void setor(int nominal) {
        if (nominal > 0) {
            this.saldo += nominal;
            System.out.println("Setoran sebesar " + nominal + " berhasil dilakukan, saldo anda sekarang " + this.saldo);
        } else {
            System.out.println("Setoran sebesar " + nominal + " tidak berhasil dilakukan, mohon masukan nominal yang valid");
        }
    }

    public void tarik(int nominal) {
        if (saldo >= nominal) {
            this.saldo -= nominal;
            System.out.println("Penarikan sebesar " + nominal + " berhasil dilakukan, saldo anda sekarang " + this.saldo);
        } else {
            System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");
        }
    }
}
