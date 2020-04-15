public class PersonStack {
        private Person [] pStack;
        private int top;
        private int size;

        //default constructor
        public PersonStack() {
            top = -1;
            size = 50;
            pStack = new Person [50];
        }

        //Constructor with a passing value of the size
        public PersonStack(int size) {
            top = -1;
            this.size = size;
            pStack = new Person[this.size];
        }

        //Pushing the value and checking if the value is pushed
        public boolean push(Person item) {

            if(!isFull()) {
                top++;
                pStack[top] = item;
                return true;
            } else {
                return false;
            }
        }

        //Checking if we can push a value to the stack. No more than the size of the stack
        public boolean isFull() {
            return (top == pStack.length -1);
        }

        public Person pop() {
            return pStack[top--];
        }

        public boolean isEmpty() {
            return (top == -1);
        }
    }