package steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;


public class DescontoStep extends RunCucumberTest {
    HomePage homePage= new HomePage(driver);
    //variavel          //instância de memória
    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando() {
     homePage.acessarAplicacao();
    }
    @Quando("^preencho meu email$")
    public void preencho_meu_email() throws InterruptedException {
      homePage.scroolDown();
      homePage.preecheEmail();
    }
    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
       homePage.clickGanharDesconto();
    }
    @Então("^visualizo codigo de desconto$")
    public void visualizo_codigo_de_desconto()  {
       homePage.verificarCupomDesconto();
    }
}
