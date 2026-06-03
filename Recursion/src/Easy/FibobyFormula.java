package Easy;

public class FibobyFormula{
    public static void main(String[] args){
        for(int i=0; i<50; i++){
            System.out.println(fiboFormula(i));
        }
    }

    static int fiboFormula(int n){
//        return (int)((Math.pow(((1 + Math.sqrt(5))/2), n) - Math.pow(((1 - Math.sqrt(5))/2), n))/Math.sqrt(5));
        return (int)(Math.pow(((1 + Math.sqrt(5))/2), n)/Math.sqrt(5));
    }


    static int fiboBase(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fiboBase(n-1) + fiboBase(n-2);
    }
}

//(Math.pow(((1 + Math.sqrt(5)))/2, n) - Math.pow(((1 - Math.sqrt(5)))/2, n))