package karyawan;

public class Class1 {
    //atribut
    private String id, nama, alamat, tanggal_lahir, gender;
    private int masuk, absen;
    private long gajih;

    //construktor
    public Class1(){
    }
    public Class1(String id, String nama){
        this.id=id;
        this.nama=nama;
    }
    public Class1(String id, int masuk){
        this.id=id;
        this.masuk=masuk;
    }
    public Class1(int masuk, String nama){
        this.masuk=masuk;
        this.nama=nama;
    }

    //method
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

    //Setter
    public void setId(String id){
        this.id= id;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public void setTanggal_lahir(String tanggal_lahir){
        this.tanggal_lahir=tanggal_lahir;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setMasuk(int masuk){
        this.masuk=masuk;
    }
    public void setAbsen(int absen){
        this.absen=absen;
    }
    public void setGajih(long gajih){
        this.gajih=gajih;
    }

    //getter
    public String getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getTanggal_lahir(){
        return tanggal_lahir;
    }
    public String getGender(){
        return gender;
    }
    public int getMasuk(){
        return masuk;
    }
    public int getAbsen(){
        return absen;
    }
    public long getGajih(){ return gajih; }
}
