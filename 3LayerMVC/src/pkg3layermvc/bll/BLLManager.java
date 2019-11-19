/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layermvc.bll;

import java.util.List;
import pkg3layermvc.be.Inmate;
import pkg3layermvc.dal.DalFacade;
import pkg3layermvc.dal.InmateDAO;
import pkg3layermvc.dal.MockManager;

/**
 *
 * @author jeppjleemoritzled
 */
public class BLLManager {
    private DalFacade dal = new InmateDAO();
    
    public List<Inmate> getAllInmates(){
        return dal.getAllInmates();
    }
}
