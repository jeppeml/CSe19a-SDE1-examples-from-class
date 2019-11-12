/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelingexampleconference.dal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import modelingexampleconference.be.Conference;
import modelingexampleconference.be.Event;
import modelingexampleconference.be.Room;
import modelingexampleconference.be.Topic;

/**
 *
 * @author jeppjleemoritzled
 * 
 * THIS IS A MOCK CLASS
 */
public class ConferenceDAO {
    public Conference getConference(int year){
        Conference c = new Conference(0, "IT conf", year);
        
        Room r = new Room(0, "A17", 2000);
        Room r2 = new Room(0, "b1", 50);
        
        List<Room> rooms = new ArrayList();
        
        rooms.add(r);
        
        Event e1 = new Event(0, "IoT Workshop", "Piotr Stegovskij", "Workshop", 200, rooms, LocalDateTime.MAX, LocalDateTime.MIN);
        Event e2 = new Event(1, "SDE Workshop", "Peter Bomstræk", "Foredrag", 40, rooms, LocalDateTime.MAX, LocalDateTime.MIN);
        
        Topic t = new Topic();
        t.getEvents().add(e1);
        t.getEvents().add(e2);
        
        c.getTopics().add(t);
        
        return c;
            
    }
}
