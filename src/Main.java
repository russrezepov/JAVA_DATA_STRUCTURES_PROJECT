public class Main {
    public static void main(String[] args) {

        //Stack with regular primitive data type int
//       InStack inStack = new InStack();
//        if (!inStack.isFull()) {
//            inStack.push(2);
//            inStack.push(4);
//            inStack.push(6);
//            inStack.push(9);
//        }
//
//        System.out.println(inStack.pop());
//        System.out.println(inStack.pop());

        //Stack with objects
//        Person person1 = new Person("Russ","12345");
//        Person person2 = new Person("John","999000");
//
//        PersonStack stack = new PersonStack();
//
//        stack.push(person1);
//        stack.push(person2);
//
//        System.out.println(stack.pop().toString());
//        System.out.println(stack.pop().toString());

        //Queue Stack with primitive data type
//        IntQ intQ = new IntQ();
//        intQ.enqueue(3);
//        intQ.enqueue(4);
//        intQ.enqueue(6);
//
//        System.out.println(intQ.dequeue());
//        System.out.println(intQ.dequeue());
//        System.out.println(intQ.dequeue());
//
//        intQ.showAll();

        //Queue with Objects

//        PersonQ personq = new PersonQ();
//        personq.enqueue(new Person("Russ","2908"));
//        personq.enqueue(new Person("Bond","1002"));
//        personq.showAll();

        IntLinkedList list = new IntLinkedList(2);

        list.insertItem(5);
        list.insertItem(8);
        list.printList();
    }
}
