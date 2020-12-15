import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai01Test {

	@Test
	void testReverseString() {
		Kadai01 k = new Kadai01();
//		assertNull(k.ReverseString(null));
		assertEquals("4321",k.ReverseString("1234"));
		assertEquals("FEDCBA",k.ReverseString("ABCDEF"));
		assertEquals("5 4A 6",k.ReverseString("6 A4 5"));

	}

}
