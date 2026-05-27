class SingleNumberII {
public static void main(String[] args){
int n = {2,2,2,3,4,4,4,5,5,5,6,6,6};
System.out.println(singleNumber(n));
}
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;
            for (int num : nums) {
                // check if bit is set
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }
            // remainder means unique number owns this bit
            if (count % 3 != 0) {
                ans = ans | (1 << bit);
            }
        }
        return ans;
    }
}
