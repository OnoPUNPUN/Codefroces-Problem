import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        String e = sc.next();
        int rans = sc.nextInt();
        
        if(op.equals("+")) {
            int ans = a + b;
            if (ans == rans) {
                System.out.println("Yes");
            } else{
                System.out.println(ans);
            }
        } else if(op.equals("-")) {
            int ans = a - b;
            if (ans == rans) {
                System.out.println("Yes");
            } else{
                System.out.println(ans);
            }
        } else if(op.equals("*")) {
            int ans = a * b;
            if (ans == rans) {
                System.out.println("Yes");
            } else{
                System.out.println(ans);
            }
        } else if(op.equals("/")) {
            int ans = a / b;
            if (ans == rans) {
                System.out.println("Yes");
            } else{
                System.out.println(ans);
            }
        }
        sc.close();
    }
}