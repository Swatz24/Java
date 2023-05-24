import java.util.LinkedList;
import java.util.Queue;

// Define a SharedBuffer class to handle the shared buffer between producer and consumer threads.
public class SharedBuffer {
        private Queue<Integer> buffer;
        private int maxSize;


    /*  a. Store and manage the buffer.
      b. Limit the maximum buffer size. */
    public SharedBuffer(int maxSize) {
        this.buffer = new LinkedList<>();
        this.maxSize = maxSize;
    }

        // Provide synchronized methods for adding elements to and removing elements from the buffer.
        // Produce method to add items to the buffer and wait for consumer to take the items if the buffer is full.
        // Use wait() and notifyAll() to coordinate access to the buffer.
        public synchronized void produce(int item){
            while (buffer.size() == maxSize){
                try{
                    wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            buffer.add(item);
            System.out.println("Number added to the Shared buffer: " + item);
            notifyAll();
        }

        public synchronized int consume(){
            while (buffer.isEmpty()){
                try{
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            // poll() removes the item from the head of the queue.
            int item = buffer.poll();
            System.out.println("Number consumed from the buffer: " + item);
            notifyAll();
            return item;
        }
}
