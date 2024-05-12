package com.dropdown1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\.cache\\selenium\\chromedriver\\win32\\chromedriver_win32 (7)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
driver.get("https://www.opencart.com/index.php?route=account/register");
WebElement drpcountryEle=driver.findElement(By.xpath("//select[@id='input-country']"));
Select drpcountry=new Select(drpcountryEle);
drpcountry.selectByVisibleText("Denmark");
List<WebElement>alloptions=drpcountry.getOptions();
for(WebElement option:alloptions)
{
	if(option.getText().equals("cuba"))
	{
		option.click();
		break;
	}
}
	}

}
