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
        List<Estudante> listaEstudantes = null;
        try {
            sessao.beginTransaction();
            listaEstudantes = (List<Estudante>) this.sessao.createQuery("from Estudante").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaEstudantes;
    }
    
    @Override
    public Estudante buscarPorId(Long id) {
        Estudante estudante = null;
        try {
            sessao.beginTransaction();
            estudante = (Estudante) sessao.get(Estudante.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return estudante;
    }

    @Override
    public void inserir(Estudante estudante) {
        try {
            sessao.beginTransaction();
            sessao.persist(estudante);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Estudante estudante) {
        try {
            sessao.beginTransaction();
            sessao.update(estudante);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Estudante estudante) {
        try {
            sessao.beginTransaction();
            sessao.delete(estudante);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
