package Array;

public class Quiz {

    public int[] middleWay(int[] a, int[] b) {
        /* Since the length of a and b are three , the center value should be a[1] and b[1].
        Save the middle value of a and b in temp int variables.
        Create a new array and put the values stores in i & j in the array and return it.
         */

        int i = a[1];
        int j = b[1];
        int[] c = {i,j};
       // System.out.println(c);
        return c;

    }

    /*

    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

     unlucky1([1, 3, 4, 5]) → true
     unlucky1([2, 1, 3, 4, 5]) → true
     unlucky1([1, 1, 1]) → false
     */
    public boolean unlucky1(int[] nums) {
        // Set the key as 1 and do a linear search in the array to find the key.
        int key =1;
        for(int i=0;i<nums.length;i++){
            // Key position should be either first 2 or last 2 positions in the array.
            if(nums[i] == key && (i<=1 || i> nums.length -3)){
                // Once key is found, check if there is an element after that, if yes, check if it is 3. if yes, return true => unlucky
                if(i+1 < nums.length && nums[i+1] == 3  ){

                    return true;
                }
            }

        }
        // Else return false
        return false;
    }





}
