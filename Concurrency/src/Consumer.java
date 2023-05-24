/* Implement a Consumer class that represents the consumer thread. This class should:
a. Accept a reference to the SharedBuffer object.
b. Retrieve numbers from the shared buffer using the appropriate synchronized method.
c. Calculate the sum of the retrieved numbers.
 */
public class Consumer implements Runnable {

    private SharedBuffer sharedBuffer;
    private int sum ;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
        this.sum = 0;
    }

    @Override
    public void run() {
        // run() method starts executing when the Thread is started using start().
        // // i<=7 , so it consumes 8 numbers
        for(int i =0; i <=7 ; i++){
            int num = sharedBuffer.consume();
            sum += num;
            try{
                Thread.sleep(1200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }}
        System.out.println("Total Sum of the numbers consumed: " + sum);

        }

    }

