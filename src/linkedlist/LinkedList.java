package linkedlist;

public class LinkedList {

    private  Node head;
    private Node tail;
    private int length;

    class  Node {
        int value;
        Node next;
        Node (int value ){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;

    }

    public void  printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp= temp.next;

        }
    }

    public void getHead(){
        System.out.println("head"+ head.value);
    }

    public void getTail(){
        System.out.println("tail"+ tail.value);
    }

    public void getLength() {
        System.out.println("length"+ this.length);
    }

    public void appendToList(int value){
        Node newNode = new Node(value);
        if( length == 0 ) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length ++;

    }

    public Node removeLast(){
        if(length == 0) return null;
        System.out.println("Node is not null, continue");

        Node temp = head;
        Node pre = head;
        while ( temp.next != null) {
            System.out.println("In the loop to find pre");
            System.out.println("temp = " + temp.value);
            pre = temp;
            temp= temp.next;
        }
        tail = pre;
        tail.next=null;
        length--;
        if (length == 0) {
            head = null;
            tail= null;
        }
        return temp;

    }


    public void prepend(int i) {

        Node prepend= new Node(i);
        if (length == 0 ) {
            head = prepend;
            tail = prepend;
        } else {
            prepend.next = head;
            head = prepend;
            length++;
        }

    }

    public void removeFirst() {
        if (length== 0) return;
        if (length ==1) {
            head = null;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length ==0 ) {
            tail = null;
        }


    }


    public  Node getNode (int value ) {
        if (value < 0 || value > length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < value; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public  boolean setValue (int index, int value ) {
        if (value < 0 || index > length) {
            return false;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value=value;
        return true;
    }

    public  boolean insertNode(int index, int value ) {

        if(index==0) {
            prepend(value);
            return true;
        }
        if(index== length-1){
            appendToList(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = getNode(index-1);
        Node temp2 = getNode(index);
        temp.next= newNode;
        newNode.next = temp;
        length++;
        return true;

    }

    public boolean remove(int index) {

        Node temp = getNode(index -1);
        temp.next = getNode(index+1);

        return true;

    }

    public boolean reverse(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before =null ;
        for (int i=0 ;i <length;i++) {
             after= temp.next;
             temp.next = before;
             before = temp;
             temp = after;
        }



        return true;


    }

    public  Node findMiddleNode() {
        if(length ==0) return null;
        if(length==1) return head;
        Node temp = head;
        int half = length /2 ;
        System.out.println("Middle="+ half);
        for (int i = 0; i <half;i ++) {
            temp = temp.next;
        }
        return temp;


    }

    public static void main(String argv[]) {
        LinkedList myList = new LinkedList(1);
        myList.appendToList(2);
        myList.appendToList(3);
        myList.appendToList(4);
        myList.appendToList(5);
        myList.appendToList(6);
        //myList.appendToList(3);
        //myList.printList();
        //myList.removeFirst();
        //myList.printList();
        //System.out.print(myList.setValue(2, 20));
        //myList.insertNode(3,30);
       // myList.remove(2);
        //myList.reverse();
        System.out.println(myList.findMiddleNode().value);
        //myList.printList();
    }

}
