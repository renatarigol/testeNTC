import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;


public class DSLNTC {
	
	private WebDriver driver;
	
	//Construtor Classe
	public DSLNTC(WebDriver driver) {
		this.driver = driver;
	}
	
	public void acessasite() {		
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
	}
	
	public void dimensionajanela(int a, int b) {
		driver.manage().window().setSize(new Dimension(a, b));
	}
		
	public void escreverbycss(String csscampo, String textoescrever) {		
		driver.findElement(By.cssSelector(csscampo)).sendKeys(textoescrever);		
	}
	
	public void escreverbyxpat(String xpathcampo, String textoescrever) {
		WebElement variaveltexto = driver.findElement(By.xpath(xpathcampo));
		variaveltexto.sendKeys(textoescrever);
	}
	
	public void escreverbyid(String id, String textoescrever) {
		WebElement variaveltexto = driver.findElement(By.id(id));
		variaveltexto.sendKeys(textoescrever);
	}
	
	public boolean validavalortexto(String id, String valor) {
		String texto = driver.findElement(By.id(id)).getText();
		System.out.println(texto);
				
		try{
			Assert.assertEquals(texto, valor);
			}catch(Throwable t){
			     return false;
			}		  
			  return true;	
	}
	
	
	public void selecionacombobox(String id, String valor) {
		String js;
		JavascriptExecutor selecionaperiodo = (JavascriptExecutor) driver;
		js = "document.getElementById('"+id+"').value = '"+valor+"'"; 
		selecionaperiodo.executeScript(js);
	}
	
	public void clicasimular(String tag, int tempo) {
		new WebDriverWait(driver, tempo).until(ExpectedConditions.elementToBeClickable(By.tagName(tag))).click();
	}
		
	public void clicarbyxpat(String xpahtcampo) {		
		driver.findElement(By.xpath(xpahtcampo)).click();		
	}	
	
	public boolean validaperfil(String xpahtcampo) {
		boolean atributo = driver.findElement(By.xpath(xpahtcampo)).isSelected();
		
		try{
			Assert.assertEquals(atributo, true);
			}catch(Throwable t){
			     return false;
			}		  
			  return true;			
	}
	
}
