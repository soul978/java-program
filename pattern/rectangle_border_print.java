import java.util.Scanner;

public class rectangle_border_print {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row : ");
        int row  = sc.nextInt();
        System.out.print("Enter the column : ");
        int column = sc.nextInt();

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=column; j++) {
                if (i==1||j==1 || i==row||j== column) {
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
