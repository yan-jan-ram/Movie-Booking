 package com.infy.moviebooking.dto;

import java.time.LocalDate;

import com.infy.moviebooking.entity.MovieBooking;

public class MovieBookingDTO {

	private Integer bookingId;
	private String movieName;
	private String screenName;
	private LocalDate showDate;
	private Integer noOfSeats;
	private Double bookingAmount;
	private String paymentType;
	private Long customerPhoneNo;
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}
	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public Double getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(Double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Long getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(Long customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	public static MovieBookingDTO prepareDTO(MovieBooking movieBooking)
	{
		MovieBookingDTO movieBookingDTO=new MovieBookingDTO();
		movieBookingDTO.setBookingId(movieBooking.getBookingId());
		movieBookingDTO.setMovieName(movieBooking.getMovieName());
		movieBookingDTO.setScreenName(movieBooking.getScreenName());
		movieBookingDTO.setShowDate(movieBooking.getShowDate());
		movieBookingDTO.setNoOfSeats(movieBooking.getNoOfSeats());
		movieBookingDTO.setBookingAmount(movieBooking.getBookingAmount());
		movieBookingDTO.setPaymentType(movieBooking.getPaymentType());
		movieBookingDTO.setCustomerPhoneNo(movieBooking.getCustomerPhoneNo());
		return movieBookingDTO;
		
	}
	public static MovieBooking prepareEntity(MovieBookingDTO movieBookingDTO)
	{
		MovieBooking movieBooking=new MovieBooking();
		movieBooking.setMovieName(movieBooking.getMovieName());
		movieBooking.setScreenName(movieBookingDTO.getScreenName());
		movieBooking.setShowDate(movieBookingDTO.getShowDate());
		movieBooking.setNoOfSeats(movieBookingDTO.getNoOfSeats());
		movieBooking.setPaymentType(movieBookingDTO.getPaymentType());
		movieBooking.setCustomerPhoneNo(movieBookingDTO.getCustomerPhoneNo());
		return movieBooking;
		
	}
}
