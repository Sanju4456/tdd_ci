package sit707;

import org.junit.Assert;
import org.junit.Test;


public class AddTest{
	 @Test
	    public void testAddition() {
	        // Testing addition of two positive numbers
	        Assert.assertEquals(MathUtil.add(5, 3), 8);
	    }
	   @Test
	    public void testAddValidAB() {
	        Assert.assertEquals(MathUtil.add(1, 2), 3);
	    }

}