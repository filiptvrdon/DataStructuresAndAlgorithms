package sk.makay;

import java.util.Arrays;

public class A4_ShellSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22, 2424, 89, 2, -24, 424};
        System.out.printf("Array length: %d%n", intArray.length);
        System.out.println(Arrays.toString(intArray));

        for (int gap = intArray.length / 2; gap > 0; gap /= 2){
            for (int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                int j = i;

                while(j >= gap && intArray[j - gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        System.out.println(Arrays.toString(intArray));

    }
}
