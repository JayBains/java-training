package DataStructures;

import java.util.Stack;
import java.util.Collections;

public class Stacks {
    private final Stack<Integer> stack;

    public Stacks(int size) {
        stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            stack.push(i);
        }
    }

    public void printStack(){
        System.out.println(stack);
    }

    public void shuffleStack(){
        Collections.shuffle(stack);
    }

    public void sortStack(){
        Collections.sort(stack);
    }

    public void manualSortStack(){
        Stack<Integer> tempStack = new Stack<>();

        while(!stack.isEmpty()){
            int temp = stack.pop();

            while(!tempStack.isEmpty() && tempStack.peek() > temp){
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        stack.addAll(tempStack);
    }

}
