import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int a = sc.nextInt();
        if (a%5==0) {
            System.out.println("Numbers is divisible by 5");

        }
        else{
            
            System.out.println("number is not divisible by 5");
        }
    }
}
