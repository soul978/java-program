import java.util.Scanner;
public class power_calculation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int a = sc.nextInt();
        System.out.println("enter the power ");
        int b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i < b; i++) {
            System.out.println(ans*=a);
        }


    }
}
