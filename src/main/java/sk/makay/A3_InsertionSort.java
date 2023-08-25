package sk.makay;

import java.util.Arrays;

public class A3_InsertionSort {

    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,55,1,-22,2424,89,2,-24,424};

        for (int firstUnorderedIndex = 1; firstUnorderedIndex < intArray.length; firstUnorderedIndex++){
            int tmp = intArray[firstUnorderedIndex];

            int i;
            for (i = firstUnorderedIndex; i > 0 && intArray[i-1] > tmp; i--){
                intArray[i] =  intArray[i-1];
            }

            intArray[i] = tmp;

        }

        System.out.println(Arrays.toString(intArray));

    }
}
