/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dashboardlogin;


 import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DashBoardLogin {

    public static void main(String[] args) 
    {
      // Declaration 
        
        String firstName; 
        String lastName;
        String userName;
        String password;
        
        
        // input
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your first name");
        firstName= input.nextLine();
        
        System.out.println("What is your last name");
        lastName= input.nextLine();
        
        System.out.println("What is your user name");
        userName= input.nextLine();
        
 
        System.out.println("What is your password");
        password= input.nextLine();

        System.out.println("What is your user name");
        userName= input.nextLine();

      
        // Create object to Display
        
        Login login =new Login();
          login.setFirstName(firstName);
          login.setLastName(lastName);
          login.setUserName(userName);
          login.setPassword(password);
          
          // Display
           System.out.print(login.checkUserName(userName));
            System.out.print(login.checkPasswordComplexity(password, password));
            System.out.print(login.registerUserName(userName, password));
            System.out.print(login.loginUser(login, userName, password));
            System.out.print(login.returnLoginStatus());
        
            TaskClass taskclass = new TaskClass();   
            taskclass.promptUserOption();
            taskclass.run();
            String TaskName= JOptionPane.showInputDialog("Please enter your task name");
            String TaskDescription = JOptionPane.showInputDialog("Please enter a short Description of your task");
            String TaskNumber = JOptionPane.showInputDialog("Enter the task numeber");
            String Details = JOptionPane.showInputDialog("Please Enter first and last Name of developer ");
        
            
         
          taskclass.setTaskName(TaskName);
          taskclass.setTaskDescription(TaskDescription);           
          taskclass.setTaskName(TaskName);
                
            JOptionPane.showMessageDialog(null, taskclass.promptUserOption());
        
            
    }
    
}
       
    

