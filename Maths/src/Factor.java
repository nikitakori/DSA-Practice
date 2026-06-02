import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        factors(40);
        System.out.println();
        factors2(40);
        System.out.println();
        factors3(40);
    }
    //O(n)
    static void factors(int n){
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }
    //O((log(n))
    static void factors2(int n){
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == n){
                    System.out.print(i+" ");
                } else {
                    System.out.print(i + " "+ n/i + " ");
                }
            }
        }
    }
    //O((log(n))
    static void factors3(int n){
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == n){
                    System.out.print(i+" ");
                } else {
                    System.out.print(i + " ");
                    List.add(n/i);
                }
            }
        }
        for(int i = List.size()-1; i >= 0; i --){
            System.out.print(List.get(i)+" ");
        }
    }
}
