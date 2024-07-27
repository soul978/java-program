import java.util.Scanner;
public class horizental_addition {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers ");
        int a = sc.nextInt();
        int sum = 0;
        while (a>0) {
           sum +=a%10;
           a=a/10;
        }
        System.out.println(sum);
    }
}
