package quickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] num = {10,2,5,3,8,5,9,1};

        System.out.println("Array before quickSort: "+ Arrays.toString(num));
        QuickSort(num, 0, num.length-1);

        System.out.println("Array after quickSort: "+ Arrays.toString(num));
    }

    public static void QuickSort(int[] array, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex-lowIndex)+ lowIndex;
        int pivot = array[pivotIndex];
        Swap(array, pivotIndex, highIndex);

        int leftPointer = Partition(array, lowIndex, highIndex, pivot);

        QuickSort(array, lowIndex, leftPointer-1);
        QuickSort(array, leftPointer+1, highIndex);

    }
    public static int Partition(int[] array, int lowIndex, int highIndex, int pivot ) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){
            while (array[leftPointer] <= pivot && leftPointer< rightPointer){
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            Swap(array, leftPointer, rightPointer);
        }
        Swap(array, leftPointer, highIndex);

        return leftPointer;
    }



    public static void Swap(int[] num, int i , int j) {
        int temp = num[j];
        num[j] = num[i];
        num[i] = temp;
    }


}
