package br.ce.desafiontconsult.core;

import java.util.Properties;

import org.junit.After;
import org.openqa.selenium.TakesScreenshot;

import Static br.ce.desafiontconsult.core.DriverFactory.KillDriver;


public class Screenshot {
	
	@After
	public void finalizar() {
		TakesScreenshot capturatela = (TakesScreenshot) DriverFactory.getDriver();
		
		if(Properties.FECHABROWSER) {
			killDriver();
		}
	}

}
