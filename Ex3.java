import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        MyStack<String> stringStack = new MyStack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("String = ");
        String s = input.nextLine();
        input.close();
        for(int i = 0; i < s.length(); i++){
            stringStack.push(s.substring(i, i + 1));
        }
        s = "";
        while(!stringStack.isEmpty()){
            s += stringStack.pop();
        }
        System.out.println(s);
    }
}
