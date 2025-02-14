import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days, year, month;
        
        days = sc.nextInt();

        year = days / 365;
        month = (days % 365) / 30;
        days = (days % 365) % 30;
        
        System.out.println(year + " years");
        System.out.println(month + " months");
        System.out.println(days + " days");

        sc.close();
    }
}