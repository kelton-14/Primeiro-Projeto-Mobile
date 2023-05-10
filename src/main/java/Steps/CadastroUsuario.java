package Steps;

import PageObject.LoginPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AppDriver;
import org.openqa.selenium.WebDriver;

public class CadastroUsuario {

    WebDriver driver;
    LoginPageObject LoginPageObject;

    public CadastroUsuario() {
        LoginPageObject =  new LoginPageObject();
        driver = AppDriver.getDriver();
    }

    @Given("que estou na pagina de login")
    public void que_estou_na_pagina_de_login() {
        AppDriver.getDriver();

    }
    @When("clico no campo cadastrar usuario")
    public void clico_no_campo_cadastrar_usuario() {
        LoginPageObject.BtnCadastrarUsuario();


    }
    @And("preencho os campos nome  e senha  e  confirmo a senha")
    public void preencho_os_campos_nome_e_senha_e_confirmo_a_senha() {
        LoginPageObject.PreencherCamposNomeSenhaConfirmaSenha();

    }
    @And("clico no Campo cadastro")
    public void clico_no_campo_cadastro() {
        LoginPageObject.CadastrarUsuario();

    }
    @Then("usuario cadastrado com sucesso")
    public void usuario_cadastrado_com_sucesso() {
        LoginPageObject.LoginComSucesso();
     //   AppDriver.killDriver();

    }


}




