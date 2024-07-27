import java.util.Scanner;

public class factorial_2 {
    static int factorail(int fact){
        if (fact==0) {
            return 1;
        }
        int x= fact*factorail(fact-1);
       return x;
    }
    @SuppressWarnings("resource")
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numbers : " );
        int number  = sc.nextInt();
        System.out.println(factorail(number));
    }
}
