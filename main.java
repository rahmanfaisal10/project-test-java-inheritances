public class main {
    public static void main(String[] args){
        Mobil12 serial = new Mobil12 ("Hitam", 6 , "Motor Bergigi");
        
        serial.initialize();
        serial.read();
        serial.write();
        serial.close();
    }
}
