
package linklist;


public class LinkList {

  
    public static void main(String[] args) {
        MyLinkList<Integer> ll = new MyLinkList<>();
        ll.DeleteAtEnd();
        ll.InsertAtEnd(10);
        ll.insertAtStart(1);
        ll.insertAtStart(2);
        ll.print();
        ll.DeleteAtEnd();
        ll.print();
        ll.InsertAtEnd(32);
        ll.print();
        
    }
    
}
