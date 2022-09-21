/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.controller;

import br.edu.ifpr.paranavai.service.LoginService;

/**
 *
 * @author Aluno
 */
public class LoginController {

    public static String verifica(String email, String senha) {
        return LoginService.verifica(email,senha);
    }
    
    
}
