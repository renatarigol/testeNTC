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
	  //private Map<String, Object> vars;
	  JavascriptExecutor js;
	  
	  private DSLNTC dsl;
	  private SimulaInvestimentoPage simipage;
	  
	  
	  @Before
	  public void inicializar() {
	    driver = new FirefoxDriver();
	    js = (JavascriptExecutor) driver;
	    //vars = new HashMap<String, Object>();
	    
	    dsl = new DSLNTC(driver);
	    simipage = new SimulaInvestimentoPage(driver);
	    
	    //Accessing the main ling 
	    dsl.acessaseite();
	    
	    //Dimensioning the work' window
	    dsl.dimensionajanela(1296, 776);
	  }
	  
	  @After
	  public void finalizar() {
	    driver.quit();
	  }
	  
	  
	  
	  @Test
	  public void simulaInvestimento() throws InterruptedException {
	               
	    //#####################################
	    // Selecionar Perfil de Investimento
	    //#####################################
		  
		simipage.selecionaPerfil();
		
		//#####################################
	    // Informar quanto será aplicado
	    //#####################################
		  	
		simipage.qualValorAplicar();
	 	
	 	//#####################################
	 	//Por quanto tempo poupar
	 	//#####################################
	 	
		//Informar o total de Meses ou Anos
	 	simipage.quantotempopoupar();  
	 	
		//Selecionar Combobox Se Meses ou Anos  
	 	simipage.selecionamesano();
		
		//#####################################
		//Create an account
		//#####################################
		
		//Create an account - email address
	 	simipage.insereemail(dsl.geraemail());
		 
		//Create an account - click on Create an account
	 	simipage.submeteemail();
		
		//Account Form - radio Mr and Mrs
	 	simipage.selecionagenero();
		
		//WebElement 
	 	simipage.selecionageneros();   
		    
	    //Account Form - First Name
	 	simipage.inserefirstname("Teste");
		
		//Account Form - Last name
	 	simipage.inserelastname("DBServer");  
		
		//Account Form - Password  
	 	simipage.inserepassword("123689");
		   
		//Account Form - Date of Birth - Day 
	 	simipage.selectbirthday("25");
		
		//Account Form - Date of Birth - Month
	 	simipage.selectbirthmonth("11"); 
		
		//Account Form - Date of Birth - Year
	 	simipage.selectbirthyear("1976"); 
		
		//Account Form - Your Address - First Name
	 	simipage.inserefirstname("Teste");
		  
		//Account Form - Your Address - Last Name
	 	simipage.inserelastname("DB");
		  
		//Account Form - Your Address - Company
	 	simipage.inserecompany("Autônomo");
		  
		//Account Form - Your Address - Address 1
	 	simipage.inserestreet("João Pessoa");  
		
		//Account Form - Your Address - Address 2
	 	simipage.inserecomplement("21");
		  
		//Account Form - Your Address - City 
	 	simipage.inserecity("Porto Alegre");
		
		//Account Form - Your Address - State
	 	simipage.selectstate("6");
		
		//Account Form - Your Address - Zip Code
	 	simipage.inserezipcode("90040");
		
		//Account Form - Your Address - Country
	 	simipage.selectcountry("21");
		
		//Account Form - Your Address - Additional Information
	 	simipage.isnereadditionalinformation("TESTE DB");  
		
		//Account Form - Your Address - Home Phone
	 	simipage.inserephonehome("5551992039296"); 
		
		//Account Form - Your Address - Modile Phone
	 	simipage.inserephonemobile("5551992039296"); 
		
		//Account Form - Your Address - Alias
	 	simipage.inserealias("testedb488488");
		
		//Clicking Register
	 	simipage.registraconta();
		
		//#####################################
	    //Proceed the address
		//#####################################
		  
		//Proceed Address
		Boolean validaend = new Boolean(false);
		validaend = dsl.validaendereco();
	 	if(validaend)
	 		simipage.registraendereco();
	 	else
	 		simipage.registraendereco();
		
		//#####################################
	    //Confirming terms
		//#####################################
		  
		//Checking Terms
	 	simipage.concordatermos();  
		
		//Proccess Carrier
	 	simipage.prosseguetransportadora();
		
		//#####################################
	    //Payment choice
		//#####################################
		  
		//Payment Choice
		Boolean validavalortot = new Boolean(false);
		validavalortot = dsl.validavalortotal();
	 	if(validavalortot)
	 		simipage.escolheformapagamento();
	 	else
	 		simipage.escolheformapagamento();
		
		//Payment Confirm
	 	simipage.confirmapagamento();
		
		//#####################################
	    //Return cart
		//#####################################
		  
		//Return Cart
	 	simipage.retornapedidos();
		
		//#####################################
	    //Return home
		//#####################################
		  
		//Return Home
	 	simipage.retornahome();  
	  }

}
