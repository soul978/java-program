class soul{
    void max(){
        int sum = 0;
        int arr[] = {1,2,3,4,5,6,7,10,5,4};
       for (int i = 0; i < arr.length; i++) {
          if (arr[i]>sum) {
             sum = arr[i];
          }
       }
       System.out.println("maximum numbers is "+sum);
    }
}
public class maximum_value {
    public static void main(String[] args) {
        soul shivam = new soul();
        shivam.max();
    }
}
