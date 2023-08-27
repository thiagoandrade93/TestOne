package br.ce.wcaquino;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DSL {
	
	 private WebDriver driver;

	    public DSL(WebDriver driver){
	        this.driver = driver;
	    }
	    
	    
	    
	    public void sendkeys (String id_campo, String texto){
	        driver.findElement(By.id(id_campo)).sendKeys(texto);
	    }
	    
	    
	    public void click (String id) {
	    	driver.findElement(By.id(id)).click();
	    }
	    

	    public void ValidaTextoAparece(String id_campo, String texto){
	        Assert.assertTrue(driver.findElement(By.xpath(id_campo)).getText().contains(texto));
	    }
	    
	    
	    public void ValidaTextoApareceTela(String id, String texto ) {
			Assert.assertTrue(driver.findElement(By.xpath(id)).getText().contains(texto));

	    }
	    
	  
	    
	    
	    
	    public void ValidaElementoEstaPresent(String id) { 
	    	boolean isPresente; 
	    try { 
	    	driver.findElement(By.id(id)); 
	 
	    	System.out.println("Elemento está na tela"); 
	    	isPresente = true; } 
	    catch (NoSuchElementException e){ 
	    	System.out.println("Elemento não está na tela"); 
	    	isPresente = false; 
	    	} 
	    Assert.assertTrue(isPresente); 
	    }
	    
	    
	 
	    
}
