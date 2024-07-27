import java.util.Scanner;

public class presentquery {

    static int[] makefrequencyArrays(int a[]){
        int freq [] = new int[100005];

        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
        }
        return freq;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arrays size :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the "+ n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int freq[] = makefrequencyArrays(arr);
        System.out.println("Enter numbers of queries ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter number to be searched");
            int x = sc.nextInt();
            if (freq[x]>0) {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }    
    }
}
