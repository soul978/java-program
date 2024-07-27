import java.util.Scanner;
@SuppressWarnings("resource")
public class sum_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers : ");
        int shivam = sc.nextInt();
        int a = 1;
        int sum = 0 ;
        System.out.println();
        while (a<=shivam) {
        
            System.out.println(a+" ");
            sum = sum+a;
            a++;
        }
        System.out.println("Resultant "+sum);
    }
}
