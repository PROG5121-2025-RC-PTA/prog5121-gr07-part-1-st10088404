/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dashboardlogin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test; 
/**
 *
 * @author User
 */
public class LoginTest {
    
    LoginTest logintest = new LoginTest(); 
    public LoginTest() {
    }

    @Test
    public void testgetFirstName() 
    {
     String expected = "welcome back ";
     String actual = logintest.GetFirstName();
      
     assertEquals(expected,actual  );
    }

    @Test
    public void testSetLastName() {
    }

    @Test
    public void testSetUserName() {
    }

    @Test
    public void testSetPassword() {
    }

    @Test
    public void testGetFirstName() {
    }

    @Test
    public void testGetLastName() {
    }

    @Test
    public void testGetUserName() {
    }

    @Test
    public void testGetPassword() {
    }

    @Test
    public void testCheckUserName() {
    }

    @Test
    public void testCheckPasswordComplexity() {
    }

    @Test
    public void testRegisterUserName() {
    }

    @Test
    public void testLoginUser() {
    }

    @Test
    public void testReturnLoginStatus() {
    }

    private String GetFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
