public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,9,3,1,3,5,10,2,5,9};
        System.out.println(sLargest(arr));

    }
    public static int sLargest(int[] arr){
       int smax = -1;
       int max = -1;
       for (int i=0;i<arr.length;i++){
           if(arr[i]>max){
               smax=max;
               max=arr[i];
           }else if (arr[i] > smax && arr[i] <max){
               smax=arr[i];
           }
       }
       return smax;
    }
}

//int max = -1;
//int smax = -1;
//        for(int i = 0 ;i< arr.length ; i++){
//        if(arr[i]>max){
//smax = max;
//max = arr[i];
//        }
//        if(arr[i]<max && arr[i]>smax){
//smax = arr[i];
//        }
//        }
//        return smax;
