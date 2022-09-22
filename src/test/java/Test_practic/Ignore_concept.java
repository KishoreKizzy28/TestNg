package Test_practic;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_concept {
	
	@Test
	public void whatsapp() {
		System.out.println("whatsapp");
		}
	
	@Test(enabled=false)
	private void facebook() {
		System.out.println("Facebook");
		}
	@Ignore
	@Test
	private void instagram() {
		System.out.println("Instagram");
		}
	@Test
	public void wynkMusic() {
		System.out.println("Music");
	}
	@Test(priority = -1, invocationCount = 5)
	public void youtube() {
		System.out.println("Youtube");
	}
}
