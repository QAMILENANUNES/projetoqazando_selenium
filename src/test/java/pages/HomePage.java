package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import suport.Utils;

public class HomePage extends Utils {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarAplicacao(){
        driver.get("http://www.qazando.com.br/curso.html");
        esperarElementoEstarPresente(By.id("btn-ver-cursos"),10);
        Assert.assertEquals("não acessou aplicação",true,driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }
    public void scroolDown()throws InterruptedException{
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeAsyncScript("window.scrollTo(0,10000)");
        Thread.sleep(5000);
    }
    public void preecheEmail(){
        driver.findElement(By.id("form")).click();
        driver.findElement(By.id("email")).sendKeys("testem40@gmail.com");
    }
    public void clickGanharDesconto(){
        driver.findElement(By.id("button")).click();
    }
    public void verificarCupomDesconto(){
        String texto_cupon=driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("O cupom está errado" ,"QAZANDO15OFF",texto_cupon);
        System.out.println(texto_cupon);
    }

}
