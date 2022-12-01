/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifpr.paranavai.dao;

import br.edu.ifpr.paranavai.model.Estudante;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface EstudanteDao {
    public List<Estudante> listarTodos();
    public Estudante buscarPorId(Long estudante);
    public void inserir(Estudante estudante);
    public void atualizar(Estudante estudante);
    public void excluir(Estudante estudante);
    
}
