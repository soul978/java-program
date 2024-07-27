import java.util.Scanner;

public class arrays {

     static void arrayss(int[] arr,int size ){
          System.out.println(" ");
          for (int i : arr) {
               System.out.print(i+" ");
          }
     }


     static void rec(int arr[],int index){
          if (index==arr.length) {
               return;
          }
          System.out.print(arr[index]+" ");
          rec(arr, index+1);
     }

     static void search(int arr[],int index){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your target : ");
          int target = sc.nextInt();
          for (int i = 0; i < arr.length; i++) {
               if (arr[i]==target) {
                    target = i;
               }
          }
          System.out.println(target+" ");
     }
     static void sorting(int arr[],int index){
          for (int i = 0; i < arr.length; i++) {
               for (int j = i+1; j < arr.length; j++) {
                    if (arr[i]>arr[j]) {
                         int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;

                    }
               }
          }
          print(arr);
     }
     static void print(int arr[]){
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i]+" ");
          }
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the size of the arrays : ");
          int size = sc.nextInt();

          int[] arr = new int[size];

          for (int i = 0; i < arr.length; i++) {
               System.out.print("Enter the arrays elements "+i+" : ");
               arr[i] = sc.nextInt();
          }
          // rec(arr, 0);
          // arrayss(arr, size);

          search(arr, size);

          System.out.println("sorting ");

          sorting(arr, size);
     }
}
