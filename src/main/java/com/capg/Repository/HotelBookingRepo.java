package com.capg.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.Model.HotelBooking;

@Repository
public interface HotelBookingRepo extends JpaRepository<HotelBooking,Integer>{

	public Optional<HotelBooking> findByBookingId(int id);
	
	@Query(value="select e from HotelBooking e where e.cost = :cost")
	List<HotelBooking> findByCost(@Param("cost") float cost);
	
}
