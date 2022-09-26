package com.guru.model;

import java.util.List;

public class UserRating {
	private String userId;
	private List<Rating> ratings;

	public UserRating() {
	}

	public UserRating(String userId, List<Rating> rating) {
		super();
		this.userId = userId;
		this.ratings = rating;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> rating) {
		this.ratings = rating;
	}
}
