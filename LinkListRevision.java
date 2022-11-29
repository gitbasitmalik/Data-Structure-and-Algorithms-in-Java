
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
    
    public T deleteAtStart()
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
            Node node1 = start;
            Node node2 = null;
            while(node1.next != null)
            {
                node2 = node1;
                node1 = node1.next;
            }
            T value = node1.data;
            node2.next = null;
            end = node2;
            return value;
            
        }
        
       
    }
}
