/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelingexampleconference.be;

/**
 *
 * @author jeppjleemoritzled
 */
public class Room {
    private int id;
    private String name;
    private int maxAttendees;

    public Room(int id, String name, int maxAttendees) {
        this.id = id;
        this.name = name;
        this.maxAttendees = maxAttendees;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getMaxAttendees() {
        return maxAttendees;
    }

    public void setMaxAttendees(int maxAttendees) {
        this.maxAttendees = maxAttendees;
    }
    
    
}
