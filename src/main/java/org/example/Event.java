package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private String eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID, String eventName, String eventVenue, String eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = new ArrayList<>();
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    public void setEventAttendees(ArrayList<String> eventAttendees) {
        this.eventAttendees = eventAttendees;
    }

    public void addAttendee(String attendeeName) {
        eventAttendees.add(attendeeName);
    }

    public void removeAttendee(String attendeeName) {
        eventAttendees.remove(attendeeName);
    }

    public String updateAttendee(String oldName, String newName) {
        if (eventAttendees.contains(oldName)) {
            eventAttendees.set(eventAttendees.indexOf(oldName), newName);
            return newName;
        }
        else{
            return "i can not find the oldname.";
        }
    }

    public String findAttendee(String attendeeName) {
        if (eventAttendees.contains(attendeeName)) {
            return attendeeName;
        } else {
            return "Attendee not found.";
        }
    }

    public int getTotalAttendees() {
        return eventAttendees.size();
    }

    @Override
    public String toString() {
        return "Event ID: " + eventID +
                "\nEvent Name: " + eventName +
                "\nEvent Venue: " + eventVenue +
                "\nEvent Date: " + eventDate +
                "\nEvent Attendees: " + eventAttendees.toString();
    }
}

