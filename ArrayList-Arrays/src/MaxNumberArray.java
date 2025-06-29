public class MaxNumberArray {
    int[] a = new int[5];

   public static void main(String[] args) {

       int[][] c = new int[3][3];

       System.out.println(c.length);

        int k =1;
       for (int i = 0; i < c.length; i++) {
           for (int j = 0; j < 3; j++) {
               c[i][j] = k;
               k++;
           }
       }

       int min_num = c[0][0];
       for (int i = 0; i < c.length; i++) {
           for (int j = 0; j < 3; j++) {
              int x = c[i][j];
               System.out.print(c[i][j] + " ");
               if(x>min_num){
                   min_num = x;
               }
                          }
           System.out.println();
       }
       System.out.println(min_num);
   }

}
