package com.Maven_project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ingresar {
	
	private WebDriver Driver;
//	
	By Ingresar = By.linkText("INICIAR SESIÓN");
	By email = By.xpath("//*[@id=\"dwfrm_login_username\"]");
	By contraseña = By.xpath("//*[@id=\"dwfrm_login_password\"]");
	By ingresar = By.xpath("//*[@id=\"dwfrm_login\"]/fieldset/div[4]");
	
	
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/Chrome-Driver/chromedriver.exe");
		Driver = new ChromeDriver();
		// tamaño del ejecutable Driver
		Driver.manage().window().maximize();
		// envia url
		Driver.get("https://www.adidas.co/camiseta-visitante-manchester-united/ED7388.html");
	}

	@Test
	public void Buscar_Hombres() throws InterruptedException {

		Driver.findElement(Ingresar).click();
		Driver.findElement(email).sendKeys("nicodt0@gmail.com");
		Driver.findElement(contraseña).sendKeys("kora23*_");
		Driver.findElement(ingresar).click();
		
		
	}

	@After

	public void cierre() {
	 //Driver.close();
	}

}
