import java.util.Scanner;
public class print_rectangular {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int a = sc.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=a; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
