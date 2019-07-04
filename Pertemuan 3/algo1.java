import java.util.*;

public class algo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int x=1 ;
        int y=1 ;
        
        System.out.print("Masukkan nilai a :");
        a=sc.nextInt();
        
        while (y!=a){
            x = x+1;
            y = x*x;
        }
        System.out.print("nilai akar :" + x);
        
        
    }

}