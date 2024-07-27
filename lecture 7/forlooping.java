import java.util.Scanner;
public class forlooping {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum = sum+i;
            System.out.println(i);
        }
        System.out.println(sum);
    }   
}
