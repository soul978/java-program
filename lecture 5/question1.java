import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner shivam = new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int a = shivam.nextInt();
        if (a%2==0) {
            System.out.println("even numbers ");
        }
        else{

            System.out.println("odd numbers ");
        }

    }
}
