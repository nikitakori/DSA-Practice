package Arrays;

import java.util.ArrayList;

public class FindElement {
    public static void main(String[] args){
          int[] arr = {1,2,4,3,5,6,3,7};
//        System.out.println(find(arr, 31,0));
//        System.out.println(findIndex(arr, 31,0));
//        System.out.println(findFromLastIndex(arr, 31, arr.length-1));
//
//        findAllIndex(arr, 3, 0);
//        System.out.println(list);
//
//        ArrayList<Integer>ans = findAllIndexList(arr,3,0,new ArrayList<>());
//        System.out.println(ans);

        System.out.println(findAllIndexList2(arr, 3,0));
    }
    static boolean find (int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex (int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr, target, index + 1);
        }
    }

    static int findFromLastIndex (int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findFromLastIndex(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex (int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndexList (int[] arr, int target, int index, ArrayList<Integer>list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return findAllIndexList(arr, target, index + 1, list);
    }
    static ArrayList<Integer> findAllIndexList2 (int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalles = findAllIndexList2(arr, target, index + 1);
        list.addAll(ansFromBelowCalles);
        return list;
    }
}
