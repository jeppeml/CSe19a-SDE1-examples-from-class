/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layermvc.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.List;
import pkg3layermvc.be.Inmate;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class InmateDAO {
    public List<Inmate> getAllInmates(){
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("CSe19B_40");
        ds.setPassword("CSe19B_40");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Prison");
        ds.setServerName("10.176.111.31");
        
        try(Connection con = ds.getConnection()){
            
        } catch (SQLServerException ex) {
            Logger.getLogger(InmateDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InmateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
