package cognizant.number;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NthLargest {

    public static int getNthLargest(int count, int n, int[] arr) {

        // 1. Array-take choto theke boro (ascending order) sajiye ne
        Arrays.sort(arr);

        // 2. Pichon dik theke n-th number-ta hobe amader answer
        // Index ber korar ashol trick holo (Total Length - N)
        return arr[count - n];
    }

    public static int getNthLargestPriorityQueue(int count, int n, int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i < count; i++){
            pq.offer(arr[i]); // add we can also use offer not through exception
            if(pq.size()>n)pq.poll(); // remove also used
        }
        return pq.peek();
    }

    public static void main(String[] args) {

        /*
        // ⚠️ Online platform-e jodi Scanner diye input nite hoy, tahole ei block-ta use korbi:
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getNthLargest(count, n, arr));
        */

        // --- Test Case (From Image) ---
        int count = 5;
        int n = 3;
        int[] arr = {11, -1, -4, 12, -6};

        System.out.println("Output: " + getNthLargestPriorityQueue(count, n, arr));
        // Expected Output: -1
    }
}
