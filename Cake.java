/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cake;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author lucia
 */


// Cake.java
import java.time.LocalDate;

/**
 *
 * @author lucia
 */
public class Cake {
    private String name;
    private int weight;
    private LocalDate bestBefore;
    
public Cake(String name, int weight, LocalDate bestBefore) {
        this.name = name;
        this.weight = weight;
        this.bestBefore = bestBefore;
    }
    
    public String getName() { return name; }
    public int getWeight() { return weight; }
    public LocalDate getBestBefore() { return bestBefore; }
    
    @Override
    public String toString() {
        return name + " (" + weight + "g, Best before: " + bestBefore + ")";
    }
}
removendo arquivo errado
