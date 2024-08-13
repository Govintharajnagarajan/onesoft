package com.example.vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.vehicle.Entity.Bike;
import com.example.vehicle.Repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;

	public String postThis(List<Bike> b) {
		br.saveAll(b);
		return "successfully posted";
	}

	public List<Bike> getAll() {
		return br.findAll();
	}

	public Bike getId(@PathVariable int a) {
		return br.findById(a).get();
	}

	public String getDelete(@PathVariable int a) {
		br.deleteById(a);

		return "successfully deleted";
	}
	public Bike getfourthmax() {
		return br.getfourthmax();
	
}
	public Float getaverage() {
		return br.getaverage();
	}
	public List<Bike> getsorted() {
		return br.getsorted();
	}
	public List<Bike> getaveragemax() {
		return br.getaveragemax();
	}
	public List<Bike> getmax3() {
		return br.getmax3();
	}
	public List<Bike> getsortcolor() {
		return br.getsortcolor();
}
	public int getsum() {
		return br.getsum();
}
	public double getdecimal() {
		return br.getdecimal();
}
	

}
