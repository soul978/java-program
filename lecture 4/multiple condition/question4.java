import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers :");
        int a =sc.nextInt();
        if (a<12) {
            System.out.println("child");
        }
        else if (a>=12 && a<=18) {
            System.out.println("Teenager");
        }
        else{
            System.out.println("adalt");
        }

    }
}
