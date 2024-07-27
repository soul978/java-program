import java.util.Scanner;
public class print_rectangular2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row numbers :");
        int a = sc.nextInt();
        System.out.println("enter the column numbers :");
        int b= sc.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=b; j++) {
                if ((i+j)%2==0) {
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }    
}
