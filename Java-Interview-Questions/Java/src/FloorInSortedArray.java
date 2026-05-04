public class FloorInSortedArray {
    public static int findFloor(int[] arr, int x) {
       int st = 0; int end = arr.length-1;int ans = -1;
       while(st <= end){
           int mid = st+(end-st)/2;
           if(arr[mid] <= x){
               ans = mid;
               st = mid+1;
           }else{
               end=mid-1;
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int x = 5;
        System.out.println(findFloor(arr,x));
    }
}
//
//int st = 0; int end = arr.length-1;int ans =-1;
//        while(st <= end){
//int mid = st+(end-st)/2;
//            if(arr[mid] <= x){
//ans = mid;
//st = mid+1;
//        }else{
//end=mid-1;
//        }
//        }
//        return ans;
