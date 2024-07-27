import java.util.Scanner;

public class mark {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of the subjects :");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Excelemts");
        } else if (marks >= 80) {
            System.out.println("Very good");
        } else if (marks >= 70) {
            System.out.println("Good");
        } else if (marks >= 60) {
            System.out.println("Can do better");

        }
        else if (marks >= 50) {
            System.out.println("Average");
        } else if (marks >= 40) {
            System.out.println("Below avegage");
        } else {
            System.out.println("fail");
        }

    }
}
