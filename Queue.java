
package queue;


public class Queue <T>
{

   
    public static void main(String[] args) 
    {
        
        
    }
    
     T[] array = (T[]) new Object[5];
    int head = 0, tail = -1;
    
    public boolean isEmpty()
    {
        if(tail == -1)
            return true;
        return false;
    }
    
    public boolean isFull()
    {
        if(tail == array.length-1)
            return true;
        return false;
    }
     public void enqueue(T value)
    {
        if(isFull())
            System.out.println("Queue is Full");
        else
        {
            tail++;
            array[tail] = value;
        }
    }
     //Time Complexcity
    public T dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        }
        else
        {
            T value = array[head];
            moveForward();
            return value;
        }
    }
     public void moveForward()
    {
        for(int i = 0; i<tail; i++)
        {
            array[i] = array[i+1];
        }
        tail--;
    }
     
      //Size Shrink
     
     public T dequeue2()
     {
         if(isEmpty())
         {
             System.out.println("Queue is Empty");
             return null;
         }
         else
         {
             head++;
             return array[head];
         }
     }
}


    

