package Test_practic;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions = ArithmeticException.class )
	private void demo() {
		int age = 10;
		System.out.println(age/0);
		
	}
}
