public class Producer implements Runnable{
    private SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    // run() method starts executing when the Thread is started using start().
    @Override
    public void run() {
        for(int i =0; i <=7 ; i++){
            int number = (int) (Math.random() *100);
            sharedBuffer.produce(number);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
