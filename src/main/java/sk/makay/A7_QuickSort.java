package sk.makay;

import java.util.Arrays;

public class A7_QuickSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22, 2424, 89, 2, -24, 424};
        System.out.println(Arrays.toString(intArray));

        quickSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }


    public static void quickSort(int[] input, int start, int end) {
        // one element array  -> do nothing
        if (end - start < 2) {
            return;
        }

        // otherwise find pivot
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }


    public static int partition(int[] input, int start, int end) {
        // uses the first element of the input array as pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;

    }

}
