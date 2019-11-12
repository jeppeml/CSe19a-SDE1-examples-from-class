/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelingexampleconference.bll;

import modelingexampleconference.be.Conference;
import modelingexampleconference.dal.ConferenceDAO;

/**
 *
 * @author jeppjleemoritzled
 */
public class BLLManager {
    private ConferenceDAO conf = new ConferenceDAO();
    
    public Conference getConference(int year){
        return conf.getConference(year);
    }
}
