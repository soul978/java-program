import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first numbers :");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = a; j >i; j--) {//!=====or== for(int j = 1;j<=a-i;j++);
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {//?--- j = 0;j=<2*i-1;k++;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
