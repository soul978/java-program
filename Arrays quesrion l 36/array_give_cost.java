public class array_give_cost {
     static int bestcost(int[] h,int index){

          //! base case

          if (index==h.length-1) {
               return 0;
          }
          

          int optio1 =bestcost(h, index+1)+Math.abs(h[index]-h[index+1]);
          if (index==h.length-2) {
               return optio1;
          }
          int option2 = bestcost(h, index+2)+Math.abs(h[index]-h[index+2]);

          return Math.min(optio1, option2);
     }
     public static void main(String[] args) {
          int [] h = {10,30,40,20};
          System.out.println(bestcost(h, 0));
     }
}
