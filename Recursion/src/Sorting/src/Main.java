import java.awt.desktop.UserSessionListener;
import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] arr = {3,-1,0,9,5,46};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void bubble(int[] arr){
        boolean isSwaped;
        for(int i = 0; i < arr.length; i++){
            isSwaped = false;
            //for each pass max item will to the end respective index
            for(int j = 0; j < arr.length-i-1; j++){
                //swap when current element is grater than the next element
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSwaped = true;
                }
            }//if j did not swap swap for any perticular value of i than array is sorted
            if(!isSwaped){
                break;
            }
        }
    }
}