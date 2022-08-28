package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import support.Utils;


public class LoginSteps extends Utils{

    /*ACESSA A TELA DE LOGIN DA AUTOMATION PRACTICE*/
    LoginPage loginPage = new LoginPage(getDriver());
    @Dado("^que estou na pagina de login$")
    public void que_estou_na_pagina_de_login() {
        loginPage.acessarTelaLogin();
    }

    /*PREENCHE O CAMPO DO E-MAIL E CONFIRMA O CRIAR CONTA*/
    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário() {
        loginPage.preencherCampoEmail();
        loginPage.clicarCriarConta();
        pause();

    }
}
