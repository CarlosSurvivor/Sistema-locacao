/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.getcar.objeto.veiculo.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.getcar.entidade.veiculo.Veiculo;
import sistema.getcar.veiculo.DAO.VeiculoDAO;




/**
 *
 * @author usuario
 */
@SessionScoped
@ManagedBean
public class VeiculoBean {
    
    
    private Veiculo veiculo = new Veiculo();
    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionar(){
        veiculos.add(veiculo);
        new VeiculoDAO().salvar(veiculo);        
        veiculo = new Veiculo();
    }    

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos= veiculos;
    }
    
}