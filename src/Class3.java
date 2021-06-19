import karyawan.Class1;
import karyawan_kontrak.Class2;

public class Class3 {
    public static void main(String[] args) {
        //pembuatan objek
        Class1 Rita = new Class1("001","Rita Purnamasari");
        Rita.alamat = "Bangkal";
        Rita.tanggal_lahir = "05 September 2001";
        Rita.gender = "Perempuan";
        Rita.masuk = 15;
        Rita.Desc();
        Rita.Alamat();
        Rita.InfoAbsen();
        Rita.Gajih();
        System.out.println();

        Class1 Fahmi = new Class1("002","Hafizhol Fahmi");
        Fahmi.alamat = "Sungai Sipai";
        Fahmi.tanggal_lahir = "16 januari 2001";
        Fahmi.gender = "Laki-Laki";
        Fahmi.masuk = 18;
        Fahmi.Desc();
        Fahmi.Alamat();
        Fahmi.InfoAbsen();
        Fahmi.Gajih();
        System.out.println();

        Class1 Widia = new Class1("003",8);
        Widia.nama = "Widia";
        Widia.alamat = "Cempaka";
        Widia.tanggal_lahir = "19 Agustus 2001";
        Widia.gender = "Perempuan";
        Widia.Desc();
        Widia.Alamat();
        Widia.InfoAbsen();
        Widia.Gajih();
        System.out.println();

        Class1 Adit = new Class1("004",20);
        Adit.nama = "M Adit";
        Adit.alamat = "Lukaas";
        Adit.tanggal_lahir = "2 juni 2001";
        Adit.gender = "Laki-Laki";
        Adit.Desc();
        Adit.Alamat();
        Adit.InfoAbsen();
        Adit.Gajih();
        System.out.println();

        Class1 Nadia = new Class1(19,"Nadia");
        Nadia.nama = "Nadia";
        Nadia.alamat = "Lukaas";
        Nadia.tanggal_lahir = "8 Februari 2001";
        Nadia.gender = "Perempuan";
        Nadia.Desc();
        Nadia.Alamat();
        Nadia.InfoAbsen();
        Nadia.Gajih();
        System.out.println();

        Class1 Omi = new Class1(19,"M Tomi");
        Omi.alamat = "Banyu Irang";
        Omi.tanggal_lahir = "30 Agustus 2001";
        Omi.gender = "Laki-Laki";
        Omi.Desc();
        Omi.Alamat();
        Omi.InfoAbsen();
        Omi.Gajih();
        System.out.println();

        //pembuatan objek untuk Class2
        Class2 Resa = new Class2();
        Resa.id = "007";
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
