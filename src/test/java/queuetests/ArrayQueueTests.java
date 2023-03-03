package queuetests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import queues.ArrayQueue;

public class ArrayQueueTests {
    private final ArrayQueue<Integer> queue = new ArrayQueue<>();

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
        for(int i = 0; i < 25; i++) {
            queue.enqueue(i);
        }
        var result = queue.isFull();
        Assertions.assertTrue(result);
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
