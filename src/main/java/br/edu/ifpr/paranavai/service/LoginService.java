/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.service;

/**        
 * 
 * 
 *
 * @author Aluno
 */
public class LoginService {

    public static String verifica(String email, String senha){
       if (email.equals("20210001920")){
           if (senha.equals("12345")){
                return "Sucesso no login!";
           }
           return "Senha inválida!";
       }
       return "RA inválido!";         
    }
    
}
