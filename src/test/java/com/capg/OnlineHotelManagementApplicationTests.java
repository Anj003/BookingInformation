package com.capg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.Model.HotelBooking;
import com.capg.Repository.HotelBookingRepo;
import com.capg.Service.HotelBookingService;

@SpringBootTest
class OnlineHotelManagementApplicationTests {

	@MockBean
	private HotelBookingRepo bookingrepo;
	
	@Autowired
	private HotelBookingService service;
	
	
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
   // Date startDate = format.parse("05/06/2010");
   // Date endDate = format.parse("02/07/2010");
	
	
	
	@Test
	 void contextLoads() {
		
	}
	//fetchAllBooking
	
	/*
	 * @Test public void getAllBooking() {
	 * when(bookingrepo.findAll()).thenReturn(Stream.of(new HotelBooking(123,
	 * 234,456, 678, startDate, endDate , 300.8f, "Booked"))
	 * .collect(Collectors.toList()));
	 * assertEquals(1,service.getAllHotelBooking().size()); }
	 * 
	 * 
	 * //fetchBookingById //@Test
	 * 
	 * 
	 * public void getBookingById() { int id=123; HotelBooking book=new
	 * HotelBooking(123,234, 456, 678, startDate,endDate, 300.8f, "Booked");
	 * when(bookingrepo.findById(id)).thenReturn(Optional.ofNullable(new
	 * HotelBooking(123, 234, 456, 678, startDate, endDate, 300.8f, "Booked")));
	 * assertEquals(book,service.fetchByBookingId(id)); }
	 * 
	 * 
	 * //SaveBooking
	 * 
	 * @Test public void saveBooking() { HotelBooking book=new HotelBooking(123,234,
	 * 456, 678, startDate,endDate, 300.8f, "Booked");
	 * when(bookingrepo.save(book)).thenReturn(book);
	 * assertEquals(book,service.addHotelBooking(book)); }
	 * 
	 */
	  //fetchBookingByCost
		
		/*
		 * @Test public void getBookingByCost() { float cost=300.8f;
		 * when(bookingrepo.findByCost(cost)).thenReturn(Stream.of(new
		 * HotelBooking(123,234,456, 678, startDate, endDate , 300.8f,
		 * "Booked")).collect(Collectors.toList()));
		 * assertEquals(1,service.findByCost(cost).size()); }
		 * 
		 */
	  
	  
	  //updateBookingById
	  
		
		/*
		 * @Test public void updateBookingById() { HotelBooking book=new
		 * HotelBooking(123, 234, 456, 678,startDate,endDate, 300.8f, "Booked");
		 * when(bookingrepo.findByBookingId(book.getBookingId()).thenReturn(Stream.of(
		 * service.updateHotelBooking(book))).collect(Collectors.toList()));
		 * assertEquals(book,service.fetchByBookingId(book.getBookingId())); }
		 */
	 
	
	//deleteByBookingId
	
	
	/*
	 * @Test public void deleteBookingById() { int id=123;
	 * when(bookingrepo.findByBookingId(id)).thenReturn(Stream.of(service.
	 * deleteHotelBookingById(id))).collect(Collectors.toList()));
	 * assertEquals(1,service.fetchByBookingId(id).size());
	 * 
	 * }
	 */
	 
	 
}
