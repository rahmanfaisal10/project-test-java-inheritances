abstract class Kendaraan1 {
    String warna;
    int roda;
    int numErrors = 0;
   
    Kendaraan1 (String w,int r){
	warna = w;
	roda = r;
	}
    
    final public void anotherError(){
        numErrors++;
    }
    final public int getNumErrors(){
        return numErrors;
    }
    
    abstract public void initialize();
    abstract public void read();
    abstract public void write();
    abstract public void close();
}