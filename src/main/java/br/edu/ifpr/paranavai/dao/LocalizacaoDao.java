/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifpr.paranavai.dao;

import br.edu.ifpr.paranavai.model.Localizacao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface LocalizacaoDao {
    public List<Localizacao> listarTodos();
    public Localizacao buscarPorId(Long localizacao);
    public void inserir(Localizacao localizacao);
    public void atualizar(Localizacao localizacao);
    public void excluir(Localizacao localizacao);
    
}
