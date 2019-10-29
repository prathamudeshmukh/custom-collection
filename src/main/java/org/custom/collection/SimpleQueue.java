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

    public T dequeue() throws QueueOutOfBoundsException
    {
        if (tail == 0) {
            throw new QueueOutOfBoundsException("No more elements to dequeue");
        }
        T returnElement = (T) queue[0];
        System.arraycopy(queue, 1, queue, 0, queue.length - 1);
        tail --;
        return returnElement;
    }

    public T peek()
    {
        return (T) queue[0];
    }

    public int size()
    {
        return tail;
    }

    public boolean isEmpty()
    {
        return false;
    }
}
