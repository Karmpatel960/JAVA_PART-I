/*Prepared by PATEL KARM HITESHKUMAR(21CE095)*/


/*Aim: Given two non-negative int values, return true if they have the same first digit, such as with 72 and
75.
1 1
firstDigit(7, 71) → true
firstDigit(6, 17) → false
firstDigit(31, 311) → true*/
import java.util.Scanner;

public class Practical3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter The First Number :");
        int a = in.nextInt();
        System.out.println("Enter The Second Number :");
        int b = in.nextInt();

        if(digit(a,b)) {
            System.out.println("Your Entered First Digit of Both Number " + a + " & " + b + " is same");
        }
        else{
            System.out.println("Your Entered First Digit of Both Number " + a + " & " + b + " is not same");
        }
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");


    }
    public static boolean digit(int c,int d){
        int n=0;
        int m=0;
        while(c!=0){
            n=c%10;
            c/=10;
        }
        while(d!=0){
            m=d%10;
            d/=10;
        }
        return n == m;

    }
}
