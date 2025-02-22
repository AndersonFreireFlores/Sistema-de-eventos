package com.example.lembrete_eventos.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
public class Event {

    @Id
    private UUID id;

    private String title;

    @ManyToOne
    private User creator;

    @ManyToMany(mappedBy = "eventsParticipating")
    private Set<User> participants;

    private Date createdAt;

    public Event() {
    }

    public Event(UUID id, String title, User creator, Set<User> participants, Date createdAt) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.participants = participants;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<User> participants) {
        this.participants = participants;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
