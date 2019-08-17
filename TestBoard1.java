public class TestBoard1 {
    public static void main (String[] args){
        IOSerialBoard serial = new IOSerialBoard ("my first port", 0x2f8);
        serial.initialize();
        serial.read();
        serial.close();
    }
}