import karyawan.Class1;
import karyawan_kontrak.Class2;

public class Class3 {
    public static void main(String[] args) {
        //pembuatan objek
        Class1 Rita = new Class1("001","Rita Purnamasari");
        Rita.setAlamat("Bangkal");
        Rita.setTanggal_lahir("05 September 2001");
        Rita.setGender("Perempuan");
        Rita.setMasuk(15);
        Rita.Desc();
        Rita.Alamat();
        Rita.InfoAbsen();
        Rita.Gajih();
        System.out.println();

        Class1 Fahmi = new Class1("002","Hafizhol Fahmi");
        Fahmi.setAlamat("Sungai Sipai");
        Fahmi.setTanggal_lahir("16 januari 2001");
        Fahmi.setGender("Laki-Laki");
        Fahmi.setMasuk(18);
        Fahmi.Desc();
        Fahmi.Alamat();
        Fahmi.InfoAbsen();
        Fahmi.Gajih();
        System.out.println();

        Class1 Widia = new Class1("003",8);
        Widia.setNama("Widia");
        Widia.setAlamat("Cempaka");
        Widia.setTanggal_lahir("19 Agustus 2001");
        Widia.setGender("Perempuan");
        Widia.Desc();
        Widia.Alamat();
        Widia.InfoAbsen();
        Widia.Gajih();
        System.out.println();

        Class1 Adit = new Class1("004",20);
        Adit.setNama("M Adit");
        Adit.setAlamat("Lukaas");
        Adit.setTanggal_lahir("2 juni 2001");
        Adit.setGender("Laki-Laki");
        Adit.Desc();
        Adit.Alamat();
        Adit.InfoAbsen();
        Adit.Gajih();
        System.out.println();

        Class1 Nadia = new Class1(19,"Nadia");
        Nadia.setId("005");
        Nadia.setAlamat("Lukaas");
        Nadia.setTanggal_lahir("8 Februari 2001");
        Nadia.setGender("Perempuan");
        Nadia.Desc();
        Nadia.Alamat();
        Nadia.InfoAbsen();
        Nadia.Gajih();
        System.out.println();

        Class1 Omi = new Class1(19,"M Tomi");
        Omi.setId("006");
        Omi.setAlamat("Banyu Irang");
        Omi.setTanggal_lahir("30 Agustus 2001");
        Omi.setGender("Laki-Laki");
        Omi.Desc();
        Omi.Alamat();
        Omi.InfoAbsen();
        Omi.Gajih();
        System.out.println();

        //pembuatan objek untuk Class2
        Class2 Resa = new Class2();
        Resa.setId("007");
        Resa.setNama("Resa Damayanti");
        Resa.setAlamat("Bangkal Banjarbaru");
        Resa.setTanggal_lahir("18 April 2005");
        Resa.setGender("Perempuan");
        Resa.bidang = "Busana butik";
        Resa.join = 2021;
        Resa.kontrak = 5;
        Resa.setMasuk(18);
        Resa.Desc();
        Resa.Alamat();
        Resa.Bidang();
        Resa.InfoAbsen();
        Resa.Gajih();
        Resa.MasaKontrak();
        System.out.println();
    }
}
