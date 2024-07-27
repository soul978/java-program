public class Insertion_sort {
     static void insertion(int arr[]){
          for (int i = 0; i < arr.length; i++) {
               for (int j = i+1; j < arr.length; j++) {
                    if (arr[i]>arr[j]) {
                         int tmp = arr[i];
                         arr[i] = arr[j];
                         arr[j]  =tmp;
                    }
               }
          }
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i]+" ");
          }
     }

     //! second methods 
     static void insertion1(int[] arr){
          for (int i = 0; i < arr.length; i++) {
               int j = i; //? it's point the i index : 

               while (j>0 && arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--; //? decrease the index no  : 
               }
          }
          for (int i : arr) {
               System.out.print(i+" ");
          }
     }
     public static void main(String[] args) {
          int arr[] = {2,5,9,13,15,7};
          insertion1(arr);
     }
}
