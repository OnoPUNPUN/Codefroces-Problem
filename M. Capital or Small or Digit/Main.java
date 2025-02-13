import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        if(Character.isDigit(a)){
            System.out.println("IS DIGIT");
        } else {
            System.out.println("ALPHA");
            if(Character.isUpperCase(a)){
                System.out.println("IS CAPITAL");
            } else{
                System.out.println("IS SMALL");
            }
        }

        sc.close();
    }
}