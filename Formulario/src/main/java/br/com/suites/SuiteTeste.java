package br.com.suites;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import br.com.core.DriverFactory;
import br.com.test.TesteFormulario;


@RunWith(Suite.class)
@SuiteClasses({
	TesteFormulario.class
	
	
})
public class SuiteTeste {

	
	
	
	
	@AfterClass
	public static void finalizaTudo() {
		DriverFactory.killDriver();
	}
	
	
	
	
}
