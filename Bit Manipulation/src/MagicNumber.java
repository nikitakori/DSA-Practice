public class MagicNumber {
    //https://leetcode.com/problems/single-number-ii/description/
    public static void main(String[] args){
        int n = 6;
        singleNumberII(n);
    }
    static void singleNumberII(int n){
        int base = 5;
        int ans = 0;
        while(n>0){
            int last = n & 1;
            n = n>>1;
            ans += last * base;
            base *= 5;
        }
        System.out.println(ans);
    }
}
