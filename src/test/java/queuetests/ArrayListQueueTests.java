package queuetests;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import queues.ArrayListQueue;

public class ArrayListQueueTests {
    private final ArrayListQueue<Integer> queue = new ArrayListQueue<>();

    @Test
    public void enqueueAnElement() {
        queue.enqueue(1);
        var result = queue.size();
        Assertions.assertEquals(1, result);
    }
    @Test
    public void dequeueAnElement() {
        queue.enqueue(1);
        queue.dequeue();
        var result = queue.isEmpty();
        Assertions.assertTrue(result);
    }
    @Test
    public void enqueueOnFullQueue() {
        var result = queue.isFull();
        Assertions.assertFalse(result);
    }
    @Test
    public void dequeueOnEmptyQueue() {
        Assertions.assertThrows(RuntimeException.class, queue::dequeue);
    }
    @Test
    public void getElementsAsString() {
        for(int i = 0; i < 3; i++) {
            queue.enqueue(i + 1);
        }
        var result = queue.toString();
        Assertions.assertEquals("[1 2 3]", result);
    }
    @Test
    public void getElementsAsStringAfterDequeues() {
        for(int i = 0; i < 10; i++) {
            queue.enqueue(i + 1);
        }
        for(int i = 0; i < 5; i++) {
            queue.dequeue();
        }
        var result = queue.toString();
        Assertions.assertEquals("[6 7 8 9 10]", result);
    }
}
