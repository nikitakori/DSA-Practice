package Patterns;
import java.util.*;
public class Sorting {
    public static void main(String[] args){
        int[] arr = {1,2,4,3,5,6,7};

//        bubble(arr, arr.length-1, 0);
//        System.out.println(Arrays.toString(arr));


//        selection(arr, arr.length-1, 0,0);
//        System.out.println(Arrays.toString(arr));


        selection2(arr, 0, 0,0);
        System.out.println(Arrays.toString(arr));

    }

    //Bubble sort using maximum
    static void bubble(int[] arr, int r , int c){
        if(r == 0){
            return ;
        }
        if(c < r){
            if(arr[c] > arr[c + 1]){
                int tmp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = tmp;
            }
            bubble(arr, r, c + 1);
        } else{
            bubble(arr, r - 1, 0);
        }
    }

    //Selection sort using maximum
    static void selection(int[] arr, int r , int c, int max){
        if(r == 0){
            return ;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selection(arr, r, c + 1, c);
            }
            else{
                selection(arr, r, c + 1, max);
            }
        } else{
            int tmp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = tmp;
            selection(arr, r - 1, 0, 0);
        }
    }

    //Selection sort using minimum
    static void selection2(int[] arr, int r , int c, int min){
        if(r == arr.length){
            return ;
        }
        if(c < arr.length){
            if(arr[c] < arr[min]){
                selection2(arr, r, c + 1, c);
            }
            else{
                selection2(arr, r, c + 1, min);
            }
        } else{
            int tmp = arr[min];
            arr[min] = arr[r];
            arr[r] = tmp;
            selection2(arr, r + 1, r + 1, r + 1);
        }
    }
}
