/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poePart1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class RegistrationNLogin {
 
    
    
    public static void main(String[] args) {
    
  
        // Test the methods
        String userName = "john_doe";
        String password = "Password@123";

        User user = new User("John", "Doe", userName, password);

        System.out.println(Login.registerUserName(userName, password));

        String loginUserName = "john_doe";
        String loginPassword = "Password@123";

        boolean loggedIn = Login.loginUser(user, loginUserName, loginPassword);
        System.out.println(Login.returnLoginStatus(loggedIn));
       
       
         
    
    }
}
    

