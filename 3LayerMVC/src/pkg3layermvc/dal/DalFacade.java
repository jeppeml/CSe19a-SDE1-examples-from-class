/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layermvc.dal;

import java.util.List;
import pkg3layermvc.be.Inmate;

/**
 *
 * @author jeppjleemoritzled
 */
public interface DalFacade {
    public List<Inmate> getAllInmates();
    public boolean deleteInmate(Inmate inmate);
    public Inmate createInmate(Inmate inmate);
    public boolean updateInmate(Inmate inmate);
    
}
