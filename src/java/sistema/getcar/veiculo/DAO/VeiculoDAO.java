/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.getcar.veiculo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.getcar.util.fabrica.FabricaConexao;
import sistema.getcar.entidade.veiculo.Veiculo;

/**
 *
 * @author ADSI
 */
public class VeiculoDAO {
    
    public void salvar(Veiculo veiculo) {
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps= conexao.prepareCall("INSERT INTO,'sistema-locacao','veiculo'('modelo','fabricante','cor','quilometragem','estilo','potencia','placa','ano')VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, veiculo.getModelo());//parametros de referencia ?
            ps.setString(2, veiculo.getFabricante());
            ps.setString(3, veiculo.getCor());
            ps.setInt(4, veiculo.getQuilometragem());
            ps.setString(5, veiculo.getEstilo());
            ps.setString(6, veiculo.getPotencia());
            ps.setString(7, veiculo.getPlaca());
            ps.setDate(8, new Date(veiculo.getAno().getTime()));
            ps.execute();
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
