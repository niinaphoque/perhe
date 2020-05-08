package com.example.perhe.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface PerheRepository extends CrudRepository<Perhe, Long> {
	
	List<Perhe> findbyName(String Perhe);

}
