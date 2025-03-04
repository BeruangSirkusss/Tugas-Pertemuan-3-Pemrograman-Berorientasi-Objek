public class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang", panjang, lebar);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    public void infoBangunDatar() {
        System.out.println("===========================================");
        System.out.println("Jenis Bangun Datar: " + super.getjenisBangunDatar());
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("================================");
    }
}