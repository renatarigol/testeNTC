import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestesUI {
	
	private WebDriver driver;
	private DSLNTC dsl;
	private SimulaInvestimentoPage simipage;
	JavascriptExecutor js;
	
	public String tipoperfilvoce = "(//input[@type='radio'])[1]";
	public String tipoperfilempresa = "(//input[@type='radio'])[2]";
	
	
	public String valoraplicacao="5.000,00";
	public String idvaloraplicacao="valorAplicar";
		
	public String valorpoupar="500,00";
	public String idvalorpoupar="valorInvestir";
	public int opcao=1;
	
	public int periodopoupar=24;
	public String idperiodopoupar="tempo";
	
	public String mesano="M";
	public String idmesano="periodo";
	
	
	
	//Construtor Classe
	public TestesUI(WebDriver driver) {
		dsl = new DSLNTC(driver);
	}
				
	
}
