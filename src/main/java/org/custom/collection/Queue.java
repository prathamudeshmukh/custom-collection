package org.custom.collection;

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
    void enqueue(T element);

    /**
     * Remove and returns the first element from the queue
     */
    T dequeue();

    /**
     * Return the first element in queue
     *
     * @return T element
     */
    T peek();

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
