package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int array_size = in.nextInt();
        int[] array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            System.out.print("\nEnter value: " );
            array[i] = in.nextInt();
        }

        mergeSort(array);
        for (int i:array){
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] array) {

        int length=array.length;
        if (length<=1)return;

        int middle=length/2;
        int[] leftArray=new int[middle];
        int[] rightArray=new int[length-middle];

        int i=0,j=0;

        for (;i<length;i++){
            if (i<middle){
                leftArray[i]=array[i];
            }
            else {
                rightArray[j]=array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftsize = array.length/2;
        int righsize = array.length-leftsize;
        int i=0,l=0,r=0;

        while (l<leftsize && r<righsize){
            if (leftArray[l]<rightArray[r]){
                array[i]=leftArray[l];
                i++;
                l++;
            }
            else {
                array[i]=rightArray[r];
                i++;
                r++;
            }
        }
        while(l<leftsize){
            array[i]=leftArray[l];
            i++;
            l++;
        }
        while (r<righsize){
            array[i]=rightArray[r];
            i++;
            r++;
        }
    }
}
