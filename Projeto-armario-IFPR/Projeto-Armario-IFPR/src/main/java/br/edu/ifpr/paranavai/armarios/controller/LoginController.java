package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.service.LoginService;
/**
 *
 * @author Leonardo Sarto e Carlos Eduardo
 */
public class LoginController {
    public static String loginVerificacaoArmario(String autenticacao, String senha, String armario, boolean devolverArmario) {
        String autenticado = LoginService.login(autenticacao, senha);
        if(autenticado.equals("Usuário logado!")) {
            if(armario != null) {
                return LoginService.verificacaoArmario(armario, devolverArmario);
            }
        }
        return autenticado;
    }
}
