package karyawan_kontrak;

import karyawan.Class1;

public class Class2 extends Class1 {
    //atribut
    private String bidang;
    private int join, kontrak;

    //method
    public void Bidang(){
        System.out.println(getNama()+" ahli dalam bidang "+bidang);
    }
    public void MasaKontrak(){
        System.out.println("Masa kontrak "+getNama()+" akan berakhir pada "+(join+kontrak));
    }

    //Setter
    public void setBidang(String bidang){
        this.bidang=bidang;
    }
    public void setJoin(int join){
        this.join=join;
    }
    public void setKontrak(int kontrak){
        this.kontrak=kontrak;
    }

    //Getter
    public String getBidang(){
        return bidang;
    }
    public int getJoin(){
        return join;
    }
    public int getKontrak(){
        return kontrak;
    }

    //Overriding
    public void Desc(){
        System.out.println("Karyawan "+getId()+" dengan nama "+getNama()+" lahir pada "+getTanggal_lahir()+" dengan kelamin "+getGender()+" berstatus sebagai Kariawan KONTRAK");
    }
    public void Gajih(){
        setGajih(300000*getMasuk());
        System.out.println("Gajih "+getNama()+" pada bulan ini sebesar Rp"+getGajih());
    }
}
