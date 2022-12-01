package br.edu.ifpr.paranavai.service;

import br.edu.ifpr.paranavai.dao.EstudanteDao;
import br.edu.ifpr.paranavai.dao.EstudanteDaoImpl;
import br.edu.ifpr.paranavai.model.Estudante;
import java.util.ArrayList;
import java.util.List;

/**        
 * 
 * 
 *
 * @author Aluno
 */
public class EstudanteService {
    
    private static EstudanteDao dao = new EstudanteDaoImpl();
    
    public static List<Estudante> listarEstudantes() {
        return dao.listarTodos();
    }

    public static Estudante buscarPorId(Long id) {
        return dao.buscarPorId(id);
    }

    public static void inserir(Estudante estudante) {
        dao.inserir(estudante);
    }

    public static void atualizar(Estudante estudante) {
        dao.atualizar(estudante);
    }

    public static void excluir(Estudante estudante) {
        dao.excluir(estudante);
    }
    
}
