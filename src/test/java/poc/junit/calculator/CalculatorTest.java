package poc.junit.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import poc.junit.calculator.generator.SimpleDisplayNameGenerator;

//@DisplayName("Test Calculator")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class CalculatorTest {

	private Calculator calculator = new Calculator();
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("Before Each");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("After Each");
	}
	
	@Test
	public void testAddSuccess() {
		var result = calculator.add(10, 10);
		assertEquals(20, result);
	}
	
	@Test
	public void testDivideSuccess() {
		var result = calculator.divide(100, 10);
		assertEquals(10, result);
	}
	
	@Test
	public void testDivideError() {
		assertThrows(IllegalArgumentException.class, ()->{
			calculator.divide(100, 0);
		});
	}
	
	@Test
	@Disabled
	public void testCommingSoon() {
		
	}
	
	@Test
	public void testAborted() {
		var profile = System.getenv("PROFILE");
		if(!"DEV".equals(profile)) {
			throw new TestAbortedException("Tes dibatalkan karena bukan DEV");
		}
	}
	
}
