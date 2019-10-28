package org.custom.collection;

public class SimpleQueue<T> implements Queue<T>
{
    private Object[] queue;
    private int tail = 0;

    public SimpleQueue(int size) {
        queue = new Object[size];
    }

    public void enqueue(Object element)
    {
        queue[tail] = element;
        tail += 1;
    }

    public T dequeue()
    {
        T returnElement = (T) queue[0];
        System.arraycopy(queue, 1,queue, 0, queue.length - 1);
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
