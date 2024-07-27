import java.util.Scanner;

public class rectangular_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows :");
        int a = sc.nextInt();
        System.out.println("enter the column :");
        int b = sc.nextInt();
        System.out.println("\n");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
