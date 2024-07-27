import java.util.Scanner;

public class repeating_element_find {
    static void find_number(int arr[],int size){
        int a = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                   arr[i] = 0;arr[j]=0;
                //    System.out.println(arr[i]+"   "+arr[j]);
                }
                else{
                     a= arr[i];
                 // System.out.print(arr[i]);
                }
            }
    
        }
    System.out.println("not repeated element is : "+a);
       
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays : ");
        int size  =  sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element "+i+" : ");
            arr[i] = sc.nextInt();
        }
        find_number(arr,size);

    }
}