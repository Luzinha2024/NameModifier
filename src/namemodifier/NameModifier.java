/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namemodifier;

/**
 *
 * @author luciane
 */
import inpututilities.InputUtilities;

     
          public class NameModifier {
         
          public static void main(String[] args) {
              
              
              
       /* Use the my InputUtilities package to create this new code, 
        * to make the work easier and faster, then avoid to repeat all code 
        *again.
       */
                InputUtilities inputUtils = new InputUtilities();
        
       
        /*
        * Ask user to enter some  text - if they enter non-text (like numbers, is not allowed)
        * then ask them again
        * @param prompt - the question or prompt to ask the user
        * @return a String containing whatever text the user entered
        */
        
        // Step 1: Ask the user to enter their name, the code come from InputUtilities
        
        String name = inputUtils.askUserForText("Please enter your name: ");
        
   
        // Step 2: Modify the name using various "STRING Methods" 
        //Use "\n" for print the new line
        
        System.out.println("\nThat is grand! Now, here are some different modifications to your name, have fun: ");

        
        // 2.1- Now convert the name to Uppercase, using String upperCaseName
        String upperCaseName = name.toUpperCase();
        System.out.println("\n1. Name in Uppercase: " + upperCaseName);
        

        // 2.2-  Reverse the name using String reverse and Builder and If and Else;
        String reversedName = new StringBuilder(name).reverse().toString();
        System.out.println("2. Name reversed: " + reversedName);
        // Move the last letter to the front
        if (name.length() > 1) {
            String lastToFront = name.charAt(name.length() - 1) + name.substring(0, name.length() - 1);
            
            System.out.println("3. Last letter moved to the front: " + lastToFront);
            
        // If the name is too short, the programm cannot modify, so we need let the user know it
        } else {
            System.out.println("3. Name is too short to modify with this method.");
              }
        
        // 2.3 Extract initials using split and String Builder for print my initials, using "for" an "if" together
        String[] words = name.split(" ");
        
        StringBuilder initials = new StringBuilder();
        
        /* Without the "for" the program would only be able to handle one word (or none, if the loop does not exist)
           and without the "if" the program could crash or include invalid characters from empty words.
           The for loop and the if condition work together to ensure that the initials are extracted correctly and robustly, 
           handling input that may have extra spaces or other inconsistencies.
        */
        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(word.charAt(0));
            }
        }
        System.out.println("4. Initials: " + initials.toString().toUpperCase());
        
        
        
        // 2.4-  Continuing the String now let's Replace all vowels with '👀';
        String vowelsReplaced = name.replaceAll("[aeiouAEIOU]", " 👀 ");
        System.out.println("5. Name with vowels replaced: " + vowelsReplaced);
        
       
        
        //2.5 Now going to give some good fun for the user's, mixed reversed name with prefix and suffix
       System.out.println ("\nNow some different appearance: ");
        // Add a custom prefix and suffix to make the transformation more unique using 
        String modifiedName = "☘ 🖤 ️" + reversedName + " ☘ 🖤";  
        
        // Display the final transformed name to the user
        System.out.println("Your name appearence is: " + modifiedName);
        
      
        // To say the Users "Thank you very much" for your time to answer your name...
          System.out.println(" \nThank you very much for participate in my Homework 👍!!!");
    }
}
