package com.example.vehicle.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle.Entity.Bike;
import com.example.vehicle.Service.BikeService;

@RestController
public class BikeController {
	@Autowired
	BikeService bs;

	@PostMapping(value = "/postBike")
	public String postThis(@RequestBody List<Bike> b) {
		return bs.postThis(b);
	}

	@GetMapping(value = "/getall")
	public List<Bike> getAll() {
		return bs.getAll();

	}

	@GetMapping(value = "/getid/{a}")
	public Bike getId(@PathVariable int a) {
		return bs.getId(a);
	}

	@GetMapping(value = "/getdelete/{a}")
	public String getDelete(@PathVariable int a) {
		return bs.getDelete(a);
	}

	@GetMapping(value = "/getByColor/{c}")
	public List<Bike> getByColor(@PathVariable String c) {
		return bs.getByColor(c);
	}

	@GetMapping(value = "/getByBrand/{d}")
	public List<Bike> getByBrand(@PathVariable String d) {
		return bs.getByBrand(d);
	}

	@GetMapping(value = "/getByPrice/{a}/{b}")
	public List<Bike> getByPrice(@PathVariable int a, @PathVariable int b) {
		return bs.getByPrice(a, b);
	}

	@GetMapping(value = "/getLetter/{a}")
	public String getByLetter(@PathVariable String a) {
		return bs.getByLetter(a);
	}

	@GetMapping(value = "/getsort")
	public List<Integer> getsort() {
		return bs.getsort();
	}

	@GetMapping(value = "/getdec")
	public List<Integer> getdec() {
		return bs.getdec();
	}
	@GetMapping(value="/getmin")
    public Bike getmin() {
    return bs.getmin();
	}
	@GetMapping(value="/getsec")
	public Bike getsec() {
		return  bs.getsec();
	}
	@GetMapping(value="getgroup")
	public Map<String,Long> getgroup() {
		return bs.getgroup();
	}
	
	//task1
	@GetMapping(value="/getfourthmax")
	public Bike getfourthmax() {
		return bs.getfourthmax();
	}
	
	//task2
	@GetMapping(value="/getaverage")
	public Float getaverage() {
		return bs.getaverage();
	}
	//task3
	@GetMapping(value="/getsorted")
	public List<Bike> getsorted() {
		return bs.getsorted();
	}
	
	//task4
	@GetMapping(value="/getaveragemax")
	public List<Bike> getaveragemax() {
		return bs.getaveragemax();
	}
	
	//task5
	@GetMapping(value="/getmax3")
	public List<Bike> getmax3() {
		return bs.getmax3();
	}
	
	//task6
	@GetMapping(value="/getsortcolor")
	public List<Bike> getsortcolor() {
		return bs.getsortcolor();
   }
	
	//task7
	@GetMapping(value="/getsum")
	public int getsum() {
		return bs.getsum();
    }
	
	//task8
	@GetMapping(value="/getdecimal")
	public double getdecimal() {
		return bs.getdecimal();
   }
	
	
}