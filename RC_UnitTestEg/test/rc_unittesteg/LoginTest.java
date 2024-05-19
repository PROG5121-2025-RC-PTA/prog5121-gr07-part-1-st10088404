/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rc_unittesteg;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @Test
    public void testSetName() {
    }

    @Test
    public void testSetUserName() {
    }

    @Test
    public void testGetName() {
    }

    @Test
    public void testGetUserName() {
    }

    @Test
    public void testCheckUserNametrue() {
        
        // Arrange
        boolean expected = true;
        String expectedUsername = "Ky12_";
        //Act
        Login login = new Login();
        login.setUserName(expectedUsername);
        boolean actual = login.checkUserName();
        //Assert
        assertTrue(actual);
    }
    @Test
    public void testCheckUserNamefalse() {
        
        // Arrange
        boolean expected = true;
        String expectedUsername = "Ky12_xmxiw";
        //Act
        Login login = new Login();
        login.setUserName(expectedUsername);
        boolean actual = login.checkUserName();
        //Assert
        assertFalse(actual);
    }
    @Test 
    public void registerStatus()
    {
        //Arrange
        String expected = "Correct UserName";
        //Act
        Login login = new Login();
        login.setUserName("syd2*");
        String actual = login.registerStatus();
        //Assert
        assertEquals(expected, actual);
    }
    
    
    
    
}




