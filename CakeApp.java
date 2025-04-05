/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cake;
import java.time.LocalDate;
/**
 *
 * @author lucia
 */
public class CakeApp {
    // CakeApp.java

    public static void main(String[] args) {
        MyStack oven = new MyStack();
        
        oven.push(new Cake("Chocolate Cake", 250, LocalDate.now().plusDays(10)));
        oven.push(new Cake("Vanilla Cake", 300, LocalDate.now().plusDays(12)));
        
        System.out.println("Top Cake: " + oven.peek());
        
        oven.pop();
        System.out.println("Top Cake after removal: " + oven.peek());
    }}
