/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.controller;
import br.edu.ifpr.paranavai.service.EstudanteService;
import br.edu.ifpr.paranavai.model.Estudante;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class EstudanteController {

    public static List<Estudante> listarEstudantes() {
        return EstudanteService.listarEstudantes();
    }
    
}
