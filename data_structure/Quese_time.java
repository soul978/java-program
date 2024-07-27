import java.util.Scanner;

public class Quese_time {
    static void ques(int arr[],int size){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first index  : ");
        int first = sc.nextInt();
        System.out.print("Enter the last index : ");
        int last = sc.nextInt();
        for (int i =first+1; i<=last;i++) {
           arr[i] +=arr[i-1];
        }
        for (int i = 1; i <=arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
       
    }

    @SuppressWarnings("resource")    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first nubers : ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        for (int i = 1; i<=arr.length-1;i++) {
          System.out.print("Enter the elements "+i+" : ");
           arr[i] = sc.nextInt();
        }
        ques(arr,size);
    }
}
