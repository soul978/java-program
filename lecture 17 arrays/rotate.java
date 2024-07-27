import java.util.Scanner;

public class rotate {
    static void printarrays(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int[] rotate(int a[], int k) {
        int n = a.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = a[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arrays size ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter " + n + "elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter k");
        int k = sc.nextInt();

        System.out.println("original arryas ");
        printarrays(arr);

        int ans[] = rotate(arr, k);
        System.out.println("Arrays after rotation :");
        printarrays(ans);
    }

}
