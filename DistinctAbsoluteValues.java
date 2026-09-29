import java.util.*;

public class DistinctAbsoluteValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                set.add(Math.abs(x));
            }

            System.out.println(set.size());
        }

        sc.close();
    }
}
