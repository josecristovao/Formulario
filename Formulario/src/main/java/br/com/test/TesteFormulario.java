package br.com.test;

import static br.com.core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BaseTeste;
import br.com.core.DSL;
import br.com.core.DriverFactory;
import br.com.page.FormularioPage;
import br.com.page.HomePage;


public class TesteFormulario  extends BaseTeste{
	private FormularioPage pageFormulario;
	private HomePage pageHome;
	private DSL dsl;
	
	
	
	@Before
	public void inicializa() {
		getDriver().get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
		pageHome = new HomePage();
		pageFormulario = new FormularioPage();
		dsl = new DSL();

	}



	@Test
	public void DesafioA()   {
		pageHome.selecionarCombo("Bootstrap V4 Theme");
		pageHome.clicarBotaoAddRecord();
		pageFormulario.setNome("Teste José");
		pageFormulario.setSobrenomeContato("Teste");
		pageFormulario.setNomeContato("seu nome");
		pageFormulario.setTelefone("61-9999-9999");
		pageFormulario.setEndereco("Setor Comercial Sul");
		pageFormulario.setComplementoEndereco("Torre A");
		pageFormulario.setCidade("Brasília");
		pageFormulario.setUf("DF");
		pageFormulario.setCEP("73105-900");
		pageFormulario.setNacao("Brasil");
		pageFormulario.setNumeroDoFuncionario("1234");
		pageFormulario.setLimiteCredito("200");
		pageFormulario.clicarBotaoSave();	
		WebDriverWait wait = new WebDriverWait(getDriver(),15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Edit Record')]")));;
		Assert.assertEquals("Your data has been successfully stored into the database. Edit Record or Go back to list", dsl.obterTexto(By.xpath("//p[.='Your data has been successfully stored into the database. Edit Record or Go back to list']")));
	}

	@Test
	public void DesafioB() throws InterruptedException   {
		DesafioA();
		pageFormulario.clicarBotaoGoBack();
		pageHome.setNomePesquisa("Teste José");
		pageHome.clicarCheckBox();
		pageHome.clicarBotaoDelete();		
		Assert.assertEquals("Are you sure that you want to delete those 2 items?", dsl.obterTexto(By.xpath("//p[contains(., 'Are you sure that you want to delete those 2 items?')]")));
		pageHome.clicarBotaoDeletePopup();
		Thread.sleep(3000);
		Assert.assertEquals("Your data has been successfully deleted from the database.", dsl.obterTexto(By.xpath("//p[contains(., 'Your data has been successfully deleted from the database.')]")));
	}

}
	
	
	
	
	


