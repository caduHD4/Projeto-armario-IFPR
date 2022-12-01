package br.edu.ifpr.paranavai.service;

import br.edu.ifpr.paranavai.dao.ArmarioDao;
import br.edu.ifpr.paranavai.dao.ArmarioDaoImpl;
import br.edu.ifpr.paranavai.model.Armario;
import java.util.ArrayList;
import java.util.List;

/**        
 * 
 * 
 *
 * @author Aluno
 */
public class ArmarioService {
    
    private static ArmarioDao dao = new ArmarioDaoImpl();
    
    public static List<Armario> listarArmarios() {
        return dao.listarTodos();
    }

    public static Armario buscarPorId(Long id) {
        return dao.buscarPorId(id);
    }

    public static void inserir(Armario armario) {
        dao.inserir(armario);
    }

    public static void atualizar(Armario armario) {
        dao.atualizar(armario);
    }

    public static void excluir(Armario armario) {
        dao.excluir(armario);
    }
    
}
