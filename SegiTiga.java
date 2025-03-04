public class SegiTiga extends BangunDatar {
    double alas, tinggi, sisia, sisib, sisic;

    public SegiTiga(double alas, double tinggi, double sisia, double sisib, double sisic) {
        super("SegiTiga", alas, tinggi, sisia, sisib, sisic);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisia = sisia;
        this.sisib = sisib;
        this.sisib = sisib;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return sisia + sisib + sisic;
    }

    public String getJenisSegiTiga() {
        if (sisia == sisib && sisib == sisic) {
            return "Segitiga Sama Sisi";
        } else if (sisia == sisib || sisia == sisic || sisib == sisic) {
            return "Segitiga Sama Kaki";
        } else {
            return "Segitiga Sembarang";
        }
    }

    public void infoBangunDatar() {
        System.out.println("===========================================");
        System.out.println("Jenis Bangun Datar: " + super.getjenisBangunDatar());
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi a: " + sisia);
        System.out.println("Sisi b: " + sisib);
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Jenis Segitiga: " + getJenisSegiTiga());
        System.out.println("===========================================");
    }
}