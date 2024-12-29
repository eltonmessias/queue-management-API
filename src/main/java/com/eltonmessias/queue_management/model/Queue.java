package com.eltonmessias.queue_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Queue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String category;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "queue")
    private List<Client> clients = new ArrayList<>();
}
