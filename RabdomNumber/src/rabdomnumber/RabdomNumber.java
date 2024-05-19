/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rabdomnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RabdomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Please choose a number between 1 and 36:");
        int chosenNumber = scanner.nextInt();
        
        // Check if the chosen number exceeds 6
        while (chosenNumber > 6) {
            System.out.println("Number should not exceed 6. Please choose again:");
            chosenNumber = scanner.nextInt();
            
          // Generate a random number between 1 and 36
        int randomNumber = random.nextInt(36) + 1;
        
        System.out.println("You chose: " + chosenNumber);
        System.out.println("The randomly generated number is: " + randomNumber);
    }
            
        }
        
     
    }
    
}
