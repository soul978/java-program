import java.util.Scanner;

public class gretest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the  first numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is grater numbers :");
        } else if (b > c && b > a) {
            System.out.println(b + " is grater  numbers ");
        } else {
            System.out.println(c + " is grater numbers ");
        }
    }
}
