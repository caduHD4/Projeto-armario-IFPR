/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifpr.paranavai.dao;

import br.edu.ifpr.paranavai.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.model.Reserva;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Leonardo
 */
public class ReservaDaoImpl implements ReservaDao {
    private Session sessao;

    public ReservaDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }
    
    @Override
    public List<Reserva> listarTodos() {
        List<Reserva> listaReservas = null;
        try {
            sessao.beginTransaction();
            listaReservas = (List<Reserva>) this.sessao.createQuery("from Reserva").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaReservas;
    }
    
    @Override
    public Reserva buscarPorId(Long id) {
        Reserva reserva = null;
        try {
            sessao.beginTransaction();
            reserva = (Reserva) sessao.get(Reserva.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reserva;
    }

    @Override
    public void inserir(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.persist(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.update(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.delete(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
