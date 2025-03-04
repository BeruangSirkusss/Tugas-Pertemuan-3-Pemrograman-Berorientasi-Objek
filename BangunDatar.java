public class BangunDatar {
    String jenisBangunDatar;
    double panjang;
    double sisi,sisia,sisib,sisic;
    double lebar;
    double tinggi;
    double alas;
    public BangunDatar (String PersegiPanjang, double panjang, double lebar ){
        jenisBangunDatar = PersegiPanjang;
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public BangunDatar(String BujurSangkar, double sisi){
        jenisBangunDatar=BujurSangkar;
        this.sisi=sisi;
    }
    public BangunDatar(String SegiTiga, double alas,double sisia,double sisib,double sisic, double tinggi){
        this.alas=alas;
        this.tinggi = tinggi;
        this.sisia = sisia;
        this.sisib=sisib;
        this.sisi=sisic;

    }
    public void setDataBangunDatar(String jenis,double alas, double panjang, double sisi,double lebar,double tinggi,double sisia,double sisib, double sisic){
        jenisBangunDatar=jenis;
        this.alas=alas;
        this.lebar=lebar;
        this.panjang=panjang;
        this.sisi=sisi;
        this.sisia=sisia;
        this.sisib= sisib;
        this.sisic=sisic;
        this.tinggi=tinggi;

    }
    public String getjenisBangunDatar(){
        return jenisBangunDatar;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public double getAlas(){
        return alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getSisi(){
        return sisi;
    }
    public double getSisiA(){
        return sisia;
    }
    public double getSisiB(){
        return sisib;
    }
    public double getSisiC(){
        return sisic;
    }

}


