package com.efraimpc;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebElement;

@SuppressWarnings("deprecation")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test {

	@BeforeClass
	public static void inicializar(){
		System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
	}
	
	@org.junit.Test
	public void validarPaginaBase() {
		EjercicioTesting.irAPaginaBase();
		Assert.assertTrue(EjercicioTesting.checarSiTituloEsIgualA("Google"));
	}
	
	@org.junit.Test
	public void validarWikipediaResult(){
		Assert.assertTrue(EjercicioTesting.validarElementoPresentePorId("lst-ib"));
		EjercicioTesting.enviarTextoElementoPorId("Manual Testing", "lst-ib");
		EjercicioTesting.obtenerElementoPorXpath("/html/body/div/div[3]/form/div[2]/div[3]/center/input[1]").click();
		Assert.assertTrue(EjercicioTesting.isTextPresent("Manual testing - Wikipedia"));
	}

}
