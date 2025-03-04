import java.util.Scanner;


public class MenghitungBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Pilih Bangun Datar Mana yang Ingin Diuji ");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Bujur Sangkar");
        System.out.println("3. Segitiga");
        System.out.println("Masukkan pilihan: ");
        int pilihan = sc.nextInt();

        if (pilihan == 1){
            System.out.println("Masukan Panjang : ");
            double panjang = sc.nextDouble();
            System.out.println("Masukan Lebar : ");
            double lebar = sc.nextDouble();
            PersegiPanjang P1=new PersegiPanjang (panjang,lebar);
            P1.infoBangunDatar();
        }
        else if(pilihan==2){
            System.out.println("Masukan Sisi : ");
            double sisi=sc.nextDouble();
            BujurSangkar p2 = new BujurSangkar(sisi);
            p2.infoBangunDatar();
        }
        else if (pilihan == 3) {
            System.out.println("Masukkan Alas: ");
            double alas = sc.nextDouble();
            System.out.println("Masukkan Tinggi: ");
            double tinggi = sc.nextDouble();
            System.out.println("Masukkan Sisi 1: ");
            double sisia = sc.nextDouble();
            System.out.println("Masukkan Sisi 2: ");
            double sisib = sc.nextDouble();
            System.out.println("Masukkan Sisi 3: ");
            double sisic = sc.nextDouble();
            SegiTiga p3 = new SegiTiga(alas, tinggi, sisia, sisib, sisic);
            p3.infoBangunDatar();
        } else {
            System.out.println("Pilihan tidak valid!");
        }


    }
}