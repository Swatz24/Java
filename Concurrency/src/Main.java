// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    int max = 2;

    // run() method starts executing when the Thread is started using start().
    SharedBuffer sharedBuffer = new SharedBuffer(max);

    //  Instantiate the Producer and Consumer classes, passing the SharedBuffer instance to both.
    Producer producer = new Producer(sharedBuffer);
    Consumer consumer = new Consumer(sharedBuffer);

    // Create two Thread objects, one for the producer and one for the consumer, using the instances created in the previous step.

        Thread produceThread = new Thread(producer);
        Thread consumeThread = new Thread(consumer);

    //  Start both threads.

    produceThread.start();
    consumeThread.start();



    }
}