package Recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println( recursion_fact(5));
        iteration_fact(5);
    }

    private static void iteration_fact(int num) {
        int fact=1;
        while (num!=0){
            fact=fact*num;
            num--;
        }
        System.out.println(fact);
    }

    private static int recursion_fact(int num) {
        if (num<2) return 1 ;
        return num*recursion_fact(num-1);

    }

}
