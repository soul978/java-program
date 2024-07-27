import java.util.Scanner;

public class fabonaci_series {
    static int fabo(int a) {
        if (a == 0||a==1) {
            return a;
        }
        // if (a == 1) {
        //     return 1;
        // }

        return fabo(a - 1) + fabo(a - 2);
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println(fabo(i));
        }
        // System.out.println(fabo(n));
    }
}
