/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifpr.paranavai.dao;

import br.edu.ifpr.paranavai.model.Reserva;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface ReservaDao {
    public List<Reserva> listarTodos();
    public Reserva buscarPorId(Long reserva);
    public void inserir(Reserva reserva);
    public void atualizar(Reserva reserva);
    public void excluir(Reserva reserva);
    
}
