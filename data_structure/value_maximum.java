
import java.util.Scanner;

public class value_maximum {
    @SuppressWarnings("resource")
    static void shivam(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays : ");
        int n = sc.nextInt();
        int c = 0;
        int arrays[] = new int[n];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Enter Elements of the arrays " + i + " : ");
            arrays[i] = sc.nextInt();

        }

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > c) {
                c = arrays[i];
            }
        }
        System.out.println("Resultants : "+c);
    }
    public static void main(String[] args) {
       shivam();
    }
}
