/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifpr.paranavai.dao;

import br.edu.ifpr.paranavai.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.model.Armario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Leonardo
 */
public class ArmarioDaoImpl implements ArmarioDao {
    private Session sessao;

    public ArmarioDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }
    
    @Override
    public List<Armario> listarTodos() {
        List<Armario> pessoas = null;
        try {
            sessao.beginTransaction();
            pessoas = (List<Armario>) this.sessao.createQuery("from Armario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoas;
    }
    
    @Override
    public Armario buscarPorId(Long id) {
        Armario pessoa = null;
        try {
            sessao.beginTransaction();
            pessoa = (Armario) sessao.get(Armario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public Armario inserir(Armario pessoa) {
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
    public void atualizar(Armario localizacao) {
        try {
            sessao.beginTransaction();
            sessao.update(localizacao);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Armario localizacao) {
        try {
            sessao.beginTransaction();
            sessao.delete(localizacao);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
