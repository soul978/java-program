import java.util.Scanner;
public class queston2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int b = 0;
        int a =  sc.nextInt();
        while (a>0) {
             a= a/10;
             b++;
        }
        System.out.println(b);
    }
}
