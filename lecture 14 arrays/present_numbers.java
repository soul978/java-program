class shivam{
    void ss(){
        int x = 7;
        int arr[]={7,5,7,5,4,9,8,6,4,3,5,7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
               System.out.println("index numbers is "+i);
               break;
            }
        }
        //System.out.println(x);
    }
}
public class present_numbers {
    public static void main(String[] args) {
        shivam obj = new shivam();
        obj.ss();
    }
}
