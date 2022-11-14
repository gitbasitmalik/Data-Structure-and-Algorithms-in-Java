
package circularqueue;

public class CircularQueue <T> 
{

   
    public static void main(String[] args) {
        
    }
    
      int n=10;
    T[] array = (T[]) new Object[n];
    int head = -1;
    int tail = -1;
    
    public boolean isEmpty()
    {
        if (head==tail)
        {
            return true;
        }
            else{
                    return false;
                }
        
    }
     public boolean isFull()
    {
        if(head==tail-n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int size()
    {
        return (tail-head);
        
    }
    
    public void enqueue(T value)
    {
        if(isFull())
        {
            System.out.println("Queue is Full"); 
        }
        else
        {
            tail++;
             value = array[tail%n];
        }
    }
    
     public T dequeue()
    {
        if(isFull())
        {
            System.out.println("Queue is Empty");
            return null;
        }
        else
        {
            head++;
            return array[head%n];
        }
    }
    
}
