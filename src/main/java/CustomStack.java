import java.util.Stack;

public class CustomStack {

    private Stack<Integer> stack;
    public CustomStack(){
        stack = new Stack<Integer>();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public Integer peek(){
        return stack.peek();
    }

    public Integer pop(){
        return stack.pop();
    }

    public Integer push(Integer item){
        return stack.push(item);
    }

    public Integer search(Integer item){
            return stack.indexOf(item);
    }

}
