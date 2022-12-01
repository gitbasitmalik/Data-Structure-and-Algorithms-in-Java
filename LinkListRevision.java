
package linklistrevision;


public class LinkListRevision <T> 
{

    public static void main(String[] args) 
    {
      
    }
    
    class Node
    {
        T data;
        Node next;
    }
    Node start ;
    Node end;
    
    public void insertAtStart(T value)
    {
        Node newnode = new Node();
        newnode.data = value;
        
        if(start==null)
        {
            start = newnode;
        }
        else
        {
            newnode.next = start;
            start = newnode;
            
        }
    }
    
    public void insertAtEnd(T value)
    {
        Node newnode = new Node();
        newnode.data = value;
        newnode.next = null;
        if(start==null)
        {
            start = end = newnode;
        }
        else
        {
            end.next = newnode;
            end = newnode;
        }
    }
    public T  deleteAtStart()
    {
        if(start ==null) 
        {
            System.out.println("List is Empty");
            return null;
        }
        else if  (start==end)
        {
            T value = start.data;
            start = end = null;
            return value;
        }
        else
        {
            T value = start.data;
            start = start.next;
            return value;
        }
    }
    
    public T deleteAtEnd()
    {
        if(start==null)
        {
            System.out.println("LinkList is Empty");
            return null;
        }
        else if(start==end)
        {
            T value = start.data;
            start = end = null;
            return value;
        }
        else
        {
            Node lastnode = start;
            Node secondlast = null;
            while(lastnode.next != null)
            {
                secondlast = lastnode;
                lastnode = lastnode.next;
            }
            T value = lastnode.data;
            secondlast.next = null;
            end = secondlast;
            return value;
            
        }
        
        public Node search(T key)
    {
        if(start!=null)
        {
            Node tnode= start;
            while (tnode!=null)
            {
                if(tnode.data==key)
                {
                    return tnode;
                }
                tnode = tnode.next;
            }
        }
        return null;
    }
        
    }
    
     public void print()
    {
        if(start!=null)
        {
            Node tnode = start;
            while(tnode!=null)
            {
                System.out.println(tnode.data+"--->");
                tnode = tnode.next;
            }
        }
    }
    
}
