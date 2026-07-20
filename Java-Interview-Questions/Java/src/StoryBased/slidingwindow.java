package StoryBased;
import java.util.*;
public class slidingwindow {

    public static int maxConsecutiveOrders(int N, int K, int[] P) {
        // Write your O(N) sliding window logic here
//        long sum = 0; long max=0;
//        for(int i=0; i <K; i++){
//            sum += P[i];
//        }
//        max = Math.max(sum,max);
//
//        for(int i=K; i < N; i++){
//            sum += P[i] - P[i-K];
//            max =   Math.max(max,sum);
//        }
//
//        return (int) max; // Replace with your actual answer


        long sum = 0; long max = 0;
        for(int i =0; i <K; i++){
            sum += P[i];
        }
        max = Math.max(max,sum);
        for(int i=K ; i< N; i++){
            sum += P[i] - P[i-K];
            max = Math.max(max,sum);
        }
        return (int) max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        System.out.println(maxConsecutiveOrders(N, K, P));
        sc.close();
    }
}

