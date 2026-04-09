import java.util.Arrays;

public class SelectionSort {
    public static void SelectionSortFunc(int[] arr){
        for(int i=0; i <=arr.length-2; i++){
            int min=i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[min] > arr[j]) min=j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]=temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,1,1,2,5,0};
        SelectionSortFunc(arr);
        System.out.println(Arrays.toString(arr));
    }
}
