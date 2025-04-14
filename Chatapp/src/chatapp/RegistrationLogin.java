/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

/**
 *
 * @author User
 */
public class RegistrationLogin {
    // Store registered user details (simulated storage)
    private static String registeredUsername = "";
    private static String registeredPassword = "";
    private static String registeredPhoneNumber = "";
    
    public static boolean isValidUsername(String username) {
        // Check if username contains an underscore and is less than 5 characters long
        return username.contains("_") && username.length() < 5;
    }
    
    public static boolean isValidPassword(String password) {
        // Check minimum length
        if (password.length() < 8) return false;

        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUppercase = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecialChar = true;
        }

        return hasUppercase && hasDigit && hasSpecialChar;
    }
     public static boolean isValidCellphoneNumber(String phoneNumber) {
        // Local format: Must start with 0 and be exactly 10 digits
        return phoneNumber.matches("0\\d{9}");
    }
     
     public static String getRegistrationMessage(String inputUsername, String password, String phoneNumber) {
        if (!isValidUsername(inputUsername)) {
            return "Invalid username! Username must contain '_' and be less than 5 characters.";
        }
        if (!isValidPassword(password)) {
            return "Invalid password! Password must be at least 8 characters, contain an uppercase letter, a number, and a special character.";
        }
        if (!isValidCellphoneNumber(phoneNumber)) {
            return "Invalid cellphone number! It must start with 0 and be exactly 10 digits long (e.g. 0821234567).";
        }
        return "✅ Registration complete! All inputs are valid.";
    }
   
     
    // Method to simulate storing the registration details
    public static void storeUserDetails(String inputUsername, String password, String phoneNumber) {
        registeredUsername = inputUsername;
        registeredPassword = password;
        registeredPhoneNumber = phoneNumber;
    }

    // Method to check if the entered details match the stored ones
    public static boolean doEnteredDetailsMatch(String enteredUsername, String enteredPassword, String enteredPhoneNumber) {
        return enteredUsername.equals(registeredUsername) && 
               enteredPassword.equals(registeredPassword) && 
               enteredPhoneNumber.equals(registeredPhoneNumber);
    }
    
    // Method to generate a login success/failure message
    public static String getLoginMessage(String enteredUsername, String enteredPassword, String enteredPhoneNumber) {
        if (doEnteredDetailsMatch(enteredUsername, enteredPassword, enteredPhoneNumber)) {
            return "✅ Login successful! Welcome back.";
        } else {
            return "❌ Login failed! The details entered do not match our records.";
        }
    }
    public static String getWelcomeMessage(String username) {
    if (isValidUsername(username)) {
        return "Welcome " + username + " nice to see you again";
    } else {
        return "Invalid username";
    }
}

    
    
    
}
