import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        if (a == a.toUpperCase()) {
            System.out.println(a.toLowerCase());
        } else {
            System.out.println(a.toUpperCase());
        }

        sc.close();
    }
}