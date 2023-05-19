package Logic2;



public class Main {
    public static void main(String[] args) {
        Quiz q= new Quiz();

        /*
           We want make a package of goal kilos of chocolate.
           We have small bars (1 kilo each) and big bars (5 kilos each).
           Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
                makeChocolate(4, 1, 10) → -1
                makeChocolate(4, 1, 7) → 2
         */
        System.out.println(q.makeChocolate(5,1,9));
        System.out.println(q.makeChocolate(4,1,10));
        System.out.println(q.makeChocolate(4,1,7));
    }
}
