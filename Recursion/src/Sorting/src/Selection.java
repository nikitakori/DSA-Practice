import java.util.Arrays;

public class Selection {
    public static void main(String[] args){
        int[] arr = {3,-1,0,9,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //find the max element in the remaining array to swap with the correct index
            //last is positon where our max item will store
            int last = arr.length-i-1;
            //find
            int maxIndex = getMaxIndex(arr,0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }

    static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
