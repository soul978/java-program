
//package pridict_the_output;
import java.util.Scanner;

public class stm {
    public static void main(String[] args) {
        Scanner stm = new Scanner(System.in);
        int i, j, k, l;
        double a, b;
        System.out.println("enter the value :");
        i = stm.nextInt();
        System.out.println("enter the second value :");
        j = stm.nextInt();
        k = i / j * j;
        l = j / i * i;
        a = i / j * j;
        b = j / i * i;
        System.out.println();

        System.out.println(k + " " + l + " " + a + "" + b);

    }
}
