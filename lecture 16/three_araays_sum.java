import java.util.Scanner;
class shivam{
     static void ss(int arr[]){
        Scanner ss = new Scanner(System.in);
        System.out.print("enter the elements of the arrays :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ss.nextInt();
        }
    }
    static void resultants(int a[],int x,int n){
        
        System.out.println("he;llo");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int j2 = j+1; j2 < a.length; j2++) {
                    if (a[i]+a[j]+a[j2] ==x) {
                        System.out.println("index "+i+"  +   index "+j+"  + index "+j2+" = "+x);
                        //ans++;
                    }
                }
            }
        }
    }
}
public class three_araays_sum {
    public static void main(String[] args) {
        Scanner shivam = new Scanner(System.in);
        System.out.println("enter the range of arrays :");
        int n = shivam.nextInt();
        System.out.println("enter the target values :");
        int c = shivam.nextInt();
        int arr[] = new int[n];
        shivam obj = new shivam();
       obj.ss(arr);

       System.out.println("resultant ");

       obj.resultants(arr,c,n);
    }
}
