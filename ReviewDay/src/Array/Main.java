package Array;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quiz q = new Quiz();

        System.out.println(Arrays.toString(q.middleWay(new int[]{2, 3, 4}, new int[]{1,1,1})));
        System.out.println(Arrays.toString(q.middleWay(new int[]{1, 13, 45}, new int[]{2,21,51})));
        System.out.println(Arrays.toString(q.middleWay(new int[]{7, 5, 6}, new int[]{100,30,10})));

        System.out.println();

        System.out.println("Passing the array [1,1,3,3,2,5,1] " + q.unlucky1(new int[]{1, 1, 3, 3, 2, 5, 1}) );
        System.out.println("Passing the array [1,1,0,3,2,5,1,3] " + q.unlucky1(new int[]{1, 1, 0, 3, 2, 5, 1,3}) );
        System.out.println("Passing the array [1,1,10,13,2,5,1] " + q.unlucky1(new int[]{1, 1, 10,13, 3, 2, 5, 1}) );
        System.out.println("Passing the array [1,1,1] " + q.unlucky1(new int[]{1, 1, 1}) );
    }
}
