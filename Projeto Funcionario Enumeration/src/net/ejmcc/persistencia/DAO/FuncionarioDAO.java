/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ejmcc.persistencia.DAO;
import java.util.ArrayList;
import net.ejmcc.entidades.classes.Funcionario;
import net.ejmcc.persistencia.interfaces.IfuncionarioDAO;
import java.io.*;
/**
 *
 * @author Giu
 */
public class FuncionarioDAO implements IfuncionarioDAO{
    //ArrayList<Funcionario> listaDeContatos;
    
    @Override
    public void incluir(Funcionario objetoFuncionario) throws Exception {
        try{
           //cria arquivo
           FileWriter fw = new FileWriter("Funcionario.txt",true);
           //cria o buffer do arquivo
           BufferedWriter bw = new BufferedWriter(fw);
           //escreve no arquivo
           bw.write(objetoFuncionario.toString()+"\n");
           //fecha o arquivo
           bw.close();
        }catch(Exception erro){
            throw erro;
        }
    }
    
    @Override
    public ArrayList<Funcionario> listagem() throws Exception {
        try{
            ArrayList<Funcionario> listaDeContatos = new ArrayList<Funcionario>();
            //listaDeContatos = new ArrayList<Funcionario>();
            FileReader fr = new FileReader("Funcionario.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Funcionario objFuncionario = new Funcionario(linha);
                listaDeContatos.add(objFuncionario);
            }
            br.close();
            return listaDeContatos;
        }catch(Exception erro){
        throw erro;
        }
    }
    
   
    
    @Override
    public void excluir(int matricula) throws Exception{
        ArrayList<Funcionario> lista = null;
        lista = listagem();
        if(lista.size()==0) return;
        FileWriter fw = new FileWriter("Funcionario.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(Funcionario p : lista){
            if(p.getMatricula() != matricula){
                bw.write(p.toString()+"\n");
            }
        } bw.close();
        /*for(int i = 0; i < lista.size(); i++)
        {
            Funcionario p = lista.get(i);
            if(p.getMatricula() != matricula){
                lista.remove(p);
                bw.write(p.toString()+"\n");
                break;
            }
        }bw.close();*/
    }
    
    
    @Override
    public void atualizar(Funcionario objetoFuncionario) throws Exception {
        try{
            ArrayList<Funcionario> lista = null;
            lista = listagem();
            if(lista.size()==0) return;
            FileWriter fw = new FileWriter("Funcionario.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for(Funcionario p : lista){
                if(p.getMatricula() != objetoFuncionario.getMatricula()){
                    bw.write(p.toString()+"\n");
                }else{
                        bw.write(objetoFuncionario.toString()+"\n");
                     }
              } bw.close();
            /*for(int i = 0; i < lista.size(); i++)
            {
                Funcionario p = lista.get(i);
                if(p.getMatricula() != objetoFuncionario.getMatricula()){
                    //lista.add(p);
                    bw.write(p.toString()+"\n");
                    //break;
                }else{
                        bw.write(objetoFuncionario.toString()+"\n");
                     }
            }bw.close();*/
            
       }catch(Exception erro){
            throw erro;
        }
    }
}

    

    
    

