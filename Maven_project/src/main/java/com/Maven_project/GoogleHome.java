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
import org.openqa.selenium.interactions.Actions;

public class GoogleHome {

	private WebDriver Driver;
	By Ingresar = By.linkText("INICIAR SESIÓN");
	By email = By.xpath("//*[@id=\"dwfrm_login_username\"]");
	By contraseña = By.xpath("//*[@id=\"dwfrm_login_password\"]");
	By ingresar = By.xpath("//*[@id=\"dwfrm_login\"]/fieldset/div[4]");
	By cuadro = By.xpath("//*[@id=\"overlay_membersonly\"]/p/a[1]/img");
	By linkH = By.linkText("HOMBRES");
	By RopaH = By.linkText("Ropa");
	By SelecProduc = By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[10]/div/div/div/div[1]/a");
	By seleccionarTalla = By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[3]/div[2]/div[2]/div/div/form/div[2]/div[1]/div/div");
	By seleccionarTalla_2 = By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[3]/div[2]/div[2]/div/div/form/div[2]/div[1]/div/div/div/div/ul/li[1]");
	By AñadirCArrito = By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[3]/div[2]/div[2]/div/div/form/div[3]/button");
	By VEr_Carrito = By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div/div[1]/div[3]/div/a[1]");
	

	
	
	
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
		Driver.findElement(cuadro).click();
		Driver.findElement(linkH).click();
		Thread.sleep(5000);
		Driver.findElement(RopaH).click();
		Thread.sleep(5000);
		Driver.findElement(SelecProduc).click();
		Thread.sleep(5000);
		Driver.findElement(seleccionarTalla).click();
		Thread.sleep(5000);
		Driver.findElement(seleccionarTalla_2).click();
		Thread.sleep(5000);
		Driver.findElement(AñadirCArrito).click();
		Thread.sleep(5000);
		Driver.findElement(VEr_Carrito).click();

		

//		Driver.findElement(linkContinuar).click();
	
		
		
	}

	@After

	public void cierre() {
	 //Driver.close();
	}

}
