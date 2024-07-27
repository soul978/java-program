import java.util.Scanner;
public class ss {
    public static void main(String[] args) {
        Scanner shivam = new Scanner(System.in);
        int a;
        System.out.println("entert the first numbers :");
        a = shivam.nextInt();
        int b ;
        //! System.out.println("enter the second numbers :");
        //? b = shivam.nextInt();
        if (a%2==0) {
            System.out.println(+a+"  is even numbers ");
        }
        else{
            System.out.println(+a+"  is odd numbers ");
        }
    }
}
