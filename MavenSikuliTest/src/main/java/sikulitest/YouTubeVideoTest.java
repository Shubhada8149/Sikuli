package sikulitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Shubhada//Documents//Selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/watch?v=bHWgc5MPnPA");
		Thread.sleep(10000);

		Screen s = new Screen(); // create obj of sikuli class

		// click on full screen icon
		Pattern fullscreenImg = new Pattern("full_screen.png");
		s.wait(fullscreenImg, 7000);
		s.click();

		// click on skip add
		Pattern skipAddImg = new Pattern("skip_add.png");
		s.wait(skipAddImg, 2000);
		s.click();

		// click on pause button
		Pattern pauseImg = new Pattern("skip_add.png");
		s.wait(pauseImg, 2000);
		s.click();

		// click on play button
		Pattern playImg = new Pattern("skip_add.png");
		s.wait(playImg, 2000);
		s.click();

	}

}
