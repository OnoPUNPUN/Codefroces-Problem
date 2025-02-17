import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        char d = (char) (c + 1);
        
        if (c == 'z'){
            System.out.println("a");
        } else{
            System.out.println(d);
        }

        sc.close();
    }
}