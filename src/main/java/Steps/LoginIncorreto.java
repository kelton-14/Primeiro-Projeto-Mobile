package Steps;

import PageObject.LoginPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AppDriver;
import org.openqa.selenium.WebDriver;

public class LoginIncorreto {
    WebDriver driver;
    LoginPageObject loginPageObject;

    public LoginIncorreto(){
        loginPageObject = new LoginPageObject();
        driver = AppDriver.getDriver();
    }

    @When("preencho os campos usuario e senha incorretas")
    public void preencho_os_campos_usuario_e_senha_incorretas() {
        loginPageObject.PreencherCampoUsuarioSenhaIncorreto();

    }
    @And("clico em logar 2")
    public void clico_em_logar_2() {
        loginPageObject.BtnLogar2();

    }
    @Then("o login não será realizado")
    public void o_login_não_será_realizado() {
        loginPageObject.LoginIncorreto();

    }

}

