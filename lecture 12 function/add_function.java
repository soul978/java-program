import java.util.Scanner;
class algebra{

    int a;//! use this two variables any where in the algebra classk
    int b;

    algebra(int x,int y){//? paramerter of the calss 
        System.out.println("constructor of algebra class ");
        a=x;
        b=y;
    }
    int add(int a,int b){
        int ans = a+b;
        return ans;
    }
    int sub(int a,int b){
        int c = a-b;
        return c;
    }
}
public class add_function {
    public static void main(String[] args) {
        algebra object = new algebra(5,7);
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the first numbers :");
        int a = sc.nextInt();
        System.out.println("enter the second numbers :");
        int b = sc.nextInt();
        

        System.out.println("sum of input numbers ");
        int ss = object.add(a,b);
        System.out.println(ss);
    }
}
