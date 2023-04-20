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
	
	void fbAns_to_int() {
		assertEquals("7", fb.fizzbuzz(7));
		assertEquals("13", fb.fizzbuzz(13));
	}
	
	@Test
	void fbAns_buzz() {
		assertEquals(fb.fizzbuzz(5),"buzz");

	}
	
	@Test
	void fbAns_fizz_to_6() {
		assertEquals(fb.fizzbuzz(6),"fizz");
		assertEquals(fb.fizzbuzz(400),"buzz");

	}
	
	@Test
	void fbAns_fizzbuzz_to_15() {
		assertEquals(fb.fizzbuzz(15),"fizzbuzz");
	}

}
