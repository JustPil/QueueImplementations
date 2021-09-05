package QI;

public class Deque<T> implements DequeInterface<T>
{
    private final int DEFAULT = 100;
    private T[] items;
    private int totalItems;
    private int front = 0;
    private int rear;

    /**
     * Constructor instantiates the Deque's array to the default and sets the rear to the last index of the array.
     */
    public Deque()
    {
        items = (T[])new Object[DEFAULT];
        rear = DEFAULT - 1;
    }

    /**
     * Constructor instantiates the Deque's array to the size passed in and sets the rear to the last index of the
     * array.
     * @param arraySize The size of the array.
     */
    public Deque(int arraySize)
    {
        if(arraySize < 0)
            throw new EmptyQueueDequeueException("Array cannot have less than 0 indexes.");
        items = (T[])new Object[arraySize];
        rear = arraySize - 1;
    }

    /**
     * dequeueFront Removes and returns the front value in the array.
     * @return The value to be removed.
     */
    public T dequeueFront()
    {
        if(isEmpty())
            throw new EmptyQueueDequeueException("dequeue attempted on an empty queue.");
        T temp = items[0];
        T[] tempArray = (T[])new Object[items.length];
        for(int i = 0; i < totalItems - 1; i++)
        {
            tempArray[i] = items[i + 1];
        }
        items = tempArray;
        totalItems--;
        rear--;
        return temp;
    }

    /**
     * dequeueRear Removes and returns the rear value in the array.
     * @return The value to be removed.
     */
    public T dequeueRear()
    {
        if(isEmpty())
            throw new EmptyQueueDequeueException("dequeue attempted on an empty queue.");
        T temp = items[rear];
        rear = (rear - 1) % items.length;
        totalItems--;
        return temp;
    }

    /**
     * enqueueFront Adds a value to the front of the array.
     * @param input The value to be inserted.
     */
    public void enqueueFront(T input)
    {
        if(isFull())
            throw new FullQueueEnqueueException("enqueue attempted on a full queue.");
        T[] tempArray = (T[])new Object[items.length];
        tempArray[0] = input;
        for(int i = 0; i < totalItems; i++)
        {
            tempArray[i + 1] = items[i];
        }
        items = tempArray;
        totalItems++;
        rear++;
    }

    /**
     * enqueueRear Adds a value to the rear of the array.
     * @param input The value to be inserted.
     */
    public void enqueueRear(T input)
    {
        if(isFull())
            throw new FullQueueEnqueueException("enqueue attempted on a full queue.");
        rear = (rear + 1) % items.length;
        items[rear] = input;
        totalItems++;
    }

    /**
     * isEmpty Checks if there are no items in the deque.
     * @return True if there are no items in the deque, false otherwise.
     */
    public boolean isEmpty()
    {
        return totalItems == 0;
    }

    /**
     * Checks if there are maximum items in the deque.
     * @return True if there are maximum items in the deque, false otherwise.
     */
    public boolean isFull()
    {
        return totalItems == items.length;
    }

    /**
     * size Returns the total items in the deque.
     * @return The number of items in the deque.
     */
    public int size()
    {
        return totalItems;
    }
}
