package QI;

public interface DequeInterface<T>
{
    void enqueueFront(T element);
    void enqueueRear(T element);
    T dequeueFront() throws EmptyQueueDequeueException;
    T dequeueRear() throws EmptyQueueDequeueException;
    boolean isFull();
    boolean isEmpty();
    int size();
}
