import java.util.Scanner;

public class area_rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of the rectangle :");
        int a = sc.nextInt();
        System.out.println("enter the breath of the rectangle :");
        int b = sc.nextInt();
        int area = a * b;
        int perimeter = 2 * (a + b);

        if (area > perimeter) {
            System.out.println("area is greater than perimeter");
        } else {
            System.out.println("perimeter is greater the area ");
        }
    }
}
