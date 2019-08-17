import java.util.Scanner;
public class mainn {
    public static void main(String [] args){
        //inisialisasi Variabel baru
        String nama,matpel,namaguru;
        long nilaiujian;
        String ala;
        
        //Kreasi tampilan output
        System.out.println("============================================================");
        // Input Data Murid
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama Murid : ");
        nama = keyboard.nextLine();
        
        Scanner keyboards = new Scanner(System.in);
        System.out.print("Alamat Rumah Anda : ");        
        ala = keyboards.nextLine();
        
        Scanner keyboarr = new Scanner(System.in);
        System.out.print("Nama Wali Kelas : ");
        namaguru = keyboarr.nextLine();
        
        //input Jurusan
        Scanner keyboarda = new Scanner(System.in);
        System.out.print("Jurusan anda sekarang (IPA atau IPS) :");
        matpel = keyboarda.nextLine();
        
        Scanner baru = new Scanner(System.in);
        System.out.print("Hasil Ujian Anda adalah : ");
        nilaiujian = baru.nextInt();
        //manggil Class Guru
        
        Teacher p = new Teacher(namaguru);
        MuridScientific af;
        af = new MuridScientific(nama, (int) nilaiujian);
        MuridSoshum as;
        as = new MuridSoshum(nama, (int) nilaiujian);
           
            
        //Manggil Mata Pelajaran pada Course Class
        CourseClass mm = new CourseClass ("Matematika, Fisika, Biologi dan Kimia");
        CourseClass mn = new CourseClass ("Matematika, Sejarah, Geografi dan Akuntasi");
        mm.setMatakuliah("Matematika, fisika dan Akuntasi");
        mn.setMatakuliah("Matematika, Sejarah, Geografi dan Akuntasi");
        if (matpel=="IPA")
        {
            try{
                System.out.println(af.charAt(100));
            }
            catch (Exception e){
                System.out.println();
                System.out.println("==================================================");
                System.out.println("Nama Murid : "+af.namaMurid);
                System.out.println("Nilai Hasil : "+af.nilai);
                System.out.println("Alamat Rumah : "+ala);
                System.out.println("Nama Wali Kelas : "+p.namaGuru);
                System.out.println("Mata Pelajaran yang di ujian kan" + mm.getMatakuliah());
                mm.setMatakuliah("Matematika, Fisika, Kimia dan Biologi");
                System.out.println("Mata Pelajaran yang dipelajari" + mm.getMatakuliah());
                if (nilaiujian <60){
                    System.out.println("Maaf Anda tidak Lolos Apapun");
                }
                else{
                    af.exam();
                    af.exercises();
                    af.interview();
                    af.presentation();
                System.out.println("==================================================");
                }
            }
        } else 
        {
        try{
            System.out.println(as.charAt(100));
        }
        catch (Exception e){
            System.out.println("==================================================");           
            System.out.println();
            System.out.println("Nama Murid : "+as.namaMurid);
            System.out.println("Nilai Hasil : "+as.nilai);
            System.out.println("Alamat Rumah : "+ala);
            System.out.println("Nama Wali Kelas : "+p.namaGuru);
            System.out.println("Mata Pelajaran yang dipelajari" + mn.getMatakuliah());
            if (nilaiujian <60){
                System.out.println("Maaf Anda tidak Lolos Apapun");
            }
            else{
            as.exam();
            as.exercises();
            as.interview();
            as.presentation();
            System.out.println("==================================================");            
            }
        }
        }
    }
}