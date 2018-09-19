package dridi.demogit;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class MyUnitTest {
@Before
public void testbefore() {
	System.out.println("before");
}
	    @Test
    public void testadd() {
        MyUnit myUnit = new MyUnit();
        int result = myUnit.add(1, 2);
        assertEquals(3, result);
    }
    
    @After
    public void testafter() {
    	
    	System.out.println("after");
    }

}