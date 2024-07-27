import java.util.Scanner;


public class sum_of_arrays {
     
     static int arrays_sum(int array[],int index){
          if (index ==array.length-1) {
               return array[index];
          }
          return arrays_sum(array, index+1)+array[index];         
     }
     @SuppressWarnings("unused")
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int arr[] = {1,2,3,4};
          System.out.println(arrays_sum(arr, 0));
          // arrays_sum(arr, sum);
     }
}
