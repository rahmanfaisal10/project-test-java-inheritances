public class Mobil3 {
    String namaPemilik;
    String merkMobil;
    String warnaMobil;
    int platAngka;
    static String Punya;
    
    public String getPunya() {
        return Punya;
    }

    public void setPunya(String Punya) {
        this.Punya = Punya;
    }
    
    Mobil3 (String nama,String merk,String warna,int plat){
	namaPemilik = nama;
	merkMobil = merk;
	warnaMobil = warna;
	platAngka = plat;
    }
   
}

class ExampleMobil {
    public static void main(String[] args){
        Mobil3 b1,b2,Andi,Eka,Efa;
        b1 = new Mobil3("Efri","Innova","Hitam",2133);
        b1.setPunya("Efrizal");
        b2 = new Mobil3("Rian","sada","biru",4121);
        Andi = new Mobil3("andi","l300","hijau",6546);
        Eka = new Mobil3("Eka","avanza","merah",8554);
        Efa = new Mobil3("Efa","jazz","Hitam",1235);

            
        b2.setPunya("Rian Fauzi");
        Andi.setPunya ("Andi");
        Eka.setPunya ("Eka");
        Efa.setPunya ("Efa");
        
        System.out.println("Nama Pemilik adalah " + b1.getPunya());
        System.out.println("Nama Pemilik adalah " + b2.getPunya());
        System.out.println("Nama Pemilik adalah " + Andi.getPunya());
        System.out.println("Nama Pemilik adalah " + Eka.getPunya());
        System.out.println("Nama Pemilik adalah " + Efa.getPunya());
    }   
}