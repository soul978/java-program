public class zero_at_lastindex {

     //! second methods 

     static void last_zero_inde(int[] arr){
          for (int i = 0; i < arr.length; i++) {
               boolean falg = false;
               for (int j = 0; j < arr.length-i-1; j++) {
                    if (arr[j]==0 && arr[j+1]!=0) {
                         int tem = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = tem;
                         falg = true;
                    }
               }
               if (falg==false) {
                    break;
               }
          }
          
          for (int i: arr) {
               System.out.print(i+" ");
          }

          
     }
     
     public static void main(String[] args) {
          int arr[] = {0,5,0,3,42};
          int brr[] = {0,0,0,5,0,0 };
          
          last_zero_inde(brr);
     }
}
