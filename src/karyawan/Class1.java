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
}
