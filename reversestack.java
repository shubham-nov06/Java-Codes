importjava.util.Stack;

public class reversestack {
    
    public static void main(String[] args ) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        Stack<Integer> rev = new Stack<>();
        while(!s.isEmpty()) {
            rev.push(s.pop());

        }
        system.out.println("Reversed stack is " + rev);
    }
}
