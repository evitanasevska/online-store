package com.example.seminarska.models.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="categories")
@Data
public class Category {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Size(min=2, message = "Title must be at least 2 characters long")
    private String name;

    @Getter
    @Setter
    private String slug;

    @Getter
    @Setter
    private int sorting;
    
}
