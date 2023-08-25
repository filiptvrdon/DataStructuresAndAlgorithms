package sk.makay;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Sort1BubbleSort2Test {

    @Test
    public void testSwap(){
        int[] array = {1,2,3};
        A1_BubbleSort2.swap(array, 1, 2);
        System.out.println(Arrays.toString(array));
        assertEquals(1, array[0]);
        assertEquals(3, array[1]);
        assertEquals(2, array[2]);
    }

    @Test
    public void testSort(){
        int[] initial = {20,35,-15,7,55,1,-22,2424,89,2,-24,424};
        int[] expected ={-24, -22, -15, 1, 2, 7, 20, 35, 55, 89, 424, 2424};

        A1_BubbleSort2.sort(initial);

        for (int i = 0; i < initial.length; i++){
            assertEquals(expected[i], initial[i]);
        }
    }



}