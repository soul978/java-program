import java.util.Scanner;
public class tranglenumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int a = sc.nextInt();
        for (int i = 1; i <a; i++) {
            for (int j = a; j >=i; j--) {
                System.out.print(i);
            }
            for (int j = 1+1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
