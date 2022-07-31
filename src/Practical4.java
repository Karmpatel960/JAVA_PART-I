import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {

            Scanner in = new Scanner (System.in);

            String[] ans = { "D","B","D","C","C","D","A","E","A","D"};
            String[][] arry = new String[8][10];

            for (int i =0;i<arry.length;i++){
                System.out.println("Enter tha Answer's of Student "+i+" : ");
                int c =0;

                for (int j=0;j<arry[i].length;j++){

                    arry[i][j] = in.next();

                    if(arry[i][j].equalsIgnoreCase(ans[j]))
                        c++;
                }

                System.out.println("The Result of Student " + i + " is " + c);

            }

        }

    }