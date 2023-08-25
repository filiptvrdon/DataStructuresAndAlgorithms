package sk.makay;
/*
makes assumptions about the data
data must have the same radix and width
    radix - the number of options each element can take
    widht - the number of places (digits/characters) each element takes
sort based on each individual digit/char
starts at the rightmost position
must use a stable algorithm at each stage

MUST USE STABLE ALGORITHM AT EACH STAGE!

first, we sort based on the 1's position
1330, 8792, 1594, 4725, 4586, 5729

then we sort based on the 10's position
4725, 5729, 1330, 4586, 8792, 1594

then we sort based on the 100's position
1330, 4586, 1594, 4725, 5829, 8792

then we sort based on the 1000's position
1330, 1594, 4586 4725, 5729, 8792
*/

import java.util.Arrays;

public class A9_RadixSort {

    public static void main(String[] args) {
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};
        System.out.println(Arrays.toString(intArray));

        radixSort(intArray, 10, 4);
        System.out.println(Arrays.toString(intArray));


    }

    private static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        // adjust the countArray to display how many elements at a given position have the given value or less
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }


    private static int getDigit(int position, int value, int radix) {
        // returns the digit at the given position //
        return (value / (int) Math.pow(10, position)) % radix;
    }


}
