package sk.makay;

import java.util.Arrays;
import static sk.makay.A1_BubbleSort1.swap;

public class A2_SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22,2424,89,2,-24,424};
        System.out.println(Arrays.toString(intArray));

        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray,largest,lastUnsortedIndex);
        }

        System.out.println(Arrays.toString(intArray));
    }


}
