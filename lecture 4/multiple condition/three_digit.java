import java.util.Scanner;

public class three_digit {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the positive three didgit numbers :");
        int a = sc.nextInt();
        if (a>99 && a<=999) {
            System.out.println("Three digit numbers ");
        }
        else if (a>9 && a<100) {
           System.out.println("Two digit numbers "); 
        }
        else{

            System.out.println("not a three digit numbers :");
        }
    }
}
