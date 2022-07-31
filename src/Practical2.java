/*Prepared by PATEL KARM HITESHKUMAR(21CE095)*/



/*Aim: A typical mobile number in India is “+91-AA-BBB-CCCCC”. Where the first two digits (AA) indicate
a mobile system operator, the next three (BBB) denote the mobile switching code (MSC) while the remaining
five digits (CCCCC) are unique to the subscriber. Write an application that takes a mobile number as an
input from a user in above mentioned format
and display code for mobile system operator, mobile switching code and last 5 digits which
are unique to subscriber*/
import java.util.Scanner;
import java.lang.*;
public class Practical2 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter Mobile Number of 10 Digit ");
        String a = in.next();
        String b = a.substring(0, 2);
        String c = a.substring(2, 5);
        String d = a.substring(5, 10);

        System.out.println("Your Mobile Number is +91 "+a);

        System.out.println("Mobile System Operator Code is "+b);
        System.out.println("MSC is "+c);
        System.out.println("Unique Code is "+d);

    }
}
