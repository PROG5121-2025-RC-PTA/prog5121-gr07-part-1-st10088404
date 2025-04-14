/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package chatapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class RegistrationLoginTest {
    
    public RegistrationLoginTest() {
    }

    @Test
    void testValidUsernameWelcomeMessage() {
        String username = "u_er"; // valid: contains "_" and < 5 chars
        String expectedMessage = "Welcome u_er nice to see you again";
        
        String actualMessage = RegistrationLogin.getWelcomeMessage(username);

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testInvalidUsernameWelcomeMessage() {
        String username = "user"; // invalid: no underscore
        String expectedMessage = "Invalid username";
        
        String actualMessage = RegistrationLogin.getWelcomeMessage(username);

        assertEquals(expectedMessage, actualMessage);
    }
    
}
