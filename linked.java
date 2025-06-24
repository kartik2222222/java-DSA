
public class linked {
    Node head;
     class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
     }
     //adding node at first
     public void addnodefirst(String data){
       Node  newnode = new Node(data);
        if(head==null){
           head=newnode;
           return;
        }
        newnode.next=head;
        head=newnode;
     }
     //adding node at last
     public void addnodelast(String data){
        Node newnode =new Node(data);
       if(head==null){
           head=newnode;
           return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;

     }
     //printing list
     public void printlist(){
        Node currentnode = head;
        while(currentnode!=null){
            System.out.print(currentnode.data+"-->");
            currentnode=currentnode.next;
        }
     }
     //deleting element at first
     public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;

        }
         head =head.next;
     }
     //deleting element at last
     public void deletelast(){
          if(head==null){
            System.out.println("list is empty");
            return;

        }
        if(head.next==null){
            head=null;
        }
         Node currentnode = head.next;
         Node previousnode =head;
         while(currentnode.next!=null){
            currentnode =currentnode.next;
            previousnode=previousnode.next;
         }
         previousnode.next=null;
     }
     public void listreverse(){
        if(head==null||head.next==null){
            return;
        }
        Node pnode = head;
        Node cnode = head.next;
        while(cnode!=null){
           Node  nnode = cnode.next;

           cnode.next=pnode;


           pnode = cnode;
           cnode=nnode;

        }
        head.next=null;
        head=pnode;
     }
     

     public static void main(String[] args) {
        linked list =new linked();
        list.addnodefirst("is");
        list.addnodefirst("a");
        list.addnodefirst("linkedlist");
        list.printlist();
        list.listreverse();
        list.printlist();

     }
}
