import java.util.Scanner;
public class trangle_number {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int a = sc.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = a; j>i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
