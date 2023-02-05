package com.surya.controller;

import java.time.LocalDate;
import java.util.List;

import com.surya.dto.BikeModel;
import com.surya.dto.CommentsModel;
import com.surya.dto.CustomerModel;
import com.surya.dto.RenterModel;

public interface IAdminController {
	
	public List<CustomerModel> getAllCustomers();
	public List<RenterModel> getAllRenters();
	public List<BikeModel> getRenterById(Long id);
	public RenterModel isRenterActive(Long id);
	public CustomerModel isCustomerActive(Long id);
	public List<CommentsModel> getAllComments();
	public Double calculateRevenue(LocalDate startDate,LocalDate endDate);
	

}
