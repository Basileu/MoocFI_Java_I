
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Test1 {
    
    @Test
    public void testUI() {
        System.out.println("Executing my 1st test case");
        UserInterface myUI = new UserInterface(null, null);
        Assert.assertEquals("test string ", myUI.methodToTest());
    }
}
