package QI;

public class CircularLinkedListQueue<T> implements DequeInterface<T>
{
    private Node<T> front;
    private Node<T> rear;
    private int nodeCount = 0;

    /**
     * Constructor sets the front and rear nodes to null.
     */
    public CircularLinkedListQueue()
    {
        front = rear = null;
    }

    /**
     * enqueueFront Inserts a new node at the front of the linked list.
     * @param data The data for the new node to hold.
     */
    public void enqueueFront(T data)
    {
        Node<T> insert = new Node<>(data);
        if(nodeCount == 0)
        {
            front = rear = insert;
            nodeCount++;
        }
        else
        {
            insert.setNext(front);
            front = insert;
            rear.setNext(front);
            nodeCount++;
        }
    }

    /**
     * enqueueRear Inserts a new node at the rear of the linked list.
     * @param data The data for the new node to hold.
     */
    public void enqueueRear(T data)
    {
        Node<T> insert = new Node<>(data);
        if(nodeCount == 0)
        {
            front = rear = insert;
            nodeCount++;
        }
        else
        {
            rear.setNext(insert);
            rear = insert;
            rear.setNext(front);
            nodeCount++;
        }
    }

    /**
     * dequeueFront Removes a node from the front of the linked list.
     * @return The data held by the removed node.
     */
    public T dequeueFront()
    {
        if(isEmpty())
            throw new EmptyQueueDequeueException("dequeue attempted on an empty queue.");
        T removedNode = front.getData();
        if(nodeCount == 1)
        {
            front = rear = null;
            nodeCount--;
        }
        else
        {
            front = front.getNext();
            rear.setNext(front);
            nodeCount--;
        }
        return removedNode;
    }

    /**
     * dequeueRear Removes a node from the rear of the linked list.
     * @return The data held by the removed node.
     */
    public T dequeueRear()
    {
        if(isEmpty())
            throw new EmptyQueueDequeueException("dequeue attempted on an empty queue.");
        T removedNode = rear.getData();
        if(nodeCount == 1)
        {
            front = rear = null;
            nodeCount--;
        }
        else
        {
            Node<T> parser = front;
            while(true)
            {
                if(parser.getNext().getNext() == front)
                {
                    parser.setNext(front);
                    rear = parser;
                    nodeCount--;
                    break;
                }
                parser = parser.getNext();
            }
        }
        return removedNode;
    }

    /**
     * isEmpty Checks if there are no nodes in the linked list.
     * @return True if there are no nodes, false otherwise.
     */
    public boolean isEmpty()
    {
        return nodeCount == 0;
    }

    /**
     * isFull Checks if the linked list is full.
     * @return False because a linked list cannot be full.
     */
    public boolean isFull()
    {
        return false;
    }

    /**
     * size Returns the size of the linked list.
     * @return The amount of nodes in the linked list.
     */
    public int size()
    {
        return nodeCount;
    }

    /**
     * remove Removes a set amount of nodes from the front of the linked list.
     * @param count The amount of nodes to be removed.
     */
    public void remove(int count)
    {
        if(count > nodeCount)
            throw new EmptyQueueDequeueException("Not enough elements for removal.");
        for(int i = 0; i < count; i++)
        {
            front = front.getNext();
            nodeCount--;
            if(nodeCount == 0)
            {
                front = rear = null;
            }
        }
    }

    /**
     * swapStart Swaps the first two nodes at the front of the linked list.
     * @return True if the swap was successful, false otherwise.
     */
    public boolean swapStart()
    {
        if(nodeCount < 2)
            return false;
        else if(nodeCount == 2)
        {
            rear = front;
            front = front.getNext();
        }
        else
        {
            Node<T> temp1 = front.getNext();
            Node<T> temp2 = temp1.getNext();
            temp1.setNext(front);
            front.setNext(temp2);
            front = temp1;
        }
        return true;
    }

    /**
     * swapEnds Swqaps the last two nodes at the rear of the linked list.
     * @return True if the swap was successful, false otherwise.
     */
    public boolean swapEnds()
    {
        if(nodeCount < 2)
            return false;
        else if(nodeCount == 2)
        {
            rear = front;
            front = rear.getNext();
        }
        else
        {
            Node<T> parser = front;
            while(true)
            {
                if(parser.getNext().getNext().getNext() == front.getNext())
                {
                    Node<T> temp = parser.getNext();
                    parser.setNext(rear);
                    rear.setNext(temp);
                    temp.setNext(front);
                    rear = temp;
                    break;
                }
                parser = parser.getNext();
            }
        }
        return true;
    }

    /**
     * toString Outputs information about the current contents of the linked list.
     * @return A string containing information about the current contents of the linked list.
     */
    public String toString()
    {
        String str = "";
        if(front == null)
        {
            str += "Front: null\nRear: null";
        }
        else
        {
            str += "Front: " + front.getData() + "\nRear: " + rear.getData();
        }
        return str + "\nSize: " + nodeCount + "\nEmpty: " + isEmpty() + "\nFull: " + isFull();
    }
}
