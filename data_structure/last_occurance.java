import java.util.Scanner;

public class last_occurance {
    static void occurance(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays  : ");
        int n = sc.nextInt();
        int arrays[]  = new int[n];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Enter the elements of the arryas "+i+" : ");
            arrays[i] = sc.nextInt();

        }
        System.out.println("Enter the searching Elements : ");
        int search = sc.nextInt();
        int c = -1;
        for (int i = 0; i < arrays.length; i++) {
            if (search==arrays[i]) {
               c =i;
            }
        }
        System.out.print("Last occurance  : "+c);
    }
    public static void main(String[] args) {
        occurance();
    }
}
