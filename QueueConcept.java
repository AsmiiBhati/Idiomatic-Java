import java.util.Queue;
import java.util.LinkedList;
public class QueueConcept
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<String>();
        //Queue is actually an interface and not a class, and we can not create an instance for an interface. interface can be implemented by a class. The Queue interface can be implemented by two classes : LinkedList and PriorityQueue
        System.out.println("Is queue empty?" + queue.isEmpty());//returns true.
        //we can use add(),remove() and element() to do the same things, but its recommended to use offer(), poll() and peek(), since they throw less exceptions.

        //offer() adds at the tail
        queue.offer("Alice");//head
        queue.offer("Barney");
        queue.offer("Charlie");
        queue.offer("Daniel");//tail

        System.out.println("Is queue empty?" + queue.isEmpty());//returns false
        System.out.println(queue);//returns all elements. first element is head, last is tail.

        System.out.println(queue.peek());//peek() returns head of queue.
        System.out.println(queue.size());//size() returns number of objects in queue
        System.out.println(queue.contains("Barney"));//contains() return true/false not index of object

        //poll() removes at the head
        String removed = queue.poll();
        System.out.printf("%s got dequeued from the queue\n",removed);
        System.out.println(queue);
    }
}
