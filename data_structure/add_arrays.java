import java.util.Scanner;

public class add_arrays {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the arrays : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of the " + i + " : ");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];

        }
        System.out.println(a);
    }
}
