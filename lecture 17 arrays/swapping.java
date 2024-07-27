import java.util.Scanner;

public class swapping {
    static  void swape(int a,int b){
        int temp  = a;
        a = b;
        b = temp;
       
        System.out.println("a = "+a +" b = "+b);
        
    }
    static void swapewithout(int a,int b){
        a = a+b;
        b =a - b;
        a = a-b; 
        System.out.println("a = "+a +" b = "+b);
    }
   
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a = sc.nextInt();
        System.out.println("enter the value of b :");
        int b = sc.nextInt();
       // swape(a, b);
       swapewithout(a, b);
      
    }
}
