import java.util.Scanner;
public class divisible_by3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any numbers :");
        int a = sc.nextInt();
        if (a%2==0 && a%3==0) {
            System.out.println("The value is "+a);
        }

    }
}
//! write a program to print the value if is even and divisible by 3