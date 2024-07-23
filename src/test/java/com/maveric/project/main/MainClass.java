package com.maveric.project.main;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;
public class MainClass 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://github.com/");
	}
}
