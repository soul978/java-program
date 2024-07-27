import java.util.Scanner;
class ram{
    int add(int a,int b){
        int ans = a+b;
        return ans;
    }
}

public class addition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first numbers : ");
            int a = sc.nextInt();
            System.out.println("Enter the second numners : ");
            int b = sc.nextInt();
            ram sole = new ram();
      int c = sole.add(a, b);
            System.out.println(c);
        }

    }
}
