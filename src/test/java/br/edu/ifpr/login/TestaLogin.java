package br.edu.ifpr.login;

import br.edu.ifpr.paranavai.controller.LoginController;
import org.junit.Assert;
import org.junit.Test;

public class TestaLogin {
    
    private String emailInvalido = "bleble@blabla.com";
    private String senhaInvalida = "13579";
    
    private String emailValido = "admin@admin.com";
    private String senhaValida = "12345";
    
    @Test
    public void autenticacaoOk(){
        /* podemos utilizar o método static,pq é uma classe vazia */
        String resposta = LoginController.verifica(emailValido,senhaValida);
        Assert.assertEquals("Sucesso no login!", resposta);    
    }
    @Test
    public void emailInvalido(){
        String resposta = LoginController.verifica(emailInvalido,senhaValida);
        Assert.assertEquals("E-mail inválido!", resposta); 
    }
    @Test
    public void senhaInvalida(){
        String resposta = LoginController.verifica(emailValido, senhaInvalida);
        Assert.assertEquals("Senha inválida!", resposta);
    }
}
