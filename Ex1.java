public class Ex1{
    public static void main(String[] args){
        MyStack<Fraction> fStack = new MyStack<>();
        fStack.push(new Fraction(5, 8));
        fStack.push(new Fraction(7, 2));
        fStack.push(new Fraction(23, 5));
        fStack.push(new Fraction(77, 3));
        fStack.push(new Fraction(1241, 4));
        fStack.push(new Fraction(99, 100));
        fStack.print();
        System.out.println(fStack.size());
        System.out.println(fStack.pop());
        fStack.pop();
        fStack.print();
        System.out.println(fStack.contains(new Fraction(77, 3)));
        System.out.println(fStack.isEmpty());
        System.out.println(fStack.getPeek());

        MyQueue<Fraction> fQueue = new MyQueue<>();
        fQueue.enQueue(new Fraction(27, 3));
        fQueue.enQueue(new Fraction(6, 1));
        fQueue.enQueue(new Fraction(8, 3));
        fQueue.enQueue(new Fraction(1024, 1025));
        fQueue.enQueue(new Fraction(55, 37));
        fQueue.enQueue(new Fraction(269, 82));
        fQueue.enQueue(new Fraction(2, 3));
        fQueue.print();
        System.out.println(fQueue.getFront());
        System.out.println(fQueue.deQueue());
        System.out.println(fQueue.deQueue());
        fQueue.print();
        System.out.println(fQueue.contains(new Fraction(2, 3)));
        System.out.println(fQueue.isEmpty());
    }

}