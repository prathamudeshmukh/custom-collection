package org.custom.collection;

import org.custom.collection.exceptions.QueueOutOfBoundsException;

public class SimpleQueue<T> implements Queue<T>
{
    private Object[] queue;
    private int tail = 0;
    public SimpleQueue(int size) {
        queue = new Object[size];
    }

    public void enqueue(Object element) throws QueueOutOfBoundsException
    {
        if(tail >= this.queue.length) {
            throw new QueueOutOfBoundsException("Cannot add more elements, the queue is exhausted");
        }
        queue[tail] = element;
        tail += 1;
    }

    public T dequeue()
    {
        T returnElement = (T) queue[0];
        System.arraycopy(queue, 1, queue, 0, queue.length - 1);
        return returnElement;
    }

    public T peek()
    {
        return (T) queue[0];
    }

    public int size()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return false;
    }
}
