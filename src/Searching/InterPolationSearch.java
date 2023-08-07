package Searching;

import java.util.Scanner;

public class InterPolationSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int array_size = in.nextInt();
        int[] array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            array[i] = i;
        }
        long start, end;
        start = System.nanoTime();
        end = System.nanoTime();
        System.out.println(end - start + "ns");
        int index = interpolationsearch(array, 89);
        if (index != -1) {
            System.out.println("Element found at position" + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationsearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("probe: " + probe);
            if (array[probe] == value) return probe;
            else if (array[probe] < value) {
                low = probe + 1;
            }
            else{
                high = probe -1;
            }

        }

        return -1;
    }
}

