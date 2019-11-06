/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layermvc.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pkg3layermvc.be.Inmate;
import pkg3layermvc.bll.BLLManager;

/**
 *
 * @author jeppjleemoritzled
 */
public class AppModel {
    private BLLManager bll = new BLLManager();
    private ObservableList<Inmate> inmates = 
            FXCollections.observableArrayList();

    public AppModel() {
         fetchData();
    }
    
    public void fetchData(){
        inmates.clear();
        inmates.addAll(bll.getAllInmates());
    }
    
    public ObservableList<Inmate> getInmateList(){
        return inmates;
    }
}
