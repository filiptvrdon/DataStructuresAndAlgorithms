package sk.makay;

public class A1_BubbleSort2 {

    public static void main(String[] args) {
        int[] x = {20,35,-15,7,55,1,-22,2424,89,2,-24,424};
        sort(x);
    }
    public static int[] sort(int[] array) {
        for (int lastUnorderedIndex = array.length - 1; lastUnorderedIndex > 0; lastUnorderedIndex--){
            for (int i = 0; i < lastUnorderedIndex; i++){
                if (array[i] > array[i+1]){
                    swap(array, i, i+1);
                }
            }
        }

        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
