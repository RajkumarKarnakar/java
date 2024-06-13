import java.util.*;

/* Java Program to implement a stack
using only one queue */

class Stack {
    // One queue
    Queue<Integer> q1 = new LinkedList<Integer>();

    void push(int data, int c)
    {

        // Push the current element first and
        // After every recursion add the front element again
        q1.add(data);

        // Return if size becomes 0
        if (c <= 0)
            return;

        // Decrement size by 1 in every recursion
        c--;

        // remove front element from queue and return it
        // using q1.remove() and call recursive function
        push(q1.remove(), c);
    }

    void pop()
    {
        // if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.remove();
    }

    int top()
    {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    int size() { return q1.size(); }

    // driver code
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(1, s.size()); // Value and current size
        s.push(2, s.size());
        s.push(3, s.size());

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}

