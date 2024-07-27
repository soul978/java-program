import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers : ");
        int n = sc.nextInt();
        int[] arrays = new int[n];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Enter the numbers "+i+" : ");
            arrays[i] = sc.nextInt();
        }

        // for (int i = 0; i < arrays.length; i++) {
        //     System.out.print(arrays[i]+" ");
        // }
        // for (int c : arrays) {
        //     System.out.println(c);
        // }
        int i =0 ;
        while (i<arrays.length) {
            System.out.println(arrays[i]);
            i++;
        }
       
    
    }
}
