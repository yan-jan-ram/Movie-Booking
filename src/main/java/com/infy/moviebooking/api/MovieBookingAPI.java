package com.infy.moviebooking.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.infy.moviebooking.dto.MovieBookingDTO;
import com.infy.moviebooking.exception.MovieBookingException;
import com.infy.moviebooking.service.MovieBookingService;

public class MovieBookingAPI {
	
	private MovieBookingService movieBookingService;
	
	public ResponseEntity<MovieBookingDTO> bookMovie(MovieBookingDTO movieBookingDTO) throws MovieBookingException
	{
		return null;
		
	}
	public ResponseEntity<List<MovieBookingDTO>>getBookingByScreenName(String screenName) throws MovieBookingException
	{
		return null;
		
	}
	
	

}
