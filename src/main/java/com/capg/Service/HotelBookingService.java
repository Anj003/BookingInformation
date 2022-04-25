package com.capg.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Model.HotelBooking;
import com.capg.Repository.HotelBookingRepo;

@Service
public class HotelBookingService {

	
	@Autowired
	HotelBookingRepo bookRepos;
	
	public HotelBooking addHotelBooking(HotelBooking bookObj) {
		return bookRepos.save(bookObj);
	}

	public List<HotelBooking> getAllHotelBooking() {
		return bookRepos.findAll();
	}
	public List<HotelBooking> updateHotelBooking(HotelBooking bookObj){
		 bookRepos.save(bookObj);
		 return getAllHotelBooking();
	}
	
	  public int deleteHotelBookingById(int id){ 
		  bookRepos.deleteById(id);
		  return id;
    }
	 
	
	public Optional<HotelBooking> fetchByBookingId(int id) {
		return bookRepos.findByBookingId(id);
	}
	
	public List<HotelBooking> findByCost(float cost) {
		List<HotelBooking> bo= bookRepos.findByCost(cost);
		return bo;
	}
}
