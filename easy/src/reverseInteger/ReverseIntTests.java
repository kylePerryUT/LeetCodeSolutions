package reverseInteger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ReverseIntTests {
	
	
	@Test
	public void testSmall() {
		assertEquals(321, ReverseInteger.reverse(123));
	}
	
	@Test
	public void testLarge() {
		assertEquals(83762981, ReverseInteger.reverse(18926738));
	}
	
	@Test
	public void testOverflow() {
		assertEquals(0, ReverseInteger.reverse(1534236469));
	}
}
