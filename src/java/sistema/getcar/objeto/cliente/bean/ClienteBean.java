/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.getcar.objeto.cliente.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.getcar.entidade.cliente.Cliente;

/**
 *
 * @author ADSI
 */
@ManagedBean
@SessionScoped
public class ClienteBean {
    
    private Cliente cliente = new Cliente();
    private List<Cliente> clientes = new ArrayList<>();
    
    
    public void adicionar(){
        clientes.add(cliente);
        cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
    
    
}
