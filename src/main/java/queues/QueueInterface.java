package queues;

import exceptions.EmptyQueueDequeueException;
import exceptions.FullQueueEnqueueException;

public interface QueueInterface<T> {
    void enqueue(T element) throws FullQueueEnqueueException;
    T dequeue() throws EmptyQueueDequeueException;
    boolean isFull();
    boolean isEmpty();
    int size();
    String toString();
}
