import java.util.Scanner;
public class print {
    static void solution(){
        @SuppressWarnings({ "resource", "unused" })
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=100; i++) {
            if (i%3==0||i%5==0) {
                if (i%15!=0) {
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        solution();
    }
}
