import karyawan.Class1;
import karyawan_kontrak.Class2;

public class Class3 {
    public static void main(String[] args) {
        //pembuatan objek
        Class1 Rita = new Class1();
        Rita.id = "001";
        Rita.nama = "Rita Purnamasari";
        Rita.alamat = "Bangkal";
        Rita.tanggal_lahir = "05 September 2001";
        Rita.gender = "Perempuan";
        Rita.masuk = 15;
        Rita.Desc();
        Rita.Alamat();
        Rita.InfoAbsen();
        Rita.Gajih();
        System.out.println();

        Class2 Resa = new Class2();
        Resa.id = "002";
        Resa.nama = "Resa Damayanti";
        Resa.alamat = "Bangkal Banjarbaru";
        Resa.tanggal_lahir = "18 April 2005";
        Resa.gender = "Perempuan";
        Resa.bidang = "Busana butik";
        Resa.join = 2021;
        Resa.kontrak = 5;
        Resa.masuk = 18;
        Resa.Desc();
        Resa.Alamat();
        Resa.Bidang();
        Resa.InfoAbsen();
        Resa.Gajih();
        Resa.MasaKontrak();
        System.out.println();
    }
}
