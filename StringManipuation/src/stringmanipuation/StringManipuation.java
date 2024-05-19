/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringmanipuation;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class StringManipuation {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for full name and street address
        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();
        
        System.out.println("Enter your street address:");
        String address = scanner.nextLine();
        
        //Construct ID
        String id;
        id = contsructID(fullName, address);
        
        // Print the constructed ID
        System.out.println("Your ID is: " + id);
        
         
    public static String ConstructId(String fullName, String Address)
    {
       //Extract intials from name and address
       
        String[] names = fullName.split("\\s+");
        StringBuilder initials = new StringBuilder();
        
        for (String name : names) {
            initials.append(name.charAt(0));
        }
        
        // Extract numeric part from the address
        String numericPart = Address.replaceAll("\\D", "");
        
        // Combine initials and numeric part to construct the ID
        String id = initials.toString().toUpperCase() + numericPart;
        
        return id;
        
        
        
    }
   

   

}
    

