package javaapplication1;

public class Mobil {
	static String namaPemilik;    
    static String getNamaPemilik;
	String merkMobil;
	String warnaMobil;
	int platAngka;
	Mobil (String nama,String merk,String warna,int plat){
		namaPemilik = nama;
		merkMobil = merk;
		warnaMobil = warna;
		platAngka = plat;
	}
        public static String getNamaPemilik() {
        return namaPemilik;
    }

    public static void setNamaPemilik(String namaPemilik) {
        Mobil.namaPemilik = namaPemilik;
    }
	
}

class Mobil2 {
    public static void main (String [] args){
    Mobil Efri,Rian;
    Efri = new Mobil("Efri", "Innova","Hitam",2133);
    Rian = new Mobil("rian","Innova","biru",1231);
    //Andi = new Mobil("andi","l300","hijau",6546);
    //Eka = new Mobil("Eka","avanza","merah",8554);
    //Efa = new Mobil("Efa","jazz","Hitam",1235);

    Mobil.setNamaPemilik ("Efri");
    Mobil.setNamaPemilik ("Rian");
    //Andi.setNamaPemilik ("Andi");
    //Eka.setNamaPemilik ("Eka");
    //Efa.setNamaPemilik ("Efa");
   
    System.out.println("Nama Pemilik adalah: " + Mobil.getNamaPemilik);
    System.out.println("Nama Pemilik adalah: " + Mobil.getNamaPemilik);
    //System.out.println("Nama Pemilik adalah: " + Andi.getNamaPemilik);
    //System.out.println("Nama Pemilik adalah: " + Eka.getNamaPemilik);
    //System.out.println("Nama Pemilik adalah: " + Efa.getNamaPemilik);
    }
}
/*
class Mobil2 {
	public static void main(String [] args) {
            Mobil [] a = new Mobil[5];
            
            a[0] = new Mobil("EFRI","Innova","Hitam",2133);
            a[1] = new Mobil("rian","Innova","biru",1231);
            a[2] = new Mobil("andi","l300","hijau",6546);
            a[3] = new Mobil("Eka","avanza","merah",8554);
            a[4] = new Mobil("Efa","jazz","Hitam",1235);
            
           for (int i =0; i<a.length;i++)
            System.out.println("\n" + "Nama Pemilik: " +a[i].namaPemilik +"\n"+ "Jenis Mobil: "+a[i].merkMobil +"\n"+ "Warna Mobil: "+ a[i].warnaMobil +"\n"+ "Nomor Plat: "+ a[i].platAngka);
        
        }
}
*/
