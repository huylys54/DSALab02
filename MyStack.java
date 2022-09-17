import java.util.NoSuchElementException;

public class MyStack<E> implements StackInterface<E>{
    private Node<E> top;
    private int numNode;

    public MyStack() {
        this.top = null;
        this.numNode = 0;
    }

    @Override
    public void push(E item){
        if(top == null){
            top = new Node<E>(item);
            numNode++;
            return;
        }
        top = new Node<E>(item, top);
        numNode++;
    }

    @Override
    public E pop() throws NoSuchElementException{
        if(top == null) {
            throw new NoSuchElementException("Stack Underflow!");
        }
        E del = this.top.getData();
        this.top = this.top.getNext();
        this.numNode--;
        return del;
    }

    @Override
    public int size(){
        return this.numNode;
    }

    @Override
    public boolean contains(E item) {
        if(this.top == null) {
            return false;
        }
        if(this.top.getData().equals(item)){
            return true;
        }
        Node<E> curr = this.top.getNext();
        while(curr != null){
            if(curr.getData().equals(item)){
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    @Override
    public void print() {
        if(top == null){
            System.out.println("Empty stack!");
            return;
        }
        String out = "[";
        Node<E> curr = top;
        while(curr.getNext() != null) {
            out += curr.getData().toString() + " | ";
            curr = curr.getNext();
        }
        out += curr.getData().toString() + "]";
        System.out.println(out);
    }

    @Override
    public boolean isEmpty() {
        return this.numNode == 0;
    }

    @Override
    public E getPeek(){
        return this.top.getData();
    }
}