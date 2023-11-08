package io.nilmani.mailservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "EmailAddress")
public class MailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    @Column(unique = true)
    private  String email;
    private  String message;


    public MailEntity(int id, String email, String message) {
        this.id = id;
        this.email = email;
        this.message = message;
    }

    public MailEntity() {

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
