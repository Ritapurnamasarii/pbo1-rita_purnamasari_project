package karyawan_kontrak;

import karyawan.Class1;

public class Class2 extends Class1 {
    public String bidang;
    public int join, kontrak;

    public void Bidang(){
        System.out.println(nama+" ahli dalam bidang "+bidang);
    }
    public void MasaKontrak(){
        System.out.println("Masa kontrak "+nama+" akan berakhir pada "+(join+kontrak));
    }
}
