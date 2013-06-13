import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsSingup {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	String arg1;
	  private boolean acceptNextAlert = true;

	@Before(value = "@Selenium")
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/";
	}

	@When("^Quando a página de cadastro estiver carregada$")
	public void Quando_a_página_de_cadastro_estiver_carregada()
			throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(baseUrl + "/Engajamundo/faces/singup.xhtml");
		} catch (Exception e) {
			verificationErrors.append(e.toString());
		}
	}

	@Then("^Insira os valores para os campos do formulário$")
	public void Insira_os_valores_para_os_campos_do_formulário()
			throws Throwable {
		try {
			driver.findElement(By.id("j_idt13:nome")).clear();
			driver.findElement(By.id("j_idt13:nome")).sendKeys("Liz");
			driver.findElement(By.id("j_idt13:sobrenome")).clear();
			driver.findElement(By.id("j_idt13:sobrenome")).sendKeys("Dias");
			driver.findElement(By.id("j_idt13:email")).clear();
			driver.findElement(By.id("j_idt13:email")).sendKeys("liz@gmail.com");
			driver.findElement(By.id("j_idt13:data")).clear();
			driver.findElement(By.id("j_idt13:data")).sendKeys("01/01/1991");
			driver.findElement(By.id("j_idt13:telefone")).clear();
			driver.findElement(By.id("j_idt13:telefone")).sendKeys("12345678");
			driver.findElement(By.id("j_idt13:skype")).clear();
			driver.findElement(By.id("j_idt13:skype")).sendKeys("liz");
			driver.findElement(By.id("j_idt13:facebook")).clear();
			driver.findElement(By.id("j_idt13:facebook")).sendKeys("liz");
			driver.findElement(By.id("j_idt13:cidade")).clear();
			driver.findElement(By.id("j_idt13:cidade")).sendKeys("SP");
			driver.findElement(By.id("j_idt13:estado")).clear();
			driver.findElement(By.id("j_idt13:estado")).sendKeys("SP");
			driver.findElement(By.id("j_idt13:pais")).clear();
			driver.findElement(By.id("j_idt13:pais")).sendKeys("Brasil");
			driver.findElement(By.id("j_idt13:login")).clear();
			driver.findElement(By.id("j_idt13:login")).sendKeys("liz");
			driver.findElement(By.id("j_idt13:senha")).clear();
			driver.findElement(By.id("j_idt13:senha")).sendKeys("123");
			driver.findElement(By.name("j_idt13:j_idt41")).clear();
			driver.findElement(By.name("j_idt13:j_idt41")).sendKeys("oi!");
			driver.findElement(By.name("j_idt13:j_idt43")).click();
		} catch (Exception e) {
			verificationErrors.append(e.toString());
		}
	}

	@Then("^Verifica se o cadastro foi realizado com sucesso$")
	public void Verifica_se_o_cadastro_foi_realizado_com_sucesso()
			throws Throwable {
		try {
			assertTrue(driver
					.findElement(By.cssSelector("BODY"))
					.getText()
					.matches("^[\\s\\S]*Sucesso na operação\\.\\.\\.[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		
		driver.quit();
		
	}
	
	@Then("^Insira no campo login, um login já existente$")
	public void Insira_no_campo_login_um_login_já_existente() throws Throwable {
		try {
			driver.findElement(By.id("j_idt13:login")).clear();
			driver.findElement(By.id("j_idt13:login")).sendKeys("laisa");
			driver.findElement(By.name("j_idt13:j_idt43")).click();
		} catch (Exception e) {
			verificationErrors.append(e.toString());
		}

	}

	@Then("^Verifica se a validação foi realizada$")
	public void Verifica_se_a_validação_foi_realizada() throws Throwable {
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Esse login ja existe[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}
	
	@SuppressWarnings("unused")
	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  @SuppressWarnings("unused")
	private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  @SuppressWarnings("unused")
	private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
