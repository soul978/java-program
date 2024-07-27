import java.util.Scanner;
public class divisible_5_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int a = sc.nextInt();
        if (a%5==0 && a%3==0) {
            System.out.println(a+" Divisible by 5 and 3 ");
        }
        else{
            System.out.println(a+"it is not divisible by 5 and 3");
        }
    }
}
