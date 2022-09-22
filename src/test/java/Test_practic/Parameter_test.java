package Test_practic;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_test {
	
	@Test
	@Parameters({"username","password"})
	
	private void credntial(@Optional("starc")String username ,@Optional("123")int password) {
		System.out.println("username :"+ username);
		System.out.println("password :"+ password);
	}

}