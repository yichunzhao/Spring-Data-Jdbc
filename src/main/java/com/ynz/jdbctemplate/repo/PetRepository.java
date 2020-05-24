package com.ynz.jdbctemplate.repo;

import com.ynz.jdbctemplate.domain.Pet;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PetRepository extends CrudRepository<Pet, Long> {

    @Query("select * from pet where name = :name")
        //only support name parameters, but not indexing.
    List<Pet> findByName(@Param("name") String name);
}
