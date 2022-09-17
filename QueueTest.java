public class QueueTest{
    public static void main(String[] args){
        MyQueue<String> q = new MyQueue<>();
        q.enQueue("aa"); 
        q.enQueue("ab"); 
        q.enQueue("ea"); 
        q.enQueue("fa"); 
        q.enQueue("ls"); 
        q.enQueue("wera"); 
        q.enQueue("ink");
        q.print();
        q.deQueue(); 
        q.deQueue(); 
        q.deQueue();
        q.print();
        System.out.println(q.size()); 
        System.out.println(q.contains("wera")); 
        System.out.println(q.isEmpty()); 
        System.out.println(q.getFront()); 
    }
}