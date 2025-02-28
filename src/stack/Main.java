package stack;

public class Main {

    public static void main(String argv[]){
        Stack myStack = new Stack(1);
        myStack.getTop();
        myStack.getHeight();
        myStack.push(2);
        myStack.push(3);
        myStack.pop();
        myStack.printStack();
    }
}
