public class BitManipulation {
    public static void main(String[] args){
        System.out.println(isEven(338));
    }
    static boolean isEven(int n){
        return (n & 1)==1;
    }
}
