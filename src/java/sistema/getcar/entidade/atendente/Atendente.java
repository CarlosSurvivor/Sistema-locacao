/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.getcar.entidade.atendente;

import java.sql.Date;

/**
 *
 * @author Carlos Antonio
 */
public class Atendente {    
    
       private String idAtendente;
       private String senha;
       private String nome;
       private Date dataCadastro;
       private String cargo;
       private String descricao;

    public String getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(String idAtendente) {
        this.idAtendente = idAtendente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }      
       

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }   

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    
    }        

   

   
}