package com.vanbilloen.pbwhuuraanvraag.model;

import javax.persistence.*;

@Entity
@Table(name ="clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;

    @Column(nullable = false)
    private String email;

}
