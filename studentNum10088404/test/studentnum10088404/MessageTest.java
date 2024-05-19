/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package studentnum10088404;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test; 
/**
 *
 * @author User
 */
public class MessageTest {
    
    Message message = new Message();
    public MessageTest() {
    }

    @Test
    public void testgetMessage() 
    {
     String expected = "welcome back ";
     String actual = message.getMessage();
      
     assertEquals(expected,actual  );
    }
    
}
