package com.surya.service;

import java.util.List;

import com.surya.dto.BikeModel;

public interface IBikeService {
	
	public List<BikeModel> getAllBikes();
	public BikeModel addBikes(int id,BikeModel bike);
	public BikeModel updateBike(int id,BikeModel bike);
	public BikeModel deleteBikeById(int id);
	public BikeModel  getBikeById(int id);
	public List<BikeModel> getRenterById(Long id);

}
