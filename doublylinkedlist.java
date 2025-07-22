
public class doublylinkedlist{
    node head;
    int size=0;
    class node{
        int var;
        node next;
        node prev;

        public node(int var){
            this.var = var;
            this.next= null;
            this.prev=null;

        }
    }

    public void  insert_first(int a){
        node node = new node(a);
        if(head==null){
          head= node;
          size++;
          return;
        }
        node.next=head;
        head.prev=node;
        head=node;
        size++;

      
    }
     public void  insert_last(int a){
      node node = new node(a);
        if(head==null){
          head= node;
          size++;
          return;
        }
        node crr=head;
        while(crr.next!=null){
            crr=crr.next;
        }
        crr.next=node;
        node.prev=crr;
        size++;

    }
     public void  insert_pos(int a,int n){
      if(n==size+1){
        insert_last(a);
        return;
      }
      if(n==1){
        insert_first(a);
        return;
      }
      node crr= head;
      for(int i=1;i<n;i++){
        crr=crr.next;
      }
      node node =new node(a);
      node.next= crr;
      node.prev=crr.prev;
      crr.prev.next=node;
      crr.prev=node;
      size++;
    }
     public void  delete_first(){
      
        if(head==null||head.next==null){
            head=null;
            size=0;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
        
    }
     public void  delete_last(){
      if(head==null||head.next==null){
            head=null;
                size=0;
            return;
        }

        node crr= head;
        while(crr.next.next!=null){
            crr=crr.next;
        }
        crr.next=null;
        size--;
    }
     public void  delete_pos(int n){
      if(n==size){
        delete_last();
        return;
      }
      if(n==1){
        delete_first();
        return;
      }
      node crr = head;
      int m=0;
      while(m<n-1){
        crr=crr.next;
        m++;
      }
      crr.next=crr.next.next;
      crr.next.prev=crr;
    }
     public void  display(){
        node crr=head;
      while(crr!=null){
        System.out.print(crr.var+ "-> ");
        crr=crr.next;
      }
    }
    public void  size(){
       System.out.println("\n"+size);
    }

    public static void main(String args[]){
        doublylinkedlist list = new doublylinkedlist();
        list.insert_first(10);
        list.insert_first(11);
        list.insert_last(12);
        list.insert_pos(55,2);
        list.delete_first();
         list.delete_last();
        list.delete_pos(2);
        list.display();
        list.size();
       

    }
}

















































// public class doublylinkedlist {
//     Node head;
//     class Node{
//         int val;
//         Node next;
//         Node prev;

//         public Node(int a){
//              this.val = a;
//             this.next= null;
//             this.prev= null;
//         }
//     }
//     public void insertfirst(int val){
//       Node node = new Node(val);
//       if(head==null){
//         head = node;
//       }else{
//         node.next=head;
//         head.prev=node;
//        head=node;
//       }
       
//     }


//     public void insertlast(int val){
//         Node node = new Node(val);
//         if(head==null){
//         head = node;
//         return;
//       }
//       Node current = head;
//       while(current.next!=null){
//         current = current.next;
//       }
//       current.next=node;
//       node.prev=current;
        
//     }
//     public void insert_position(int val, int n) {
//         if (n <= 1) {
//             insertfirst(val);
//             return;
//         }

//         Node current = head;
//         int index = 1;

//         while (current != null && index < n - 1) {
//             current = current.next;
//             index++;
//         }

//         if (current == null || current.next == null) {
//             insertlast(val); 
//             return;
//         }

//         Node node = new Node(val);
//         node.next = current.next;
//         node.prev = current;
//         current.next.prev = node;
//         current.next = node;
//     }
//       public void deletefirst() {
//         if (head == null) return;
//         head = head.next;
//         if (head != null) head.prev = null;
//     }
//      public void deletelast() {
//         if (head == null) return;
//         if (head.next == null) {
//             head = null;
//             return;
//         }

//         Node current = head;
//         while (current.next != null) {
//             current = current.next;
//         }

//         current.prev.next = null;
//     }
//      public void delete_position(int n) {
//         if (head == null) return;
//         if (n == 1) {
//             deletefirst();
//             return;
//         }

//         Node current = head;
//         int index = 1;

//         while (current != null && index < n) {
//             current = current.next;
//             index++;
//         }

//         if (current == null) return;

//         if (current.next != null)
//             current.next.prev = current.prev;
//         if (current.prev != null)
//             current.prev.next = current.next;
//     }
//     public void display(){
//      Node currentNode = head;
//      while(currentNode!=null){
//         System.out.print(currentNode.val+"->");
//         currentNode=currentNode.next;
//      }
//     }


//     public static void main(String args[]){
//       doublylinkedlist list = new doublylinkedlist();
//       list.insertfirst(2);
//        list.insertlast(3);
//         list.insertfirst(1);
//          list.insert_position(4,2);

//       list.display();
//     }
// }
