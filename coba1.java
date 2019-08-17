import java.util.*;

public class coba1 {
    public static void main (String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                for (int j=0;j<n;j++){
                    if (j<10){
                        double sum;
                        sum = Math.pow(2,j);
                        double z=0;
                        z += sum;
                        System.out.println(z);
                    }
                }
                
            }
        }
    }
 }
