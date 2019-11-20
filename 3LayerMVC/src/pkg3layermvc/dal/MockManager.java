/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layermvc.dal;

import java.util.ArrayList;
import java.util.List;
import pkg3layermvc.be.Inmate;

/**
 *
 * @author jeppjleemoritzled
 */
public class MockManager implements DalFacade{
    private ArrayList<Inmate> inmates = new ArrayList();
    
    public MockManager() {
        Inmate im1 = new Inmate(1, 256, "Piotr Steganovski");
        Inmate im2 = new Inmate(2, 256, "Pierre Stegeau");
        Inmate im3 = new Inmate(3, 128, "Peter Stegger");
        Inmate im4 = new Inmate(5, 65536, "Petanika Stegunika");
        
        inmates.add(im1);
        inmates.add(im2);
        inmates.add(im3);
        inmates.add(im4);
    }
    
    
    public List<Inmate> getAllInmates(){
        return inmates;
    }

    @Override
    public boolean deleteInmate(Inmate inmate) {
        return inmates.remove(inmate);
    }

    @Override
    public Inmate createInmate(Inmate inmate) {
        inmate.setFangenummer(0);
        inmates.add(inmate);
        return inmate;
    }

    @Override
    public boolean updateInmate(Inmate inmate) {
        // nothing to see here, move along people!
        return true;
    }
}
