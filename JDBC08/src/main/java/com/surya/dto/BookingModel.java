package com.surya.dto;

import java.time.LocalDate;

public class BookingModel {

	private Long bookingId;
	private Double totalAmount;
	private LocalDate bookingDate;
	private LocalDate endDate;
	private String renterName;
	private String customerName;
	private String brandName;
	private String modelName;
	private Long bikeId;
	private CustomerModel customer;
	private RenterModel renter;

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getRenterName() {
		return renterName;
	}

	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Long getBikeId() {
		return bikeId;
	}

	public void setBikeId(Long bikeId) {
		this.bikeId = bikeId;
	}

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}

	public RenterModel getRenter() {
		return renter;
	}

	public void setRenter(RenterModel renter) {
		this.renter = renter;
	}

}
