public class BujurSangkar extends BangunDatar {
    double sisi;

    public BujurSangkar(double sisi) {
        super("Bujur Sangkar", sisi);
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public void infoBangunDatar() {
        System.out.println("===========================================");
        System.out.println("Jenis Bangun Datar: " + super.getjenisBangunDatar());
        System.out.println("Sisi: " + sisi);
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("================================");
    }
}