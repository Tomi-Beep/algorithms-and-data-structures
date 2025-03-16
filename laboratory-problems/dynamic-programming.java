import java.util.Scanner;

public class Main {

    public static int minimalniKvadrati(int X) {

        int[] dp = new int[X + 1];
        dp[0] = 0;
        for (int i = 1; i <= X; i++) {
            dp[i] = Integer.MAX_VALUE;
        }


        for (int i = 1; i <= X; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[X];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        System.out.println(minimalniKvadrati(X));

        sc.close();
    }
}
