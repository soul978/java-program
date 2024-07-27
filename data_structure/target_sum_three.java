import java.util.Scanner;

public class target_sum_three {
    
    static void inputs() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays : ");
        int inputs = sc.nextInt();
        int arrays[] = new int[inputs];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("enter the elements " + i + " : ");
            arrays[i] = sc.nextInt();
        }
        targetsum(arrays);
    }
    @SuppressWarnings("resource")
    static void targetsum(int array[]) {
        int n = array.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target sum : ");
        int target = sc.nextInt();
        for (int i = 0; i<n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int j2 = j+ 1; j2 < n; j2++) {
                    if ((array[i] + array[j] + array[j2]) == target) {
                        System.out.println(array[i] + " + " + array[j] + " + " + array[j2] + " = " + target);
                        
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        inputs();
    }
}