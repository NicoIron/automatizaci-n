package com.Maven_project;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRueba {

	private WebDriver Driver;
//	By linkH = By.linkText("HOMBRES");
//	By RopaH = By.linkText("Ropa");
	By SelecProduc = By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[10]/div/div/div/div[1]/a");
	By seleccionarTalla = By.xpath("//*[@id=\\\"app\\\"]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[2]/div[1]/div/div/button");
	By seleccionarTalla_2 = By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[2]/div[1]/div/div/div/div/ul/li[2]");
	By AñadirCArrito = By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[3]");
	By linkContinuar = By.linkText("www.adidas.co/on/demandware.store/Sites-adidas-CO-Site/es_CO/CODelivery-Start");
	By Ingresar = By.linkText("Iniciar sesión");
	
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/Chrome-Driver/chromedriver.exe");
		Driver = new ChromeDriver();
		// tamaño del ejecutable Driver
		Driver.manage().window().maximize();
		// envia url
		Driver.get("https://www.adidas.co/ropa");
	}

	@Test
	public void Buscar_Hombres() throws InterruptedException {
//		Driver.findElement(linkH).click();
//		Thread.sleep(5000);
//		Driver.findElement(RopaH).click();
//		Thread.sleep(5000);
		Driver.findElement(SelecProduc).click();
//		Thread.sleep(5000);
		Driver.findElement(seleccionarTalla).click();
		Driver.findElement(seleccionarTalla_2).click();
		Driver.findElement(AñadirCArrito).click();
		//Driver.findElement(linkContinuar).click();
		Driver.findElement(Ingresar);
		
		
		
	}

	@After

	public void cierre() {
	 //Driver.close();
	}

}
