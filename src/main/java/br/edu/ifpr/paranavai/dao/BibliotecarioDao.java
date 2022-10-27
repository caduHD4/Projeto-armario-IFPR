/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifpr.paranavai.dao;

import br.edu.ifpr.paranavai.model.Bibliotecario;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface BibliotecarioDao {
    public List<Bibliotecario> listarTodos();
    public Bibliotecario buscarPorId(Long bibliotecario);
    public void inserir(Bibliotecario bibliotecario);
    public void atualizar(Bibliotecario bibliotecario);
    public void excluir(Bibliotecario bibliotecario);
    
}
