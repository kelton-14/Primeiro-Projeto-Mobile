package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.AppDriver.getDriver;

public class LoginPageObject {

    public LoginPageObject(){
        this.driver = getDriver();
    }
    static WebDriver driver;

//  Cadastrar Usuarios
    public void BtnCadastrarUsuario(){
        driver.findElement(By.id("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario")).click();
    }
    public void PreencherCamposNomeSenhaConfirmaSenha(){
        driver.findElement(By.id("br.com.alura.aluraesporte:id/input_nome")).sendKeys("Kelton2");
        driver.findElement(By.id("br.com.alura.aluraesporte:id/input_senha")).sendKeys("1234");
        driver.findElement(By.id("br.com.alura.aluraesporte:id/input_confirmar_senha")).sendKeys("1234");
    }
    public void CadastrarUsuario(){
        driver.findElement(By.id("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar")).click();
    }
    // Login com sucesso
    public void PreencherCampoUsuarioSenha(){
        driver.findElement(By.id("br.com.alura.aluraesporte:id/input_usuario")).sendKeys("Kelton2");
        driver.findElement(By.id("br.com.alura.aluraesporte:id/input_senha")).sendKeys("1234");
    }

    public void BtnLogar() {
        driver.findElement(By.id("br.com.alura.aluraesporte:id/login_botao_logar")).click();
    }
    public void LoginComSucesso(){
        driver.findElement(By.id("br.com.alura.aluraesporte:id/login_botao_logar")).isDisplayed();
    }
    public void Logout() {
        driver.findElement(By.id("br.com.alura.aluraesporte:id/menu_principal_deslogar")).click();
    }
 // Login incorreto
    public void PreencherCampoUsuarioSenhaIncorreto(){
         driver.findElement(By.id("br.com.alura.aluraesporte:id/input_usuario")).sendKeys("Kelton2");
         driver.findElement(By.id("br.com.alura.aluraesporte:id/input_senha")).sendKeys("1234test");
 }
    public void BtnLogar2() {
        driver.findElement(By.id("br.com.alura.aluraesporte:id/login_botao_logar")).click();
    }
    public void LoginIncorreto() {
        driver.findElement(By.id("br.com.alura.aluraesporte:id/mensagem_erro_login")).isDisplayed();
    }

}
