import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.141592653;

        double r = sc.nextDouble();

        System.out.println(r * r * pi);
        sc.close();
    }
}