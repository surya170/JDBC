package com.surya.dao;

import java.util.List;

import com.surya.dto.BikeModel;
import com.surya.dto.CustomerModel;
import com.surya.dto.PaymentModel;
import com.surya.dto.RenterModel;

public interface ICustomerDao {
	

	public List<BikeModel> getCustomerBike();
	public List<BikeModel> getActiveBikes(List<RenterModel> renters,List<BikeModel> bikes);
    public CustomerModel delete(int id);
    public CustomerModel update(int id,CustomerModel customer);
    public CustomerModel getCustomerById(int id);
    public PaymentModel validatePayment(PaymentModel payment);

}
