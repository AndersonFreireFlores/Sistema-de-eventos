package com.example.lembrete_eventos.Models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    private UUID id;

    private String name;

    private String email;

    private boolean active;

    private Date createdAt;

    @OneToMany(mappedBy = "creator")
    private List<Event> eventsCreated;

    @ManyToMany
    @JoinTable(
            name = "participants_events",
            joinColumns = @JoinColumn(name = "tb_user_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private Set<Event> eventsParticipating;

    public User() {
    }

    public User(UUID id, String name, String email, boolean active, Date createdAt, List<Event> eventsCreated, Set<Event> eventsParticipating) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
        this.createdAt = createdAt;
        this.eventsCreated = eventsCreated;
        this.eventsParticipating = eventsParticipating;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<Event> getEventsCreated() {
        return eventsCreated;
    }

    public void setEventsCreated(List<Event> eventsCreated) {
        this.eventsCreated = eventsCreated;
    }

    public Set<Event> getEventsParticipating() {
        return eventsParticipating;
    }

    public void setEventsParticipating(Set<Event> eventsParticipating) {
        this.eventsParticipating = eventsParticipating;
    }
}
