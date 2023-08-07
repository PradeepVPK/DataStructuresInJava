package Searching;

import java.sql.Array;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int array_size= in.nextInt();
        int[] array = new int[array_size];

        for (int i=0;i<array_size;i++){
            array[i] =i;
        }
        long start,end;
        start=System.nanoTime();
        int index= linearsearch(array,898989);
        end=System.nanoTime();
        System.out.println(end-start + "ns");
        if (index!=-1){
            System.out.println("Element found at position" + index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int linearsearch(int[] array, int key) {


        for (int i=0;i<array.length;i++){
            if (array[i]==key){
                return i;
            }
        }

        return  -1;
    }

}
