/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cake;
import java.util.ArrayList;
/**
 *
 * @author lucia
 */

    // MyStack.java

public class MyStack implements StackInterface {
    private final int CAPACITY = 5;
    private ArrayList<Cake> stack;
    
    public MyStack() {
        stack = new ArrayList<>();
    }
    
    @Override
    public void push(Cake cake) {
        if (isFull()) {
            System.out.println("No more capacity");
        } else {
            stack.add(cake);
        }
    }
    
    @Override
    public Cake pop() {
        if (isEmpty()) {
            System.out.println("No cakes to remove");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }
    
    @Override
    public Cake peek() {
        if (isEmpty()) return null;
        return stack.get(stack.size() - 1);
    }
    
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    @Override
    public boolean isFull() {
        return stack.size() >= CAPACITY;
    }
}

