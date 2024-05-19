package dashboardlogin;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TaskClass 
{
    // Declaration
    private String taskName;
    private int taskNum;
    private String taskdescription;
    private String developerDetails;
    private String taskID;
    private String taskDuration;
    private String taskStatus;
    private ArrayList<String> tasksNum;
    

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public void setDescription(String description) {
        this.taskdescription = description;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public void setTaskDuration(String taskDuration) {
        this.taskDuration = taskDuration;
    }

    public void setTaskStatues(String taskStatues) {
        this.taskStatus = taskStatues;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public String getDescription() {
        return taskdescription;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getTaskDuration() {
        return taskDuration;
    }

    public String getTaskStatues() {
         return taskStatus;
    }
    
         public TaskClass() {
         tasksNum = new ArrayList<>();
    
    }
         Scanner input = new Scanner(System.in);
         
         public int promptUserOption() {
         int option = 0;
         Login login = new Login(); 

         if(login.returnLoginStatus().matches(login.registerUserName(taskName, taskID)))
         {JOptionPane.showInputDialog("Welcome to Easykanhan: ");
         
        while (true) {
            JOptionPane.showInputDialog("Please select an option below: ");
            String addTask = JOptionPane.showInputDialog("1. Add Task" );
            String showreport = JOptionPane.showInputDialog("2. Show Report");
            String quit = JOptionPane.showInputDialog("3. Quit");
            JOptionPane.showInputDialog(": ");
             
            if (input.hasNextInt()) {
                option = input.nextInt();
                if (option >= 1 && option <= 3) {
                    break;
                  
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Number must be between 1 and 3.");
                }
            } else {
                JOptionPane.showMessageDialog(null," Invalid input. Please enter a number.");
                input.next(); // clear the invalid input
            }            

          }                      
         }
         return option;    
         }
         
      public void addTask() {
        JOptionPane.showMessageDialog(null, "Enter the task description:");
        taskdescription = input.nextLine();
        tasksNum.add(taskdescription);
       JOptionPane.showMessageDialog(null, "Task successfully captured: ");}
      
      
       public void showReport() {
        JOptionPane.showMessageDialog(null, "Task Report: " );
        if (tasksNum.isEmpty()) {
         JOptionPane.showMessageDialog(null, "Task coming soon! ");
        } else {
            for (int i = 0; i < tasksNum.size(); i++) {
                System.out.println((i + 1) + ". " + tasksNum.get(i));
            }
        }
       }
        public void run() {
        while (true) {
            int option = promptUserOption();
            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    showReport();
                    break;
                case 3:
                  JOptionPane.showMessageDialog(null, "Quitting... ");
                    return;
                default:
                JOptionPane.showMessageDialog(null, "Please try again ");
            }
        }
    }
      
     
       public boolean CheckTaskDescription()
    {
           
            if(taskdescription.length()>= 50 )
            {
               JOptionPane.showMessageDialog(null, "Please enter a description of 50 or less characters ");
            }
            return false;
            
    }
                
     
     public String CreateTaskID(String TaskName, String fullName, int TaskNum)
     {
         JOptionPane.showInputDialog("Enter the name of the task");
         TaskName = input.nextLine();
         
           // Extract from Task name
        String[] tasks = TaskName.split("\\s++");
        StringBuilder initials = new StringBuilder();
        
          for (String name : tasks) {
            initials.append(name.charAt(1));
        }
        
        // Extract from Developers name
         JOptionPane.showInputDialog("Enter the developer's first and last name");
         fullName = input.nextLine();
         
         String []Developer = fullName.split("\\++s");
         StringBuilder assign = new StringBuilder();
         for(String name : Developer)
         {
            assign.append(name.charAt(1));
         }
      
 
        // Combine 
        String id = initials.toString().toUpperCase()+" : " + TaskNum + " : "+assign.toString().toUpperCase();
        
        return id;
       
      }
        
     
     public int PrintTaskDetails()
     { 
         int menu=0;
         JOptionPane.showInputDialog("Please select an option");
         String toDo =  JOptionPane.showInputDialog("1. TO DO");
         String done =  JOptionPane.showInputDialog("2. DONE");
         String Doing = JOptionPane.showInputDialog("3. DOING");
         
          if (input.hasNextInt()) {
                menu = input.nextInt();
                if (menu >= 1 && menu <= 3) {
                    
                    JOptionPane.showMessageDialog(null, "Please Enter Task.");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Number must be between 1 and 3.");
                }
            } else {
                JOptionPane.showMessageDialog(null," Invalid input. Please enter a number.");
                input.next(); // clear the invalid input
            } 
          return menu;
          }
 }


              
     

    
    

     

