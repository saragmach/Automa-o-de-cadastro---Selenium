package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroStep extends RunCucumberTest {


    CadastroPage cadastroPage = new CadastroPage(getDriver());

    /*PREENCHE O FORMULÁRIO PARA CADASTRO DA CONTA*/
    @Quando("^eu preencho o formulário para cadastros$")
    public void eu_preencho_o_formulário_para_cadastros() {
        cadastroPage.selectTitle(2);
        cadastroPage.preencheNome("Sara");
        cadastroPage.preencheSobrenome("Gomes");
        cadastroPage.preencheSenha("552278701auA@");
        cadastroPage.selecionaAniversario(18, 05, "2002");
        cadastroPage.preencheEndereco("Rua ABC");
        cadastroPage.preencheCidade("Beauty City");
        cadastroPage.SelecionaEstado("2");
        cadastroPage.preencheCep("88663");
        cadastroPage.preencheCelular("45000011112");
    }

    /*CLICA EM CRIAR A CONTA*/
    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.clicaCriaConta();

    }

    /*VERIFICA SE A CONTA FOI REALMENTE CRIADA*/
    @Então("^vejo que o cadastro foi realizado com sucesso$")
    public void vejoQueOCadastroFoiRealizadoComSucesso() {
        cadastroPage.verificaSucesso();
    }


}
