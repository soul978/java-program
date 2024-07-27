class sum{
    void shivam(){
        int aee[] = {1,2,3,9,0,5,8};
        int sum= 0;
        for (int i = 0; i < aee.length; i++) {
            sum+=aee[i];
        }
        System.out.println(sum);
    }
}
public class sum_arrays {
    public static void main(String[] args) {
        sum shivam = new sum();
        shivam.shivam();
    }
}
