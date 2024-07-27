import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the years ");
        int leap = sc.nextInt();

        if (leap % 4 == 0) {

            System.out.println("leap years ");
        } else {

            System.out.println("not a leap years");
        }
    }
}
