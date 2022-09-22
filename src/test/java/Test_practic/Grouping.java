package Test_practic;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "social media")
	public void whatsapp() {
		System.out.println("whatsapp");
		}
	
	@Test(groups = "social media")
	private void facebook() {
		System.out.println("Facebook");
		}
	
	@Test(groups = "social media")
	private void instagram() {
		System.out.println("Instagram");
		}
	@Test(groups = "Musics")
	public void wynkMusic() {
		System.out.println("Music");
	}
	@Test(priority = -1 ,groups = "social media")
	public void youtube() {
		System.out.println("Youtube");
	}
	@Test(groups = "Musics")
	public void spotify() {
		System.out.println("albums");
	}
}


