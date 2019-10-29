package org.custom.collection;

import org.custom.collection.exceptions.QueueOutOfBoundsException;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;


public class SimpleQueueTest
{
    @DisplayName("Test enqueue() adds element to end of the queue")
    @Test
    public void enqueue_addsElementToEndOfQueue() throws QueueOutOfBoundsException
    {
        SimpleQueue queue = new SimpleQueue(4);
        queue.enqueue(1);
        assertEquals(1, queue.peek(), "added element does not match");
    }

    @DisplayName("Test peek() returns element at first in the queue")
    @Test
    public void peek_returnsElementAtFirst() throws QueueOutOfBoundsException
    {
        SimpleQueue queue = new SimpleQueue(4);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(1);
        assertEquals(5, queue.peek(), "First element does not match");
    }

    @DisplayName("Test dequeue() removes and returns the first element from the queue")
    @Test
    public void dequeue_removesAndReturnsFirstElementFromQueue_ElementsPresent() throws QueueOutOfBoundsException
    {
        SimpleQueue<Integer> queue = new SimpleQueue<Integer>(4);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(1);
        Integer first = queue.dequeue();
        assertEquals(Integer.valueOf(5), first, "returned the first element");
    }

    @DisplayName("Test enqueue() throws exception if it exceeds the size")
    @Test
    public void enqueue_throwsException_IfExceedsSize() throws QueueOutOfBoundsException
    {
        SimpleQueue<Integer> queue = new SimpleQueue<Integer>(1);
        queue.enqueue(1);
        assertThrows(QueueOutOfBoundsException.class, () -> {
            queue.enqueue(5);
        });
    }

    @DisplayName("Test dequeue() throws exception if the queue is empty")
    @Test
    public void dequeue_throwsException_IfQueueEmpty() throws QueueOutOfBoundsException
    {
        SimpleQueue<Integer> queue = new SimpleQueue<Integer>(1);
        queue.enqueue(1);
        queue.dequeue();
        assertThrows(QueueOutOfBoundsException.class, () -> {
            queue.dequeue();
        });
    }

    @DisplayName("Test size() returns the total number of elements in the queue")
    @Test
    public void size_totalNumberOfElements() throws QueueOutOfBoundsException
    {
        SimpleQueue<Integer> queue = new SimpleQueue<Integer>(10);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        assertEquals(3, queue.size(), "Total number of elements does not match");
    }

    @DisplayName("Test size() returns 0 if no elements found")
    @Test
    public void size_zero_noElementsFound() throws QueueOutOfBoundsException
    {
        SimpleQueue<Integer> queue = new SimpleQueue<Integer>(10);
        assertEquals(0, queue.size(), "Total number of elements does not match");
    }
}
