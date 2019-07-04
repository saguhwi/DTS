
import java.util.Scanner;


public class algo4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int x,y;
         
          System.out.println("Masukkan bilangan 1 : ");
          x = sc.nextInt();
          System.out.println("Masukkan bilangan 2 : ");
          y = sc.nextInt();
          
        if (x>y)
        {
            System.out.println("bilangan "+x+" lebih besar dari "+y);
            
       
        }else if (x<y){
        System.out.println("bilangan "+x+" lebih kecil dari "+y);    
        }else{
            System.out.println("bilangan "+x+" sama dengan "+y);
        }
    
}
}