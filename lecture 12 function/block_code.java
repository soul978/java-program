class algebra{
    int a = 10;
    int b = 40;
     
    int add(){
        return a+b;

    }
    void demo(){
    int c  =90;//! method level scope :

        System.out.println(c);//? not print the d only print c
    }
    {
        int d=60;//!------block level code 

        System.out.println(d);//? block  level code calling only inside the braces 
    }
}
public class block_code {

    
}
