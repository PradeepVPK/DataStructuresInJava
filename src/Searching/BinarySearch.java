package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int array_size = in.nextInt();
        int[] array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            array[i] = i;
        }
        long start,end;
        start=System.nanoTime();
        end=System.nanoTime();
        System.out.println(end-start + "ns");
        int index=binarysearch(array,898989);
        if (index!=-1){
            System.out.println("Element found at position" + index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int binarysearch(int[] array, int target) {

        int low=0;
        int high = array.length-1;
        while (low<=high){
            int middle = low +(high-low)/2;
            int value=array[middle];

            if (value > target) high=middle-1;
            else if (value<target) low=middle+1;
            else return  middle;

        }

        return -1;
    }
}
