public class BitManipulation {
    public static void main(String[] args){
        System.out.println(isEven(338));
        System.out.println(getBit(10,3));
        System.out.println(setBit(10,2));
        System.out.println(clearBit(10,2));
        System.out.println(updateithBit(22,2,0));
        System.out.println(clearLastithBits(15,2));
        System.out.println(clearRange(10,2,4));
    }
    // check value is odd or even
    static boolean isEven(int n){
        return (n & 1)==1;
    }
    //get ith bit
    static int getBit(int n,int i){
        // return ((n & (1 << 2)) == 1 ? 1 : 0);
        int bit_mask = 1<<i;
        if((n & bit_mask ) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    //set ith bit
    static int setBit(int n,int i){
        int bit_mask = 1<<i;
        return n | bit_mask;
    }
    //clear ith bit
    static int clearBit(int n,int i){
        int bit_mask = ~(1<<i);
        return n & bit_mask;
    }
    //update bit without using setbit
    static int updateithBit(int n, int i, int newBit){
        n = clearBit(n,i);
        int bitMask = newBit << i;
        return n | bitMask;
    }
    //clear last ith bits
    static int clearLastithBits (int n, int i){
        return n & ((~0) << i);
    }
    //clear range of its bits
    static int clearRange(int n,int i,int j){
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
}
