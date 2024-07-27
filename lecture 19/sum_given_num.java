import java.util.Scanner;

public class sum_given_num {

    static int[] makeprefixsumArrays(int a[]){
        for (int i = 1; i <a.length; i++) {
            a[i]+=a[i-1];
        }
        return (a);
    }
    // static void print(int a){
    //     for (int i = i; i < array.length; i++) {
            
    //     }
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int n = sc.nextInt();
        int a[] = new int[n+1];

        System.out.println("enter the "+n+" elements ");
        for (int i = 1; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int prefsum[] = makeprefixsumArrays(a);

        System.out.println("enter hte numbers of quries ");
        int q = sc.nextInt();

        while (q-->0) {
            //System.out.println("Enter the range");
            System.out.println();
            System.out.println("starting numbers of sum :");
            int l = sc.nextInt();
            System.out.println();
            System.out.println("ending numbers of sum :");
            int r= sc.nextInt();
            System.out.println();
            int ans = prefsum[r] - prefsum[l-1];
            System.out.println("sum "+ans);
        }
      
    }

}