import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
     for(int i=arr.length-1;i >=0;i--){
         int didswap =0;
         for(int j=0; j <=i-1;j++){
             if(arr[j] > arr[j+1]) {
                 int temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
                 didswap = 1;
             }
         }
         if(didswap==0)break;
     }

    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

//        for(int i=arr.length-1; i >=0; i--){
//            int didswap=0;
//            for(int j=0;j<=i-1;j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    didswap=1;
//                }
//            }
//
//            if(didswap==0)break;
//        }