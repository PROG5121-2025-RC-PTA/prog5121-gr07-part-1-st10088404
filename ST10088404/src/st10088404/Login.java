/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10088404;

import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Login 
{
    // Declaration
    
     private String firstName;
     private String lastName;
     private String userName;
     private String password;
     
      // Constructor
     public Login (String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
     
    public boolean checkUserName(String userName) {
        return userName.length() < 5 && userName.contains("_");
    }

    public static boolean checkPasswordComplexity(String password) {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        if(!password.contains(pattern)){
            System.out.println("Please ensure password is correct");
        }
        return Pattern.matches(pattern, password);
    }
    
     public String registerUserName(String userName, String password) {
        if (checkUserName(userName) && checkPasswordComplexity(password)) {
            return "Registration successful";
        } else {
            return "Registration failed. Username must be less than 5 characters and contain underscore. Password must have at least 8 characters with special characters, numbers, small and capital letters.";
        }
    }

    public static boolean loginUser(Login user, String userName, String password) {
        return user.getUserName().equals(userName) && user.getPassword().equals(password);
    }
    
    
      public static String returnLoginStatus(boolean loggedIn) {
        if (loggedIn) {
            return "Login successful";
        } else {
            return "Login unsuccessful";
        }
    }

    boolean checkPasswordCompelxity(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean returnLoginStatues(boolean loggedIn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
     
     
}
