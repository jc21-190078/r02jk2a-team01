import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai02Test {

	@Test
	void testReverseString() {
		Kadai02 k = new Kadai02();
		assertNull(k.countString(null,' '));
		assertEquals(2,k.countString("ApplePie",'p'));
	}


}
