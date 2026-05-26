public class BitManipulation {
    public static void main(String[] args){
        System.out.println(isEven(338));
        System.out.println(getBit(10,2));
    }
    //check number is even or odd
    static boolean isEven(int n){
        return (n & 1)==1;
    }
    //check the bit is 1 or 0
    static int getBit(int n,int i){
//        return ((n & (1 << 2)) == 1 ? 1 : 0);
        int bit_mask = 1<<i;
        if((n & bit_mask ) == 0){
            return 0;
        }else {
            return 1;
        }
    }
}
