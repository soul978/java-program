import java.util.Scanner;
public class numerical_rectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers :");
        int a = sc.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = i; j <=a; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//? numerical rectangles printed ;