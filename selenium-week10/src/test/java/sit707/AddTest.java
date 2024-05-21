package sit707;

import org.junit.Assert;
import org.junit.Test;


public class AddTest{
	@Test
	public void testAddValidAB() {
		Assert.assertEquals(MathUtil.add(1,2),3);
	}
}