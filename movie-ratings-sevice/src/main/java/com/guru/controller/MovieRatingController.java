package com.guru.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guru.model.Rating;
import com.guru.model.UserRating;

@RestController()
@RequestMapping("/rating")
public class MovieRatingController {

	@RequestMapping("/{userId}")
	public UserRating getMovieRating(@PathVariable("userId") String userId) {
		return new UserRating(userId, Arrays.asList(new Rating("L1", 4), new Rating("L2", 5), new Rating("L3", 1)));
	}

}
