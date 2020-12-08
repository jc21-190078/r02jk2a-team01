import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai05Test {

	@Test
	void testGetMax() {
		Kadai05 k = new Kadai05();
		int[] d = {4,10,5,20};
		assertEquals(20,k.getMax(d));
	}

}
