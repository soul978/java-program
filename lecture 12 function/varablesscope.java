 class algebra{
    int a =10;//! members varaibles used the variables any where in the class
    int b = 5;

    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a/b;
        }
}
public class varablesscope {
    public static void main(String[] args) {
        algebra ss = new algebra();
        int c = ss.add();
        System.out.println(c);
    }
}
