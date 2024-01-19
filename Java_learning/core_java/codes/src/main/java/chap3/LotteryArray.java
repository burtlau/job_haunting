import java.util.Arrays;

public class LotteryArray{
    public static void main(String[] args)
    {
        final int NMAX = 5;

        int[][] odds = new int[NMAX + 1][];
//        System.out.println(Arrays.deepToString(odds));
        for (int n = 0 ; n <= NMAX; n++)
            odds[n] = new int[n + 1];
//        System.out.println(Arrays.deepToString(odds));
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k< odds[n].length; k++)
            {
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++){
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                    System.out.printf("i: %d, n: %d, k:%d, lotteryOdds: %d\n", i, n, k, lotteryOdds);
                }


                odds[n][k] = lotteryOdds;
            }

        for (int[] row:odds)
        {
            for (int odd: row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}