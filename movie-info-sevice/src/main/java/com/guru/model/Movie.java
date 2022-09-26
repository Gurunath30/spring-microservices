package com.guru.model;

public class Movie {
	private String name;
	private String desc;
	private String movieId;

	public Movie() {
	}

	public Movie(String movieId, String name, String description) {
		this.movieId = movieId;
		this.name = name;
		this.desc = description;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return desc;
	}

	public void setDescription(String description) {
		this.desc = description;
	}
}
