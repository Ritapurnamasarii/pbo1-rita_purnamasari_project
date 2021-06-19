package karyawan;

public class Class1 {
    public String id, nama, alamat, tanggal_lahir, gender;
    public int masuk, absen;
    public long gajih;

    public void Desc(){
        System.out.println("Karyawan "+id+" dengan nama "+nama+" lahir pada "+tanggal_lahir+" dengan kelamin "+gender);
    }
    public void Gajih(){
        gajih = 500000 * masuk;
        System.out.println("Gajih "+nama+" pada bulan ini sebesar Rp"+gajih);
    }
    public void InfoAbsen(){
        absen = 20 - masuk;
        System.out.println(nama+" Absen sebanyak "+absen+" hari dan masuk "+masuk+" hari dalam bulan ini");
    }
    public void Alamat(){
        System.out.println("Alamat "+nama+" bertempat di "+alamat);
    }

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
    }
}
