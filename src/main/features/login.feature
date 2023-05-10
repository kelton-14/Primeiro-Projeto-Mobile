# Language: pt

  @TestLogin

  Feature:  Login

  @CadastroUsuario

  Scenario: Cadastro de usuario

  Given que estou na pagina de login
  When clico no campo cadastrar usuario
  And preencho os campos nome  e senha  e  confirmo a senha
  And clico no Campo cadastro
  Then usuario cadastrado com sucesso

  @LoginComSucesso
  Scenario: Login com sucesso

  Given que estou na pagina de login
  When preencho os campos usuario e senha corretas
  And clico em logar
  Then o login será realizado com sucesso
  And realizo o logout

  @LoginIncorreto
  Scenario: Login incorreto

  Given que estou na pagina de login
  When preencho os campos usuario e senha incorretas
  And clico em logar
  Then o login não será realizado
