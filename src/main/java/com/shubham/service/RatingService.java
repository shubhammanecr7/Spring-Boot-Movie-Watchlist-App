package com.shubham.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class RatingService {
	String apiUrl = "https://www.omdbapi.com/?i=tt3896198&apikey=a66852de&t=";

	public String getImdbRating(String title) {
		try {
			/* we fetch the IMDB rating of movie title using OMDB api 
			 * we use RestTemplate class to call external api from here using apiUrl+title*/
			RestTemplate restTemplate = new RestTemplate();
			
			//Response entity is wrapper to hold json type object
			ResponseEntity<ObjectNode> responseEntity = restTemplate.getForEntity(apiUrl+title, ObjectNode.class);
			
			//now we will extract json object from response entity
			ObjectNode jsonObject = responseEntity.getBody();
			
			return jsonObject.path("imdbRating").asText();
		} catch (Exception e) {
			System.out.println("Either movie name wrong/unavailable or API is down" + e.getMessage());
		}
		return null;
	}
}