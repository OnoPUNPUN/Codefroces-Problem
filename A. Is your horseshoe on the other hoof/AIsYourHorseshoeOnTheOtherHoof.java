import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class AIsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> colors = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            colors.add(num);
        }

        List<Integer> colorsUqine = new ArrayList<>(new HashSet<>(colors));

        System.out.println( 4 - colorsUqine.size());

        sc.close();
    }
}
