package base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class claseBase {

	
	public WebDriver driver;
	
	public claseBase (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	public WebElement fiendElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public List<WebElement> fiendElements(By Locator){
		return driver.findElements(Locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	} 
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
		}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
		}
	
	public void click(By locator) {
		driver.findElement(locator).click();
		}
	
	public Boolean isDisplayed(By locator) {
		try {
		return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
		return false;
		}
		}
	
	public Boolean isSelected(By locator) {
		try {
		return driver.findElement(locator).isSelected();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	public void visit(String url) {
		driver.get(url);
		}
	
}
