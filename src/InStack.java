public class InStack {
    private int [] stack;
    private int top;
    private int size;

    //default constructor
    public InStack() {
        top = -1;
        size = 50;
        stack = new int [50];
    }

    //Constructor with a passing value of the size
    public InStack(int size) {
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    //Pushing the value and checking if the value is pushed
    public boolean push(int item) {

        if(!isFull()) {
            top++;
            stack[top] = item;
            return true;
        } else {
            return false;
        }
    }

    //Checking if we can push a value to the stack. No more than the size of the stack
    public boolean isFull() {
        return (top == stack.length -1);
    }

    public int pop() {
        return stack[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
