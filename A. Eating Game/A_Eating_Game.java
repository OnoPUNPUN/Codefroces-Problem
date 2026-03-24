/*
I have no idea what to do with myself. And while I wait for my epiphany,
I feel the toxins collecting in my body.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class A_Eating_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            List<Integer> d = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                d.add(l);
            }

            Integer max = Collections.max(d);
            System.out.println(Collections.frequency(d, max));
            t--;
        }
        sc.close();
    }
}
