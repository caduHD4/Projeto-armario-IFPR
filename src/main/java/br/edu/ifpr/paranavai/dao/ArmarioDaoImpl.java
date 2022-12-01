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
        List<Armario> listaArmarios = null;
        try {
            sessao.beginTransaction();
            listaArmarios = (List<Armario>) this.sessao.createQuery("from Armario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaArmarios;
    }
    
    @Override
    public Armario buscarPorId(Long id) {
        Armario armario = null;
        try {
            sessao.beginTransaction();
            armario = (Armario) sessao.get(Armario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return armario;
    }

    @Override
    public void inserir(Armario armario) {
        try {
            sessao.beginTransaction();
            sessao.persist(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Armario armario) {
        try {
            sessao.beginTransaction();
            sessao.update(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Armario armario) {
        try {
            sessao.beginTransaction();
            sessao.delete(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
