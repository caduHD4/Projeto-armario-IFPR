/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifpr.paranavai.dao;

import br.edu.ifpr.paranavai.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.model.Estudante;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Leonardo
 */
public class EstudanteDaoImpl implements EstudanteDao {
    private Session sessao;

    public EstudanteDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }
    
    @Override
    public List<Estudante> listarTodos() {
        List<Estudante> pessoas = null;
        try {
            sessao.beginTransaction();
            pessoas = (List<Estudante>) this.sessao.createQuery("from Estudante").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoas;
    }
    
    @Override
    public Estudante buscarPorId(Long id) {
        Estudante pessoa = null;
        try {
            sessao.beginTransaction();
            pessoa = (Estudante) sessao.get(Estudante.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public Estudante inserir(Estudante pessoa) {
        try {
            sessao.beginTransaction();
            sessao.persist(pessoa);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public void atualizar(Estudante localizacao) {
        try {
            sessao.beginTransaction();
            sessao.update(localizacao);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Estudante localizacao) {
        try {
            sessao.beginTransaction();
            sessao.delete(localizacao);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
