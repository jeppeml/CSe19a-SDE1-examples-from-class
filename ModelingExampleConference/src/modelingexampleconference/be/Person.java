/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelingexampleconference.be;

import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class Person {
    private int id;
    private String email;
    private String name;
    private String phone;
    private String title;
    
    private List<Event> chosenTalks;
    private List<Event> chosenWorkshops;

    public Person(int id, String email, String name, String phone, String title) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.title = title;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Event> getChosenTalks() {
        return chosenTalks;
    }

    public void setChosenTalks(List<Event> chosenTalks) {
        this.chosenTalks = chosenTalks;
    }

    public List<Event> getChosenWorkshops() {
        return chosenWorkshops;
    }

    public void setChosenWorkshops(List<Event> chosenWorkshops) {
        this.chosenWorkshops = chosenWorkshops;
    }
    
    
}
