import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        boolean result = false;

        if (op.equals(">")){
            result = (a > b);
        } else if (op.equals("<")){
            result = (a < b);
        } else if (op.equals("=")){
            result = (a == b);
        }

        System.out.println(result ? "Right" : "Wrong");
        
        sc.close();
    }
}