import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        
        Scanner ss= new Scanner(System.in);
        System.out.println("enter the first numbers :");;
        int a =  ss.nextInt();
        System.out.println("enter the second numbers :");
        int b = ss.nextInt();
        System.out.println("not equlat to operaters ="+(a!=b));
        System.out.println("equal to opraters = "+(a==b));
        System.out.println("grater than = "+(a>b));
        System.out.println("less than =  "+(a<b));
        System.out.println("grater equal to = "+(a>=b));
        System.out.println("less qual to = "+(a<=b));
    }
}
