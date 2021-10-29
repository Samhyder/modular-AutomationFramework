package com.hrms.lib;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//contains all the re-usable functions when executing test cases.
public class General extends Global {
	
	public void openApplication() {
	//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
	}
	
	public void closeApplication(){
		driver.close();
		System.out.println("Application closed");
	}
	public void login() {
		System.out.println(txt_loginname + "," + userName);
		driver.findElement(By.name(txt_loginname)).sendKeys(userName);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
	}
	
	public void enterFrame() {
		driver.switchTo().frame(iframe_rightMenu);
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
	}
	
	public void addEmp() {
		ac  = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(pim))).perform();
		driver.findElement(By.linkText(addEmp)).click();
		enterFrame();
		driver.findElement(By.name(txt_firstName)).sendKeys("aadbc");
		driver.findElement(By.name(txt_lastName)).sendKeys("a");
		driver.findElement(By.id(saveBtn)).click();
		System.out.println("emp added");
		driver.findElement(By.xpath(backBtn)).click();
		exitFrame();
	}
	public void delEmp() throws InterruptedException {
		enterFrame();
		driver.findElement(By.xpath(checkBtn)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(deletebtn)).click();
		Thread.sleep(2000);
		System.out.println("Emp Deleted");
		exitFrame();
	}
	
	public void logout(){
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
		driver.close();
	}
	
}
