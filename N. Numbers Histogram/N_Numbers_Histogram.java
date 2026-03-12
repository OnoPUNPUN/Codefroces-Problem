import java.util.Scanner;

public class N_Numbers_Histogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        while (n > 0) {
            int m = sc.nextInt();

            for (int i = 0; i < m; i++) {
                System.out.print(s);
            }
            System.out.println();
            n--;
        }

        sc.close();

    }
}