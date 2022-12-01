/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifpr.paranavai.dao;

import br.edu.ifpr.paranavai.model.Armario;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface ArmarioDao {
    public List<Armario> listarTodos();
    public Armario buscarPorId(Long armario);
    public void inserir(Armario armario);
    public void atualizar(Armario armario);
    public void excluir(Armario armario);
    
}
