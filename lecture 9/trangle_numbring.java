import java.util.Scanner;
public class trangle_numbring {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbres : ");
        int a = sc.nextInt();
        for (int i = 1; i <=4; i++) {
            for (int j = 4; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
