package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elements 
{
public WebElement ele;	 
public WebDriver driver;
public elements(WebDriver driver) 
{
    this.driver = driver;
}
  //***********************************************Login-Page*********************************
public By Email = By.xpath("//*[@id=\"Email\"]");
public By Password = By.xpath("//*[@id=\"Password\"]");
public By Login_In = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
public By Login_In1 = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
public By Account = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
public By Lerror = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span");
public void dfind(By locator) 
{
    WebElement element = driver.findElement(locator);
    element.click();
}
public void dfind(By locator, String text) 
{
    WebElement element = driver.findElement(locator);
    element.sendKeys(text);
}
public WebElement dfind1(By locator) 
{
    return driver.findElement(locator);
}
}