package com.example.simple_rest_project.mdoel;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    private long id;
    private String title;
    private String content;
    private LocalDateTime created;
}
