package com.guru.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guru.model.Movie;

@RestController
@RequestMapping("/movie")
public class MovieInfoController {
	@RequestMapping("/{movieId}")
	public Movie getMovieDetails(@PathVariable String movieId) {
		return new Movie(movieId, "Passenger", "Great movie with adventures space things.");
	}
}
