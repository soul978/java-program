import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        System.out.println("enter the area of the circle :");
        Scanner shivam = new Scanner(System.in);
        int radius;
        radius = shivam.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("the area of the circle is :" + area);
    }
}
