import java.util.Scanner;

public class divisible_by5or3 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("entert the numbers :");
        int a = sc.nextInt();
        if (a%5==0 || a%3==0) {
           if (a%5==0) {
             System.out.println("it is divisible by 5");
           }
           else if (a%5==0 && a%3==0) {
            System.out.println("divisble by 5 and 3");
           }
           else{
            System.out.println("it is divisible by 3");
           }
        }
        else{
            System.out.println("it is not divisible by 5 or 3");
        }

    }
}
