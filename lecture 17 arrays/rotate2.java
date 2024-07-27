import java.util.Scanner;

public class rotate2 {
    static void printarrays(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    // static void swap(int a[],int i,int j){
    //     int temp = a[i];
    //     a[i] = a[j];
    //     a[j] = temp;
    // }
    static void reverse(int a[],int i,int j){
        while (i<j) {
           // swape(a,i,j);
           int temp = a[i];
           a[i] = a[j];
           a[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateinplace(int a[],int k ){
    int n = a.length;
    k = k%n;
    reverse(a,0,n-k-1);
    reverse(a , n-k , n-1);
    reverse(a , 0 , n-1);
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

        rotateinplace(arr, k);
        System.out.println("Arrays after rotation :");
        printarrays(arr);
    }

}
//? in place rotate  not ussing extra arrays in the code: