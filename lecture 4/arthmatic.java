import java.util.Scanner;

public class arthmatic {
    public static void main(String[] args) {
        Scanner shivam = new Scanner(System.in);
        System.out.println("enter the fisrt numbers :");
        int a = shivam.nextInt();
        System.out.println("enter the second numbers :");
        int b = shivam.nextInt();
        int c = a + b,d=a/b,e=a*b,f=a%b,g=a-b;
        System.out.println("adition resultant is "+c);
        System.out.println("subtraction resultant is "+g);
        System.out.println("multioplication resultant is "+e);
        System.out.println("division resultant is "+d);;
        System.out.println("reminder is a/b is "+f);

    }
}
