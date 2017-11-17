/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.getcar.atendente.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.getcar.entidade.atendente.Atendente;
import sistema.getcar.util.fabrica.FabricaConexao;

/**
 *
 * @author Carlos Antonio
 */
public class AtendenteDAO {
    
    public void salvar(Atendente atendente) {
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps= conexao.prepareCall("INSERT INTO `mydb`.`atendente`(`idAtendente`,`nome`,`senha`,"
                    + "`DataCadastro`,`cargo`,`descricao`)VALUES(?,?,?,?,?,?);");     
            ps.setString(1, atendente.getIdAtendente());
            ps.setString(2, atendente.getNome());
            ps.setString(3, atendente.getSenha());
            ps.setDate(4, new Date(atendente.getDataCadastro().getTime()));
            ps.setString(5, atendente.getCargo()); 
            ps.setString(6,atendente.getDescricao());
            ps.execute();
            FabricaConexao.fecharConexao();
            } catch (SQLException ex) {
                Logger.getLogger(AtendenteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
    

   
