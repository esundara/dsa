package queue;

public class Queue {

    private Node first;
    private Node last;
    int length;

     class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

    }

    Queue(int value){
         Node newNode = new Node(value);
         first = newNode;
         first.next = last;
         last = newNode;
         length = 1;
    }

    public Node getFirst(){
         return this.first;
    }
    public Node getLast(){
        return this.last;
    }
    public int getLength(){
         return this.length;
    }

    public void printQueue() {
        Node tmp = first;
        while (tmp != null) {
            System.out.println( tmp.value);
            tmp= tmp.next;
        }

    }

    public void enqueue(int value){
         Node newNode = new Node(value);
         if (length == 0) {
             first = newNode;
             last = newNode;

         } else {
             last.next = newNode;
             last = newNode;
         }
        length++ ;


    }

    public Node dequeue(){
         if(length ==1) return null;
         Node tmp =first;
         if(length ==1) {
             first= null;
             last= null;
         } else {
             first = first.next;
             tmp.next = null;

         }
         length --;
         return tmp;

    }
}