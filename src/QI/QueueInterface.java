package QI;

public interface QueueInterface<T> {
    void enqueue(T element) throws FullQueueEnqueueException;
    T dequeue() throws EmptyQueueDequeueException;
    boolean isFull();
    boolean isEmpty();
    int size();
}
