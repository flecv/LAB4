package com.example.demo.service.repository;

import com.example.demo.service.DirectorClass.Director;
import org.springframework.data.repository.CrudRepository;

public interface DirectorRepo extends CrudRepository<Director, String> {
    Director getDirectorByName(String id);
}
