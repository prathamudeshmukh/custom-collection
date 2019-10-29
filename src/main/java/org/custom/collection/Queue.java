package org.custom.collection;

import org.custom.collection.exceptions.ElementNotFoundException;
import org.custom.collection.exceptions.QueueOutOfBoundsException;

/**
 * Queue interface contract for implementation
 *
 * @param <T>
 */
public interface Queue<T>
{
    /**
     * Add an element to the queue
     *
     * @param element
     */
    void enqueue(T element) throws QueueOutOfBoundsException;

    /**
     * Remove and returns the first element from the queue
     */
    T dequeue() throws QueueOutOfBoundsException;

    /**
     * Return the first element in queue
     *
     * @return T element
     */
    T peek() throws ElementNotFoundException;

    /**
     * Get the size of the queue
     *
     * @return int size
     */
    int size();

    /**
     * Return true if the queue is empty
     *
     * @return boolean
     */
    boolean isEmpty();
}
