import java.util.Scanner;
@SuppressWarnings("resource")
public class half_traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row : ");
        int a = sc.nextInt();
        System.out.println();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
