import java.util.Scanner;

public class non_decrsing_order {
    static void inputs(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the arrays : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements "+i+" : ");
            arr[i] = sc.nextInt();
        }
        non_decreasing(arr);
    }
    static void swape(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] =temp;
    }
    static void swap(int arr[]){
      int i = 0,j = arr.length-1;
      while (i<j) {
        swape(arr,i,j);//? two pointer approch with swape function : 
        i++;
        j--;
      }
    }
    static void non_decreasing(int arr[]){
        int n = arr.length;
        int brr[] = new int[n];
        int i = 0;
        int j = n-1;
       int k = n-1;
        while (i<=j) {
            if (Math.abs(arr[i])>Math.abs(arr[j])) {
              brr[k--] = arr[i]*arr[i];
              i++;
               
            }
            else{
                brr[k--] = arr[j]*arr[j];//? answer ko arrays me laast se fell kr rhe k--
                j--;//! yadi k++ rhta to wo arrya me starting se value fell krta :
            }

        }
        // swap(brr);
       for (int j2 = 0; j2 < brr.length; j2++) {
        System.out.print(brr[j2]+" ");
       }
       System.out.println();
       
    }
    public static void main(String[] args) {
       inputs();
    }
}
