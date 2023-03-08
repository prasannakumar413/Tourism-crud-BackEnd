package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TheRoyalRoute")
public class ProjectEntity {

	@Id
	
	private int bookingId;
	private String city;
	private String modeOfTravel;
	private int modeOfTravelPrice;
	private String hotels;
	private int hotelPrice;
	private float hotelRatings;
	
	
	
	
	public ProjectEntity(int bookingId, String city, String modeOfTravel, int modeOfTravelPrice, String hotels,
			int hotelPrice, float hotelRatings) {
		super();
		this.bookingId = bookingId;
		this.city = city;
		this.modeOfTravel = modeOfTravel;
		this.modeOfTravelPrice = modeOfTravelPrice;
		this.hotels = hotels;
		this.hotelPrice = hotelPrice;
		this.hotelRatings = hotelRatings;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getModeOfTravel() {
		return modeOfTravel;
	}
	public void setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}
	public int getModeOfTravelPrice() {
		return modeOfTravelPrice;
	}
	public void setModeOfTravelPrice(int modeOfTravelPrice) {
		this.modeOfTravelPrice = modeOfTravelPrice;
	}
	public String getHotels() {
		return hotels;
	}
	public void setHotels(String hotels) {
		this.hotels = hotels;
	}
	public int getHotelPrice() {
		return hotelPrice;
	}
	public void setHotelPrice(int hotelPrice) {
		this.hotelPrice = hotelPrice;
	}
	public float getHotelRatings() {
		return hotelRatings;
	}
	public void setHotelRatings(float hotelRatings) {
		this.hotelRatings = hotelRatings;
	}
	
	public String toString() {
		return "bookingId=" + bookingId + "city=" + city + "modeOfTravel=" + modeOfTravel
				+ "modeOfTravelPrice=" + modeOfTravelPrice + "hotels=" + hotels + "hotelPrice=" + hotelPrice
				+ "hotelRatings=" + hotelRatings ;
	}
	
	
	
	

	
public ProjectEntity() {
		
	}



	


	
	
	
	
		
	}