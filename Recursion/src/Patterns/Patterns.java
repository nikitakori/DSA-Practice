package Patterns;

public class Patterns {
    public static void main(String[] args){
        int r = 6;
        triangleInverte(r,0);
        triangle(r,0);
    }
    //Inverted triangle
    static void triangleInverte(int r , int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            triangleInverte(r, c + 1);
        } else{
            System.out.println();
            triangleInverte(r - 1, 0);
        }
    }
    //Normal Triangle
    static void triangle(int r , int c){
        if(r == 0){
            return;
        }
        if(c < r){
            triangle(r, c + 1);
            System.out.print("*");
        } else{
            triangle(r - 1, 0);
            System.out.println();
        }
    }
}
