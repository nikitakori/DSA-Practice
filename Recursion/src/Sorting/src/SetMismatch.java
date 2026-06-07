import java.util.*;

public class SetMismatch {
    public static void main(String[] args){
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findMismatch(nums)));
    }
    public static int[] findMismatch(int[] nums){
        int i = 0;
        while(i < nums.length){
            //find the correct position of element
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return new int[] {nums[index],index + 1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] nums, int first, int second) {
        int tmp = nums[first];
        nums[first] = nums[second];
        nums[second] = tmp;
    }
}
