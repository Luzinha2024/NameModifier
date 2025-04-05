/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cake;

/**
 *
 * @author lucia
 */
public interface StackInterface {
    // StackInterface.java

    void push(Cake cake);  // Add a cake to the stack
    Cake pop();            // Remove a cake from the stack
    Cake peek();           // View the top cake
    boolean isEmpty();     // Check if the stack is empty
    boolean isFull();      // Check if the stack is full
}


