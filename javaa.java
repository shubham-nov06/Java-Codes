import java.util.Stack;

public class javaa {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("a");
        st.push("Shubham");
        st.push("Yayyyyyyyyy");
        st.pop();
        System.out.println(st.pop());
        System.out.println(st.peek());

    }

}