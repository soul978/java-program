public class find_last_index_target {
     static int no = 0;
     static int last_index_target(int[] arr,int index,int target){
          if (index==arr.length) {
               return 0;
          }
          if (arr[index] == target) {
               no  = index;
          }
          last_index_target(arr, index+1, target);
          return no;
     }
     public static void main(String[] args) {
          int arr[] = {
               1,2,5,6,7,5,5,6,5
          };
          int target = 5;
          System.out.println("target last index is : "+last_index_target(arr,0, target));

     }
}
