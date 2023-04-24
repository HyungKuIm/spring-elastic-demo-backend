package com.oraclejava.es.api.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.oraclejava.es.api.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String> {
	
	//List<Movie> findAll(Sort sort);
	Page<Movie> findAll(Pageable pageable);

	Page<Movie> findByTitle(String title, Pageable pageable);
}
