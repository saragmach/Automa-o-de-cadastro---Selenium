#language: pt

  Funcionalidade: Criar uma conta na Automation Practice
    Eu como usuário da Automation Practice
    Quero criar uma conta no site
    Para realizar compras

  @cadastro_sucesso
  Cenário: registrar nova conta com sucesso
    Dado que estou na pagina de login
    E acesso o cadastro de usuário
    Quando eu preencho o formulário para cadastros
    E clico em registrar
    Então vejo que o cadastro foi realizado com sucesso