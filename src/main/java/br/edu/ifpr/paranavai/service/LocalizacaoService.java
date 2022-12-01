/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.service;

import br.edu.ifpr.paranavai.dao.LocalizacaoDao;
import br.edu.ifpr.paranavai.dao.LocalizacaoDaoImpl;
import br.edu.ifpr.paranavai.model.Localizacao;
import java.util.ArrayList;
import java.util.List;
/**        
 * 
 * 
 *
 * @author Aluno
 */
public class LocalizacaoService {

    private static LocalizacaoDao dao = new LocalizacaoDaoImpl();

    public static List<Localizacao> buscarListaLocalizacoes(){
       return dao.listarTodos();
    }
    
    public static Localizacao buscarPorId(Long id) {
        return dao.buscarPorId(id);
    }

    public static void inserir(Localizacao localizacao) {
        dao.inserir(localizacao);
    }

    public static void atualizar(Localizacao localizacao) {
        dao.atualizar(localizacao);
    }

    public static void excluir(Localizacao localizacao) {
        dao.excluir(localizacao);
    }
    
}
