package dashboardlogin;
import java.util.regex.Pattern;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Login {
    
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    
    
    
    
    // setters and getters 

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

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean checkUserName(String userName)
    {
        if (userName.contains("_") && userName.length()<5 )
        {
            System.out.println("Welcome back "+ firstName +  lastName + " Nice to see you again ");
        }
        else
        {
            System.out.println("User Name incorrectly formatted, Please ensure that it contains an underscore and has five or less char");
        }
         return userName.length() < 5 && userName.contains("_");
    }

    public boolean checkPasswordComplexity(String password, String pattern)
        {
          String Pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).*^";  
          if(password.contains(Pattern) && password.length()<8)
          {
             System.out.println("Correct Password");
          }
          else{ 

             System.out.println("Please ensure password is correct"); 
          }
           return false;
        }
         
          public String registerUserName(String userName, String password)
    {
         if (this.userName.matches(userName)&& this.password.matches(password)) {
            return "Your Registration is successful";
        } else {
            return "Registration failed. Username must be less than 5 characters and contain underscore. Password must have at least 8 characters with special characters, numbers, small and capital letters.";
        }
    }
  
         public boolean loginUser(Login user, String userName, String password) {
        return user.getUserName().equals(userName) && user.getPassword().equals(password);
    }
         
         public String returnLoginStatus() {
             Login login = new Login(); 
             boolean loggedIn=login.loginUser(null, userName, password);
        if (loggedIn) {
            return "Login successful";
        } else {
            return "Login unsuccessful";
        }
        
           
}

}



    
     
 

