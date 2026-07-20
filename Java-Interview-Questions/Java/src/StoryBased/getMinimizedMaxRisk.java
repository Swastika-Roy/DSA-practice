package StoryBased;
import java.util.*;
public class getMinimizedMaxRisk {


//        public static long getMinimizedMaxRisk(int N, int K, int[] workloads) {
//            // Write your optimization logic here
//
//
//            return 0; // Replace this with your actual computed answer
//        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int N = sc.nextInt();
                int K = sc.nextInt();
                int[] workloads = new int[N];
                for (int i = 0; i < N; i++) {
                    workloads[i] = sc.nextInt();
                }
//                System.out.println(getMinimizedMaxRisk(N, K, workloads));
            }
            sc.close();
        }
    }

