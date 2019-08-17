abstract class Student implements interfaceActivity {
    //inisialisasi variabel pada class Student
    String namaMurid;
    int nimMurid;
    int nilai;
    
    //constructor in class student
    Student(String nam,int nil){
        namaMurid = nam;
        nilai = nil;
    }
    
    //Fungsi Getter
    public int getNimMurid() {
        return nimMurid;
    }
    //Fungsi Setter
    public void setNimMurid(int nimMurid) {
        this.nimMurid = nimMurid;
    }
}