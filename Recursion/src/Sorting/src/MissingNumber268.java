import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args){
        int[] arr = {3,4, 0, 2, 1,7};
        System.out.println(missingElement(arr));
    }
     public static int missingElement(int[] arr){
        int i = 0;
        while(i < arr.length){
            //find the correct position of element
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    //swap
    static void swap(int[] arr, int first, int second){
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }
}
