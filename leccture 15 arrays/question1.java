public class question1 {
    static void shivam(int rr[]){
        int sum = 0;
        for (int i = 0; i < rr.length; i++) {
            //System.out.println(rr[i]);
            if (rr[i]==5) {
                sum+=1 ;
                System.out.println("index is "+i);
            }
        }
        System.out.println(sum+" time five show");
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,8,5};
        shivam(arr);
    }
}
