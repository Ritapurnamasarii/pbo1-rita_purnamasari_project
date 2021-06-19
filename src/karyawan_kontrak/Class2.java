package karyawan_kontrak;

import karyawan.Class1;

public class Class2 extends Class1 {
    public String bidang;
    public int join, kontrak;

    public void Bidang(){
        System.out.println(getNama()+" ahli dalam bidang "+bidang);
    }
    public void MasaKontrak(){
        System.out.println("Masa kontrak "+getNama()+" akan berakhir pada "+(join+kontrak));
    }
}
