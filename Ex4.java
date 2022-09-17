import java.util.Scanner;

public class Ex4 {
    public static boolean match(String a, String b){
        if(a.equals("(") && b.equals(")")){
            return true;
        }
        if(a.equals("[") && b.equals("]")){
            return true;
        }
        if(a.equals("{") && b.equals("}")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input = ");
        String[] ch = input.nextLine().split("");
        input.close();
        for(String c : ch){
            if(c.equals("(") || c.equals("{") || c.equals("[")){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    System.out.println("Too many closed brackets");
                    return;
                }
                if(!match(stack.pop(), c)){
                    System.out.println("Mismatched");
                    return;
                }
            }
        }
        if(!stack.isEmpty()){
            System.out.println("Too many open brackets");
            return;
        }
        System.out.println("Balanced");
    }
}
