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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class InmateDAO implements DalFacade {
    
    public static void main(String[] args) {
        InmateDAO dao = new InmateDAO();
        
        Inmate vanDer = new Inmate(1005, 666, "Piotr Garrsmanikovski Steginavsokej");
        // Inmate inmate = dao.createInmate(vanDer);
        //boolean b = dao.deleteInmate(vanDer);
        boolean b = dao.updateInmate(vanDer);
        System.out.println(""+b);
    }

    private SQLServerDataSource ds = new SQLServerDataSource();

    public InmateDAO() {
        ds.setUser("CSe19B_40");
        ds.setPassword("CSe19B_40");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Prison");
        ds.setServerName("10.176.111.31");
    }

    public List<Inmate> getAllInmates() {

        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * FROM Inmates";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            List<Inmate> inmates = new ArrayList();
            while (rs.next()) {
                int fangenummer = rs.getInt("fangenummer");
                int celle = rs.getInt("celle");
                String navn = rs.getString("navn");

                Inmate inmate = new Inmate(fangenummer, celle, navn);
                inmates.add(inmate);
            }
            return inmates;

        } catch (SQLServerException ex) {
            Logger.getLogger(InmateDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InmateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean deleteInmate(Inmate inmate) {
        try (Connection con = ds.getConnection()) {
            String sql = "DELETE FROM Inmates WHERE fangenummer=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, inmate.getFangenummer());
            
            int updatedRows = pstmt.executeUpdate();
            return updatedRows > 0;
            
        } catch (SQLServerException ex) {
            Logger.getLogger(InmateDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InmateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Inmate createInmate(Inmate inmate) {
        try (Connection con = ds.getConnection()) {
            String sql = "INSERT INTO Inmates (celle, navn) VALUES (?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, inmate.getCelle());
            pstmt.setString(2, inmate.getNavn());
            
            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            
            if(rs.next())
                inmate.setFangenummer((int)rs.getLong(1));
            else 
                return null;
            
            return inmate;
            
            
        } catch (SQLServerException ex) {
            Logger.getLogger(InmateDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InmateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean updateInmate(Inmate inmate) {
       
        try (Connection con = ds.getConnection()) {
            String sql = "UPDATE Inmates SET celle=?, navn=? WHERE fangenummer=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, inmate.getCelle());
            pstmt.setString(2, inmate.getNavn());
            pstmt.setInt(3, inmate.getFangenummer());
           
            int updatedRows = pstmt.executeUpdate();
            return updatedRows > 0;
            
        } catch (SQLServerException ex) {
            Logger.getLogger(InmateDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InmateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
