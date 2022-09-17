public class QueueStack<E> implements QueueInterface<E>{
    private MyStack<E> temp;
    private MyStack<E> queue;

    public QueueStack(){
        temp = new MyStack<>();
        queue = new MyStack<>();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    @Override
    public void enQueue(E item) {
        if(queue.isEmpty()){
            queue.push(item);
            return;
        }
        while(!queue.isEmpty()){
            temp.push(queue.pop());
        }
        temp.push(item);
        while(!temp.isEmpty()){
            queue.push(temp.pop());
        }
    }

    @Override
    public E deQueue() {
        return queue.pop();
    }

    public void print(){
        queue.print();
    }

    @Override
    public boolean contains(E item) {
        return queue.contains(item);
    }

    @Override
    public E getFront() {
        return queue.getPeek();
    }

    @Override
    public int size() {
        return queue.size();
    }
}
