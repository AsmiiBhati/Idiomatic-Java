import java.util.LinkedList;

public class LinkedListConcept
{
    public static void main(String[] args)
{
    LinkedList<String> linkedList = new LinkedList<String>();
    //our linkedlist stores both previous address and next address.
    /*
    linkedList.push("A");
    linkedList.push("B");
    linkedList.push("C");
    linkedList.push("D");
    linkedList.push("F");
    System.out.println(linkedList); //[F,D,C,B,A] just like a stack
    */
    
    linkedList.offer("A");
    linkedList.offer("B");
    linkedList.offer("C");
    linkedList.offer("D");
    linkedList.offer("F");
    System.out.println(linkedList); //[A,B,C,D,F] just like a queue

    linkedList.add(4,"E");
    System.out.println(linkedList);//[A,B,C,D,E,F] E will be put before the current object at 4.

    linkedList.add(4,"M");//[A,B,C,D,M,E,F] M will be put before the current object at 4.
    System.out.println(linkedList);

    linkedList.remove("C");
    System.out.println(linkedList);

    linkedList.remove(3);
    System.out.println(linkedList);//removes M

    System.out.println(linkedList.indexOf("E"));
}
}
