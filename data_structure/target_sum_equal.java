import java.util.Scanner;

public class target_sum_equal {
    static void all_no(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays : ");
        int size =sc.nextInt();
        int arrays[] = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Enter the Elements of  "+i+" : ");
            arrays[i] = sc.nextInt();
        }
        solution(arrays);
    }
    static void solution(int arr[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target _sum : ");
        int s = sc.nextInt();
        int d = 0;
        int e = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (i==j) {
                    break;
                }
                if (d==arr[i]||e==arr[j]) {
                    continue;
                }else{
                if (arr[i]+arr[j]==s) {
                    d = arr[i];
                    e = arr[j];
                    System.out.println(arr[i]+" + "+arr[j]+"  =  "+s);
                }}
            }
        }
    }
    public static void main(String[] args) {
        all_no();
    }
}
