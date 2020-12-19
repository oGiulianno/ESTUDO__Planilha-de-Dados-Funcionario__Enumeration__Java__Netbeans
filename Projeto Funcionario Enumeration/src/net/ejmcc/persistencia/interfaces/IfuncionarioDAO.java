/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ejmcc.persistencia.interfaces;
import net.ejmcc.entidades.classes.Funcionario;
import java.util.ArrayList;
/**
 *
 * @author Giu
 */
public interface IfuncionarioDAO {
    
    void incluir (Funcionario objetoFuncionario) throws Exception;
    void excluir(int matricula) throws Exception;
    void atualizar (Funcionario objetoFuncionario) throws Exception;
    ArrayList<Funcionario> listagem() throws Exception;
    
}


