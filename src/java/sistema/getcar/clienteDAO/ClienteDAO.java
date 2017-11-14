/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.getcar.clienteDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.getcar.entidade.cliente.Cliente;
import sistema.getcar.util.fabrica.FabricaConexao;

/**
 *
 * @author Carlos Antonio
 */
public class ClienteDAO {
    
    public void salvar(Cliente cliente) {
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps= conexao.prepareCall("INSERT INTO `mydb`.`cliente`(`idcliente`,`nome`,`telefone`,"
                    + "`cpf`,`email`)VALUES(?,?,?,?,?);");     
            ps.setInt(1, cliente.getIdcliente());
            ps.setString(2, cliente.getNome());
            ps.setInt(3, cliente.getTelefone());
            ps.setString(4, cliente.getCpf());
            ps.setString(5, cliente.getEmail());
            ps.execute();
            FabricaConexao.fecharConexao();            
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    
}
}