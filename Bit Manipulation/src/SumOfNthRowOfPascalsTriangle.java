public class SumOfNthRowOfPascalsTriangle {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(sumOfPascalRow(n));
    }
    static int sumOfPascalRow(int n){
        return 1 << n-1;
    }
}