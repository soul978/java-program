import java.util.ArrayList;

public class arrayslist_retrun {
     static ArrayList<Integer> indexretrn(int[] arr,int target,int index){
          ArrayList<Integer> ans = new ArrayList<>();
          if (index==arr.length) {
               return ans;
          }
          if (arr[index]==target) {
               ans.add(index);
          }
          ArrayList<Integer> smallanswer = indexretrn(arr, target, index+1);
          ans.addAll(smallanswer);
          return ans;

     }
     public static void main(String[] args) {
          int arr[] = {7,1,2,3,4,5,6,7,7,6,7,5,7};
          int taget = 7;
          ArrayList<Integer> ans = indexretrn(arr, taget, 0);
          System.out.println(ans);
     }
}
