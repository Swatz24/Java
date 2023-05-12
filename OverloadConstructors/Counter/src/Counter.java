public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public Counter(int startValue) {
        this.count = startValue;
    }

    public int value(){
        return count;
    }
    public void increase(){
        count++;
    }
    public void decrease(){

        count--;
    }

    public void increase(int increaseBy){
        if(increaseBy > 0) {
            count += increaseBy;
        }
    }
    public void decrease(int decreaseBy){
        if(decreaseBy > 0) {
            count -= decreaseBy;
        }
    }
}

