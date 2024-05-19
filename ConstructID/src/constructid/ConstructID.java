/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructid;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConstructID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        // Declaclaration
        String fullName;
        String address;
        
        // Prompt the user for full name and street address
        System.out.println("Enter your full name:");
         fullName = scanner.nextLine();
        
        System.out.println("Enter your street address:");
         address = scanner.nextLine();
        
        // Construct the ID
        String id = constructID(fullName, address);
        
        // Print the constructed ID
        System.out.println("Your ID is: " + id);
        
    }
    
    public static String constructID(String fullName, String address) {
        // Extract initials from the full name
        String[] names = fullName.split("\\s+");
        StringBuilder initials = new StringBuilder();
        
          for (String name : names) {
            initials.append(name.charAt(0));
        }
        
        // Extract numeric part from the address
        String numericPart = address.replaceAll("\\D", "");
        
        // Combine initials and numeric part to construct the ID
        String id = initials.toString().toUpperCase() + numericPart;
        
        return id;
    }
      
    }
    

