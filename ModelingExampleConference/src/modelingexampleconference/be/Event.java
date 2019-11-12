/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelingexampleconference.be;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class Event {
    private int id;
    private String name;
    private String host;
    private String eventType;
    private int maxAttendees;
    
    private List<Room> rooms;
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;

    public Event(int id, String name, String host, String eventType, int maxAttendees, List<Room> rooms, LocalDateTime timeStart, LocalDateTime timeEnd) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.eventType = eventType;
        this.maxAttendees = maxAttendees;
        this.rooms = rooms;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
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

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public int getMaxAttendees() {
        return maxAttendees;
    }

    public void setMaxAttendees(int maxAttendees) {
        this.maxAttendees = maxAttendees;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalDateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }
    
    
}
