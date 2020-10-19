import org.junit.Test;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TesteNTConsult {
	
	  private WebDriver driver;
	  JavascriptExecutor js;	  
	  private DSLNTC dsl;
	  private SimulaInvestimentoPage simipage;
	  private TestesUI tui;
	  
	  
	  @Before
	  public void inicializar() {
	    driver = new FirefoxDriver();
	    js = (JavascriptExecutor) driver;	    
	    dsl = new DSLNTC(driver);
	    simipage = new SimulaInvestimentoPage(driver);
	    
	    //Acessando o site 
	    dsl.acessasite();
	    
	    //Ajuste dimensões janela
	    dsl.dimensionajanela(1296, 776);
	  }
	  
	  @After
	  public void finalizar() {
	    driver.quit();
	  }
	  
	  
	  
	  @Test
	  public void simulaInvestimento() throws InterruptedException {
		  
		  //tui.validaRegras();
	               
	    //#####################################
	    // Selecionar Perfil de Investimento
	    //#####################################
		  
		simipage.selecionaPerfil();
		
		boolean resultado = simipage.validaperfil();
		
		//#####################################
	    // Informar quanto será aplicado
	    //#####################################
		  	
		simipage.qualValorAplicar();
		
		simipage.validavaloraplicar();
		
		//#####################################
	    // Que valor poupar todo mês
	    //#####################################
		simipage.quantopoupartodomes(1);
		
		simipage.validavalorpoupar();
				
	 	//#####################################
	 	//Por quanto tempo poupar
	 	//#####################################
	 	
		//Informar o total de Meses ou Anos
	 	simipage.quantotempopoupar();  
	 	
	 	simipage.validatempoinvestimento();
	 	
		//Selecionar Combobox Se Meses ou Anos  
	 	simipage.selecionamesano();
	 	
	 	simipage.validaopcaoperiodo();
	 	
	 	//#####################################
	 	//Clica em Simular
	 	//#####################################
	 	
	 	simipage.clicaremsimular(); 
		
	  }
	  
	  @Test
	  public void sipoupavalorinferior() throws InterruptedException {
	               
	    //#####################################
	    // Selecionar Perfil de Investimento
	    //#####################################
		  
		simipage.selecionaPerfil();
		
		//#####################################
	    // Informar quanto será aplicado
	    //#####################################
		  	
		simipage.qualValorAplicar();				
		
		//#####################################
	    // Que valor poupar todo mês - teste valor inferior a R$ 20,00
	    //#####################################
		
		simipage.quantopoupartodomes(2);
	 	
	 	//#####################################
	 	//Por quanto tempo poupar
	 	//#####################################
	 	
		//Informar o total de Meses ou Anos
	 	simipage.quantotempopoupar();  
	 	
		//Selecionar Combobox Se Meses ou Anos  
	 	simipage.selecionamesano();
	 	
	 	//#####################################
	 	//Clica em Simular
	 	//#####################################
	 	
	 	simipage.clicaremsimular(); 
		
	  }

}
