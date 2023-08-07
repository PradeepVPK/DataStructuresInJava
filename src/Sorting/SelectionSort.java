package Sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int array_size = in.nextInt();
        int[] array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            System.out.print("\nEnter next element : ");
            array[i] = in.nextInt();
        }

        selectionSort(array);
        for (int i:array){
            System.out.println(i + " ");
        }
    }

    private static void selectionSort(int[] array) {

        for (int i=0;i<array.length;i++){
            int min = i;
            for (int j=i+1;j<array.length;j++){
                if (array[min]>array[j]){
                    min=j;
                }
            }
            int temp = array[i];
            array[i]=array[min];
            array[min]= temp;
        }
    }
}
