//! search taget and return there index 
import java.util.ArrayList;

//? it print the all indeces in given arrays list;
public class search_target_return_index {
     static void target_index(int[] arr,int index,int targets){
          if (index==arr.length) {
               return;
          }
          if (targets==arr[index]) {
               System.out.println("The target elemnts index no is : "+index+" ");
          }
          target_index(arr, index+1, targets);
     }
//! retrn the arrays list which show in the types : [2,3,4,5];


     static ArrayList<Integer> allIndex(int []arr,int index,int target){
          
          //? base case
          ArrayList<Integer> ans = new ArrayList<>();

          if (index==arr.length) {
               return ans;
          }

          //?Self work
          if (arr[index]==target) {
               ans.add(index);
          }

          //recursive work

          ArrayList<Integer> sole = allIndex(arr, index+1, target);

          ans.addAll(sole);

          return  ans;
     }
     public static void main(String[] args) {
          // Scanner sc = new Scanner(System.in);
          int[] arr = {
               2,33,4,4,5,4,5,4
          };
          int target = 4;
          ArrayList<Integer> ans = allIndex(arr, 0, target);
          System.out.println(ans);
     }
}
