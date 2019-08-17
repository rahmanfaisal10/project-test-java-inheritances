class IOEthernetBoard extends IOBoard{
    long networkAddress;
    
    IOEthernetBoard(String s, long netAdd){
        super(s);
        networkAddress = netAdd;
        System.out.println("IOEthernetBoard constructor");
    }
    public void inizialize(){
        System.out.println("initialize method in IOEthernetBoard");
    }
    public void read(){
        System.out.println("read method in IOEthernetBoard");
    }
    public void write(){
        System.out.println("write method in IOEthernetBoard");
    }
    public void close(){
        System.out.println("close method in IOSerialBoard");
    }

    @Override
    public void initialize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
