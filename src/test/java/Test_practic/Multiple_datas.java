package Test_practic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_datas {
	
	@Test(dataProvider = "testData")
	private void credntial(String Username ,int Password) {
		System.out.println("username :"+ Username);
		System.out.println("password :"+ Password);
		
	}
	
	@DataProvider
	private Object[][] testData() {
		return new Object[][] {
			{"starc",56},
			{"smith",49}
			
		};
		
		
	}

}
