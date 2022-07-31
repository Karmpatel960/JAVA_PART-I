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
