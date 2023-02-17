package br.com.page;

import org.openqa.selenium.By;

import br.com.core.BasePage;

public class HomePage extends BasePage {

	public void selecionarCombo(String valor) {
		dsl.selecionarCombo("switch-version-select", valor);
	}

	public void clicarBotaoAddRecord() {
		dsl.clicarLink("Add Record");
	}

	public void setNomePesquisa(String nome) {
		dsl.escrever(By.xpath("//input[@placeholder='Search CustomerName']"), nome);
	}

	public void clicarCheckBox() throws InterruptedException {
		dsl.clicarCheck(By.xpath("//input[@type='checkbox' and @class='select-all-none']"));
		Thread.sleep(3000);
		dsl.clicarCheck(By.xpath("//input[@type='checkbox' and @class='select-all-none']"));

	}

	public void clicarBotaoDelete() {
		dsl.clicarBotao(By.xpath("//span[@class='text-danger' and .='Delete']"));
	}

	public void clicarBotaoDeletePopup() {
		dsl.clicarBotao(By.xpath("//button[@class='btn btn-danger delete-multiple-confirmation-button']"));
	}
}
