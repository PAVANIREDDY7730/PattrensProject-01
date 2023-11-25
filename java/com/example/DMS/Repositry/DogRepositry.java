package com.example.DMS.Repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

public interface DogRepositry extends CrudRepository<Dog , Integer>{
	List<Dog>  findByName(String name);

}
