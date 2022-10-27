/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.controller;
import br.edu.ifpr.paranavai.model.Armario;
import br.edu.ifpr.paranavai.service.EstudanteService;
import br.edu.ifpr.paranavai.model.Estudante;
import br.edu.ifpr.paranavai.service.ArmarioService;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ArmarioController {

    public static List<Armario> listarArmarios() {
        return ArmarioService.listarArmarios();
    }
    
}
