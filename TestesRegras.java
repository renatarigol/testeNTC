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

@RunWith(Parameterized.class)
public class TestesRegras {
	private WebDriver driver;
	private DSLNTC dsl;
	private SimulaInvestimentoPage simipage;
	JavascriptExecutor js;
	
	@Parameter
	public String tipoperfilvoce = "(//input[@type='radio'])[1]";
	@Parameter(value=1)
	public String tipoperfilempresa = "(//input[@type='radio'])[2]";
	
	
	@Parameter(value=2)
	public String valoraplicacao;
	@Parameter(value=3)
	public String idvaloraplicacao;
		
	@Parameter(value=4)
	public String valorpoupar;
	@Parameter(value=5)
	public String idvalorpoupar;
	@Parameter(value=6)
	public int opcao;
	
	@Parameter(value=7)
	public int periodopoupar;
	@Parameter(value=8)
	public String idperiodopoupar;
	
	@Parameter(value=9)
	public String mesano;
	@Parameter(value=10)
	public String idmesano;
	
	
	
	//Construtor Classe
	public TestesRegras(WebDriver driver) {
		dsl = new DSLNTC(driver);
	}
	
	
	@Parameters
	public static Collection<Object[]>getColletion(){
		return Arrays.asList(new Object[][] {
			{"(//input[@type='radio'])[1]","","5.000,00", "valorAplicar", "500,00", "valorInvestir", 1, 24, "tempo","periodo", "M"}
		});
	}
	
	@Test
	public void validaRegras1() {
		//#####################################
	    // Selecionar Perfil de Investimento
	    //#####################################
		
		
		simipage.selecionaPerfil(tipoperfilvoce);
		
		//#####################################
	    // Informar quanto será aplicado
	    //#####################################
		  	
		simipage.qualValorAplicar(idvaloraplicacao,valoraplicacao);
		
		//#####################################
	    // Que valor poupar todo mês
	    //#####################################
		simipage.quantopoupartodomes(idvalorpoupar,valorpoupar,opcao);
				
	 	//#####################################
	 	//Por quanto tempo poupar
	 	//#####################################
	 	
		//Informar o total de Meses ou Anos
	 	simipage.quantotempopoupar(idperiodopoupar,periodopoupar);  
	 	
		//Selecionar Combobox Se Meses ou Anos  
	 	simipage.selecionamesano(mesano, idmesano);
	 	
	 	//#####################################
	 	//Clica em Simular
	 	//#####################################
	 	
	 	simipage.clicaremsimular(); 
		
				
	}

}
