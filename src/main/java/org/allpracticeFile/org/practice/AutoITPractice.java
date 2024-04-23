package org.allpracticeFile.org.practice;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;


public class AutoITPractice {

	public static void main(String[] args) throws Exception 
	{
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://altoconvertpdftojpg.com/");
	 driver.findElement(By.xpath("//button[@id='browse']")).click();
	 Thread.sleep(3000);
	 //MethodOfExe.exeRun();
	 Runtime.getRuntime().exec("D:\\Autoit_Example\\RohitSeleniumFolder.exe");
	 
	 
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submit_btn']")));
	 driver.findElement(By.xpath("//button[@id='submit_btn']")).click();
	 
	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(1000));
	 wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submit_btn']")));
	 driver.findElement(By.xpath("//button[@id='submit_btn']")).click();
	 
	 
	

	}

}
