import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int minimum(int[] numbers) {

        if(numbers.length==0){
            throw new IllegalArgumentException("Array must not be empty");
        }
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length;i++){
            if(numbers[i]< minValue){
                minValue = numbers[i];
            }
        }

       return minValue;
    }

    public static int SmallestIndex(int[] num){
        if(num.length== 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int minIndex = 0;
        for (int i =1; i<num.length;i++){
            if(num[i] < num[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int SmallestFromIndex(int[] num , int index){
        if(num.length== 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int minIndex = index;
        for(int i = index+1; i < num.length; i++){
            if(num[i] < num[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        System.out.println("Array before swapping: " + Arrays.toString(array));
      int temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
        System.out.println("Swapped numbers in the array: " + Arrays.toString(array));
    }

    public static void sort(int[] array){

        for(int i =0; i < array.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j < array.length; j++){
                if(array[j]< array[minIndex]){
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }


    public static void main(String[] args) {
        int i = 5;
        int[] numArray = {2,4,3,1,7};
        int[] num1 ={-1, 0, 2, 1, 5};
        int minNum = minimum(numArray);
        System.out.println("Minimum value in the array: " + minNum);
        System.out.println("Index of the minimum value in the array is, " + SmallestIndex(numArray));
        System.out.println("Index of the minimum value in the array is after the index 1 is , " + SmallestFromIndex((numArray), 1));
        System.out.println("Index of the minimum value in the array is after the index 2 is , " + SmallestFromIndex((num1), 2));
        swap(numArray, 0,2);
        sort(numArray);

    }


}

