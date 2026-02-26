import java.util.Stack;

public class copystack {
    public static void main(Stiring[] args) {

        Stack<Integer> n = new Stack<>();
        n.push(100);
        n.push(200);
        n.push(300);

     Stack<Integer> co = new Stack<>();
     for( int i = 0 ; i<= n.size() ; i++){
        co.add((n.get(i)));
     }
         System.out.println("AFter copy" + co);

    }

}
