import java.util.Scanner;
@SuppressWarnings("resource")
public class natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n numbers : ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = a; i >=1;i-=2) {
            System.out.print(i+" ");
            sum = sum+i;
        }
        System.out.println("Resultant  : "+sum);
    }
}
