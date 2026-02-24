import java.util.Stack;

public class java {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.push(10);
        st.push(100);
        st.push(200);
        st.pop();
        System.out.println(st.pop());
        System.out.println(st.peek());

    }

}