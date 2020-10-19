import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;	


public class SimulaInvestimentoPage {
	
	private DSLNTC dsl;
	
	
	//Construtor Classe
	public SimulaInvestimentoPage(WebDriver driver) {
		dsl = new DSLNTC(driver);
	}
	
	public void selecionaPerfil() {
		dsl.clicarbyxpat("(//input[@type='radio'])[1]");			
	}
	
	public boolean validaperfil() {
		return dsl.validaperfil("(//input[@type='radio'])[1]");
	}
	
	public void qualValorAplicar() {
		dsl.escreverbyid("valorAplicar", "5.000,00");		
	}
	
	public void validavaloraplicar() {
		boolean resultado = dsl.validavalortexto("valorAplicar","5.000,00");
	}
	
	public void quantopoupartodomes(int opcao) {
		if (opcao == 1) dsl.escreverbyid("valorInvestir", "500,00");
		else dsl.escreverbyid("valorInvestir", "19,00");						
	}
	
		
	public void validavalorpoupar() {
		boolean resultado = dsl.validavalortexto("valorInvestir", "500,00");
	}
	
	public void quantotempopoupar() {
		String periodos = Integer.toString(24);
		
		dsl.escreverbyid("tempo", periodos);		
	}
	
	public void validatempoinvestimento() {
		boolean resultado = dsl.validavalortexto("valorInvestir", "24");
	}
	
	public void selecionamesano() {
		dsl.selecionacombobox("periodo", "M");	
	}
	
	public void validaopcaoperiodo() {
		boolean resultado = dsl.validavalortexto("periodo", "M");
	}
	
	public void clicaremsimular() {
		dsl.clicasimular("button", 20);
	}
	
	public void refazersimulacao() {
		dsl.clicasimular("button", 20);
	}
	
	
}
