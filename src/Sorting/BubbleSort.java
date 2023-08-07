package Sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int array_size = in.nextInt();
        int[] array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            System.out.print("\nEnter next element : ");
            array[i] = in.nextInt();
        }

        bubbleSort(array);
        for (int i:array){
            System.out.println(i + " ");
        }
    }

    private static void bubbleSort(int[] array) {

        for (int i=0;i<array.length;i++){
            System.out.println("Loop No :  " + i);
            for (int j=0;j<array.length-1-i;j++){
              System.out.println("J :" +j+ "\t J+1 :"+(j+1));
              System.out.println("ARR OF J : "+ array[j]+"\t ARR of J+1 : "+array[j+1]);
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]= temp;
                }
            }
        }
    }
}
