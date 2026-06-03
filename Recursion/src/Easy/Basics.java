package Easy;

public class Basics {

    //Reverse digits of number - way 1
    static int sum = 0;
    static void reverse1(int n){
        if(n == 0){
            return ;
        }
        sum = sum * 10 + (n % 10);
        reverse1(n / 10);
    }
    //Reverse digits of number - way 2
    static int reverse2 (int n){
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }
    private static int helper (int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10,digits-1)) + helper(n / 10, digits - 1) ;
    }
    static boolean palindrome(int n){
        return n == reverse2(n);
    }

    public static void main(String[] args){
        reverse(5);
        System.out.println();
        System.out.println("factorial: "+facto(5));
        System.out.println("sum of n: "+sumOfN(5));
        System.out.println("product of: "+prodOfN(5));
        System.out.println("Sum of Digits: "+sumOfDigits(58976454));
        System.out.println("Product of Digits: "+prodOfDigits(12345564));

        reverse1(1842);
        System.out.println("Reverse1 of Digits: "+sum);

        System.out.println(reverse2(1234));
        System.out.println(palindrome(1233221));
    }

    static void reverse(int n){
        if(n == 0){
            return;
        }
        System.out.print(n +" ");
        reverse(n-1);
        System.out.print(n +" ");
    }
    //factorial of a number
    static int facto(int n){
        if(n <= 1){
            return 1;
        }
        return n * facto(n - 1);
    }
    //sum of 1 to n numbers
    static int sumOfN(int n){
        if(n <= 1){
            return 1;
        }
        return n + facto(n - 1);
    }
    //product of 1 to n numbers
    static int prodOfN(int n){
        if(n <= 1){
            return 1;
        }
        return n * prodOfN(n - 1);
    }
    // sum of number of digits
    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
    // Product of number of digits
    static int prodOfDigits(int n){
        if(n%10 == n){
            return n;
        }
        return (n % 10) * prodOfDigits(n / 10);
    }
}
