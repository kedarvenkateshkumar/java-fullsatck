package Collections.Lists;

class ListNode{

    class Node {
        Node next;
        int data;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    
        Node head;
    
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        public void addLast(int data){
            Node newNode = new Node(data);

            while(head.next != null){

                head = head.next;
            }
            head.next = newNode;
        }
        //delete a data from list
        public void delete(int data){
            
            if(head == null) return;
            if(head.data == data) head = head.next;

            Node temp = head;
            while(temp.next != null && temp.next.data != data){
                temp = temp.next;
            }

            if(temp.next != null) temp.next = temp.next.next;


        }
    
        public void display() {
            Node temp = head;
            if (temp == null)
                return;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(" null");
        }
    }


public class Linkedlist {

    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.addFirst(20);
        list.addFirst(19);
        list.addFirst(87);
        list.addFirst(91);
        list.addFirst(82);
        list.addFirst(5);
        System.out.println("Before delete: ");
        list.display();

        System.out.println("After delete 91: ");
        list.delete(91);
        //list.delete(10);
        list.display();

    }
}
