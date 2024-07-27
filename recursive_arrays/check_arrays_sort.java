public class check_arrays_sort {
     static boolean check(int arr[],int index){
          if (index==0||index==1) {
               return true;
          }
          return arr[index-1]>=arr[index-2]&&
          check(arr, index-1);
     }
     public static void main(String[] args) {
          int arr[] = {1,2,5,3,4,5};
          if (check(arr, arr.length)) {
               System.out.println("yes");
          }
          else{
               System.out.println("no");
          }
     }
}
