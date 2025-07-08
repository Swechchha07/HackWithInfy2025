import java.util.*;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans;
        if (n <= 2) {
            ans = n;
        } else {
            int prev1 = 1;
            int prev2 = 2;
            for (int i = 3; i <= n; i++) {
                int current = prev1 + prev2;
                prev1 = prev2;
                prev2 = current;
            }
            ans = prev2;
        }

        System.out.println(ans); 
    }
}
