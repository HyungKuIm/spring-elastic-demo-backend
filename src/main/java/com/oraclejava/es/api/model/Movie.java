package com.oraclejava.es.api.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie {
	@Id
	@Column(name = "movie_id")
	private String id;
	private String title;
	private int price;
	private String synopsis;
	
	private byte[] moviePicture;
}
