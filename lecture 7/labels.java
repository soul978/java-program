import java.util.Scanner;
public class labels {
    public static void main(String[] args) {
       System.out.println("enter the first numbers :"); 
       Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      outer:  for (int i = 1; i < 10; i++) { //! creating labels in fromnt of the loops 
        inner:   for (int j = 1; j <=10; j++) {//? creating labesls in fronts of the loops
             if (i==a) {
                break outer;//! ----------usage of labels in java programs
             }
             System.out.println(i);
           }
          
        }
    }
}
