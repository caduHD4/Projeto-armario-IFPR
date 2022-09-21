/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.service.LoginService;

/**
 *
 * @author Aluno
 */
public class LoginController {

    public static String verifica(String email, String senha) {
        return LoginService.verifica(email,senha);
    }
    
    
}
