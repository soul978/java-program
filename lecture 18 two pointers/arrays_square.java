import java.util.Scanner;//? scanner mathord is most importans 
//? the revers function is most importants :
public class arrays_square {//? arrrays class is most importants :

    static void printarrays(int a[]) {//? print fuctions 
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int[] sortsquares(int arr[]) {//! help in shorting 
        int n = arr.length;
        int left = 0, right = n - 1;
        int ans[] = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                k++;
                left++;
            } else {//! or without reverse fuction k-- fill 
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    static void swap(int a[], int i, int j) {//? shelp in 
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void reverse(int a[]) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arrays :");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("enter the " + a + "elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("origional arrays :");
        printarrays(arr);
        int ans[] = sortsquares(arr);
        System.out.println("sorted arrays :");
        reverse(ans);
        printarrays(ans);
    }
}
// ! yadi hum elements ko last pe bharna start kiya hote to reverse function ki
// jaruarat nuhi padati
