import java.util.Scanner;
@SuppressWarnings("resource")
public class patern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of the rectangle : ");
        int a = sc.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=a; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
