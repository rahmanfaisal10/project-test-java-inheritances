class MuridScientific extends Student {
    String mataPelajaranI;
    int num;
    String alamatMurid;
    //constructor dan inheritance
    public MuridScientific(String nam,int nil) {
        super(nam,nil);
        num = nil;
}
    
    //setter dan getter
    public String getMataPelajaran() {
        return mataPelajaranI;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaranI = mataPelajaran;
    }
    
    public String getAlamatMurid() {
        return alamatMurid;
    }

    public void setAlamatMurid(String alamatMurid) {
        this.alamatMurid = alamatMurid;
    }
    
    public static String muridipa(){
        return "Deskripsi Murid IPA";
    }
    
    //Inisialisasi interface
    @Override
    public void exam(){
            System.out.println("Selamat Anda Lulus Ujian");
    }
    public void exercises(){
            System.out.println("Selamat Anda Lulus Latihan");
    }  
    @Override
    public void interview(){
            System.out.println("Selamat Anda Lulus Wawancara");
    }
    
    @Override
    public void presentation(){
            System.out.println("Selamat Anda Lulus Presentasi");
    }

    boolean charAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execises() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}