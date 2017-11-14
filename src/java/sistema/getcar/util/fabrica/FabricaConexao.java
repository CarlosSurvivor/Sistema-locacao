/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.getcar.util.fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class FabricaConexao {
    
    public static Connection conexao; //interface
    public static final String URL_CONEXAO ="jdbc:mysql://localhost/Sistema-locacao";
    public static final String USUARIO ="root";
    public static final String SENHA =null;
    
    public static Connection getConexao(){
    if(conexao == null){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(URL_CONEXAO,USUARIO,SENHA);
        } catch (SQLException ex) {
            Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }        
     return conexao;
     }

    public static void  fecharConexao(){
        
    if(conexao !=null){
    try{
        conexao.close();
        conexao = null;
        
    }catch(SQLException ex){
        Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    }
}

    

