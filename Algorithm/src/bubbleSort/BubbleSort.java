package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int[] array) {

        if(array.length==0){
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int n = array.length;
        boolean swapped;
        System.out.println("Unsorted array " + Arrays.toString(array));

        for(int i =0; i<array.length-1; i++){
            swapped = false;
            for (int j=0; j<n-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                System.out.println("Sorted Array: " + Arrays.toString(array));
                break;
            }
        }


    }

      public static void main(String[] args) {
        int[] array = {3,5,1,12,9,10};
        BubbleSort(array);
        int[] array1 = {10, 0, -2, 25, 100};
        BubbleSort(array1);

    }
}



