public class SingleElementinaSortedArray {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,4,6,6};
        System.out.println(uniqueElement(arr));
    }
    static int uniqueElement(int[] arr){
        int unique = 0 ;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
