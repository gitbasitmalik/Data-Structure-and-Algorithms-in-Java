
package conversion;

// Stack By LinkList
public class Stack02 <T>
{
   class Node
   {
       T data;
       Node next;
   }
    Node start;
    public void push(T value)
    {
        Node n = new Node();
        n.data = value;
        n.next = start;
        start = n;
    }
    public T pop()
    {
        if(start==null){
            return null;
        }
        else
        {
            T value = start.data;
            start = start.next;
            return value;
        }
    }
    private boolean isEmpty()
    {
        if(start==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
   public T peek(){
       if(isEmpty())
       {
           return null;
       }
       else 
       {
           return start.data;
       }
   }
}
