class IOSerialBoard extends IOBoard {
    int port;
    
    IOSerialBoard(String s, int p){
        super(s);
        port = p;
        System.out.println("IOSerialBoard constructor");
    }
    
    public void initialize(){
        System.out.println("initialize method in IOSerialBoard");
    }
    
    @Override
    public void read(){
        System.out.println("read method in IOSerialBoard");
    }
    
    @Override
    public void write(){
        System.out.println("write method in IOSerialBoard");
    }
    
    public void close(){
        System.out.println("close method in IOSerialBoard");
    }

}