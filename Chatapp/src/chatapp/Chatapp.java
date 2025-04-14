package chatapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import static chatapp.RegistrationLogin.doEnteredDetailsMatch;
import static chatapp.RegistrationLogin.getLoginMessage;
import static chatapp.RegistrationLogin.getRegistrationMessage;
import static chatapp.RegistrationLogin.isValidCellphoneNumber;
import static chatapp.RegistrationLogin.isValidPassword;
import static chatapp.RegistrationLogin.isValidUsername;
import static chatapp.RegistrationLogin.storeUserDetails;
/**
 *
 * @author User
 */import java.util.Scanner;
import javax.swing.JOptionPane;
public class Chatapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        String inputUsername = null;
        boolean isValid = false;
            
        // Password validation loop
        String password = null;
        boolean validPassword = false;
          // Cellphone number validation
        String phoneNumber = null;
        boolean validPhone = false;
        

        // Keep asking until the user enters a valid username
        while (!isValid) {
            inputUsername = JOptionPane.showInputDialog("Enter a username:\n(Username must contain an underscore and be less than 5 characters)");

            // If user clicks "Cancel" or closes the dialog
            if (inputUsername == null) {
                JOptionPane.showMessageDialog(null, "Cancelled by user. Exiting...");
                System.exit(0);
            }

            isValid = isValidUsername(inputUsername);

            if (!isValid) {
                JOptionPane.showMessageDialog(null, "Invalid username!\nUsername must contain an underscore and be less than 5 characters.");
            }
        }

        // If the loop ends, it means the username is valid
        JOptionPane.showMessageDialog(null, "✅ Username is valid!");
        
        while (!validPassword) {
            password = JOptionPane.showInputDialog("Create a password:\n(Min 8 chars, include uppercase, number, and special character)");

            if (password == null) {
                JOptionPane.showMessageDialog(null, "Cancelled by user. Exiting...");
                System.exit(0);
            }

            validPassword = isValidPassword(password);

            if (!validPassword) {
                JOptionPane.showMessageDialog(null, "Invalid password!\nPassword must be at least 8 characters long and include:\n- An uppercase letter\n- A number\n- A special character.");
            }
        }

        // Success
        JOptionPane.showMessageDialog(null, "✅ Username and Password successfully created!");
        
         while (!validPhone) {
            phoneNumber = JOptionPane.showInputDialog("Enter your cellphone number:\n(Must start with 0 and be exactly 10 digits — e.g. 0821234567)");

            if (phoneNumber == null) exit();

            validPhone = isValidCellphoneNumber(phoneNumber);

            if (!validPhone) {
                JOptionPane.showMessageDialog(null, "Invalid cellphone number!\nIt must:\n- Start with 0\n- Be exactly 10 digits long\nExample: 0821234567");
            }
        }
         
          // Success
        JOptionPane.showMessageDialog(null, "✅ Registration complete!\nAll inputs are valid.");
        
          // Get registration message
        String message = getRegistrationMessage( password, phoneNumber,inputUsername);
          // Show registration message
        JOptionPane.showMessageDialog(null, message);
        
        // Store the valid registration details
        if (message.startsWith("✅")) {
            storeUserDetails(inputUsername, password, phoneNumber);
        }

        // Check if the user details match when entered again
        String enteredUsername = JOptionPane.showInputDialog("Enter your username again to verify:");
        String enteredPassword = JOptionPane.showInputDialog("Enter your password again to verify:");
        String enteredPhoneNumber = JOptionPane.showInputDialog("Enter your cellphone number again to verify:");

        if (doEnteredDetailsMatch(enteredUsername, enteredPassword, enteredPhoneNumber)) {
            JOptionPane.showMessageDialog(null, "✅ Details match! You are successfully verified.");
        } else {
            JOptionPane.showMessageDialog(null, "❌ Details do not match. Please check your information.");
        }
        
        // Get the login message
        String loginMessage = getLoginMessage(enteredUsername, enteredPassword, enteredPhoneNumber);

         // Display the login result
        JOptionPane.showMessageDialog(null, loginMessage);
        
    
    }
    

    private static void exit() {
        JOptionPane.showMessageDialog(null, "Cancelled by user. Exiting...");
        System.exit(0);
    }
    
    
}
    


       
    

