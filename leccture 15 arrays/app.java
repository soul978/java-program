
public class app {
    static void printarray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");

        }
        System.out.println();
    }
  static void change_arrays(int[]arr){
    for (int i = 0; i < arr.length; i++) {
        arr[i] = 0;
    }
  }  
  static void change_value(int a){//! copy of arrays  this is not a initial value
    a = 100;
  }

  public static void main(String[] args) {
    int a = 5;//? initial value can not changed
    change_value(a);
    System.out.println(a);// given 5 becaouse value can't cahnge 
    int []arr = new int[3];
    arr[0]=5;
    arr[1] = 6;
    arr[2] = 7;

    change_arrays(arr);
    printarray(arr);
  }
}