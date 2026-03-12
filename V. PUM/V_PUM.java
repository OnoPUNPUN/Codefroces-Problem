import java.util.Scanner;

public class V_PUM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;

        while (n >= 1) {
            for (int i = 0; i <= 4; i++) {
                if (i == 3) {
                    System.out.print("PUM");
                    count++;
                    break;
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
            n--;
            System.out.println();
        }

        sc.close();
    }
}