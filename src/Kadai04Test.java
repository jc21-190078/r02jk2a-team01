import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai04Test {

	@Test
	void testgetMaxString() {
		Kadai04 k = new Kadai04();
		String s = "CLASS";
		assertEquals('S',k.getMaxString(s));
	}

}
