import java.util.Scanner;

public class printreverse_trangle {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numbers : ");
        int row  = sc.nextInt();
        for (int i = row; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
