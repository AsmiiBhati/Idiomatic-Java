import java.util.*;
public class PriorityQueueConcept
{
    public static void main(String[] args)
    {
        //Queue<Double> queue = new LinkedList<Double>();
        Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());//normally, we will be printing in ascending order (priorities) but when we use Collections.reverseOrder() it'll print in descending order.
        queue.offer(3.6);
        queue.offer(1.9);
        queue.offer(2.8);
        queue.offer(4.1);
        queue.offer(3.1);

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
        //when linkedlist is used, the print statement will print objects in the same order it was offered. first in first served. When we use priority queuw, the same print statement will return the objects in ascending order making priorities

        Queue<String> newqueue = new PriorityQueue<String>(Collections.reverseOrder());

        newqueue.offer("B");
        newqueue.offer("C");
        newqueue.offer("A");
        newqueue.offer("F");
        newqueue.offer("D");
        while(!newqueue.isEmpty())
        {
            System.out.println(newqueue.poll());
        }
    }
}
