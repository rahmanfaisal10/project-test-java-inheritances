class MuridSoshum extends Student {
    String Pelajaran;
    int num;

    //constructor dan inheritance
    public MuridSoshum(String nam,int nil) {
        super(nam,nil);
        num = nil;
    }   
    //setter dan getter
    public String getPelajaran() {
        return Pelajaran;
    }
    public void setPelajaran(String mataPelajaran) {
        this.Pelajaran = mataPelajaran;
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

    @Override
    public void execises() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean charAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}