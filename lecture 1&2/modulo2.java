import java.util.Scanner;

public class modulo2 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the forst numbers :");
        int a = ss.nextInt();
        System.out.println("enter the second numbers :");
        int b = ss.nextInt();
        double r = a % b;
        System.out.println("the reminder when " + a + " is divided by " + b + " is " + r);
    }
}
