package com.guru.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.guru.model.Movie;
import com.guru.model.MovieCatalogues;
import com.guru.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public MovieCatalogues getMoviesWithDetails(@PathVariable("userId") String userId) {
		UserRating userRating = restTemplate.getForObject("http://movie-ratings-service/rating/" + userId, UserRating.class);
		List<Movie> movies = userRating.getRatings().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-sevice/movie/" + rating.getMovieId(), Movie.class);
			movie.setRating(rating.getRating());
			return movie;
		}).collect(Collectors.toList());
		return new MovieCatalogues(userId, "robot", movies);
	}
}
/*
 * RestTemplate is going to be deprecated in near future according to spring doc,
 * and there were no updates would be released for RestTemplate from spring so
 * there's an alternative way i.e WebClient way this is of kind asynchronous
 * whereas RestTemplate synchronous way Movie movie = webClientBuilder.build()
 * .get().uri("http://localhost:8082/movies/"+ rating.getMovieId())
 * .retrieve().bodyToMono(Movie.class) // mono indicates that asynchronous way
 * .block();
 */
