import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float x = scanner.nextFloat();
        float p = scanner.nextFloat();

        float percent = (1 - x / 100);

        float price = p / percent;

        System.out.format("%.2f", price);

        scanner.close();
    }
}