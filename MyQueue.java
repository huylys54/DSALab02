
public class MyQueue<E> implements QueueInterface<E>{
    private Node<E> front;
    private Node<E> rear;
    private int numNode;

    public MyQueue(){
        this.front = this.rear = null;
        this.numNode = 0;
    }

    @Override
    public void enQueue(E item) {
        if(this.front == null) {
            this.front = this.rear = new Node<E>(item);
            this.numNode++;
            return;
        }
        this.rear.setNext(new Node<E>(item));
        this.rear = this.rear.getNext();
        this.numNode++;
    }

    @Override
    public E deQueue(){
        if(front == null) {
            return null;
        }
        E del = this.front.getData();
        this.front = this.front.getNext();
        this.numNode--;
        return del;
    }

    @Override
    public int size(){
        return this.numNode;
    }
    
    @Override
    public boolean contains(E item){
        if(this.front == null) {
            return false;
        }
        if(this.front.getData().equals(item)){
            return true;
        }
        if(this.rear.getData().equals(item)){
            return true;
        }
        Node<E> curr = this.front.getNext();
        while(curr.getNext() != null){
            if(curr.getData().equals(item)){
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    @Override
    public void print(){
        if(front == null){
            System.out.println("Empty queue!");
            return;
        }
        String out = "[";
        Node<E> curr = front;
        while(curr.getNext() != null) {
            out += curr.getData().toString() + ", ";
            curr = curr.getNext();
        }
        out += rear.getData().toString() + "]";
        System.out.println(out);
    }

    @Override
    public boolean isEmpty(){
        return this.numNode == 0;
    }

    @Override
    public E getFront(){
        return this.front.getData();
    }
}