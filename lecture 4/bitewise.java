public class bitewise {
    public static void main(String[] args) {
        int p = 9,b = 10;

        System.out.println(p|b);//!  11
        System.out.println(p&b);//! 8
        System.out.println(p^b);//! 3

        System.out.println(p<<1);// 18
        System.out.println(p<<2); //! 36

        System.out.println(b>>1);//! 5
        System.out.println(b>>2);// ! 2
    }
}
