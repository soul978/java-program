public class ss {
    public static void main(String[] args) {
        int a = 10,b=30;
       System.out.println(a<b && a<=b);
        System.out.println(a==b && a<b);

        System.out.println("or operaters ");

        System.out.println(a<b || a>b);//? true
        System.out.println(a>b ||a>=b);//! false

        System.out.println("not opraters ");

        System.out.println(a!=b);//!  true 
        System.out.println(!(a<b));//!false

    }   
}
