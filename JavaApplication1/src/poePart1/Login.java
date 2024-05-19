/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poePart1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Login
{

    static boolean returnLoginStatus(boolean loggedIn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String userName;
    private String firstName;
    private String lastName;
    private String password;    

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
    
    public static boolean checkUserName(String userName) {
        return userName.length() < 5 && userName.contains("_");
    }
    
    public static boolean checkPasswordComplexity(String password) {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return Pattern.matches(pattern, password);
    }
    
     public static String registerUserName(String userName, String password) {
        if (checkUserName(userName) && checkPasswordComplexity(password)) {
            return "Registration successful";
        } else {
            return "Registration failed. Username must be less than 5 characters and contain underscore. Password must have at least 8 characters with special characters, numbers, small and capital letters.";
        }
    }
     
       public static boolean loginUser(User user, String userName, String password) {
        return user.getUserName().equals(userName) && user.getPassword().equals(password);
    }


   
    
   
}

    
   