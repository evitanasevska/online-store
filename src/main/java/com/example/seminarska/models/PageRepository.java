
package com.example.seminarska.models;

import java.util.List;

import com.example.seminarska.models.data.Page;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.Query;

public interface PageRepository extends JpaRepository<Page,Integer>{

    Page findBySlug(String slug);

    //@Query("SELECT p FROM Page p WHERE p.id != :id and p.slug = :slug")
    //Page findBySlug(int id, String slug);

    Page findBySlugAndIdNot(String slug, int id);

    List<Page> findAllByOrderBySortingAsc();
    
}

/*
public interface PageRepository extends CrudRepository<Page,Integer>{
    @Override
    List<Page> findAll();
}
*/
