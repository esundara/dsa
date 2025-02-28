package doublylinkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node (int value)  {
            this.value = value;

        }

    }

    DoublyLinkedList (int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp !=null ) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }

    public int getLength(){
        return length;
    }

    public void prepend(int value) {
            Node newNode = new Node ( value);
            if (length == 0 ){
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            length++;
        }

    public void append(int value) {
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next= newNode;
            newNode.prev = tail;
            tail = newNode;

        }
        length ++;


    }



    public Node getItem(int index){
        if (index <0 || index> length)
            return null;
        Node temp = head;
        if (index < length/2 ) {
            for(int i=0 ; i<length ; i++ ){
                temp = temp.next;
            }

        } else {
            temp = tail;
            for(int i=length-1 ; i > index ; i-- ){
                temp = temp.prev;
            }
        }
        return temp;

    }

    public boolean  set(int index , int value) {
        Node tmp = getItem(index);

        if (tmp != null) {
            tmp.value = value;
            return true;
        }
        return false;
    }

    public boolean  insert (int index, int value){
        if (index <0 || index < length) return false;
        if (index == 0 ) {
            prepend(value);
            return true;
        }
         if (index == length){
             append(value);
             return true;
         }


         Node newNode = new Node(value);
         Node before = getItem(index-1);
         Node after = before.next;

         newNode.prev= before;
         newNode.next   = after;
         before.next = newNode;
         after.prev= newNode;
         length ++;
         return true;

    }

    public Node removeFirst() {
       if(length==0) return null;
       Node temp= head;
        if(length==1) {
            head = null;
            tail= null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length --;
        return temp;

    }

    public Node removeLast(){
        if(length==0) return null;
        Node temp= tail;
        if(length==1){
            head = null;
            tail = null;
        } else {
            tail= tail.prev;
            tail.next = null;
            tail.prev = null;
        }
        length --;
        return temp;
    }

    public Node remove(int index) {
        if (index <0) return null;
        if(index==0) return removeFirst();
        if (index ==length -1) return removeLast();
        Node temp = getItem(index);
        temp.next.prev = temp.prev;
        temp.prev.next= temp.next;
        temp.next = null;
        temp.prev =    null;
        length -- ;
        return temp;


    }

    public static void main(String argv[]){
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        Node temp = myDLL.getItem(1);
        System.out.println( "At 3 >> "+ temp.value );

        myDLL.insert(1,10);

        //myDLL.printList();




    }
}
