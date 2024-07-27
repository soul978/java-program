import java.util.Scanner;

public class find_reminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter divident :");
        int a = sc.nextInt();
        System.out.println("enter divisor :");
        int b = sc.nextInt();
        int q = a / b;
        int r = a - (b * q);
        System.out.println("the reminder when " + a + " is divided by " + b + " is " + r);
    }
}