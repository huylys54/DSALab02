public class Ex5 {
    public static void main(String[] args) {
        QueueStack<Integer> queue = new QueueStack<>();
        queue.enQueue(5);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(77);
        queue.enQueue(8);
        queue.print();
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.print();
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains(78));
        System.out.println(queue.size());
    }
}
