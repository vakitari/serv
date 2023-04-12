package com.example.server.v2.entity;

import com.example.server.v2.entity.BookEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;


@Entity
@Data
@Table(name = "publishings")
public class PublisherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String publisher;
    private String city;
    @JsonIgnore
    @OneToMany(cascade =CascadeType.ALL, mappedBy = "publishing")
    private List<BookEntity> book;

}
