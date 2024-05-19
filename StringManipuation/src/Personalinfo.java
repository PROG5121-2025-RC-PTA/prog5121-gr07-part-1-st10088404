/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Personalinfo {
    
    
    private String name;
    private String lastName;
    private String address;
    private String ID;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getID() {
        return ID;
    }
    
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
