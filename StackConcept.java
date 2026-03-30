import java.util.Stack;
public class StackConcept
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();

        System.out.println("Is stack empty? "+stack.empty());//the stack is supposed to be empty
         
        stack.push("Pizzas");
        stack.push("Burgers");
        stack.push("Noodles");
        stack.push("Spring Rolls");
        stack.push("Tacos");//the top most item

        System.out.println("Is stack empty? "+stack.empty());//the stack is no longer empty

        System.out.println(stack);
       
        //pop always removes the topmost item, so at last you'll have an empty stack "[]". if we still use pop an exception will arise called the "empty stack exception" (underflow condition)
        
        //System.out.println(stack.pop());
        //if you want to take the top element of a stack you can use a print statement(like above) or you can pop and assign it to some variable. eg. String food = stack.pop();
        String fooditem = stack.pop();
        System.out.println(fooditem);
        System.out.println(stack);

        //if we just wanna look at the top and not remove it from the stack(like we do in pop) we use peek.
        System.out.println(stack.peek());

        //if you wanna search for an object within the stack you can use stack.search (numbering starts at 1 ie. the top) -> always remember the rightmost of the array is the top! the top isn't pizza
        int foodindex = stack.search("Burgers");
        System.out.println(foodindex);

        /*
        for(int i =1;i<=1000000000;i++)
        {
            stack.push("French Fries");
        }
            */
        //stack can run out of space, say we push a billion items in our stack, at some point it'll throw an exception called "Out of memory error" (no more java heap space)

        /* uses of stack :
            1. undo/redo
            2. moving back/forward through browser history arrow <- ->
            3. backtracking algos (maze,file directories)
            4. calling functions(the call stack)
        */    
    }
}
