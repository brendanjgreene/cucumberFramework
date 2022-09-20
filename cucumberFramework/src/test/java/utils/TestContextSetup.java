package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String searchString;
	public String fullName;
	public String firstProduct;
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
	public GenericUtils genUtils;
	public int num;
	boolean runParallel;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		genUtils = new GenericUtils(driver);
		driver=testBase.myWebDriverManager();
		pageObjectManager=new PageObjectManager(driver);
		
		String browser_maven = System.getProperty("browser");
		runParallel = !(browser_maven!=null && browser_maven.contentEquals("safari"));
	}
	
	
}
