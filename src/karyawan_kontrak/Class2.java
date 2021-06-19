package karyawan_kontrak;

import karyawan.Class1;

public class Class2 extends Class1 {
    public String bidang;
    public int join, kontrak;

    public void Bidang(){
        System.out.println(nama+" ahli dalam bidang "+bidang);
    }
    public void MasaKontrak(){
        System.out.println("Masa kontrak "+nama+" akan berakhir pada"+(join+kontrak));
    }

    public static void main(String[] args) {
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
    }
}
