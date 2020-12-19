/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ejmcc.entidades.classes;
import net.ejmcc.entidades.enumeracoes.*;
/**
 *
 * @author Giu
 */

public class Funcionario {
    
    //atributos
    private int matricula = 0;
    //private String matricula = "";
    private String nome = "";
    private String email = "";
    private String telefone = "";
    private Sexo sexo = Sexo.MASCULINO;
    private Situacao status = Situacao.ATIVO;
        
    
//construtor
    public Funcionario(){}
    public Funcionario(String strDados) throws Exception{
        String vetorString[] = strDados.split(";");
        if(vetorString.length < 6)throw new Exception("Faltam dados na String");
        matricula = Integer.parseInt(vetorString[0]);
        //matricula = vetorString[0];
        nome = vetorString[1];
        email = vetorString[2];
        telefone = vetorString[3];
        sexo = Sexo.valueOf(vetorString[4]);
        status = Situacao.valueOf(vetorString[5]);
    }
    public Funcionario(int matricula, String nome, String email, String telefone, Sexo sexo, Situacao status){
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.status = status;
    }
    
    
    
    //gets e sets

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the status
     */
    public Situacao getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Situacao status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        String str = matricula + ";" + nome + ";" +
                     email + ";" + telefone + ";" +
                     sexo.toString() + ";" + status.toString();
        return str;
    }
    
    
    
    
}
