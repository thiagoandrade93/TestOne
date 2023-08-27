package br.ce.wcaquino;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	 private DSL dsl;

     public LoginPage(WebDriver driver) {
         dsl = new DSL(driver);

}
     
    public void ClickBtnLogin() {
    	dsl.click("login-button");
    }
     
    public void InsereUser(String user) {
    	dsl.sendkeys("email-input", user);
    }
    
    public void InsereSenha(String password) {
    	dsl.sendkeys("password-input", password);
    }
    
    public void ValidaMensagemSucessoLogin() {
    	dsl.ValidaTextoAparece("//div[contains(text(),'Welcome to Codility')]", "Welcome to Codility");
    }
    
    public void ValidaMensagemFalhaLogin() {
    	dsl.ValidaTextoAparece("//div[contains(text(),'You shall not pass! Arr!')]", "You shall not pass! Arr!");
    }
	

    public void ValidaMensagemEmailInvalido() {
    	dsl.ValidaTextoAparece("//div[contains(text(),'Enter a valid email')]", "Enter a valid email");
    }
    
    public void ValidaMensagemCampoEmailVazio() {
    	dsl.ValidaTextoAparece("//div[contains(text(),'Email is required')]", "Email is required");
    }
    
    
    public void ValidaMensagemCampoSenhaVazio() {
    	dsl.ValidaTextoAparece("//div[contains(text(),'Password is required')]", "Password is required");
    }
    
    public void ValidaCampoEmailEstaTela() {
    	dsl.ValidaElementoEstaPresent("email-input");
    }

    public void ValidaCampoSenhaEstaTela() {
    	dsl.ValidaElementoEstaPresent("password-input");
    }
}
