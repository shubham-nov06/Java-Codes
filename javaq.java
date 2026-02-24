import java.util.LinkedList;
import java.util.Queue;

public class javaq
{

    public static void main(String[] args) {

        Queue<Integer> Queue = new LinkedList<>();
        Queue.offer(10);
        Queue.offer(20);
        Queue.offer(30);
        System.out.println("Queue after stack = " + Queue);
        int removed = Queue.poll();
        System.out.println("After removel = " + removed);

    }
}