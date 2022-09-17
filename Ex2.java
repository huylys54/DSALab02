
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        MyStack<Integer> recursive = new MyStack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        int tmp = n;
        int exponent;
        long Pn = 0;
        input.close();
        while(n > 0){
            exponent = 1;
            if(n == 1){
                recursive.push(3);
            }
            if(n > 1){
                for(int i = 0; i < n; i++){
                    exponent *= 2;
                }
                recursive.push(exponent + n * n);
            }
            n -= 1;
        }
        while(!recursive.isEmpty()){
            Pn += recursive.pop();
        }
        System.out.printf("P(%d) = %d\n", tmp, Pn);
    }
}
