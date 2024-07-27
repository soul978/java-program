import java.util.Scanner;

public class decreaments {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers");
        int a =  sc.nextInt();
        for (int i = a; i >=1; i-=2) {
            System.out.println(i);
        }
    }
}
