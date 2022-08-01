/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.service;
/**        
 * @author Leonardo Sarto e Carlos Eduardo
 */
public class LoginService {
    public static String login(String autenticacao, String senha){
        if (autenticacao.equals("20210001920") || autenticacao.equals("leonardosarto1@hotmail.com")) {
            if (senha.equals("12345")) {
                return "Usuário logado!";
            }
            return "Senha inválida!";
        }
        return "Autenticação inválida!";
    }

    public static String verificacaoArmario(String armario, boolean devolverArmario) {
        if(armario.equals("Armário 3") && devolverArmario == true) {
            return "Armário devolvido!";
        } else if(armario.equals("Armário 4") && devolverArmario == false){
            return "Armário emprestado!";
        } else {
            if(devolverArmario == true){
                return "Armário indisponível para devolução!";
            } else {
                return "Armário indisponível para empréstimo!";
            }
        }
    }
}
