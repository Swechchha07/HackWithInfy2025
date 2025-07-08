import java.util.Scanner;

public class CountWays123Steps {
    public static int countWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int a = 1; 
        int b = 1; 
        int c = 2; 

        for (int i = 3; i <= n; i++) {
            int current = a + b + c;
            a = b;
            b = c;
            c = current;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = countWays(n);
        System.out.println(result);
    }
}

