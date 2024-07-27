package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Selenium {
  @Test
  public void f() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://ww.google.com");
  }
}
