package Easy;

class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args){
        System.out.println(numberOfSteps(14,0));
    }
    public static int numberOfSteps(int num, int step) {
        return helper(num, step);
    }
    private static int helper (int num, int step){
        if(num == 0){
            return step;
        }
        if(num % 2 == 0){
            return helper (num/2, step + 1);
        }
        return helper (num - 1, step + 1);
    }
}