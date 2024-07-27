import java.util.Scanner;

public class whileloops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers :");
        int n = sc.nextInt();
        int num = 1;
        int sum =0;
        while (num <= n) {
            System.out.println(num);
            sum = sum +num;
            num ++;
        }
        System.out.println(sum);
    }
}
