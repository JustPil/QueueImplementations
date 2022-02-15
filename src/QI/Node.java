package QI;

public class Node<T> {
    private T data;
    private Node<T> next;

    /**
     * Constructor sets a node's data to the value passed in, and the next node to null.
     * @param t The value to be held by the node.
     */
    public Node(T t) {
        data = t;
        next = null;
    }

    /**
     * setData Sets the node's data to the value passed in.
     * @param t The data to be held by the node.
     */
    public void setData(T t) {
        data = t;
    }

    /**
     * getData Returns the data held by the node.
     * @return The data held by the node.
     */
    public T getData() {
        return data;
    }

    /**
     * setNext Sets the Node's next reference..
     * @param n The next node reference.
     */
    public void setNext(Node<T> n) {
        next = n;
    }

    /**
     * getNext Returns the next node reference.
     * @return The next node reference.
     */
    public Node<T> getNext() {
        return next;
    }
}
