//? count the numbers of digits for a given numbers n;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        
        Scanner shivam = new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int  a =  shivam.nextInt();
        int num= 0;
        for (int i = 0; i <=a; i++) {
            num =0;
            num= num + i;
        }
        
        System.out.println("total numbers is "+num);
    }
}
