package com.guru.model;

import java.util.List;

public class MovieCatalogues {
	private String userId;
	private String userName;
	private List<Movie> movies;

	public MovieCatalogues() {
	}

	public MovieCatalogues(String userId, String userName, List<Movie> movies) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.movies = movies;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
}
