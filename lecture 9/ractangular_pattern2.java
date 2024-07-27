import java.util.Scanner;
public class ractangular_pattern2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row :");
        int a = sc.nextInt();
        System.out.println("enter the column ");
        int b= sc.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=b; j++) {
                if (i==1 || i==a || j==1 || j==b) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
