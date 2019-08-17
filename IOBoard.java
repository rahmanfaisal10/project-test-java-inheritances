abstract public class IOBoard {
    String name;
    int numErrors = 0;
    
    IOBoard (String s){
        System.out.println("IOBoard constructor");
        name = s;
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