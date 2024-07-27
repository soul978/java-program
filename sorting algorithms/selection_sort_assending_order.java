public class selection_sort_assending_order {

     // ! my method to swaping but it's time complexity i think 0(n2);

     static int[] selection(int[] arr, int n) {
          int ans[] = new int[arr.length];
          for (int i = 0; i < n; i++) {
               for (int j = i; j < n; j++) {
                    if (arr[i] > arr[j]) {
                         int tem = arr[i];
                         arr[i] = arr[j];
                         arr[j] = tem;

                    }

               }
          }
          ans = arr;
          return ans;

     }

     // !===========================second methods==============================
     static int[] selection_sort(int arr[], int n) { // !it spcae complexity 0(1) , and time complexity is 0(n2);

          // int brr[] = new int[n];
          for (int i = 0; i < arr.length; i++) {

               // todo : i represent the curent index

               // todo find the minimum elements of the unsorted part of the arrays :

               // ? in this algorithum we are swape the elements help of index

               int min_value = i;
               for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min_value]) {
                         min_value = j;
                    }
               }
               // todo : if the min value are finded then programe are swape the elements :

               int temp = arr[i];
               arr[i] = arr[min_value];
               arr[min_value] = temp;
               // brr[i] = arr[i];

          }
          return arr;
     }

     public static void main(String[] args) {
          int arr[] = { 7, 4, 1, 2, 100, 90 };
          int n = arr.length;
          // int ans[] = selection(arr,n);
          selection_sort(arr, n);
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
          }

     }
}
