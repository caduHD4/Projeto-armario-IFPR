/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifpr.paranavai.dao;

import br.edu.ifpr.paranavai.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.model.Bibliotecario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Leonardo
 */
public class BibliotecarioDaoImpl implements BibliotecarioDao {
    private Session sessao;

    public BibliotecarioDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }
    
    @Override
    public List<Bibliotecario> listarTodos() {
        List<Bibliotecario> listaBibliotecarios = null;
        try {
            sessao.beginTransaction();
            listaBibliotecarios = (List<Bibliotecario>) this.sessao.createQuery("from Bibliotecario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaBibliotecarios;
    }
    
    @Override
    public Bibliotecario buscarPorId(Long id) {
        Bibliotecario bibliotecario = null;
        try {
            sessao.beginTransaction();
            bibliotecario = (Bibliotecario) sessao.get(Bibliotecario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bibliotecario;
    }

    @Override
    public void inserir(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.persist(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.update(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.delete(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
