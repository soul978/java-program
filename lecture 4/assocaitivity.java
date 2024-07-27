public class assocaitivity {
    public static void main(String[] args) {
        int p = 4,q=3,r=2,s;
        s = p - ++r - ++q ;
        System.out.println(s); //! == -3

        //? code run left to right  in this way answers is -3;
    }
}
