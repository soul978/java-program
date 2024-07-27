import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers ");
        int a = sc.nextInt();
        int b=1;
        for (int i = 1; i <=a; i++) {
          b = b*i;
          System.out.println("Factorial of " +i+ " : " +b);
        }
    }
}
