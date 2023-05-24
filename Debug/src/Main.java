// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Test your method with an array containing the numbers 1, 2, 3, 4, 5. Your method should return 3.0.
        int[] numbers = {1,2,3,4,5};

        Average avg = new Average();

        double average = avg.calculateAverage(numbers);
        System.out.println("Average of array of integers: " + average);

        try{
            // Null pointer exception here because the array value is not passed or assigned through constructor, but we are trying to print the array using print() function.
            // which will throw a NullPointerException. using try, catch block to catch the exception when it occurs.
            // By adding breakpoints and stepping into the function, we can see that the the print() methods tries to print the array which is not assigned any value yet.
            // So to catch the exception, we throw the exception in the method and catch it here.
            avg.print();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        // Index out of bound exception because we are trying to print numbers array with the index 7,
        // since the array length is 5, we get this exception here
        try {
            System.out.println(numbers[7]);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        // Logic error
        // By adding debug and stepping into the method we can see the how the array starts looping from the index 1 instead of 0.
        // Once we see what is going wrong in the function, we can rectify the error .
        System.out.println("Average of numbers in the array: (Logic error: number[0] is excluded while calculating sum )");
        System.out.println(avg.erroredAverage(numbers));
    }

    public static class Average{
        private int[] numbers;

        public Average() {

        }

        //  calculates the average of an array of integers.
        //  This method should take an array of integers as input and return a double as output.
        public double calculateAverage(int[] arr){
            // To avoid null pointer exception
            if(arr.length == 0){
                return 0.0;
            }
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                if(i >= arr.length ){
                    throw new ArrayIndexOutOfBoundsException("Array out of bound exception occurred.");
                }
                sum+= arr[i];
            }
            return (double) sum /arr.length;

        }

        public void print(){
            for (int number : numbers) {
                if (numbers.length == 0) {
                    throw new NullPointerException("Array is empty");
                }
                System.out.println(number + "\n");
            }
        }

        public double erroredAverage(int[] arr){
            double sum=0;
            // Logic error here, while calculating sum, we have to start from arr index 0 , but here it we start from array index 1. we can find the problem
            // by printing the arr[i] inside the loop to see what we are missing.

            for(int i=1; i< arr.length; i++){
                System.out.println(arr[i]); // Now you will see that arr[0] is missed while calculating sum.
                sum+=arr[i];
            }
            return  sum/arr.length;
        }

    }
}