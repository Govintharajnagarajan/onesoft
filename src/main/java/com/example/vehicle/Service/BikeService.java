package com.example.vehicle.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;



import com.example.vehicle.Dao.BikeDao;
import com.example.vehicle.Entity.Bike;
import com.example.vehicle.Repository.BikeRepository;

@Service
public class BikeService {
	@Autowired
	BikeDao bd;
	
	@Autowired
	BikeRepository br;

	public String postThis(List<Bike> b) {
		return bd.postThis(b);
	}

	public List<Bike> getAll() {
		return bd.getAll();

	}

	public Bike getId(@PathVariable int a) {
		return bd.getId(a);
	}

	public String getDelete(@PathVariable int a) {
		return bd.getDelete(a);
	}
	
	public List<Bike> getByColor(String c){
		List<Bike>bikes=bd.getAll();
		List<Bike>x=bikes.stream().filter(z->z.getColor().equals(c)).collect(Collectors.toList());
		return x;
	}
	public List<Bike> getByBrand(String d) {
		List<Bike> brands=bd.getAll();
		List<Bike> y=brands.stream().filter(x->x.getBrand().equals(d)).collect(Collectors.toList());
		return y;
	}
	public List<Bike> getByPrice(@PathVariable int a,@PathVariable int b) {
		List<Bike> prices=bd.getAll();
		List<Bike> z=prices.stream().filter(x->x.getPrice()>=a&&x.getPrice()<=b).collect(Collectors.toList());
		return z;
	}
	public String getByLetter(@PathVariable String a) {
		List<Bike> letters=bd.getAll();
		String letter=letters.stream().filter(x->x.getBrand().startsWith(a)).map(x->x.getBrand()).collect(Collectors.joining());
		return letter;
	}
	public List<Integer> getsort() {
		List<Bike> s=bd.getAll();
		List<Integer> sorts=s.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	return sorts;
	}
	public List<Integer> getdec() {
		List<Bike> decending=bd.getAll();
		List<Integer> dec=decending.stream().map(x->x.getPrice()).sorted().collect(Collectors.toList());
		return dec;
	}
	   public Bike getmin() {
		   List<Bike> m=bd.getAll();
		   Bike min=m.stream().min(Comparator.comparingInt(Bike::getPrice)).get();
		   return min;
			}
		public Bike getsec() {
			List<Bike> m1=bd.getAll();
			Bike min1=m1.stream().sorted(Comparator.comparingInt(Bike::getPrice)).skip(1).findFirst().get();
			return min1;
		}
		public Map<String,Long> getgroup() {
			List<Bike> g=bd.getAll();
		return	g.stream().collect(Collectors.groupingBy(x->x.getColor(),Collectors.counting()));
		}
		
		public Bike getfourthmax() {
			return bd.getfourthmax();
	   
		}
		public Float getaverage() {
			return bd.getaverage();
		}
		public List<Bike> getsorted() {
			return bd.getsorted();
		}
		public List<Bike> getaveragemax() {
			return bd.getaveragemax();
		}
		public List<Bike> getmax3() {
			return bd.getmax3();
		}
		public List<Bike> getsortcolor() {
			return bd.getsortcolor();
	}
		public int getsum() {
			return bd.getsum();
	}
		public double getdecimal() {
			return bd.getdecimal();
	}
}
		


