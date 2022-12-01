/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifpr.paranavai.dao;

import br.edu.ifpr.paranavai.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.model.Localizacao;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Leonardo
 */
public class LocalizacaoDaoImpl implements LocalizacaoDao {
    private Session sessao;

    public LocalizacaoDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }
    
    @Override
    public List<Localizacao> listarTodos() {
        List<Localizacao> listaLocalizacoes = null;
        try {
            sessao.beginTransaction();
            listaLocalizacoes = (List<Localizacao>) this.sessao.createQuery("from Localizacao").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaLocalizacoes;
    }
    
    @Override
    public Localizacao buscarPorId(Long id) {
        Localizacao localizacao = null;
        try {
            sessao.beginTransaction();
            localizacao = (Localizacao) sessao.get(Localizacao.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return localizacao;
    }

    @Override
    public void inserir(Localizacao localizacao) {
        try {
            sessao.beginTransaction();
            sessao.persist(localizacao);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Localizacao localizacao) {
        try {
            sessao.beginTransaction();
            sessao.update(localizacao);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Localizacao localizacao) {
        try {
            sessao.beginTransaction();
            sessao.delete(localizacao);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
