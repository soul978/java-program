import java.util.Scanner;
public class ss1 {
    public static void main(String[] args) {
        Scanner stm = new Scanner(System.in); 
        int a,b,c,d;
        System.out.println("enter the first numbers ");
        a = stm.nextInt();
        System.out.println("enter the second numbers ");
        b = stm.nextInt();
        System.out.println("enter the third numbers ");
        c = stm.nextInt();
        System.out.println("enter the fourth numbers ");
        d = stm.nextInt();
        int s = a+b+c+d;
        System.out.println(+s+" is resultant");//+b+""+c+""+c+""+d);

    }
}
