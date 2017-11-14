/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.getcar.objeto.atendente.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.getcar.entidade.atendente.Atendente;

/**
 *
 * @author Carlos Antonio
 */
@SessionScoped
@ManagedBean
public class AtendenteBean {
     private Atendente atendente = new Atendente();
    private List<Atendente> atendentes = new ArrayList<>();
    
    
    public void adicionar(){
        atendentes.add(atendente);
        atendente = new Atendente();
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public List<Atendente> getAtendentes() {
        return atendentes;
    }

    public void setAtendentes(List<Atendente> atendentes) {
        this.atendentes = atendentes;
    }
    
}
