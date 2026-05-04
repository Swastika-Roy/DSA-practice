import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;
        int ans = kthSmallest(arr,k);
        System.out.println(ans);
    }

    public static int kthSmallest(int[] arr, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0; i < arr.length;i++){
           pq.add(arr[i]);
           if(pq.size() > k){
               pq.poll();
           }
       }
       return pq.peek();
    }

//    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for(int i=0;i < arr.length;i++){
//        pq.add(arr[i]);
//        if(pq.size() > k){
//            pq.poll();
//        }
//    }
//        return pq.peek();

}
