
package conversion;

//stack by array
public class Stack01 <T>
{
    
    T[] arr = (T[])new Object[10];
    int top =-1;
    private boolean isFull()
    {
        if(top==arr.length-1)
        {
           return true; 
        }
        else {
            return false;
        }
            
    }
    private boolean isEmpty()
    {
    if(top==-1){
        return true;
    }
    else
    {
        return false;
    }
}
    private T peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return null;
        }
        else
        {
            return arr[top]; 
        }
    }
    public void push(T value)
    {
        if(isFull())
        {
            System.out.println("Stack is OverFlow");
        }
        else {
            arr[++top] = value;
        }
        
    }
    public T pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is UnderFlow");
            return null;
        }
        else{
            return arr[top--];
        }
    }
    public int size()
    {
        return (top+1);
    }
    
    
}

