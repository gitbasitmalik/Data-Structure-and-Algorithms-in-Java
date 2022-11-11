
package dequeue;


public class DEQueue <T>
{

    
    public static void main(String[] args) 
    {
       
        
    }
    
    int head = 0;
    int tail = -1;
    int n = 10;
    T[] array = (T[]) new Object[n];
    
    public boolean isEmpty()
    {
        if(tail==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isFull()
    {
        if(tail==array.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     public T dequeueAtHead( T value)
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        }
        else
        {
            value = array[head];
           moveForward();
           return value;
        }
    }
    public T enqueueAtTail(T value)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            return null;
        }
        else
        {
            tail++;
            return array[tail];
        }
    }
      public T dequeueAtTail()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        }
        else
        {
           T value = array[tail];
            tail--;
          return value;
        }
    }
    
    public T enqueueAtHead()
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            return null;
        }
        else
        {
            T value= array[head];
            moveBack();
           return value;
        }
    }
     private void moveForward()
    {
        for(int i = 0; i<tail;i++)
        {
            array[i]= array[i+1];
        }
        tail--;
        
    }
    
     private void moveBack()
    {
        for(int i = tail; i>=0;i--)
        {
            array[i]= array[i-1];
        }
        tail++;
    }
}



    
    

