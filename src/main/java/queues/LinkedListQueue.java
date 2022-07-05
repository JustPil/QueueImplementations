package queues;

import exceptions.EmptyQueueDequeueException;
import nodes.Node;

public class LinkedListQueue<T> implements QueueInterface<T> {
    private Node<T> front = null;
    private Node<T> rear = null;
    private int nodeCount = 0;

    /**
     * enqueue Inserts  new node at the rear of the Queue.
     * @param data The data for the new node to hold.
     */
    public void enqueue(T data) {
        Node<T> insert = new Node<>(data);
        if(nodeCount == 0) {
            front = rear = insert;
        } else {
            rear.setNext(insert);
            rear = insert;
        }
        nodeCount++;
    }

    /**
     * dequeue Removes a node from the front of the Queue.
     * @return The data held by the removed node.
     */
    public T dequeue() {
        if(isEmpty()) {
            throw new EmptyQueueDequeueException("dequeue attempted on an empty queue.");
        }
        T temp = front.getData();
        if(nodeCount == 1) {
            front = rear = null;
        } else {
            front = front.getNext();
        }
        nodeCount--;
        return temp;
    }

    /**
     * isEmpty Checks if the Deque is empty..
     * @return True if the Deque is empty, false otherwise.
     */
    public boolean isEmpty() {
        return nodeCount == 0;
    }

    /**
     * isFull Checks if the Deque is full.
     * @return False, as a Deque implemented with a linked list cannot be full.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * size Returns the size of the Deque.
     * @return The amount of nodes in the Deque.
     */
    public int size() {
        return nodeCount;
    }

    /**
     * toString Returns a String representation of the Queue elements.
     * @return A String representation of the Queue elements.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> parser = front;
        while(parser != null) {
            sb.append(parser.getData());
            sb.append(parser.getNext() != null ? " " : "");
            parser = parser.getNext();
        }
        return sb.append("]").toString();
    }
}
