package br.edu.ifpr.teste.hibernate;
import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.model.Armario;
import org.hibernate.Session;

public class TesteHibernate {
    
    public static void main (String args[]) {
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        Armario armario = new Armario();
        sessao.save(armario);
        sessao.getTransaction().commit();
        HibernateUtil.encerraSession();
    }
}
