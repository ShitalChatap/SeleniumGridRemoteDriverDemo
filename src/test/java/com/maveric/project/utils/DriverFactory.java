package com.maveric.project.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory 
{

	@SuppressWarnings("deprecation")
	public static WebDriver getDriver() throws MalformedURLException 
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setBrowserName("chrome");
		desiredCapabilities.setPlatform(Platform.WIN10);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:1111/wd/hub"), desiredCapabilities);
		return driver;
	}
}
