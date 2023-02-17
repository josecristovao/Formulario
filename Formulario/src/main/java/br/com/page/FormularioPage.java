package br.com.page;

import br.com.core.BasePage;

public class FormularioPage extends BasePage {

	public void setNome(String nome) {
		dsl.escrever("field-customerName", nome);

	}

	public void setSobrenomeContato(String contatoSobrenome) {
		dsl.escrever("field-contactLastName", contatoSobrenome);

	}

	public void setNomeContato(String nomeContato) {
		dsl.escrever("field-contactFirstName", nomeContato);

	}

	public void setTelefone(String telefone) {
		dsl.escrever("field-phone", telefone);

	}

	public void setEndereco(String endereco) {
		dsl.escrever("field-addressLine1", endereco);

	}

	public void setComplementoEndereco(String complementoEndereco) {
		dsl.escrever("field-addressLine2", complementoEndereco);

	}

	public void setCidade(String cidade) {
		dsl.escrever("field-city", cidade);

	}

	public void setUf(String uf) {
		dsl.escrever("field-state", uf);

	}

	public void setCEP(String cep) {
		dsl.escrever("field-postalCode", cep);

	}

	public void setNacao(String nacao) {
		dsl.escrever("field-country", nacao);

	}

	public void setNumeroDoFuncionario(String numeroDoFuncionario) {
		dsl.escrever("field-salesRepEmployeeNumber", numeroDoFuncionario);

	}

	public void setLimiteCredito(String limiteCredito) {
		dsl.escrever("field-creditLimit", limiteCredito);

	}

	public void clicarBotaoSave() {
		dsl.clicarBotao("form-button-save");
	}

	public void clicarBotaoGoBack() {
		dsl.clicarLink("Go back to list");
	}
}
