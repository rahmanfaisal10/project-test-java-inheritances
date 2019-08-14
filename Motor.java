public class Motor extends Kendaraan {
    String jenis;
    boolean proceeding =false;
    
    Motor (String warnaKendaraan,int jumlah,String jenismotor){
        super(warnaKendaraan,jumlah);
        jenis = jenismotor;
    }
    
    public void setProceeding(){
        proceeding = true;
    }
    public boolean isProceeding(){
        return proceeding;
    }
}