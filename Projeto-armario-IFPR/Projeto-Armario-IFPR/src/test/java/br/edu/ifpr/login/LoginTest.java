package br.edu.ifpr.login;

import br.edu.ifpr.paranavai.armarios.controller.LoginController;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest {
    
    private String autenticacaoInvalida = "202100";
    private String senhaInvalida = "senha";
    private String armarioDevolucaoInvalido = "Armário 1";
    private String armarioEmprestimoInvalido = "Armário 2";
    
    private String autenticacaoValida = "20210001920";
    private String senhaValida = "12345";
    private String armarioDevolucaoValido = "Armário 3";
    private String armarioEmprestimoValido = "Armário 4";
    
    @Test
    public void emprestimoArmarioInvalido(){
        /* podemos utilizar o método static,pq é uma classe vazia */
        String resposta = LoginController.loginVerificacaoArmario(autenticacaoValida, senhaValida, armarioEmprestimoInvalido, false);
        Assert.assertEquals("Armário indisponível para empréstimo!", resposta);    
    }
    @Test
    public void devolucaoArmarioInvalido(){
        String resposta = LoginController.loginVerificacaoArmario(autenticacaoValida, senhaValida, armarioDevolucaoInvalido, true);
        Assert.assertEquals("Armário indisponível para devolução!", resposta); 
    }
    @Test
    public void autenticacaoInvalida(){
        String resposta = LoginController.loginVerificacaoArmario(autenticacaoInvalida, senhaValida, null, false);
        Assert.assertEquals("Autenticação inválida!", resposta); 
    }
    @Test
    public void senhaInvalida(){
        String resposta = LoginController.loginVerificacaoArmario(autenticacaoValida, senhaInvalida, null, false);
        Assert.assertEquals("Senha inválida!", resposta);
    }
    @Test
    public void autenticacaoValida(){
        String resposta = LoginController.loginVerificacaoArmario(autenticacaoValida, senhaValida, null, false);
        Assert.assertEquals("Usuário logado!", resposta);
    }
    @Test
    public void emprestimoArmarioValido(){
        String resposta = LoginController.loginVerificacaoArmario(autenticacaoValida, senhaValida, armarioEmprestimoValido, false);
        Assert.assertEquals("Armário emprestado!", resposta); 
    }
    @Test
    public void devolucaoArmarioValido(){
        String resposta = LoginController.loginVerificacaoArmario(autenticacaoValida, senhaValida, armarioDevolucaoValido, true);
        Assert.assertEquals("Armário devolvido!", resposta); 
    }
}
