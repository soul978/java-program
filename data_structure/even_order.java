import java.util.Scanner;

public class even_order {
    static void inputs() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements " + i + " : ");
            arr[i] = sc.nextInt();

        }
        even_oder(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swape(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void even_oder(int arr[]) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                swape(arr, i, j);
                i++;
                j--;

            }
            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 == 1) {
                j--;
            }
        }
    }

    public static void main(String[] args) {

        inputs();
    }
}
