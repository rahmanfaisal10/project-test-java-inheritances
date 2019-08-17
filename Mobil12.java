public class Mobil12 extends Kendaraan1 {
    String jenisMobil;
    boolean proceeding =false;
    
    Mobil12 (String w,int r,String j){
        super(w,r);
        jenisMobil = j;
    }
    
    public void setProceeding(){
        proceeding = true;
    }
    public boolean isProceeding(){
        return proceeding;
    }

    @Override
    public void initialize() {
        System.out.println("Jenis Kendaraan adalah : Mobil");
    }

    @Override
    public void read() {
        System.out.println("Warna Mobil            : Hitam");
    }

    @Override
    public void write() {
        System.out.println("Jumlah Roda Mobil      : 6");
    }

    @Override
    public void close() {
        System.out.println("Jenis Mobil            : Mobil bergigi");
    }
}