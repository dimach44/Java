package circqueue1;

import java.util.NoSuchElementException;

public class CQ<T> 
{
    private Object[] buffer;
    private int currentSize;
    private int head;
    private int tail;
    
    public CQ()
    {
        final int INITIAL_SIZE = 10;
        buffer = new Object[INITIAL_SIZE];
        currentSize = 0;
        head = 0;
        tail = 0;
    }
    
    public boolean empty()
    {
        return currentSize == 0;
    }
    
    public void add(Object newElement)
    {
        growBuffer();
        currentSize ++;
        buffer[tail] = newElement;
        tail = (tail + 1) % buffer.length;
    }
    
    public Object remove()
    {
        if (currentSize == 0)
        {
            throw new NoSuchElementException();
        }
        Object removed = buffer[head];
        head = (head + 1) % buffer.length;
        currentSize --;
        return removed;
    }
    
    private void growBuffer()
    {
        if (currentSize == buffer.length)
        {
            Object[] newBuffer = new Object[2 * buffer.length];
            for (int i = 0; i < buffer.length; i++)
            {
                newBuffer[i] = buffer[(head + i) % buffer.length];
            }
            buffer = newBuffer;
            head = 0;
            tail = currentSize;
        }
    }
    
    public void Display()
    {
        for (Object o : buffer )
        {
            if (o != null)
            {
                System.out.println(o.toString());
            }
        }
    }
    
    public void Size()
    {
        System.out.println("Queue Size: " + currentSize);
    }
    
    public void BufferSize()
    {
        System.out.println("Buffer Length: " + buffer.length);
    }
}
