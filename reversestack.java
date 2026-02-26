importjava.util.Stack;

public class reversestack {
    
    public static void main(String[] args ) {
        Stack<Integer> s = new Stack<>();
        rev.push(1);
        rev.push(2);
        rev.push(3);

        Stack<Integer> rev = new Stack<>();
        while(!s.isEmpty()) {
            rev.push(s.pop());

        }
        system.out.println("Reversed stack is " + rev);
    }
}
