import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        MyQueue<Character> queue = new MyQueue<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input = ");
        String s = input.nextLine();
        input.close();
        String[] c = s.split("\\W+");
        for(String tmp : c){
            for(int i = 0; i < tmp.length(); i++){
                stack.push(tmp.charAt(i));
                queue.enQueue(tmp.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            if(Character.compare(Character.toLowerCase(stack.pop()), Character.toLowerCase(queue.deQueue())) != 0){
                System.out.println("Is not palindrome!");
                return;
            }
        }
        System.out.println("Is palindrome!");
    }
}
