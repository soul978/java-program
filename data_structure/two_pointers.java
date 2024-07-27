import java.util.Scanner;

public class two_pointers {
    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swape(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void swape(int arr[]){
        int n = arr.length;
        int i = 0,j = n-1;
        while (i<j) {
            if (arr[i]==1 && arr[j] ==0) {
                swape(arr,i,j);
                i++;
                j--;
            }
            if (arr[i]==0) {
                i++;
            }
            if (arr[j]==1) {
                j--;
            }
            
        }
    }
    // static void sort(int arr[]){
    //     int n = arr.length;
    //     int zerose = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] ==0) {
    //             zerose++;
    //         }
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         if (i<zerose) {
    //             arr[i] = 0;
    //         }
    //         else{
    //             arr[i] = 1;
    //         }
    //     }
    // }@
@SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner( System.in);
        System.out.print("Enter the size of the arrays : ");
        int size= sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements "+i+" : ");
            arr[i] = sc.nextInt();
        }

        print(arr);

        // sort(arr);
        swape(arr);
        System.out.println("Sorted arrays : ");

        print(arr);
    }
}
