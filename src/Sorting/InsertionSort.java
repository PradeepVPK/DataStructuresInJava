package Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int array_size = in.nextInt();
        int[] array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            System.out.print("\nEnter value: " );
            array[i] = in.nextInt();
        }

        insertionSort(array);
        for (int i:array){
            System.out.println(i + " ");
        }
    }

    private static void insertionSort(int[] array) {

        for (int i=1;i<array.length;i++){
          int temp=i;
          int j=i-1;
           while(j>=0 && array[j]>temp){
               array[j+1]=array[j];
               j--;
           }
           array[j+1]=temp;
        }
    }
}
