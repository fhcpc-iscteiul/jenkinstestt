package jenkinstestt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MethodsTest {

	@Test
	void testTest1() {
		Methods t = new Methods();
		double d = t.test1();
		assertEquals(9.0, d);
	}
	
	@Test
	void testTest2() {
		Methods t = new Methods();
		int i = t.test2();
		assertEquals(5, i);
	}
	
	@Test
	void testTest3() {
		Methods t = new Methods();
		String s = t.test3();
		assertEquals("Hello World", s);
	}

}
