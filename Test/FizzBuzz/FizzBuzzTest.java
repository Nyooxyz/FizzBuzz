package FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	private FizzBuzz fb;
	
	@BeforeEach
	void setUp() {
		fb = new FizzBuzz();
	}

	@Test
	void test() {
		assertEquals(fb.fizzbuzz(1),"1");
	}
	
	@Test
	void test2() {
		assertEquals(fb.fizzbuzz(2),"2");
	}

}
