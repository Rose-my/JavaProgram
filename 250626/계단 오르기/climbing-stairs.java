import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        int[] dp = new int[n+1];

        dp[1] = 0;
        dp[2] = 1;
        if (n >= 3) dp[3] = 1;

        if(n<4){
            System.out.println(dp[n]);
            return;
        }



        for(int i=4; i<n+1; i++){
            dp[i]= dp[i-2] + dp[i-3];
        }

        System.out.println(dp[n]);
    }
}