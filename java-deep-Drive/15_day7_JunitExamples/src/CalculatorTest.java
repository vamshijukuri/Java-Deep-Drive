import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	static Calculator obj;

	int a = 0;
	int b = 0;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj = new Calculator();
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
		obj = null;
	}

	@Before
	public void setUp() throws Exception {

		a = 2;
		b = 4;
	}

	@After
	public void tearDown() throws Exception {

		a = 0;
		b = 0;
	}

	@Test
	public void testAdd() {
		int result = obj.add(a, b);

		assertEquals(6, result);
	}

	@Test
	public void testSubtract() {
		int result = obj.subtract(a, b);
		assertNotNull(result);

		assertEquals(-2, result);

	}

	@Test
	public void testMultiply() throws Exception {
		int result = obj.multiply(a, b);
		assertNotNull(result);

		assertEquals(8, result);
		
		

	}

}
