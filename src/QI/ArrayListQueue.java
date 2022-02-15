package QI;

import java.util.ArrayList;

public class ArrayListQueue<T> implements QueueInterface<T> {
    private ArrayList<T> items = new ArrayList<>();
    private int totalItems = 0;
    private int front = 0;
    private int rear = 0;

    /**
     * enqueue Adds a value to the rear of the Queue.
     * @param input The value to be placed in the Queue.
     */
    public void enqueue(T input) {
        items.add(rear++, input);
        totalItems++;
    }

    /**
     * dequeue Removes a value from the front of the Queue.
     * @return The value of the removed index.
     * @throws EmptyQueueDequeueException If dequeue is attempted while the Queue is empty.
     */
    public T dequeue() throws EmptyQueueDequeueException {
        if(isEmpty()) {
            throw new EmptyQueueDequeueException("Dequeue attempted on an empty Queue.");
        }
        T temp = items.get(front);
        items.remove(front);
        rear--;
        totalItems--;
        return temp;
    }

    /**
     * isFull Checks if the Queue is full.
     * @return False because a Queue cannot be full.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * isEmpty Checks if there are no values in the Queue.
     * @return True if there are no values in the Queue, false otherwise.
     */
    public boolean isEmpty() {
        return totalItems == 0;
    }

    /**
     * size Returns the number of values in the Queue.
     * @return The count of values in the Queue.
     */
    public int size() {
        return totalItems;
    }
}
