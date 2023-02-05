package com.surya.dao;

import java.util.List;

import com.surya.dto.BookingModel;

public interface IBookingDao {

	public BookingModel saveBookingHistory(int id,BookingModel data);
	public void updateEarnings(int id,double amount);
	public BookingModel getAllBokkings();
	public List<BookingModel> getCustomerBooking(int id);
	public List<BookingModel> getRenterBookingModels(int id);
	public BookingModel deleteBookingById(int id);
	
}
