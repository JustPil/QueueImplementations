package queues;

import exceptions.EmptyQueueDequeueException;
import exceptions.FullQueueEnqueueException;

public class ArrayQueue<T> implements QueueInterface<T> {
    private T[] items;
    private int rear = 0;
    private int front = 0;
    private int totalItems = 0;
    private int capacity;
    private int DEFAULT_CAPACITY = 25;

    /**
     * Constructor for a Queue with default capacity.
     */
    public ArrayQueue() {
        items = (T[]) new Object[capacity = DEFAULT_CAPACITY];
    }

    /**
     * Constructor for a Queue with user-specified capacity.
     * @param c The capacity for the Queue.
     */
    public ArrayQueue(int c) {
        items = (T[]) new Object[capacity = c < 1 || c > Integer.MAX_VALUE ? DEFAULT_CAPACITY : c];
    }

    /**
     * enqueue Adds a value to the rear of the Queue.
     * @param input The value to be placed in the Queue.
     * @throws FullQueueEnqueueException If enqueue is attempted while the Queue is full.
     */
    public void enqueue(T input) throws FullQueueEnqueueException {
        if(isFull()) {
            throw new FullQueueEnqueueException("enqueue attmpted on a ful queue.");
        }
        rear = (rear + 1) % items.length;
        items[rear] = input;
        totalItems++;
    }

    /**
     * dequeue Removes a value from the front of the Queue.
     * @return The value of the removed index.
     * @throws EmptyQueueDequeueException If dequeue is attempted while the Queue is empty.
     */
    public T dequeue() throws EmptyQueueDequeueException {
        if(isEmpty()) {
            throw new EmptyQueueDequeueException("dequeue attempted on an empty queue.");
        }
        T temp = items[front];
        items[front] = null;
        front = ++front % items.length;
        totalItems--;
        return temp;
    }

    /**
     * isFull Checks if the Queue is full.
     * @return False because a Queue cannot be full.
     */
    public boolean isFull() {
        return totalItems == items.length;
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
        return rear;
    }

    /**
     * toString Returns a String representation of the Queue elements.
     * @return A String representation of the Queue elements.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i = front + 1; i < rear; i++) {
            sb.append(items[i]).append(" ");
        }
        return sb.append(items[rear]).append("]").toString();
    }
}
