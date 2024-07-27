import java.util.Scanner;
@SuppressWarnings("resource")
public class pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int a = sc.nextInt();
        System.out.print("enter the Column : ");
        int b = sc.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
