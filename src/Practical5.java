/*Prepared by PATEL KARM HITESHKUMAR(21CE095)*/


/*Aim: We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the
next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of
blocks in such a triangle with the given number of rows.
triangle(0) → 0
triangle(1) → 1
triangle(2) → 3*/

import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of row for Triangle :");
        int a = in.nextInt();
        int ans = numtriangle(a);
        System.out.println("The Number of Blocks Triangle has "+ans);

    }
public static int numtriangle(int b) {
    switch (b) {
        case 0:
            return 0;

        default:
            int c = numtriangle(b - 1);
            return b + c;
    }
}
}
