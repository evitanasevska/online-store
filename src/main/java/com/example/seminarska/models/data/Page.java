package com.example.seminarska.models.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

//import lombok.AccessLevel;
//import lombok.Data;
//import lombok.NonNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pages")
//@Data(AccessLevel.PUBLIC)
public class Page {

    @Id
    @Getter
    @Setter 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Getter
    @Setter 
    @Size(min = 2, message = "Title must be at least 2 characters long")
    private String title;
    
    @Getter
    @Setter 
    private String slug;
    
    @Getter
    @Setter 
    @Size(min = 5, message = "Content must be at least 5 characters long")
    private String content;
    
    @Getter
    @Setter 
    private int sorting;
    
}