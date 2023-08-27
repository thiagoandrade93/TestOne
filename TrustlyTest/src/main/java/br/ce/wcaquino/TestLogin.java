package br.ce.wcaquino;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class TestLogin {
	
	private WebDriver driver;
	private Constants constante;
	private DSL dsl;
	private LoginPage Login;
	
	
	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver", constante.driverlocal);
		driver = new ChromeDriver();
		dsl = new DSL(driver);
		Login = new LoginPage (driver);
		driver.get(constante.URL);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		
		
	}
	
	@After
	public void quit() {
		driver.quit();
	}
	

	@Test
	public void ValidaUserValido() {
		Login.InsereUser(constante.userValido);
		Login.InsereSenha(constante.password);
		Login.ClickBtnLogin();
		Login.ValidaMensagemSucessoLogin();
	}
	
	@Test 
	public void ValidaUserInvalido() {
		Login.InsereUser(constante.userInvalido);
		Login.InsereSenha(constante.password);
		Login.ClickBtnLogin();
		Login.ValidaMensagemFalhaLogin();
	}
	
	@Test 
	public void ValidaUserSemArroba() {
		Login.InsereUser(constante.userSemArroba);
		Login.InsereSenha(constante.password);
		Login.ClickBtnLogin();
		Login.ValidaMensagemEmailInvalido();		
	}
	
	@Test 
	public void ValidaUserSemPonto() {
		Login.InsereUser(constante.userSemPonto);
		Login.InsereSenha(constante.password);
		Login.ClickBtnLogin();
		Login.ValidaMensagemEmailInvalido();
	}

	@Test 
	public void ValidaUserSemNome() {
		Login.InsereUser(constante.userSemNome);
		Login.InsereSenha(constante.password);
		Login.ClickBtnLogin();
		Login.ValidaMensagemEmailInvalido();
	}
	
	
	@Test 
	public void ValidaUserSemProvedor() {
		Login.InsereUser(constante.userSemCO);
		Login.InsereSenha(constante.password);
		Login.ClickBtnLogin();
		Login.ValidaMensagemEmailInvalido();
	}


	@Test 
	public void ValidaCampoEmailVazio() {
		Login.InsereUser("");
		Login.InsereSenha(constante.password);
		Login.ClickBtnLogin();
		Login.ValidaMensagemCampoEmailVazio();
	}
	
	@Test 
	public void ValidaCampoSenhaVazio() {
		Login.InsereUser(constante.userValido);
		Login.InsereSenha("");
		Login.ClickBtnLogin();
		Login.ValidaMensagemCampoSenhaVazio();
	}
	
	@Test public void ValidaCampoEmailEstaTela() {
		Login.ValidaCampoEmailEstaTela(); 
	    }
	
	
	
	@Test public void ValidaSenhaEmailEstaTela() {
		Login.ValidaCampoSenhaEstaTela();
	    }
}
