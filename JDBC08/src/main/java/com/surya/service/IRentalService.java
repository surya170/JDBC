package com.surya.service;

import java.time.LocalDate;

import com.surya.dto.RenterModel;

public interface IRentalService {
	
	public double getRenterEarning(int renterId);
	public RenterModel getRenterById(int renterId);
	public RenterModel updateProfile(int id,RenterModel renter);
	public double calculateRevenue(int id,LocalDate startDate,LocalDate endDate);

}
