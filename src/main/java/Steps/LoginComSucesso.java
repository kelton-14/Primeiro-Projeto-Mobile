package Steps;

import PageObject.LoginPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AppDriver;
import org.openqa.selenium.WebDriver;

public class LoginComSucesso {
    WebDriver driver;
    LoginPageObject loginPageObject;

    public LoginComSucesso(){
        loginPageObject = new LoginPageObject();
        driver = AppDriver.getDriver();
    }

    @When("preencho os campos usuario e senha corretas")
    public void preencho_os_campos_usuario_e_senha_corretas() {
        loginPageObject.PreencherCampoUsuarioSenha();

    }
    @And("clico em logar")
    public void clico_em_logar() {
        loginPageObject.BtnLogar();

    }
    @Then("o login será realizado com sucesso")
    public void o_login_será_realizado_com_sucesso() {

    }

    @And ("realizo o logout")
    public void realizo_o_logout(){
        loginPageObject.Logout();

    }

}
