public class StackTest{
    public static void main(String[] args){
        MyStack<Integer> stack = new MyStack<>();
        stack.push(2);
        stack.push(4);
        stack.push(7);
        stack.push(3);
        stack.push(8);
        stack.push(123);
        stack.push(1259);
        System.out.println(stack.getPeek());
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        System.out.println(stack.contains(7));
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}