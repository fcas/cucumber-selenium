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
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsLogin {

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

	@Given("^Navegador aberto$")
	public void Navegador_aberto() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			verificationErrors.append(e.toString());
		}
	}

	@When("^Quando A pagina home estiver carregada$")
	public void Quando_A_pagina_home_estiver_carregada() throws Throwable {
		try {
			driver.get(baseUrl + "/Engajamundo/faces/home.xhtml");
		} catch (Exception e) {
			verificationErrors.append(e.toString());
		}
	}

	@Then("^Faça o login como administrador$")
	public void Faça_o_login_como_administrador() throws Throwable {

		try {
			driver.findElement(By.id("home:login")).clear();
			driver.findElement(By.id("home:login")).sendKeys("admin");
			driver.findElement(By.id("home:password")).clear();
			driver.findElement(By.id("home:password")).sendKeys("admin");
			driver.findElement(By.name("home:j_idt18")).click();
		} catch (Exception e) {
			verificationErrors.append(e.toString());
		}

	}

	@Then("^Verifique os menus visiveis para administrador$")
	public void Verifique_os_menus_visiveis_para_administrador()
			throws Throwable {
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Sobre[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Patrocine![\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*LiveStream[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Usuários[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Postagens[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Buscas[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Logoff[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Inicio[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.quit();
	}

	@Then("^Faça o login como engajador$")
	public void Faça_o_login_como_engajador() throws Throwable {

		try {
			driver.findElement(By.id("home:login")).clear();
			driver.findElement(By.id("home:login")).sendKeys("laisa");
			driver.findElement(By.id("home:password")).clear();
			driver.findElement(By.id("home:password")).sendKeys("123");
			driver.findElement(By.name("home:j_idt18")).click();
		} catch (Exception e) {
			verificationErrors.append(e.toString());
		}

	}

	@Then("^Verifique os menus visiveis para engajador$")
	public void Verifique_os_menus_visiveis_para_engajador() throws Throwable {
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Sobre[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Patrocine![\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*LiveStream[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(!driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Usuários[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Postagens[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Buscas[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Logoff[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Inicio[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.quit();
	}

	@Then("^Verifique os menus visiveis o usuário não autenticado$")
	public void Verifique_os_menus_visiveis_o_usuário_não_autenticado()
			throws Throwable {
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Sobre[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Patrocine![\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*LiveStream[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Inicio[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		driver.quit();
	}

	@Then("^Faça o login sem informar usuario e senha$")
	public void Faça_o_login_sem_informar_usuario_e_senha() throws Throwable {
		try {
			driver.findElement(By.id("home:login")).clear();
			driver.findElement(By.id("home:login")).sendKeys("");
			driver.findElement(By.id("home:password")).clear();
			driver.findElement(By.id("home:password")).sendKeys("");
			driver.findElement(By.name("home:j_idt18")).click();
		} catch (Exception e) {
			verificationErrors.append(e.toString());
		}
		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Informe o seu login[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Informe a sua senha[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

	}

	@Then("^Faça o login informando usuário inválido$")
	public void Faça_o_login_informando_usuário_inválido() throws Throwable {
		try {
			driver.findElement(By.id("home:login")).clear();
			driver.findElement(By.id("home:login")).sendKeys("cherie");
			driver.findElement(By.id("home:password")).clear();
			driver.findElement(By.id("home:password")).sendKeys("");
			driver.findElement(By.name("home:j_idt18")).click();
		} catch (Exception e) {

		}

		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Login inexistente[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@Then("^Faça o login informando senha incorreta$")
	public void Faça_o_login_informando_senha_incorreta() throws Throwable {
		try {
			driver.findElement(By.id("home:login")).clear();
			driver.findElement(By.id("home:login")).sendKeys("laisa");
			driver.findElement(By.id("home:password")).clear();
			driver.findElement(By.id("home:password")).sendKeys("1");
			driver.findElement(By.name("home:j_idt18")).click();
		} catch (Exception e) {

		}

		// Warning: verifyTextPresent may require manual changes
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Informe a sua senha[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
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
}
