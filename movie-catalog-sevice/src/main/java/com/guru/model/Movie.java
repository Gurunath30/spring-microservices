package com.guru.model;

public class Movie {
	private String name;
	private String desc;
	private String movieId;
	private int rating;

	public Movie() {
	}

	public Movie(String movieId, String name, String description, int rating) {
		this.movieId = movieId;
		this.name = name;
		this.desc = description;
		this.rating = rating;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
