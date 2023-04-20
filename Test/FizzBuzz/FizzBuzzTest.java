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
	void fbAns_1_to_1() {
		assertEquals(fb.fizzbuzz(1),"1");
	}
	
	@Test
	void fbAns_2_to_2() {
		assertEquals(fb.fizzbuzz(2),"2");
	}
	
	@Test
	void fbAns_Fizz_to_3() {
		assertEquals("fizz", fb.fizzbuzz(3));
	}

}
