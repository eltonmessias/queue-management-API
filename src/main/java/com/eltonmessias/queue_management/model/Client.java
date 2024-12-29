package com.eltonmessias.queue_management.model;

import com.eltonmessias.queue_management.enums.ClientPriority;
import com.eltonmessias.queue_management.enums.ClientStatus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Queue category;
    @Enumerated(EnumType.STRING)
    private ClientPriority priority;
    @Enumerated(EnumType.STRING)
    private ClientStatus status;
}
