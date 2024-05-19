/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10088404;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ST10088404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         // Test the methods
        String firstName;
        String lastName;
        String userName;
        String password;
        
         Scanner input = new Scanner(System.in);
         System.out.println("What is your First Name");
         firstName = input.nextLine();
         
         System.out.println("What is your Last Name");
         lastName = input.nextLine();
        
         System.out.println("What is your User Name");
         userName = input.nextLine();
        
         System.out.println("What is your Password");
         password = input.nextLine();
        
        
          Login login = new Login();
          
          login.setFirstName(firstName);
          login.setLastName(lastName);
          login.setUserName(userName);
          login.setPassword(password);
          
          // Display
          System.out.print(login.checkUserName(userName));
           System.out.print(login.checkPasswordCompelxity(password));
            System.out.print(login.registerUserName(userName, password));
            
            String loginUser=null;
            String loginPassword=null;
            boolean loggedIn = login.loginUser(login, loginUser, loginPassword);
            System.out.println(login.returnLoginStatues(loggedIn));
            
        
    }
    
}
