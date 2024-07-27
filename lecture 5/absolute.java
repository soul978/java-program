import java.util.Scanner;
public class absolute {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first numbers ");

        int shivam = sc.nextInt();

        if (shivam <0) {
            
            shivam *=(-1);
        }
        System.out.println("The absolute value is :"+shivam);
    }
}
