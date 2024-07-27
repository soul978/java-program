import java.util.Scanner;

public class modulo {
    public static void main(String[] args) {
        Scanner shivam = new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int a = shivam.nextInt();
        System.out.println("enter the secon numbers :");
        int b = shivam.nextInt();
        int c = a + b;
        if (c < 10) {
            System.out.println("number is less than 10 ");
        } else {
            System.out.println("number is more than 10  ");
        }

    }
}
