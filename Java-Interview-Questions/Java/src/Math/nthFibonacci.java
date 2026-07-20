package Math;

import java.util.Scanner;

public class nthFibonacci {
    static int nthFibonacci(int n) {
        int dp[] = new int[n+1];
        for(int i=0; i <= n ; i++)dp[i]=-1;
        return Fibo(n,dp);
    }
    static int Fibo(int n, int dp[]){
        if(n<=1)return n;
        if(dp[n] != -1)return dp[n];
        return dp[n]=Fibo(n-1,dp)+Fibo(n-2,dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i = 0 ; i<=n ; i++) {
            System.out.println(nthFibonacci(i));
        }
    }
}
