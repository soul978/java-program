import java.util.Scanner;

public class youngest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ram age ");
        int a = sc.nextInt();
        System.out.println("enter the shyam age :");
        int b = sc.nextInt();
        System.out.println("enter the ajay age :");
        int c = sc.nextInt();
        if (b > a && c > a) {
            System.out.println("ram is younget ");
        } else if (a > b && c > b) {
            System.out.println("shyam is youngest ");
        } else {
            System.out.println("ajay is youngest ");
        }

    }
}
