package com.shubham.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.entity.Movie;
import com.shubham.repository.MovieRepository;

import jakarta.validation.Valid;

@Service
public class DatabaseService {
	@Autowired
	MovieRepository movieRepository;
	@Autowired
	RatingService ratingService;
	
	public void create(Movie movie) {
		String movieRating = ratingService.getImdbRating(movie.getTitle());
		if (movieRating != null) {
			movie.setRating(Float.parseFloat(movieRating));
		}
		movieRepository.save(movie);
	}
	
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	public Movie getMovieById(Integer id) {
		return movieRepository.findById(id).get();
	}

	public void update(Integer id, @Valid Movie movie) {
		Movie movieToBeUpdated = getMovieById(id);
		
		movieToBeUpdated.setTitle(movie.getTitle());
		movieToBeUpdated.setRating(movie.getRating());
		movieToBeUpdated.setPriority(movie.getPriority());
		movieToBeUpdated.setComment(movie.getComment());
		
		movieRepository.save(movieToBeUpdated);
	}
	
	public void deleteMovieById(Integer id) {
		movieRepository.deleteById(id);
	}
}
