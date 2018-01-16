package com.efraimpc;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EjercicioTesting {
	
	public static WebDriver driver = new FirefoxDriver();
	public static String baseUrl = "https://www.google.com.mx";
	
	
	//Acciones
	public static void irAPaginaBase(){
		driver.get(baseUrl);
	}
	
	

	
	
	//Auxiliares
	public static boolean checarSiTituloEsIgualA(String tituloActual){
		
		return driver.getTitle().equals(tituloActual);
		
	}
	
	public static void enviarTextoElementoPorId(String texto, String elemento){
		driver.findElement(By.id(elemento)).sendKeys(texto);
	}
	
	public static boolean validarElementoPresentePorId(String elemento){
		return !driver.findElements(By.id(elemento)).isEmpty();
	}

	
	public static boolean isTextPresent(String text){
	    try{
	        boolean b = driver.getPageSource().contains(text);
	        return b;
	    }
	    catch(Exception e){
	        return false;
	    }
	  }
	
	public static WebElement obtenerElementoPorId(String nombreElemento){
		WebElement elemento = (WebElement) driver.findElement(By.id(nombreElemento));
		return elemento;
	}
	
	public static WebElement obtenerElementoPorXpath(String xpath){
		WebElement elemento = (WebElement) driver.findElements(By.xpath(xpath)).get(0);
		return elemento;
	}
	
			
	public static WebElement obtenerElementoPorName(String name){
		WebElement elemento = (WebElement) driver.findElements(By.name(name)).get(0);
		return elemento;
	}		
	

}
