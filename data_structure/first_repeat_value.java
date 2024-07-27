import java.util.Scanner;

public class first_repeat_value {
    static int fir_repeat(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the arrays : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of the " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(fir_repeat(arr));
    }
}