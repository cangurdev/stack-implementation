import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> stack = new ArrayList();

    public void push(T new_element) {
        if (new_element == null)
            throw new NullPointerException("null object cannot be added");

        stack.add(new_element);
    }

    public int count() {
        return stack.size();
    }

    public T pop() {
        if (stack.size() == 0)
            throw new IllegalStateException("Stack is empty");

        T lastElementOfTheStack = stack.get(stack.size() - 1);
        stack.remove(lastElementOfTheStack);

        return lastElementOfTheStack;
    }

    public T peek() {
        if (stack.size() == 0)
            throw new IllegalStateException("Stack is empty");

        return stack.get(stack.size() - 1);
    }
}
