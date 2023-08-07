package Recursion;

public class Exponent {
    public static void main(String[] args) {
        System.out.println( iteration_expo(2,8));
        System.out.println(    recursion_expo(2,8));
    }

    private static int iteration_expo(int base, int exponent) {
        int power=1;
     if (exponent<1)return 1;
     else{
         while (exponent>0){
             power=power*base;
             exponent--;
         }
     }
         return power;
    }

    private static int recursion_expo(int base, int exponent) {
        if (exponent<1) return 1;
        return base*recursion_expo(base,exponent-1);
    }
}
