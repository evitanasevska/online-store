package com.example.seminarska.models.data;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Size(min = 2, message = "Name must be at least 2 characters long")
    private String name;

    @Getter
    @Setter
    private String slug;

    @Getter
    @Setter
    @Size(min = 5, message = "Description must be at least 5 characters long")
    private String description;

    @Getter
    @Setter
    private String image;

    @Getter
    @Setter
    @Pattern(regexp = "^[0-9]+([.][0-9]{1,2})?", message = "Expected format: 5, 5.99, 15, 15.99")
    private String price;

    @Getter
    @Setter
    @Pattern(regexp = "^[1-9][0-9]*", message = "Please choose a category")
    @Column(name="category_id")
    private String categoryId;

    @Getter
    @Setter
    @Column(name="created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Getter
    @Setter
    @Column(name="updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    
}
