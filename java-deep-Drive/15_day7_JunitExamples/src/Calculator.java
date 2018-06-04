
public class Calculator {

	int add(int a, int b) {
		return a + b;
	}

	int subtract(int a, int b) {
		return a - b;
	}

	int multiply(int a, int b) throws Exception {
		if (a == 2) {
			throw new Exception("test");
		}
		return a * b;
	}

}
