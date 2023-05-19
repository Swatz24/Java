package warmUp1;
public class Quiz1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // if it is not a weekday or if it is a vacation, SleepIn should be true;
        if(!weekday || vacation){
            return true;
        }
        // otherwise sleepIn should be false
        return false;

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    // if both Monkeys are smiling or not smiling, we are in trouble
        if(aSmile == bSmile){
            return true;
        }
        // else no trouble
        return false;
    }

    public int sumDouble(int a, int b) {
        // if both a and b are equal, double their sum
        if(a==b){
            return 2*(a+b);
        }
        // else, return the sum.
        return a+b;

    }

    public int diff21(int n) {
      //  if n < or = to 21, return the absolute difference
        if(n<=21){
            return 21-n;
        }
        // else return double the difference
        return 2*(n-21);

    }
}
