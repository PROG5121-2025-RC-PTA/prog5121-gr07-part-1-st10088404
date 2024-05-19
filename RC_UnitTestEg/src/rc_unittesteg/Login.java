/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc_unittesteg;

/**
 *
 * @author User
 */
public class Login {
    
    private String name;
    private String userName;

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }
    
    public boolean checkUserName()
    {
         String Pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";  
        if(userName.length()<6 && userName.matches(Pattern))
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    public String registerStatus()
    {
        if (checkUserName()== true)
        {
            return "Correct UserName";
        }
        else{
        return "Incorrect UserName";
        }
    }
    
    
    
    
    
    
    
}
